package org.sonarqube.ws.query;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.sonarqube.ws.client.services.Query;
import org.sonarqube.ws.model.Analyses;


public class ProjectAnalysesQuery extends Query<Analyses>  {

	private static final long serialVersionUID = -8590364986681708012L;
	private final Map<String, Serializable> params = new HashMap<>();
	public static final String BASE_URL = "/api/project_analyses/search";

	
	
	public ProjectAnalysesQuery() {
		super();
	}

	public ProjectAnalysesQuery(String projectkey) {
		this.setProjectKey(projectkey);
	}

	public ProjectAnalysesQuery setProjectKey(String projectkey) {
		 return (ProjectAnalysesQuery) addParam("project", projectkey);
	}


	public ProjectAnalysesQuery setcategory(String category) {
		  return (ProjectAnalysesQuery) addParam("category", category);
	}
	

	public ProjectAnalysesQuery setps(int ps) {
		  return (ProjectAnalysesQuery) addParam("ps", ps);
	}
	
	public ProjectAnalysesQuery setp(int p) {
		  return (ProjectAnalysesQuery) addParam("p", p);
	}
	@Override
	public Class<Analyses> getModelClass() {
		return Analyses.class;
	}

	
	public static ProjectAnalysesQuery create(String projectkey) {
	        return new ProjectAnalysesQuery(projectkey);
	    }

	@Override
	public String getBaseUrl() {
		  return BASE_URL;
	}

	@Override
	public Map<String, Serializable> getParams() {
		return params;
	}

}
