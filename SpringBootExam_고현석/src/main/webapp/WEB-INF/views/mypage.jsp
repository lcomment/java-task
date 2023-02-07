<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage 화면</title>
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
	function go_home(){
		event.preventDefault();
		location.href="home";
	}
</script>	
</head>
<body>
	<div class="container">
	     <div class="form-group">
				<div class="col-sm-10" >
						<a href="home"><img src="resources/images/ktds.png"></a>
				</div>
		 	
				<div class="col-sm-10" >
				  <c:if test="">
					<a href="login" class="text-center">로그인</a>
					<a href="memberAdd" class="text-center">회원가입</a>
					<a href="list" class="text-center">QnA</a>
				  </c:if>
				</div>
			</div>
		 <form class="form-horizontal" action="#" method="get">	
			<div class="form-group">
				<div class="col-sm-8" >
						<h2 class="text-center">mypage 화면</h2>
				</div>
			</div>
			<div class="form-group">
				<label for="userid" class="col-sm-2 control-label">아이디</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="userid" value="${member.getUserid()}">
				</div>
			</div>
			<div class="form-group">
				<label for="passwd" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="passwd" value="${member.getPasswd()}">
				</div>
			</div>
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="username" value="${member.getUsername()}">
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-2 control-label">이메일</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="email" value="${member.getEmail()}">
				</div>
			</div>
			<div class="form-group">
				<label for="phone" class="col-sm-2 control-label">전화번호</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="phone" value="${member.getPhone()}">
				</div>
			</div>
	
	 </form>
		
	</div>
</body>
</html>