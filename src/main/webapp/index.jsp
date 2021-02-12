<%--
  Created by IntelliJ IDEA.
  User: FLY
  Date: 2021/2/1
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/list">hello</a>
    <hr>
    <form action="/account/save" method="post">
        姓名：<input name="name"><br>
        金额：<input name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
