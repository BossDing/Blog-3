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
        <div class="header">Welcome to Edit!</div>
        <p>填写下面的表单来添加新的账户</p>
    </div>
    <form class="ui form attached fluid segment celled" action="${pageContext.request.contextPath}/user/adduser" method="post">
        <div class="two fields">
            <div class="field">
                <label>用户名</label>
                <input placeholder="Username" type="text" name="username">
            </div>
            <div class="field">
                <label>密码</label>
                <input placeholder="Password" type="password" name="password">
            </div>
        </div>
        <div class="field">
            <label>个人描述</label>
            <input placeholder="Description" type="text" name="description">
        </div>
        <div class="field">
            <label>手机号</label>
            <input placeholder="Phone" type="text" name="phone">
        </div>
        <div class="field">
            <label>地址信息</label>
            <input placeholder="Address" type="text" name="address">
        </div>
        <%--<div class="field">
            <label>上传头像</label>
            <input placeholder="Avatar" type="text">
        </div>--%>
        <div class="field">
            <label>头像地址</label>
            <input placeholder="Avatar" type="text"  name="avatar">
        </div>
        <input class="field ui blue submit button fluid" type="submit"/>
    </form>
</div>


</body>
</html>
