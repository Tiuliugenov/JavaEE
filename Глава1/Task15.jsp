<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25.03.2023
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Task15" method="get">
    <label>Name</label>
    <input type="text" name="name">
    <label>Surname</label>
    <input type="text" name="surname">
    <label>Age</label>
    <input type="number" name="age">
    <label>Gender:</label>
    <label><input type="radio" name="gender" value="male">
    Male</label>
    <label>
    <input type="radio" name="gender" value="women">
        Women</label>
<button>send</button>
</form>
</body>
</html>
