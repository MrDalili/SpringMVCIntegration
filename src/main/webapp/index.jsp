<%--
  Created by IntelliJ IDEA.
  User: 27548
  Date: 2019/4/16
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试mvc</a>
    <br/>
    <form action="account/save" method="post">
        名称：<input name="name" type="text"/>
        金额：<input type="text" name="money"/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
