<%@page import="mvc.HelloDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>컨트롤러부터 받은 메세지</h1>
<%
HelloDTO dto = (HelloDTO)request.getAttribute("model");
%>
<H3>자바스크립트태그 = <%=dto.getMessage() %></H3>
<H3>el = ${model.message} </H3>
</body>
</html>