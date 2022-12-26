<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
    <h1> Login </h1>
    <div style="text-align: center">
        <form action="http://localhost:8080/s4/login" method="post">
            username: <input type="text" name="username"> <br>
            keyword: <input type="password" name="password"> <br>
            hobbies:
                <input type="checkbox" name="hobby" value="girl"> girl
                <input type="checkbox" name="hobby" value="coding"> coding
                <input type="checkbox" name="hobby" value="sleeping"> sleeping
                <input type="checkbox" name="hobby" value="eating"> eating
            <br>
            <input type="submit">
        </form>
    </div>
</body>
</html>
