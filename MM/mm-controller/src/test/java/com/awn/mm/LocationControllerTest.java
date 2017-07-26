package com.awn.mm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.awn.mm.controller.LocationController;
import com.awn.mm.store.LocationService;

/**
 * Test case for MMController 
 * 
 * @author Rahul Vishwakarma
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LocationControllerTest {

	private static final Logger log = LogManager.getLogger(LocationControllerTest.class);

	@Rule
	public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets"); 

	@Autowired
	private LocationService locationService;
	
	private MockMvc mockMvc;

	/**
	 * Configure MockMvc  
	 */
	@Before
	public void setUp() {
		
		this.mockMvc = MockMvcBuilders.standaloneSetup(new LocationController(locationService))
				.apply(org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration(this.restDocumentation)) 
				.build();
		log.info("Set up");
	}
	
	@After
	public void tearDown() throws Exception {
		log.info("Tear down");
	}

	/**
	 * Test the About service call
	 * Document the service
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAbout() throws Exception {
		log.info("Implemented a mock test for the about interface");
		this.mockMvc
		.perform(MockMvcRequestBuilders
				.get("/about")
				.accept(MediaType.TEXT_PLAIN)) 
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content()
				.string("Springframework based REST interface for the MM program"))
		.andDo(org.springframework.restdocs.mockmvc.MockMvcRestDocumentation
				.document("about")); 
	}

	/**
	 * MM interface test 
	 * 
	 * @throws Exception
	 */
	//@Ignore
	@Test
	public void testLocationService() throws Exception {
		log.info("Implemented a mock test for the Location interface");
		this.mockMvc
		.perform(MockMvcRequestBuilders
				.get("/mm")
				.accept(MediaType.APPLICATION_JSON)) 
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(org.springframework.restdocs.mockmvc.MockMvcRestDocumentation
				.document("mm")); 
	}
}
