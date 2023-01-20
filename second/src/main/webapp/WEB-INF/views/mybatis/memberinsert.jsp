<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html form(파라미터이름)--MemberDTO(프로퍼티이름)--Member테이블(컬럼이름)저장 -->
	<form action="<%=request.getContextPath()%>/memberinsert" 
	enctype="multipart/form-data" method="post">
		<table>
			<tr>
				<th><label for="id"> jsp아이디 입력 : </label></th>
				<td><input type="text" id="id" name="id" required></td>
			</tr>
			<tr>
				<th><label for="pw"> 비번 입력 : </label></th>
				<td><input type="password" id="pw" name="pw" required></td>
			</tr>
			<tr>
				<th><label for="name"> 이름 입력 : </label></th>
				<td><input type="text" id="name" name="name" required></td>
			</tr>
			<tr>
				<th><label for="phone"> 번호 입력 : </label></th>
				<td><input type="text" id="phone" name="phone" value="010"
					required></td>
			</tr>
			<tr>
				<th><label for="email"> 이메일 입력 : </label></th>
				<td><input type="email" id="email" name="email"
					value="??@sba.com" required></td>
			</tr>
			<tr>
				<th><label for="address"> 주소 입력 : </label></th>
				<td><input type="text" id="address" name="address" required></td>
			</tr>
			<tr>
				<th><label for="address"> 사진 선택 : </label></th>
				<td><input type="imagefile" id="imagefile" name="imagefile"></td>
			</tr>
			<tr>
				<th><input type="submit" value="회원가입"></th>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>