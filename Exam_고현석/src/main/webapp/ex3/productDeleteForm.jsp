<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품삭제</title>
</head>
<body>
<h3>[ 상품 삭제 ]</h3>
	<form action="ProductDeleteServlet" method="post">
	   삭제할 상품 아이디:<input type="text" name="id"><br>
	   <input type="submit" value="삭제">
	</form>
</body>
</html>