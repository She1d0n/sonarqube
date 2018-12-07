package org.sonarqube.ws.query;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.sonarqube.ws.client.services.Query;
import org.sonarqube.ws.model.ComponentsTree;


public class ComponentsQuery extends Query<ComponentsTree>  {

	private static final long serialVersionUID = -1831816349803533092L;
	private final Map<String, Serializable> params = new HashMap<>();
	public static final String BASE_URL = "/api/components/tree";

	
	
	public ComponentsQuery() {
		super();
	}

	public ComponentsQuery(String componentKey) {
		this.setComponentKey(componentKey);
	}

	public ComponentsQuery setComponentId(String componentId) {
		 return (ComponentsQuery) addParam("baseComponentId", componentId);
	}


	public ComponentsQuery setComponentKey(String componentKey) {
		  return (ComponentsQuery) addParam("baseComponentKey", componentKey);
	}

	public ComponentsQuery setstrategy(String strategy) {
		  return (ComponentsQuery) addParam("strategy", strategy);
	}
	
	public ComponentsQuery setqualifiers(String qualifiers) {
		  return (ComponentsQuery) addParam("qualifiers", qualifiers);
	}
	
    public ComponentsQuery asc(boolean asc) {
        return (ComponentsQuery) addParam("asc", asc);
    }
	public ComponentsQuery setps(int ps) {
		  return (ComponentsQuery) addParam("ps", ps);
	}
	
	public ComponentsQuery setp(int p) {
		  return (ComponentsQuery) addParam("p", p);
	}
	@Override
	public Class<ComponentsTree> getModelClass() {
		return ComponentsTree.class;
	}

	
	public static ComponentsQuery create(String componentKey) {
	        return new ComponentsQuery(componentKey);
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
