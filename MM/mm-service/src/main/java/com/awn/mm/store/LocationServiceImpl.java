/**
 * 
 */
package com.awn.mm.store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awn.mm.entity.LocationStore;
import com.awn.mm.repository.LocationRepository;

/**
 * @author Rahul Vishwakarma
 *
 */
@Service
public class LocationServiceImpl implements LocationService{
	
	private static final Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

	@Autowired
	private LocationRepository locationRepository;
	
	/* (non-Javadoc)
	 * @see com.awnics.mm.store.LocationService#getLocationByName(java.lang.String)
	 */
	@Override
	public List<LocationStore> getLocationByName(String name) {
		log.info("Service layer call for AuStore");
		return locationRepository.findByName(name);
	}

}
