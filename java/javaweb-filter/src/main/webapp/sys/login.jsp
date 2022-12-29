<%--
  Created by IntelliJ IDEA.
  User: loujieming
  Date: 2022/12/29
  Time: 10:36 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Login</h1>
    <form action="/servlet/login" method="post">
        username: <input type="text" name="username"> <br>
        password: <input type="password" name="password"> <br>
        <input type="submit">
    </form>
</body>
</html>
