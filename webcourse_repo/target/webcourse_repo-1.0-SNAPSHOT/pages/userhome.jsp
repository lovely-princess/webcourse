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
    <!--<link href="/style/style.css" rel="stylesheet" type="text/css"/>-->
    <title>пользователь</title>
    <style>
        #map{
        width: 1300px;
        height: 1390px;
        background: url("/style/map.svg") bottom left / contain no-repeat;
    }</style>
</head>
<body>
<a href="/adminhome"><button type="button">администратор</button></a>
<img src="/style/map.svg">
<a href="/userhome" id="map" style="width: 1300px; height: 1390px;"></a>

</body>
</html>
