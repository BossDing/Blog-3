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
</head>
<body>


<div class="ui bottom attached segment pushable">

    <div class="ui visible left vertical sidebar menu pink" style="padding-top: 50px">
        <h2 class="ui top header" style="margin-left: 11px">EBlog Console</h2>
        <a class="item" href="${pageContext.request.contextPath}/user/listall"><i class="home"></i> 用户管理 </a>
        <a class="item" href="${pageContext.request.contextPath}/category/listall"><i class="block layout"></i> 文章分类
        </a>
        <a class="item active" href="${pageContext.request.contextPath}/article/listall"><i class="smile"></i> 所有文章 </a>
        <a class="item" href="${pageContext.request.contextPath}/about/creator"><i class="calendar "></i> 关于我们</a>
    </div>
    <div class="pusher">
        <div class="ui basic segment">
            <div class="pusher dimmed">
                <div class="ui basic segment">


                    <table class="ui striped table" style="margin-top: 60px;width: 1200px">
                        <thead>
                        <tr>
                            <th>文章标题</th>
                            <th>文章副标题</th>
                            <th>文章描述</th>
                            <th>文章喜欢数</th>
                            <th>文章操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${articles}" var="article">
                            <tr>
                                <td>${article.title}</td>
                                <td>${article.subtitle}</td>
                                <td>${article.description}</td>
                                <td>${article.stars}</td>
                                <td>
                                    <a class="ui green basic button" href="${pageContext.request.contextPath}/article/update?id=${article.id}">修改</a>
                                    <a class="ui red basic button" href="${pageContext.request.contextPath}/article/delete?id=${article.id}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>

                        </tbody>
                        <tfoot>
                        <tr>
                            <th colspan="5">
                                <div class="ui right floated pagination menu">
                                    <c:forEach begin="1" end="${totalPage}" var="i">
                                        <a class="item"
                                           href="${pageContext.request.contextPath}/article/listbypage?pageNum=${i}">${i}</a>
                                    </c:forEach>
                                </div>
                            </th>
                        </tr>
                        </tfoot>
                    </table>


                </div>
            </div>
        </div>
    </div>

</div>


</body>
</html>
