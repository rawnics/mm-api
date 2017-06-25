/**
 * 
 */
package com.awn.config.repository;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Rahul Vishwakarma
 *
 */
@Configuration
@ComponentScan(basePackages = "com.awn")
@EntityScan(basePackages = "com.awn")
@EnableAutoConfiguration(
		exclude = { 
		DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class 
        })
//@PropertySource(value={"classpath:application.properties"})
public class ApplicationDataSourceConfig {

	private static final Logger LOGGER = LogManager.getLogger(ApplicationDataSourceConfig.class);

	@Primary
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() {
		LOGGER.info(">>>>>>>>>>>>>>> Initializing Datasource for the project <<<<<<<<<<<<<<<<<<<");
		return DataSourceBuilder
				.create()
				//Reading from the application.properties file
	    		//.url("jdbc:mysql://localhost:3306/padb")
	    		//.driverClassName("com.mysql.jdbc.Driver")
	    		//.username("root")
	    		//.password("")
	    		.build();
	}
	
	@Primary
    @Bean(name="jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    	LOGGER.info(">>>>>>>>>>>>>>> Initializing JdbcTemplate for the project <<<<<<<<<<<<<<<<<<<");
        return new JdbcTemplate(dataSource);
    }
	
	
	
}
