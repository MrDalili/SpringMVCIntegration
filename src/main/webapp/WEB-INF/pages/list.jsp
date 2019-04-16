<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 27548
  Date: 2019/4/16
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>list</h3>
    <c:forEach items="${list}" var="a" >
        ${a.name}+${a.money}<br/>
    </c:forEach>
</body>
</html>
