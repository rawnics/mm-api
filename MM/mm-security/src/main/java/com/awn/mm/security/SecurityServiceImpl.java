/**
 * 
 */
package com.awn.mm.security;

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
public class SecurityServiceImpl implements SecurityService{
	
	private static final Logger log = LoggerFactory.getLogger(SecurityServiceImpl.class);

	@Autowired
	private LocationRepository locationRepository;
	
	/* (non-Javadoc)
	 * @see com.awnics.mm.store.LocationService#getLocationByName(java.lang.String)
	 */
	@Override
	public List<LocationStore> getUserByName(String name) {
		log.info("Service layer call for Security calls");
		return locationRepository.findByName(name);
	}

}
