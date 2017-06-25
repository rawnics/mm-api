/**
 * 
 */
package com.awn.mm.store;

import java.util.List;

import com.awn.mm.entity.LocationStore;

/**
 * @author Rahul Vishwakarma
 *
 */
public interface LocationService {

	List<LocationStore> getLocationByName(String name);
}
