package com.awn.mm.security;

import java.util.List;

import com.awn.mm.entity.LocationStore;

/**
 * @author Rahul Vishwakarma
 *
 */
public interface SecurityService {

	List<LocationStore> getUserByName(String name);
}
