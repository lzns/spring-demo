<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>这是WEB-INF下面的test.jsp,访问成功了！！！</h1>
    <form action="/testAudio/test1" method="post" >
    name: <input name="name"/>
    createDate:<input type="datetime" name = "createDate"/>
    updateDate:<input type="datetime" name = "updateDate"/>
    <button type ="submit" value="tijiao" >提交</button>
    </form>
</body>
</html>