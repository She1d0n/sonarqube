package org.sonarqube.ws.model;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;


/** 
* @author : liujiey
* @date 创建时间：2018年11月15日 上午11:00:05 
* @param
* @throws  
* @return   Period
*/
public class Period implements Model{

	private static final long serialVersionUID = 2996255578584211763L;
	private Integer index;
	private String value;
	@CheckForNull
	public String getValue() {
		return value;
	}
	public void setValue(@Nullable String value) {
		this.value = value;
	}
	@CheckForNull
	public Integer getIndex() {
		return index;
	}
	public void setIndex(@Nullable Integer index) {
		this.index = index;
	}
}