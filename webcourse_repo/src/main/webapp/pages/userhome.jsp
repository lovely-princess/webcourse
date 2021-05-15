<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vasily
  Date: 04.05.2021
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/style/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>пользователь</title>
    <!--<link href="/style/style.css" rel="stylesheet" type="text/css"/>
    <style>
        #map{
        width: 1300px;
        height: 1390px;
        background: url("/style/map.svg") bottom left / contain no-repeat;
    }</style>-->
</head>
<body>
<h2>пользователь</h2>
<p>
    <c:if test="${is_admin}">
        <form action="/adminhome" method="post">
            <input readonly required value="${user_id}" type="number" name="user_id">
            <input type="submit" value="администратор">
        </form>
        <!--<a href="/adminhome"><button type="button">администратор</button></a>-->
    </c:if>
<img src="https://i.yapx.ru/MQSzA.png" width="500px" height="535px">
    <!-- MAP -->
</p>

<p>
<form action="/selecttrip" method="post">
    <label for="user_id">ваш id:</label>
    <input id="user_id" readonly required value="${user_id}" type="number" name="user_id">
    <label for="from">откуда</label>
    <select required name="from" id="from">
        <option></option>
        <option value="1">край мира</option>
        <option value="2">камень познания</option>
        <option value="3">картофельная грядка</option>
        <option value="4">коловорот</option>
        <option value="5">кривая дорожка</option>
        <option value="6">карман Иисуса</option>
        <option value="7">брадикардия</option>
        <option value="8">невосполнимая потеря</option>
        <option value="9">костер инквизиции</option>
        <option value="10">улица Ленина</option>
        <option value="11">проклятое место</option>
        <option value="12">предательство лучшего друга</option>
        <option value="13">последний рубеж</option>
        <option value="14">самец гепарда</option>
        <option value="15">поле заблудшей души</option>
        <option value="16">начало конца</option>
        <option value="17">ананасовый сироп</option>
        <option value="18">магический амулет</option>
        <option value="19">смысл жизни</option>
    </select>
    <label for="to">куда</label>
    <select required name="to" id="to">
        <option></option>
        <option value="1">край мира</option>
        <option value="2">камень познания</option>
        <option value="3">картофельная грядка</option>
        <option value="4">коловорот</option>
        <option value="5">кривая дорожка</option>
        <option value="6">карман Иисуса</option>
        <option value="7">брадикардия</option>
        <option value="8">невосполнимая потеря</option>
        <option value="9">костер инквизиции</option>
        <option value="10">улица Ленина</option>
        <option value="11">проклятое место</option>
        <option value="12">предательство лучшего друга</option>
        <option value="13">последний рубеж</option>
        <option value="14">самец гепарда</option>
        <option value="15">поле заблудшей души</option>
        <option value="16">начало конца</option>
        <option value="17">ананасовый сироп</option>
        <option value="18">магический амулет</option>
        <option value="19">смысл жизни</option>
    </select>
    <input type="submit" value="билеты">
</form>
</p>

</body>
</html>
