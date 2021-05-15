<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vasily
  Date: 10.05.2021
  Time: 01:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>рейс ${trip.trip_id}</title>
</head>
<body>
<form action="/adminhome" method="post">
    <input readonly required value="${user_id}" type="number" name="user_id">
    <input type="submit" value="обратно">
</form>
<br>
<table style="text-align: center;
              vertical-align: middle;
              width: 100%;
              border-collapse: collapse;">
    <tr style="border: solid black 2px;">
        <th style="border: solid black 2px;">id пользователя</th>
        <th style="border: solid black 2px;">имя</th>
        <th style="border: solid black 2px;">талефон</th>
        <th style="border: solid black 2px;">номер рейса</th>
    </tr>
    <c:forEach var="order" items="${tripsOrders}">
        <tr style="border: solid black 1px;">
            <td style="border: solid black 1px;">${order.user.user_id}</td>
            <td style="border: solid black 1px;">${order.user.user_name}</td>
            <td style="border: solid black 1px;">${order.user.user_contact_info}</td>
            <td style="border: solid black 1px;">${order.trip.trip_id}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
