package blogProject.portal.bean;

import java.util.ArrayList;
import java.util.List;


public class Pagination {

	public <T>Page<T> paging(List<T> followUser, Integer pageSize,
			Integer pageNo, Integer userId, String url) {

		// 创建分页模型
		Page<T> Pager = new Page<>();
		// 设置每行显示的记录数
		Pager.setPageSize(pageSize);
		// 查询并设置总记录数
		int totalCount = followUser.size();
		Pager.setPageTotalCount(totalCount);
		// 总页码
		int pageTotal = Pager.getPageTotalCount() / Pager.getPageSize();
		if (Pager.getPageTotalCount() % Pager.getPageSize() != 0) {
			pageTotal++;
		}
		// 设置总页码
		Pager.setPageTotal(pageTotal);

		// 设置当前页码
		Pager.setPageNo(pageNo);

		// 分页数据的起始索引公式（ 页码 - 1 ） * 每页显示记录数;
		int begin = (Pager.getPageNo() - 1) * Pager.getPageSize();
		int size = Pager.getPageSize();

		List<T> items = new ArrayList<>();

		for (int i = begin; i < (begin + size); i++) {
			if (followUser.size() > i) {
				items.add(followUser.get(i));
			}
		}

		Pager.setItems(items);

		Pager.setUrl(url + "userId=" + userId);

		return Pager;

	}

}
