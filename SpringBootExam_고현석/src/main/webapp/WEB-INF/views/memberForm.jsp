<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
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

	$(document).ready(function(){
		 $("#idcheck").on("click", function(){
	         // Ajax document => jquery.com 에서 API doc 확인
	         
	         var userid = $("#userid").val();
	         $.ajax({
	            type:"get",
	            url:"idcheck", 
	            data:{
	               // userid:userid
	               userid : userid // 서버에서 request.getParameter("userid")
	            },
	            // 서버에서 응답하는 데이터 종류 지정
	            dataType:"text",
	            success:function(responseData, status, xhr){
	               console.log(responseData);
	               $("#result").text(responseData);
	            },
	            error:function(xhr, status, error){
	               console.log("error:", error);
	            }
	         });
	         event.preventDefault();
	      });
	});
	
</script>	
</head>
<body>
	<div class="container">
	     <div class="form-group">
				<div class="col-sm-10" >
						<a href="home"><img src="resources/images/ktds.png"></a>
				</div>
				<div class="col-sm-10" >
					<a href="login" class="text-center">로그인</a>
					<a href="memberAdd" class="text-center">회원가입</a>
					<a href="list" class="text-center">QnA</a>
				</div>
			</div>
		<form class="form-horizontal" action="memberAdd" method="post">
			<div class="form-group">
				<div class="col-sm-8" >
						<h2 class="text-center">회원가입 화면</h2>
				</div>
			</div>
			<div class="form-group">
				<label for="userid" class="col-sm-2 control-label">아이디</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="userid" id="userid"
						placeholder="userid">
					<button id="idcheck">중복확인</button>	
					<span id="result" style="color:red"></span>
				</div>
			</div>
			<div class="form-group">
				<label for="passwd" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="passwd"
						placeholder="passwd">
				</div>
			</div>
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="username"
						placeholder="username">
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-2 control-label">이메일</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="email"
						placeholder="email">
				</div>
			</div>
			<div class="form-group">
				<label for="phone" class="col-sm-2 control-label">전화번호</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="phone"
						placeholder="-없이 번호만 입력">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">저장</button>
					<input type="reset" value="취소" class="btn btn-default" >
				</div>
			</div>
		</form>
		
	</div>
</body>
</html>