/**
 * 
 */
package com.awn.mm;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.awn.mm.entity.LocationStore;
import com.awn.mm.store.LocationService;

/**
 * Test case for AuStoreService 
 * 
 * @author Rahul Vishwakarma
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LocationServiceTest {

	private static final Logger LOGGER = LogManager.getLogger(LocationServiceTest.class);

	@Autowired
	private LocationService locationService;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Get Location Service
	 */
	@Test
	public final void testGetLocationByName() {
		LOGGER.info("----------------- Test the service response ---------------------");
		List<LocationStore> list = null;
		try {
			list = locationService.getLocationByName("test");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(),e);
		}
		Assert.assertNotNull(list);
	}

}
