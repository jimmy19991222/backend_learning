<%--
  Created by IntelliJ IDEA.
  User: loujieming
  Date: 2022/12/29
  Time: 10:35 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <%--%>
<%--        Object user_session = request.getSession().getAttribute("USER_SESSION");--%>

<%--        if (user_session == null){--%>
<%--            response.sendRedirect("/sys/login.jsp");--%>
<%--        }--%>
<%--    %>--%>
    <h1>main page</h1>
    <h3>login success!</h3>
<%--    <h3> Hello, <span><%=this.getServletConfig().getServletContext().getAttribute("username")%></span> !</h3>--%>
    <a href="/servlet/logout">logout</a>
</body>
</html>
