<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script type="text/javascript" src="/js/layer.js"></script>
</head>
<body>

<div class="ui small modal">
    <h3 class="ui red header">删除警告</h3>
    <div class="image content">
        <img class="image">
        <div class="description">
            <p>
                您确定要删除?
            </p>
        </div>
    </div>
    <div class="actions">
        <div class="ui approve red button">删除</div>
        <div class="ui cancel green button">取消</div>
    </div>
</div>
<div class="ui bottom attached segment pushable">

    <div class="ui visible left vertical sidebar menu pink" style="padding-top: 50px">
        <h2 class="ui top header" style="margin-left: 11px">EBlog Console</h2>
        <a class="item" href="${pageContext.request.contextPath}/user/listall"><i class="home"></i> 用户管理 </a>
        <a class="item active" href="${pageContext.request.contextPath}/category/listall"><i class="block layout"></i> 文章分类 </a>
        <a class="item" href="${pageContext.request.contextPath}/article/listall"><i class="smile"></i> 所有文章 </a>
        <a class="item" href="${pageContext.request.contextPath}/about/creator"><i class="calendar "></i> 关于我们 </a>
    </div>
    <div class="pusher">
        <div class="ui basic segment">
            <div class="pusher dimmed">
                <div class="ui basic segment">
                    <a class="ui positive basic button right floated" style="position: absolute;right: 280px;top: 50px" href="${pageContext.request.contextPath}/category/add">添加分类</a>
                    <table class="ui fixed table right aligned" style="width: 1200px;margin-top: 100px">
                        <thead>
                            <tr>
                                <th class="left aligned">文章类别</th>
                                <th>类别描述</th>
                                <th>文章操作</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${categories}" var="category">
                                <tr>
                                    <td class="left aligned">${category.categoryName}</td>
                                    <td>${category.description}</td>
                                    <td>
                                        <a class="ui green basic button" href="${pageContext.request.contextPath}/category/update?id=${category.id}">修改</a>
                                        <a class="ui red basic button" onclick="deleteCategory(${category.id})">删除</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>


                </div>
            </div>
        </div>
    </div>

</div>

<script>
    function deleteCategory(id) {
        $('.ui.small.modal')
            .modal({
                blurring:true,
                onDeny:function () {
                    return true;
                },
                onApprove:function () {
                    $.post("${pageContext.request.contextPath}/category/deletebyid",{id:id},function (data,status) {
                        if (status==="success"){
                            layer.msg("删除成功",{
                                time:1000
                            })

                        }else{
                            layer.msg("删除失败",{
                                time:1000
                            })
                        }

                    })
                }
            })
            .modal('show');
    }
</script>
</body>
</html>
