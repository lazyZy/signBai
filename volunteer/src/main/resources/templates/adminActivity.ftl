<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <style>
        li {
            list-style: none;
        }
    </style>
</head>
<body>
<div id="vm">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top headroom">
        <div class="container">
            <div class="navbar-header">
                <!-- Button for smallest screens -->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
                <a class="navbar-brand" href="/page/adminIndex"><img src="${request.contextPath}/img/heart.png"
                                                               height="60"></a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/adminIndex">管理员首页</a></li>
                    <li v-if="admin.adminAuthority > 1"><a href="/page/admin_register">注册管理员账号</a></li>
                    <li v-if="admin.adminAuthority > 1"><a href="/page/adminVolunteer">团队管理</a></li>
                    <li class="active"><a class="btn" href="/page/login">退出/登录</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->

    <!-- Header -->
    <header id="head">
        <div class="container">
            <div class="row">
                <h1 class="lead">{{title}}</h1>
                <h3>欢迎{{admin.adminName}}</h3>
            </div>
        </div>
    </header>
    <!-- /Header -->

    <!-- container -->
    <div class="container">

        <h2 class="text-center top-space">更改活动状态</h2>
        <br>
        <div class="row">
            <ol class="col-sm-4" v-for="activity in activities" :key="activity.id">
                <li>
                    活动名称：{{ activity.name }}
                </li>
                <li v-if="activity.status == 1">
                    活动状态：待审核
                </li>
                <li v-if="activity.status == 2">
                    活动状态：已批准
                </li>
                <li v-if="activity.status == 0">
                    活动状态：已驳回
                </li>
                <li v-if="activity.status == 3">
                    活动状态：已完成
                </li>
                <li>
                    活动描述：{{ activity.introduce }}
                </li>
                <li>
                    开始时间：{{ activity.startTime }}
                </li>
                <li>
                    结束时间：{{ activity.endTime }}
                </li>
                <li v-if="activity.status == 1">
                    <input type="button" v-on:click="toAdopt(activity.id)" value="通过"/>
                    &nbsp;&nbsp;<input type="button" v-on:click="toRefuse(activity.id)" value="驳回"/>
                </li>
                <li v-if="activity.status == 2">
                    <input type="button" v-on:click="toRefuse(activity.id)" value="驳回"/>
                </li>
                <li v-if="activity.status == 0">
                    <input type="button" v-on:click="toAdopt(activity.id)" value="通过"/>
                </li>
            </ol>
        </div>
        <!-- /row -->

    </div>    <!-- /container -->

</div>

<script src="${request.contextPath}/js/adminActivity.js"></script>
</body>
<#include "common/footer.html">
</html>