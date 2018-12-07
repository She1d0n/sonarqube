package org.sonarqube.ws.query;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.sonar.report.pdf.util.MetricKeys;
import org.sonarqube.ws.client.services.Query;
import org.sonarqube.ws.model.MeasuresComponentsTree;


public class MeasuresComponentTreeQuery extends Query<MeasuresComponentsTree>  {

	private static final long serialVersionUID = 1252442601276309229L;
	private final Map<String, Serializable> params = new HashMap<>();
	public static final String BASE_URL = "/api/measures/component_tree";

	
	
	public MeasuresComponentTreeQuery() {
		super();
	}

	public MeasuresComponentTreeQuery(String baseComponentKey) {
		this.setComponentKey(baseComponentKey);
	}
	
	

	public MeasuresComponentTreeQuery setComponentId(String baseComponentId) {
		 return (MeasuresComponentTreeQuery) addParam("baseComponentId", baseComponentId);
	}
	
	public MeasuresComponentTreeQuery setAsc(Boolean asc) {
		 return (MeasuresComponentTreeQuery) addParam("asc", asc);
	}
	
	public MeasuresComponentTreeQuery setPs(int ps) {
		 return (MeasuresComponentTreeQuery) addParam("ps", ps);
	}
	
	public MeasuresComponentTreeQuery setQualifiers(String qualifiers) {
		 return (MeasuresComponentTreeQuery) addParam("qualifiers", qualifiers);
	}
	
	public MeasuresComponentTreeQuery setMetricSort(String metric) {
		 return (MeasuresComponentTreeQuery) addParam("metricSort", metric);
	}
	
	public MeasuresComponentTreeQuery setMetricSort(MetricKeys metricKey) {
		 return (MeasuresComponentTreeQuery) addParam("metricSort", metricKey.getKey());
	}
	public MeasuresComponentTreeQuery setS(String s) {
		 return (MeasuresComponentTreeQuery) addParam("s", s);
	}
	
	public MeasuresComponentTreeQuery setStrategy(String strategy) {
		 return (MeasuresComponentTreeQuery) addParam("strategy", strategy);
	}

	public MeasuresComponentTreeQuery setComponentKey(String baseComponentKey) {
		  return (MeasuresComponentTreeQuery) addParam("baseComponentKey", baseComponentKey);
	}


	public MeasuresComponentTreeQuery setMetrics(String... metrics) {
		 return (MeasuresComponentTreeQuery) addParam("metricKeys", metrics);
	}



	@Override
	public Class<MeasuresComponentsTree> getModelClass() {
		return MeasuresComponentsTree.class;
	}

	public static MeasuresComponentTreeQuery createForMetrics(String componentKey,String... metricKeys) {
		return new MeasuresComponentTreeQuery(componentKey).setMetrics(metricKeys);
	}

	public static MeasuresComponentTreeQuery createForMetrics(String componentKey, MetricKeys metricKey) {
	        return createForMetrics(componentKey, metricKey.getKey());
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