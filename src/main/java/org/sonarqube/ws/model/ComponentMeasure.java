package org.sonarqube.ws.model;

import java.util.List;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;



/** 
* @author : liujiey
* @date 创建时间：2018年11月15日 上午10:57:48 
* @param
* @throws  
* @return  
*/
public class ComponentMeasure implements Model {

	private static final long serialVersionUID = 6791902194269219469L;
	private String metric;
	private String value;
	private List<Period> periods;
	
	@CheckForNull
	public String getMetric() {
		return metric;
	}
	public void setMetric(@Nullable String metric) {
		this.metric = metric;
	}
	
	@CheckForNull
	public String getMetricValue() {
		return value;
	}
	public void setValue(@Nullable String value) {
		this.value = value;
	}
	@CheckForNull
	public List<Period> periods() {
		return periods;
	}
	public void setPeriods(@Nullable List<Period> periods) {
		this.periods = periods;
	}
}
