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
                    <li><a href="/page/volunteerIndex">志愿者首页</a></li>
                    <li><a href="/page/volunteer_team">我的团队</a></li>
                    <li v-if="isTeamLeader"><a href="/page/volunteer_activity">申请活动</a></li>
                    <li class="active"><a class="btn" href="/page/login">退出/登录</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>

    <header id="head" class="secondary"></header>
    <!-- /.navbar -->
    <div class="container">

        <ol class="breadcrumb">
            <li><a href="/page/volunteerIndex">志愿者主页</a></li>
            <li class="active">申请活动</li>
        </ol>

        <div class="row">

            <!-- Article main content -->
            <article class="col-xs-12 maincontent">
                <header class="page-header">
                    <h1 class="page-title">申请活动</h1>
                </header>

                <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <form id="vm">
                                <div class="top-margin">
                                    <label>活动名称： <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="activity.name">
                                </div>
                                <div class="top-margin">
                                    <label>活动地点 <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="activity.region">
                                </div>
                                <div class="top-margin">
                                    <label>活动介绍： <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="activity.introduce" />
                                </div>
                                <div class="top-margin">
                                    <label>开始时间： <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="activity.startTime" placeholder="2018-01-01 01:01:01"/>
                                </div>
                                <div class="top-margin">
                                    <label>结束时间 <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="activity.endTime" placeholder="2018-01-01 01:01:01"/>
                                </div>
                                <hr>

                                <div class="row">
                                    <div class="col-lg-8">
                                    </div>
                                    <div class="col-lg-4 text-right">
                                        <span class="btn btn-action" type="submit" v-on:click="confirm">申请</span>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>

                </div>

            </article>
            <!-- /Article -->

        </div>
    </div>    <!-- /container -->
</div>

<script src="${request.contextPath}/js/volunteerActivity.js"></script>
</body>
<#include "common/footer.html">
</html>