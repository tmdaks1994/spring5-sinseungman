<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix="funtion" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="" %>
<c:forEach items="${latest_list}" var="latestVO">
<c:if test="${latest_list eq ''}">
<tr><td colspan="4">조회된 값이 없습니다.</td></tr>
</c:if>
<tr>
  <td><a href="#">${latestVO.title}</a></td>
  <td>${latestVO.writer}</td>
  <td><c:out
  <td>${latestVO.reg_date}</td>
  <td><span class="badge badge-success">
  ${latestVO.view_count}
  </span></td>
</tr> 
</c:forEach>