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
        <a class="item" href="${pageContext.request.contextPath}/category/listall"><i class="block layout"></i> 文章分类 </a>
        <a class="item active" href="${pageContext.request.contextPath}/article/listall"><i class="smile"></i> 所有文章 </a>
        <a class="item"><i class="calendar "></i> 关于我们 </a>
    </div>
    <div class="pusher">
        <div class="ui basic segment">
            <div class="pusher dimmed">
                <div class="ui basic segment">



                    <table class="ui striped table" style="margin-top: 100px;width: 1200px">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Date Joined</th>
                            <th>E-mail</th>
                            <th>Called</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>约翰·莉丽亚</td>
                            <td>2013年9月14日</td>
                            <td>jhlilk22@yahoo.com</td>
                            <td>否</td>
                        </tr>
                        <tr>
                            <td>杰米·哈灵顿</td>
                            <td>2014年1月11日</td>
                            <td>jamieharingonton@yahoo.com</td>
                            <td>是</td>
                        </tr>
                        <tr>
                            <td>吉尔·刘易斯</td>
                            <td>2014年5月11日</td>
                            <td>jilsewris22@yahoo.com</td>
                            <td>是</td>
                        </tr>
                        <tr>
                            <td>约翰·莉丽亚</td>
                            <td>2013年9月14日</td>
                            <td>jhlilk22@yahoo.com</td>
                            <td>否</td>
                        </tr>
                        <tr>
                            <td>约翰·莉丽亚</td>
                            <td>2013年9月14日</td>
                            <td>jhlilk22@yahoo.com</td>
                            <td>否</td>
                        </tr>
                        <tr>
                            <td>杰米·哈灵顿</td>
                            <td>2014年1月11日</td>
                            <td>jamieharingonton@yahoo.com</td>
                            <td>是</td>
                        </tr>
                        <tr>
                            <td>吉尔·刘易斯</td>
                            <td>2014年5月11日</td>
                            <td>jilsewris22@yahoo.com</td>
                            <td>是</td>
                        </tr>
                        <tr>
                            <td>约翰·莉丽亚</td>
                            <td>2013年9月14日</td>
                            <td>jhlilk22@yahoo.com</td>
                            <td>否</td>
                        </tr>
                        </tbody>
                    </table>




                </div>
            </div>
        </div>
    </div>

</div>


</body>
</html>
