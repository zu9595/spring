<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서리스트</title>
</head>
<body>
	<h3>부서목록</h3>
	<div style="border: 1px solid blue;">
		<table>
			<thead>
				<tr>
					<th>No</th>
					<th>부서번호</th>
					<th>부서코드</th>
					<th>관리자코드</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${deptList}" var="dboard" varStatus="row">
					<tr>
						<td>${row.count}</td>
						<td>${dboard.departmentId}</td>
						<td>${dboard.departmentName}</td>
						<td>${dboard.managerId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>