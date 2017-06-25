
package com.awn.common;

/**
 * Paged request. Used for server pagination.
 */
public class PageRequested {
	private String orderBy;
	private boolean orderByDirection;
	private int page;
	private int pageSize;

	/**
	 * Generic constructor.
	 */
	public PageRequested() {
		super();
	}

	/**
	 * Returns order by clause.
	 * 
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * Set order by clause.
	 * 
	 * @param orderBy
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * Get order direction.
	 * 
	 * @return true ASC, false DESC.
	 */
	public boolean isOrderByDirection() {
		return orderByDirection;
	}

	/**
	 * Set order direction.
	 * 
	 * @param orderByDirection
	 *            true ASC, false DESC.
	 */
	public void setOrderByDirection(boolean orderByDirection) {
		this.orderByDirection = orderByDirection;
	}

	/**
	 * Get the page index.
	 * 
	 * @return page index.
	 */
	public int getPage() {
		return page;
	}

	/**
	 * Set the page index.
	 * 
	 * @param page
	 *            page index.
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * Get the page size.
	 * 
	 * @return page size.
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * Set the page size.
	 * 
	 * @param pageSize
	 *            page size.
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
