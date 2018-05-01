<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
</head>
<body>
<div id="vm">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top headroom">
        <div class="container">
            <div class="navbar-header">
                <!-- Button for smallest screens -->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/page/adminIndex">
                    <img src="${request.contextPath}/img/heart.png" height="60">
                </a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/adminIndex">志愿者首页</a></li>
                    <li><a href="/page/adminIndex">About</a></li>
                    <li><a href="/page/adminIndex">Contact</a></li>
                    <li class="active"><a class="btn" href="/page/login">登录/注册</a></li>
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
                <h3>欢迎{{volunteer.volunteerName}}</h3>

            </div>
        </div>
    </header>
    <div v-show="isJoinTeam">
        <#--队长可见-->
        <div v-show="isLeader">
            <div class="container">

                <h2 class="text-center top-space">成员管理</h2>
                <br>
                <div class="row">

                    <ol v-for="volunteer in volunteers" :key="volunteer.id" >
                        <div class="col-sm-4" >
                            <li>
                                成员名称：{{ volunteer.volunteerName }}
                            </li>
                            <li v-show="3==volunteer.volunteerPwd">
                                成员状态：已批准
                            </li>
                            <li v-show="1==volunteer.volunteerPwd">
                                成员状态：待批准
                            </li>
                            <li v-show="0==volunteer.volunteerPwd">
                                成员状态：已驳回
                            </li>
                            <li>
                                成员手机号：{{ volunteer.volunteerPhone }}
                            </li>
                            <li v-if="volunteer.volunteerSex==1">
                                成员性别：男
                            </li>
                            <li v-if="volunteer.volunteerSex==0">
                                成员性别：女
                            </li>
                            <li>
                                成员地址：{{ volunteer.volunteerAdrress }}
                            </li>
                            <li v-show="1==volunteer.volunteerPwd">
                                <input type="button" v-on:click="toApproval(volunteer.id)" value="通过"/>
                                <input type="button" v-on:click="toReject(volunteer.id)" value="驳回"/>
                            </li>
                        </div>
                    </ol>
                </div>
                <!-- /row -->

            </div>    <!-- /container -->
        </div>
        <#--团员可见-->
        <div v-show="!isLeader">
            <div class="container">

                <h2 class="text-center top-space">团队成员</h2>
                <br>
                <div class="row">

                    <ol v-for="volunteer in volunteers" :key="volunteer.id" >
                        <div class="col-sm-4" v-if="3==volunteer.volunteerPwd">
                            <li>
                                成员名称：{{ volunteer.volunteerName }}
                            </li>
                            <li>
                                成员手机号：{{ volunteer.volunteerPhone }}
                            </li>
                            <li v-if="volunteer.volunteerSex==1">
                                成员性别：男
                            </li>
                            <li v-if="volunteer.volunteerSex==0">
                                成员性别：女
                            </li>
                        </div>
                    </ol>
                </div>
                <!-- /row -->

            </div>    <!-- /container -->
        </div>
    </div>
    <div v-show="!isJoinTeam">
        <div class="container">

            <h2 class="text-center top-space">活动一览</h2>
            <br>
            <div class="row">

                <ol v-for="teamInfo in teamInfos"  >
                    <div class="col-sm-4" v-if="2 == teamInfo.team.teamStatus">
                        <li>
                            成员名称：{{ teamInfo.team.teamName }}
                        </li>
                        <li >
                            团队地址：{{ teamInfo.team.teamRegion }}
                        </li>
                        <li >
                            成员成员数：{{ teamInfo.team.memberNum }}
                        </li>
                        <li >
                            队长名称：{{ teamInfo.volunteer.volunteerName }}
                        </li>
                        <li>
                            队长手机：{{ teamInfo.volunteer.volunteerPhone}}
                        </li>
                        <li v-if="teamInfo.volunteer.volunteerSex==1">
                            队长性别：男
                        </li>
                        <li v-if="teamInfo.volunteer.volunteerSex==0">
                            队长性别：女
                        </li>
                        <li>
                            队长地址：{{ teamInfo.volunteer.volunteerAdrress }}
                        </li>
                        <li >
                            <input type="button" v-on:click="toJoinTeam(teamInfo.team.id)" value="加入该团队"/>
                        </li>
                    </div>
                </ol>
            </div>
            <!-- /row -->

        </div>    <!-- /container -->
    </div>
</div>


<script src="${request.contextPath}/js/volunteerTeam.js"></script>
</body>
<#include "common/footer.html">
</html>