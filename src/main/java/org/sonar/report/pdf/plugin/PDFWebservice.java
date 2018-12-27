/*
 * SonarQube PDF Report
 * Copyright (C) 2010-2017 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.report.pdf.plugin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.sonar.api.server.ws.Request;
import org.sonar.api.server.ws.Request.Part;
import org.sonar.api.server.ws.RequestHandler;
import org.sonar.api.server.ws.Response;
import org.sonar.api.server.ws.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PDFWebservice implements WebService {
	private static final Logger LOG = LoggerFactory.getLogger(PDFWebservice.class);

	private final class Handle implements RequestHandler {
		@Override
         public void handle(Request request, Response response)  {
        	 File uploadFile = new File("pdf-files");
             if (!uploadFile.exists()) {
                 uploadFile.mkdirs();
             }
             File file = null;
             Part part = request.paramAsPart("upload");
             if (part !=null) {
            	 String filename =part.getFileName();         		  
            	 file = new File("pdf-files"+ "/" + filename);            
             try (
            	 InputStream in = part.getInputStream();
            	 FileOutputStream os = new FileOutputStream(file)
            	){
            	 byte[] bb = new byte[1024];
            	 int ch;
            	 while ((ch = in.read(bb)) > -1) {
            		 os.write(bb, 0, ch);
            	 }}catch (Exception e) {            		
            		 LOG.error("STROE PDF FILES ERROR:", e);
            		 response.stream().setStatus(500);
            	}
             }else {
            	 LOG.error("Problem getting request!");
            	 response.stream().setStatus(500);
             }
		}
	}


@Override
   public void define(Context context) {
     NewController controller = context.createController("api/pdfreport");
     controller.setDescription("PDFReport file store/get");
     // create the URL /api/hello/show
     controller.createAction("store")
       .setDescription("PDFReport file store")
       .setHandler(new Handle());
    controller.done();
   }
}
	

