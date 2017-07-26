
package com.awn.mm.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awn.mm.entity.LocationStore;
import com.awn.mm.store.LocationService;

/**
 * Rest interface for the MM program
 * 
 * @author Rahul Vishwakarma
 *
 */
@RestController
public class LocationController {

	private static final Logger log = LogManager.getLogger(LocationController.class);
	
	@Autowired
	private LocationService locationService;
	
	public LocationController(LocationService locationService) {
		super();
		this.locationService = locationService;
	}

	public LocationController() {
		super();
	}


	/**
	 * About the interface
	 * 
	 * @return
	 */
	@RequestMapping(path="/about", method=RequestMethod.GET)
	public String about(){
		log.info("Executing the about service request");
		return "Springframework based REST interface for the MM program";
	}
	
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(path="/mm", method=RequestMethod.GET)
	public List<LocationStore> getPaStore(){
		log.info("Executing the MM service request");
		List<LocationStore> list = locationService.getLocationByName("a");
		return list;
	}

}
