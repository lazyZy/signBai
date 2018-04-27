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
                <a class="navbar-brand" href="/page/volunteerIndex"><img src="${request.contextPath}/img/heart.png"
                                                                         height="60"></a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/volunteerIndex">志愿者首页</a></li>
                    <li><a href="/page/volunteerIndex">About</a></li>
                    <li><a href="/page/volunteerIndex">Contact</a></li>
                    <li class="active"><a class="btn" href="/page/login">登录/注册</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->
    <div>
        <!-- Header -->
        <header id="head">
            <div class="container">
                <div class="row">
                    <h1 class="lead">{{title}}</h1>
                    <h3>欢迎{{volunteer.volunteerName}}</h3>
                    <p v-if="teamInfo!=null">所属团队：
                        <span v-if="teamInfo.teamStauts==2">{{teamInfo.teamName}}</span>
                        <span v-if="teamInfo.teamStauts==1">团队暂未审核</span>
                    </p>
                    <p v-if="teamInfo==null">
                        <a href="/page/volunteerTeam">
                            点此加入团队
                        </a>
                    </p>
                </div>
            </div>
        </header>
        <!-- /Header -->
        <!-- container -->
        <div class="container">

            <h2 class="text-center top-space">活动一览</h2>
            <br>
            <div class="row">
                <ol v-for="activity in activities" :key="activity.id">
                    <div class="col-sm-4" v-if="activity.status != 0 && activity.status !=3">
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
                        <li>
                            活动描述：{{ activity.introduce }}
                        </li>
                        <li>
                            开始时间：{{ activity.startTime }}
                        </li>
                        <li>
                            结束时间：{{ activity.endTime }}
                        </li>
                    </div>
                </ol>
            </div>
            <!-- /row -->

        </div>    <!-- /container -->

    </div>
</div>

<script src="${request.contextPath}/js/volunteerIndex.js"></script>
</body>
<#include "common/footer.html">
</html>