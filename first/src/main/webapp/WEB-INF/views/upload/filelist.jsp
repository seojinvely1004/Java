<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>다운로드 목록을 보여드립니다.</h1>
<%
String[] filelist = (String[])request.getAttribute("filelist");
for(String filename : filelist){
	out.println("<h3>" + filename + "</h3>");
}
%>
</body>
</html>