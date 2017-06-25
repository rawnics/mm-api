package com.awn.common.process.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ListUtils
 * 
 */
public final class ListUtils {

	/**
	 * private constructor
	 */
	private ListUtils() {
	}

	/**
	 * Gets the element at given position in List
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param index
	 *            the index
	 * @return the element at the specified position in this list.
	 */
	public static <T> T get(final List<T> list, final Integer index) {
		return list.get(index);
	}

	/**
	 * Sets the element at given position in the collection
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param index
	 *            the index
	 * @param element
	 *            the element
	 * @return the element previously at the specified position.
	 */
	public static <T> Object set(final List<T> list, final Integer index, final T element) {
		return list.set(index, element);
	}

	/**
	 * Index of given element in the collection
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param o
	 *            the o
	 * @return the index in this list of the first occurrence of the specified
	 *         element, or -1 if this list does not contain this element.
	 */
	public static <T> Integer indexOf(final List<T> list, final T o) {
		return list.indexOf(o);
	}

	/**
	 * Last index of the given element in the collection
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param o
	 *            the o
	 * @return the index in this list of the last occurrence of the specified
	 *         element, or -1 if this list does not contain this element.
	 */
	public static <T> Integer lastIndexOf(final List<T> list, final T o) {
		return list.lastIndexOf(o);
	}

	/**
	 * Sub list given range
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param fromIndex
	 *            the from index
	 * @param toIndex
	 *            the to index
	 * @return a view of the specified range within this list.
	 */
	public static <T> List<T> subList(final List<T> list, final Integer fromIndex, final Integer toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	/**
	 * delete duplicate entries from list.
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @return List<T> the returned List without duplicates.
	 */
	public static <T> List<T> deleteDuplicateEntries(final List<T> list) {
		final List<T> outputList = new ArrayList<>();
		final Set<T> set = new HashSet<>();
		for (T item : list) {
			if (!set.contains(item)) {
				outputList.add(item);
				set.add(item);
			}
		}
		return outputList;
	}

}