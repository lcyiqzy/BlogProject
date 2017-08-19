<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<c:if test="${ not empty page }">

	<nav aria-label="Page navigation" style="text-align: center">
		<ul class="pagination pagination-lg">
			<c:if test="${page.pageNo > 1 }">
				<a href="${ctp}/${page.url }&pageNo=1">首页</a>
				<a
					href="${ctp}/${page.url }&pageNo=${page.pageNo - 1 }">上一页</a>
			</c:if>

			<%-- 页码的显示 --%>
			<c:choose>
				<%-- 第一种情况：当总的页码数小于等于5的情况下   只需要forEach begin=1 ,end=pageTotal --%>
				<c:when test="${page.pageTotal <= 5 }">
					<c:set value="1" var="begin"></c:set>
					<c:set value="${page.pageTotal }" var="end"></c:set>
				</c:when>
				<%--  第二种情况：当总页码数大于5的情况下 --%>
				<c:otherwise>
					<c:choose>
						<%--1.当前页码是前三个  1-3 。 需要 遍历 forEach begin=1 end=5 --%>
						<c:when test="${page.pageNo < 4 }">
							<c:set value="1" var="begin"></c:set>
							<c:set value="5" var="end"></c:set>
						</c:when>
						<%-- 2.当前页码是最后的三个，pageTotal 到 pageTotal - 2  	需要遍历 forEach begin=pageToal-4 	end=pageTotal--%>
						<c:when
							test="${page.pageNo >= page.pageTotal - 2}">
							<c:set value="${page.pageTotal - 4 }" var="begin"></c:set>
							<c:set value="${page.pageTotal }" var="end"></c:set>
						</c:when>
						<%-- 3.剩下的其他情况	pageNo-2到pageNo+2	需要遍历 forEach begin=pageNo-2  end=pageNo+2 --%>
						<c:otherwise>
							<c:set value="${page.pageNo - 2 }" var="begin"></c:set>
							<c:set value="${page.pageNo + 2 }" var="end"></c:set>
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>

			<c:forEach begin="${ begin }" end="${ end }" var="i">
				<c:if test="${page.pageNo == i }">
						【${ i }】		
					</c:if>
				<c:if test="${page.pageNo != i }">
					<a href="${ctp}/${page.url }&pageNo=${ i }">${ i }</a>
				</c:if>
			</c:forEach>

			<c:if
				test="${page.pageTotal >page.pageNo }">
				<a
					href="${ctp}/${page.url }&pageNo=${page.pageNo + 1 }">下一页</a>
				<a
					href="${ctp}/${page.url }&pageNo=${page.pageTotal }">末页</a>
			</c:if>
			共${page.pageTotal }页，${page.pageTotalCount }条记录
		

		</ul>
	</nav>

</c:if>
<br />
