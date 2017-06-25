/**
 * 
 */
package com.awn.config.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.awn.config.entity.ApplicationQueryEnum;

/**
 * @author Rahul Vishwakarma
 *
 */
@Configuration
@PropertySource(value={"classpath:config/application-sql.properties"})
public class ApplicationQueryConfig {

	@Autowired
	private Environment environment;	
	
	/**
	 * Get Configured Query value 
	 * 
	 * @param key
	 * @return
	 */
	public String getQueryString(ApplicationQueryEnum key){
		return getQueryString(key.getKey());
	}
	public String getQueryString(String key){
		return environment.getProperty(key);
	}

}
