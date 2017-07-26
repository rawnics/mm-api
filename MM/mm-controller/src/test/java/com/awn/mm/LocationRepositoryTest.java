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
import com.awn.mm.repository.LocationRepository;

/**
 * Test case for AuStoreRepository 
 * 
 * @author Rahul Vishwakarma
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LocationRepositoryTest {

	private static final Logger log = LogManager.getLogger(LocationRepositoryTest.class);

	@Autowired
	private LocationRepository locationRepository;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		log.info("Set up");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		log.info("Tear down");
	}


	/**
	 * Get Location repository
	 */
	@Test
	public final void testFindByName() {
		log.info("----------------- Test the repository response ---------------------");
		List<LocationStore> list = null;
		try {
			list = locationRepository.findByName("test");
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		Assert.assertNotNull(list);
	}

}
