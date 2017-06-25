/**
 * 
 */
package com.awn.mm.entity;

import java.io.Serializable;

/**
 * @author Rahul Vishwakarma
 *
 */
public class LocationStore implements Serializable {

	private static final long serialVersionUID = 4997145681544160167L;

    private Integer id;
    private String name;
	private String value;
	
    public LocationStore(Integer id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	public LocationStore() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PaStore [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
    
    
	
}
