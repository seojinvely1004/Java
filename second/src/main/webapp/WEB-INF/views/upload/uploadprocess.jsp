<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일업로드 결과</h1>
<h3>작성자 :${dto.name }</h3>
<h3>설명 :${dto.description }</h3>
<h3>업로드파일명1 :${dto.file1.originalFilename}</h3><!-- 서버에저장한이름이OriginalFileName -->
<h3>업로드파일명2 :${dto.file2.originalFilename}</h3>
<h3>c:/upload폴더에 저장했습니다.</h3><!-- 서버내부에 저장한 경로 -->
</body>
</html>