<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QnA 글 자세히 보기 화면</title>
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
	function go_list(){
		location.href="list";
	}
</script>	
</head>
<body>
	<div class="container">
		<form class="form-horizontal" action="/app/update/${board.getNo()}" method="post">
		    <input type="hidden" name="userid" value="" >
			<div class="form-group">
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
		
			</div>
			<div class="form-group">
				<label for="title" class="col-sm-2 control-label">글번호</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="no" value="${board.getNo()}" readonly="readonly">
				</div>
				<label for="title" class="col-sm-2 control-label">조회수</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="readcnt" value="${board.getReadcnt()}" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label for="title" class="col-sm-2 control-label">제목</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="title" value="${board.getTitle()}" >
				</div>
			</div>
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">작성자</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="username" value="${board.getUsername()}" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label for="content" class="col-sm-2 control-label">내용</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="3" name="content">${board.getContent()}</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
				   <c:if test="true">
					<button type="submit" class="btn btn-default">글수정</button>
				   </c:if>	
					<input type="button" value="목록" class="btn btn-default" onclick="go_list()">
				</div>
			</div>
		</form>
		
	</div>
</body>
</html>