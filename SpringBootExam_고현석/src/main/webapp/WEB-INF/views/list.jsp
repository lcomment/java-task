<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QnA 목록 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function writeui(){
		location.href="write";
	}
</script>
</head>
<body>
	<div class="container">
	            <div class="col-sm-10" >
						<a href="home"><img src="resources/images/ktds.png"></a>
				</div>
				<div class="col-sm-10" >
				  <c:if test="${sessionScope.userid eq null}">
					<a href="login" class="text-center">로그인</a>
					<a href="memberAdd" class="text-center">회원가입</a>
					<a href="list" class="text-center">QnA</a>
				  </c:if>
				</div>
	     		 <div class="col-sm-10" >
					<h2 class="text-center">QnA 목록 화면</h2>
				</div>
		
		<table class="table table-striped">
			<thead>
				<tr>
				  <td colspan="6">
				    <form action="list" method="get">
				     <select name="searchName">
				       <option value="username">작성자</option>
				       <option value="title">제목</option>
				     </select>
				     <input type="text" name="searchValue">
				     <input type="submit" value="검색">
				    </form> 
				  </td>
				</tr>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}">
				<tr>
					<th>${board.getNo()}</th>
					<th><a href="/app/retrieve/${board.getNo()}">${board.getTitle()}</a></th>
					<th>${board.getUsername()}</th>
					<th>${board.getWriteday()}</th>
					<th>${board.getReadcnt()}</th>
					<th><a href="/app/delete/${board.getNo()}">삭제</a></th>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		  <c:if test="true">
		    <button onclick="writeui()">글쓰기</button>
		  </c:if>  
	</div>

</body>
</html>