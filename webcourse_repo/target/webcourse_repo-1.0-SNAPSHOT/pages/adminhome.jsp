<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vasily
  Date: 04.05.2021
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>администратор</title>
</head>
<body>
администратор
<table>
    <tr>
        <th>id</th>
        <th>Имя</th>
        <th>Контактные данные</th>
    </tr>
    <c:forEach var="user" items="${usersList}">
        <tr>
            <td>${user.user_id}</td>
            <td>${user.user_name}</td>
            <td>${user.user_contact_info}</td>
        </tr>
    </c:forEach>
</table>

<a href="/userhome"><button type="button">пользователь</button></a>
</body>
</html>
