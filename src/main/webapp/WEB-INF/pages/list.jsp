<%--
  Created by IntelliJ IDEA.
  User: FLY
  Date: 2021/2/1
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>success</h1>
    ${list}
    <c:forEach items="${list}" var="i">
        <p>${i.name}--${i.money}</p>
    </c:forEach>
</body>
</html>
