<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<!--http://mitest.shankephone.com/mi/audioRepair/repair.do  -->
<body>
    <h1>这是WEB-INF下面的test.jsp,访问成功了！！！本地测试</h1>
    <form action="http://localhost:8080/mi/audioRepair/repair.do" enctype="multipart/form-data" method="post">
        <input type = 'file' name = "fileName">
        <button type="submit">测试文件上传</button>
    </form>
    
    <form action="http://mitest.shankephone.com/mi/audioRepair/repair.do" enctype="multipart/form-data" method="post">
        <input type = 'file' name = "fileName">
        <button type="submit">测试环境测试文件上传</button>
    </form>
   <!--  <form action="http://localhost:8080/mi/classesScheduling/importExcelData.do" enctype="multipart/form-data" method="post">
        <input type = 'file' name = "fileName">
        <input  type = "hidden" name = "userKey" value = "6020283b42737f7230b648ab7d6e5de9">
        <button type="submit">测试文件上传</button>
    </form> -->
    
</body>
</html>