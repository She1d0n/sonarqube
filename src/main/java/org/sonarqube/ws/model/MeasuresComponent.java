package org.sonarqube.ws.model;
import java.util.List;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

public class MeasuresComponent implements Model {


	private static final long serialVersionUID = -7152919429726036686L;
	private String id;
	private String key;
	private String name;
	private String qualifier;
	private String description;
	private List<ComponentMeasure> measures;
	@CheckForNull
	public String getId() {
		return id;
	}

	public void setId(@Nullable String id) {
		this.id = id;
	}
	
	@CheckForNull
	public String getKey() {
		return key;
	}

	public void setKey(@Nullable String key) {
		this.key = key;
	}
	
	@CheckForNull
	public String getName() {
		return name;
	}

	public void setName(@Nullable String name) {
		this.name = name;
	}
	
	@CheckForNull
	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(@Nullable String qualifier) {
		this.qualifier = qualifier;
	}
	
	@CheckForNull
	public String getDescription() {
		return description;
	}

	public void setDescription(@Nullable String description) {
		this.description = description;
	}
	@CheckForNull
	public List<ComponentMeasure> getMeasures() {
		return measures;
	}

	public void setMeasures(@Nullable List<ComponentMeasure> measures) {
		this.measures = measures;
	}
}
