/**
 * 
 */
package com.awn.mm.repository;

import java.util.List;

import com.awn.mm.entity.LocationStore;

/**
 * @author Rahul Vishwakarma
 *
 */
public interface LocationRepository {

	/**
	 * Method stub for the SQL query and BeanPropertyRowMapper result extraction
	 * SQL queries to be put in a properties file and escaped as a multi line view
	 * 
	 * @param name
	 * @return
	 */
	List<LocationStore> findByName(String name);
}
