package org.sonarqube.ws.query;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.sonar.report.pdf.util.MetricKeys;
import org.sonarqube.ws.client.services.Query;
import org.sonarqube.ws.model.MeasuresComponents;

/** 
* @author : liujiey
* @date 创建时间：2018年11月13日 上午9:45:26 
* @param
* @throws  
* @return  
*/
public class MeasuresComponentQuery extends Query<MeasuresComponents>  {

	private static final long serialVersionUID = 6601793563912618737L;
	private final Map<String, Serializable> params = new HashMap<>();
	public static final String BASE_URL = "/api/measures/component";

	
	
	public MeasuresComponentQuery() {
		super();
	}

	public MeasuresComponentQuery(String componentKey) {
		this.setComponentKey(componentKey);
	}

	public MeasuresComponentQuery setComponentId(String componentId) {
		 return (MeasuresComponentQuery) addParam("componentId", componentId);
	}


	public MeasuresComponentQuery setComponentKey(String componentKey) {
		  return (MeasuresComponentQuery) addParam("componentKey", componentKey);
	}


	public MeasuresComponentQuery setMetrics(String... metrics) {
		 return (MeasuresComponentQuery) addParam("metricKeys", metrics);
	}



	@Override
	public Class<MeasuresComponents> getModelClass() {
		return MeasuresComponents.class;
	}

	public static MeasuresComponentQuery createForMetrics(String componentKey,String... metricKeys) {
		return new MeasuresComponentQuery(componentKey).setMetrics(metricKeys);
	}

	public static MeasuresComponentQuery createForMetrics(String componentKey, MetricKeys metricKey) {
	        return createForMetrics(componentKey, metricKey.getKey());
	    }

	public static MeasuresComponentQuery create(String componentKey) {
	        return new MeasuresComponentQuery(componentKey);
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
