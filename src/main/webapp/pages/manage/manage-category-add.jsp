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

<div style="width: 500px;height:700px;position: absolute;left: 50%;top: 50%;margin-left: -250px;margin-top: -250px">
    <div class="ui attached message">
        <div class="header">Welcome to Add New Category!</div>
        <p>填写下面的表单来添加新的分类</p>
    </div>
    <form class="ui form attached fluid segment celled" method="post" action="${pageContext.request.contextPath}/category/addcategory">
        <div class="field">
            <label>分类名称</label>
            <input placeholder="CategoryName" type="text" name="categoryName">
        </div>

        <div class="field">
            <label>分类描述</label>
            <textarea rows="2" name="description"></textarea>
        </div>
        <input class="field ui blue submit button fluid" type="submit"/>
    </form>
</div>

</body>
</html>
