<html>
<body>
<h2>Hello World!</h2>

<h3>
    Currently <span><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span> people online...
</h3>

<a href="/sys/login.jsp">login</a>

</body>
</html>
