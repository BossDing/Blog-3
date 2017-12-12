<%--
  Created by IntelliJ IDEA.
  User: BeautifulSoup
  Date: 2017/12/12
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>About</title>
    <link rel="stylesheet" href="/css/semantic.min.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/semantic.min.js"></script>
</head>
<body>


<div class="ui bottom attached segment pushable">

    <div class="ui visible left vertical sidebar menu pink" style="padding-top: 50px">
        <h2 class="ui top header" style="margin-left: 11px">EBlog Console</h2>
        <a class="item" href="${pageContext.request.contextPath}/user/listall"><i class="home"></i> 用户管理 </a>
        <a class="item" href="${pageContext.request.contextPath}/category/listall"><i class="block layout"></i> 文章分类</a>
        <a class="item" href="${pageContext.request.contextPath}/article/listall"><i class="smile"></i> 所有文章 </a>
        <a class="item active" href="${pageContext.request.contextPath}/about/creator"><i class="calendar "></i> 关于我们 </a>
    </div>
    <div class="pusher">
        <div class="ui basic segment">
            <div class="pusher dimmed">
                <div class="ui basic segment">



                    <div class="ui four cards " style="height: auto;margin-top: 70px">
                        <div class="card" style="width: 270px">
                            <div class="blurring dimmable image">
                                <div class="ui dimmer">
                                    <div class="content">
                                        <div class="center">
                                            <div class="ui inverted button">Add Friend</div>
                                        </div>
                                    </div>
                                </div>
                                <img src="/img/elliot.jpg">
                            </div>
                            <div class="content">
                                <a class="header">潘盛东</a>
                                <div class="meta">
                                    <span class="date">进行前端界面的设计与开发</span>
                                </div>
                            </div>
                            <div class="extra content">
                                <a>
                                    Group leader
                                </a>
                            </div>
                        </div>
                        <div class="card" style="width: 270px">
                            <div class="blurring dimmable image">
                                <div class="ui inverted dimmer">
                                    <div class="content">
                                        <div class="center">
                                            <div class="ui primary button">Add Friend</div>
                                        </div>
                                    </div>
                                </div>
                                <img src="/img/elyse.png">
                            </div>
                            <div class="content">
                                <a class="header">汲生源</a>
                                <div class="meta">
                                    <span class="date">进行整体项目的规划和设计文档的编写</span>
                                </div>
                            </div>
                            <div class="extra content">
                                <a>
                                    Group Crew
                                </a>
                            </div>
                        </div>
                        <div class="card" style="width: 270px">
                            <div class="blurring dimmable image">
                                <div class="ui inverted dimmer">
                                    <div class="content">
                                        <div class="center">
                                            <div class="ui primary button">Add Friend</div>
                                        </div>
                                    </div>
                                </div>
                                <img src="/img/jenny.jpg">
                            </div>
                            <div class="content">
                                <a class="header">翟铮永</a>
                                <div class="meta">
                                    <span class="date">进行后台管理界面的编写开发</span>
                                </div>
                            </div>
                            <div class="extra content">
                                <a>
                                    Group Crew
                                </a>
                            </div>
                        </div>
                        <div class="card" style="width: 270px">
                            <div class="blurring dimmable image">
                                <div class="ui inverted dimmer">
                                    <div class="content">
                                        <div class="center">
                                            <div class="ui primary button">Add Friend</div>
                                        </div>
                                    </div>
                                </div>
                                <img src="/img/matthew.png">
                            </div>
                            <div class="content">
                                <a class="header">王福运</a>
                                <div class="meta">
                                    <span class="date">进行后台设计开发</span>
                                </div>
                            </div>
                            <div class="extra content">
                                <a>
                                    Group Crew
                                </a>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>
    </div>

</div>


</body>
</html>
