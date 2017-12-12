<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="/css/semantic.min.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/semantic.min.js"></script>
</head>
<body>
<div style="width: 500px;height:700px;position: absolute;left: 50%;top: 50%;margin-left: -250px;margin-top: -350px">
    <div class="ui attached message">
        <div class="header">Welcome to Update!</div>
        <p>填写下面的表单来修改当前账户</p>
    </div>
    <form class="ui form attached fluid segment celled">
        <div class="two fields">
            <div class="field">
                <label>用户名</label>
                <input placeholder="Username" type="text" value="${user.username}">
            </div>
            <div class="field">
                <label>密码</label>
                <input placeholder="Password" type="password" value="${user.password}">
            </div>
        </div>
        <div class="field">
            <label>个人描述</label>
            <input placeholder="Description" type="text" value="${user.description}">
        </div>
        <div class="field">
            <label>手机号</label>
            <input placeholder="Phone" type="text" value="${user.phone}">
        </div>
        <div class="field">
            <label>地址信息</label>
            <input placeholder="Address" type="text" value="${user.address}">
        </div>
        <div class="field">
            <label>头像地址</label>
            <input placeholder="Avatar" type="text" value="${user.avatar}">
        </div>
        <div class="field ui blue submit button fluid">Submit</div>
    </form>
</div>


</body>
</html>
