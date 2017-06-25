package com.awn.config.entity;

/**
 * @author Rahul Vishwakarma
 *
 * Enumeration for all the SQL queries configured in properties file
 * 
 */
public enum ApplicationQueryEnum {
	
	SQL_MM_LOCATION_S10("sql.data.query.mm.stest10","s10"),
	SQL_MM_STEST20("sql.data.query.mm.stest20","s20");
	
	String key;
	String value;
	
	ApplicationQueryEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
