<%--
  Created by IntelliJ IDEA.
  User: vasily
  Date: 12.05.2021
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>добавление пользователя</title>
</head>
<body>
<form action="/adminhome" method="post">
    <input readonly required value="${user_id}" type="number" name="user_id">
    <input type="submit" value="администратор">
</form>
<form action="/addnewuser" method="post">
    <input style="width: 0px" readonly required value="${user_id}" type="number" name="user_id">
    <label for="name">ФИО</label>
    <input required type="text" name="name" id="name">

    <label for="phone">телефон</label>
    <input required type="text" id="phone" name="phone">

    <label for="admin">админ?</label>
    <input required type="checkbox" id="admin" name="admin">

    <button type="submit">добавить пользователя</button>
</form>

</body>
</html>
