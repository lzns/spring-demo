<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>这是WEB-INF下面的moreUpload.jsp,访问成功了！！！</h1>
    <form action="/testAudio/test1" enctype="multipart/form-data" method="post">
        <input type = 'file' name = "fileName">
        <input type = 'file' name = "fileName">
        <input type = 'file' name = "fileName">
        <button type="submit">测试文件上传</button>
    </form>
</body>
</html>