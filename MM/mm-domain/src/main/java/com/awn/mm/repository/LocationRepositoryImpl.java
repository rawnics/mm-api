/**
 * 
 */
package com.awn.mm.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.awn.config.entity.ApplicationQueryEnum;
import com.awn.config.repository.ApplicationQueryConfig;
import com.awn.mm.entity.LocationStore;

/**
 * @author Rahul Vishwakarma
 *
 */
@Repository
public class LocationRepositoryImpl implements LocationRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LocationRepositoryImpl.class);

	@Autowired
	@Qualifier("jdbcTemplate") 
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ApplicationQueryConfig applicationQueryConfig;
	

	/* (non-Javadoc)
	 * @see com.awnics.mm.repository.AuStoreRepository#findByName(java.lang.String)
	 */
	@Override
	public List<LocationStore> findByName(String name) {		
		// Fetch the query from: sql.properties
		String sql = applicationQueryConfig.getQueryString(ApplicationQueryEnum.SQL_MM_LOCATION_S10);
		log.info("Query: "+sql);
		List<LocationStore> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(LocationStore.class));
		log.info("SQL query and BeanPropertyRowMapper. Result: "+list);
		return list;
	}

}
