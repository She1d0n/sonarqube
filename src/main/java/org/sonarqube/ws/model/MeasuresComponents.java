package org.sonarqube.ws.model;


public class MeasuresComponents implements Model {


	private static final long serialVersionUID = -7152919429726036686L;
	 private transient  MeasuresComponent component;

	    public  MeasuresComponent getMeasuresComponent() {
	        return component;
	    }

	    public void setMeasuresComponent(MeasuresComponent component) {
	        this.component = component;
	    }
}
