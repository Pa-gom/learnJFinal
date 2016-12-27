<!DOCTYPE html>
<html>
<head>
    <title>就业管理中心系统</title>
    <link rel="stylesheet" type="text/css" href="./themes/30480/fzu_new/css/reset.css"/>
    <link rel="stylesheet" type="text/css" href="./themes/30480/fzu_new/css/login.css"/>
</head>
<body>
<div id="container">
    <form action="/stuffLogin" method="post">

        <label for="username">用户名:</label>

        <input type="text" id="name" name="name">

        <label for="password">密码:</label>

        <p><a href="#">忘记密码?</a></p>

        <input type="password" id="pwd" name="pwd">

        <div id="lower">

            <input type="checkbox"><label class="check" for="checkbox">记住密码</label>

            <input type="submit" value="登录">

        </div>

    </form>
</div>
</body>
</html>
