package com.awn.common.process.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * MapUtils
 * 
 */
public final class MapUtils {

	/**
	 * private constructor
	 */
	private MapUtils() {
	}

	/**
	 * Returns true if this map contains a mapping for the specified key.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map
	 *            the map
	 * @param key
	 *            the key
	 * @return true if this map contains a mapping for the specified key.
	 */
	public static <K, V> Boolean containsKey(final Map<K, V> map, final K key) {
		return map.containsKey(key);
	}

	/**
	 * Returns true if this map maps one or more keys to the specified value.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map
	 *            the map
	 * @param value
	 *            V
	 * @return true if this map maps one or more keys to the specified value.
	 */
	public static <K, V> Boolean containsValue(final Map<K, V> map, final V value) {
		return map.containsValue(value);
	}

	/**
	 * Removes the mapping for a key from this map if it is present.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map
	 *            the map
	 * @param key
	 *            the key
	 * @return the previous value associated with key, or null if there was no
	 *         mapping for key.
	 */
	public static <K, V> V remove(final Map<K, V> map, final K key) {
		return map.remove(key);
	}

	/**
	 * Associates the specified value with the specified key in the specified
	 * map.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map:
	 *            the map where to store the value
	 * @param key:
	 *            the key to associate the value to
	 * @param value:
	 *            the value to put in the map
	 * @return the previous value associated to the key, or null if there was
	 *         none
	 */
	public static <K, V> V put(Map<K, V> map, K key, V value) {
		return map.put(key, value);
	}

	/**
	 * Copies all of the mappings from map2 to map1.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map1
	 *            the map1
	 * @param map2
	 *            the map2
	 */
	public static <K, V> void putAll(final Map<K, V> map1, final Map<K, V> map2) {
		map1.putAll(map2);
	}

	/**
	 * Returns a Set view of the keys contained in this map.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map
	 *            the map
	 * @return a set view of the keys contained in this map
	 */
	public static <K, V> Set<K> keySet(final Map<K, V> map) {
		return map.keySet();
	}

	/**
	 * Returns the value to which the specified key is mapped, or null if this
	 * map contains no mapping for the key.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param key:
	 *            the key to get the value from
	 * @param map
	 *            the map
	 * @return the value mapped with the key
	 */
	public static <K, V> V get(final Map<K, V> map, final K key) {
		return map.get(key);
	}

	/**
	 * Returns a Collection view of the values contained in this map.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param map
	 *            the map
	 * @return the value mapped with the key
	 */
	public static <K, V> Collection<V> values(final Map<K, V> map) {
		return map.values();
	}

}