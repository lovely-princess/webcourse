<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>авторизация</title>
</head>
<body>
    <h3>авторизация</h3>
    <form action="/auth" method="post">
        <input required type="text" name="user_id" placeholder="id пользователя">
        <input type="submit" value="войти">
    </form>
    <h2><a href="/signup">зарегистрироваться</a></h2>
</body>
</html>