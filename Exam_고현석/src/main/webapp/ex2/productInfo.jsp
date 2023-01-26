<%@page import="com.dto.Product"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록정보</title>
</head>
<body>
	<b>상품입력 결과</b>
	<hr />
	<table border='1'>
		<tr>
			<th>상품명</th>
			<th>상품아이디</th>
			<th>수량</th>
		</tr>
		<%
			HashMap<String, Product> products = (HashMap<String, Product>) request.getAttribute("products");
			for(String key : products.keySet()) {
		%>
		<tr>
			<th><%= products.get(key).getName() %></th>
			<th><%= products.get(key).getId() %></th>
			<th><%= products.get(key).getAmount() %></th>
		</tr>
		<%
			}
		%>
	</table>
	<a href="productForm.jsp">상품 입력하기</a>
</body>
</html>