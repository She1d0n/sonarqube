package org.sonarqube.ws.model;

import java.util.ArrayList;
import java.util.List;

public class MeasuresComponentsTree implements Model {


	private static final long serialVersionUID = -4011045624521543268L;
	 private Paging paging;
	 private MeasuresComponent baseComponent;
	 private final List<MeasuresComponent> components = new ArrayList<>();

	    public  MeasuresComponent getbaseComponent() {
	        return baseComponent;
	    }
	    
	    public Paging getPaging() {
	        return paging;
	    }
	    public List<MeasuresComponent> getComponents() {
	        return components;
	    }
}
