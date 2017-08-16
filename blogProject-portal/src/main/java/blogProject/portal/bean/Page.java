package blogProject.portal.bean;

import java.util.List;

public class Page<T> {
	public static final int PAGE_SIZE = 4;

	private int pageNo;

	private int pageTotalCount;

	private int pageTotal;

	private int pageSize = PAGE_SIZE;

	private List<T> items;

	private String url;

	public Page() {
	}

	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		if (pageNo < 1) {
			pageNo = 1;
		}
		if (pageNo > pageTotal) {

			pageNo = pageTotal;
		}

		this.pageNo = pageNo;
	}


	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public String getUrl() {
		return url;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}


	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageTotalCount=" + pageTotalCount
				+ ", pageTotal=" + pageTotal + ", pageSize=" + pageSize
				+ ", items=" + items + ", url=" + url + "]";
	}

}

