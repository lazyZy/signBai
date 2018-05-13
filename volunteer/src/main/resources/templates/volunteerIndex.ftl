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
                    <li><a href="/page/volunteer_team">我的团队</a></li>
                    <li><a href="/page/volunteer_info">修改我的信息</a></li>
                    <li v-if="isTeamLeader"><a href="/page/volunteer_activity">申请活动</a></li>
                    <li class="active"><a class="btn" href="/page/login">退出/登录</a></li>
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
                        <a href="/page/volunteer_team">
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
            <div v-show="!isTeamLeader" class="row">

                <ol v-for="activity in activities" :key="activity.id" >
                    <div class="col-sm-4" v-if="activity.status != 0 && activity.status !=3">
                        <li>
                            活动名称：{{ activity.name }}
                        </li>
                        <li v-show="2==activity.teamId">
                            活动状态：已参加(未审核)
                        </li>
                        <li v-show="0==activity.teamId">
                            活动状态：已参加(审核未通过)
                        </li>
                        <li v-show="3==activity.teamId">
                            活动状态：已参加(已审核)
                        </li>
                        <li v-show="1==activity.teamId">
                            活动状态：可参加
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
                        <li v-show="1==activity.teamId&& !isTeamLeader">
                            <input type="button" v-on:click="toJoinActivity(activity.id)" value="参加"/>
                        </li>
                    </div>
                </ol>
            </div>
            <!-- /row -->
            <div v-show="isTeamLeader" class="row">

                <ol v-for="activity in activities2" :key="activity.id" >
                    <div class="col-sm-4" v-if="activity.status == 2 && activity.status !=3">
                        <li>
                            活动名称：{{ activity.name }}
                        </li>
                        <li v-show="2==activity.status">
                            活动状态：进行中
                        </li>
                        <li v-show="3==activity.status">
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
                        <li v-show="2==activity.status" >
                            <label>活动总结 <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" v-model="activity.summary">
                        </li>
                        <li v-show="3==activity.status" >
                            活动总结：{{activity.summary}}
                        </li>
                        <li v-show="2==activity.status&& isTeamLeader">
                            <input type="button" v-on:click="toFinishActivity(activity.id,activity.summary)" value="完成"/>
                        </li>
                    </div>
                </ol>
            </div>
            <!-- /row -->
        </div>    <!-- /container -->

        <div v-show="isTeamLeader" class="container">

            <h2 class="text-center top-space">成员活动申请</h2>
            <br>
            <div class="row">

                <ol v-for="activityJoin in activityJoins" >
                    <div class="col-sm-4" >
                        <li>
                            成员名称：{{ activityJoin.volunteerName }}
                        </li>
                        <li>
                            成员手机：{{ activityJoin.volunteerPhone }}
                        </li>
                        <li>
                            成员邮箱：{{ activityJoin.volunteerMail }}
                        </li>
                        <li>
                            活动名称：{{ activityJoin.ActivityName }}
                        </li>
                        <li>
                            活动地点：{{ activityJoin.ActivityRegion }}
                        </li>
                        <li>
                            该申请状态：待审核
                        </li>
                        <li >
                            <input type="button" v-on:click="toAllow(activityJoin.volunteerId,activityJoin.activityId)" value="完成审核"/>
                        </li>
                    </div>
                </ol>
            </div>
        </div>    <!-- /container -->
    </div>
</div>

<script src="${request.contextPath}/js/volunteerIndex.js"></script>
</body>
<#include "common/footer.html">
</html>