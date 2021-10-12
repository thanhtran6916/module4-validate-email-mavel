<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 10/12/2021
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/validate" method="post">
    <input type="text" name="email">
    <button>submit</button>
</form>
<h1>${message}</h1>
</body>
</html>
