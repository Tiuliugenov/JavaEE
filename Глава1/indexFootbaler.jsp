<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26.03.2023
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="AddFootballer" method="post">
    <label>Name:</label>
    <input type="text" placeholder="Insert name" name="name">
    <label>Surname</label>
    <input type="text" placeholder="Insert surname" name="surname">
    <label>Club</label>
    <select name="club">
        <option>Real Madrid</option>
        <option>M.U.</option>
        <option>Bavaria</option>
    </select>
    <label>Salary</label>
    <input type="number" placeholder="Insert salary" name="salary">
    <label>Transfer Price</label>
    <input type="number" placeholder="Insert transfer price" name="transfer_price">
    <button>Add Footballer</button>
</form>
</body>
</html>
