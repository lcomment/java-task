<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약정보</title>
</head>
<body>

<h3>예약정보</h3>
<hr>
<b>입력한 생년월일: <%= (String) request.getAttribute("birth") %></b>
<b>선택한 티겟: <%= (String) request.getAttribute("type") %></b>
<br>
나이: <%= (String) request.getAttribute("age") %>세<br> 
등급: <%= (String) request.getAttribute("classification") %><br> 
할인 적용 금액: <%= (String) request.getAttribute("dc") %>원<br> 
지불금액: <%= (String) request.getAttribute("cost") %>원<br> 
</body>
</html>