package com.awn.common.process.utils;

import java.util.Collection;

/**
 * CollectionUtils
 * 
 */
public final class CollectionUtils {

	/**
	 * private constructor
	 */
	private CollectionUtils() {
	}

	/**
	 * Ensures that the Collection contains the specified element.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 * @param o
	 *            the o
	 * @return true if this Collection changed as a result of the call
	 */
	public static <T> Boolean add(final Collection<T> collection, final T o) {
		return collection.add(o);
	}

	/**
	 * Removes a single instance of the specified element from this collection,
	 * if it is present.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 * @param o
	 *            the o
	 * @return true if this Collection changed as a result of the call
	 */
	public static <T> Boolean remove(final Collection<T> collection, final T o) {
		return collection.remove(o);
	}

	/**
	 * Adds all of the elements in the specified Collection to this collection
	 * 
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            Collection<T>
	 * @param c
	 *            final
	 * @return true if this Collection changed as a result of the call
	 */
	public static <T> Boolean addAll(final Collection<T> collection, final Collection<T> c) {
		return collection.addAll(c);
	}

	/**
	 * Removes all this collection's elements that are also contained in the
	 * specified collection.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 * @param c
	 *            the c
	 * @return true if this Collection changed as a result of the call
	 */
	public static <T> Boolean removeAll(final Collection<T> collection, final Collection<T> c) {
		return collection.removeAll(c);
	}

	/**
	 * Removes all of the elements from this collection.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 */
	public static <T> void clear(final Collection<T> collection) {
		collection.clear();
	}

	/**
	 * Returns true if this Collection contains no elements.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 * @return true if this Collection contains no elements
	 */
	public static <T> Boolean isEmpty(final Collection<T> collection) {
		return collection.isEmpty();
	}

	/**
	 * Returns the size of the Collection specified.
	 *
	 * @param <T>
	 *            the generic type
	 * @param collection
	 *            the collection
	 * @return size of the collection
	 */
	public static <T> Integer size(final Collection<T> collection) {
		return collection.size();
	}

	/**
	 * Returns true if the collection contains the specified element
	 * 
	 * @param collection
	 *            the collection
	 * @param o
	 *            the element to search
	 * @return true if the collection contains the specified element
	 */
	public static <T> Boolean contains(final Collection<T> collection, final T o) {
		return collection.contains(o);
	}

}