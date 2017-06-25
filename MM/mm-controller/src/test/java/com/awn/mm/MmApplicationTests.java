package com.awn.mm;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.test.context.ContextConfiguration;

import com.awn.config.repository.ApplicationDataSourceConfig;
import com.awn.mm.ApplicationConfig;


/**
 * @author Rahul Vishwakarma
 *
 */
@ContextConfiguration(classes = {ApplicationConfig.class, ApplicationDataSourceConfig.class})
@RunWith(Suite.class)
@SuiteClasses({ LocationRepositoryTest.class, LocationServiceTest.class, LocationControllerTest.class })
public class MmApplicationTests {

	
}
