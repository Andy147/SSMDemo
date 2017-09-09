<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 2017/8/31
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="test/find.do" method="post">
    <input type="submit" value="查询所有"/>
  </form>
<form action="test/condition.do" method="post">
  ID：<input type="text" name="userId" id="userid"><br/>
  用户名：<input type="text" name="userName" id="name"><br/>
  密码：<input type="password" name="userPwd" id="pwd">
  <input type="submit" value="注册">
</form>
  <hr/>
  <form action="upload/image.do" enctype="multipart/form-data" method="post">
    file:<input type="file" name="file"><br>
    <input type="submit" value="upload file">
  </form>
  </body>
</html>
