/*
 * SonarQube PDF Report
 * Copyright (C) 2010-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
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
package org.sonarqube.ws.model;

import java.util.Date;
import java.util.List;

/**
 * Component model
 *
 */
public class Analyse implements Model {

	private static final long serialVersionUID = 294635042177870654L;
	private String key;
	private Date date;
	private List<Events> events;
	

    public String getKey() {
        return key;
    }
    
    public Date getDate() {
        return (Date) date.clone();
    }
    
    public List<Events> getevents() {
        return  events;
    }
   
}
