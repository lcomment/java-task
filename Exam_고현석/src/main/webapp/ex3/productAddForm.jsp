<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
</head>
<body>
<h3>[ 상품 정보 입력 ]</h3>
	<form action="ProductAddServlet" method="post">
		<table border="1">
			<tr>
				<th>상품명</th>
				<td><input type="text" name="name"></input></td>
			</tr>
			<tr>
				<th>상품아이디</th>
				<td><input type="text" name="id"></input></td>
			</tr>
			<tr>
				<th>상품수량</th>
				<td><input type="text" name="amount"></input></td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="상품정보전송"></input>
					<input type="reset" value="다시입력"></input>
				</th>				
			</tr>

		</table>
	</form>
</body>
</html>