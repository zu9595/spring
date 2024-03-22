<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 목록</h3>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody id="brdList">
			<!-- 	int boardNo;
	String title;
	String content;
	String writer;
	Date writerDate;
	int clickCnt;
	String image; -->
		</tbody>
	</table>
	<script>
	boardList();
		function boardList(){
			fetch("/boards/")
			.then(res => res.json())
			.then(res => makeBlist(res))
		}
		function makeBlist(json){
			brdList.innerHTML = '';
			json.forEach((data, index) => {
				
			let newTag = `<tr>
				<td>${index}</td>
				<td>${data.title}</td>
				<td>${data.content}</td>
				<td>${data.writer}</td>
				<td><button type="button">ì¡°í</button></td>
			</tr>`
			brdList.innerHTML += newTag;
			})
		}
	</script>
</body>
</html>