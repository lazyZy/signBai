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
                    <li class="active"><a class="btn" href="/page/login">重新登录</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->
    <div class="panel panel-default">
        <div class="panel-heading" id="vm">{{title}}

            <div class="form-group" id="vm">
                <p>欢迎{{admin.adminName}}</p>


            </div>

            <div id="vm">
                <ol v-for="volunteer in volunteers" :key="activity.id">
                    <li>
                        活动名称：{{volunteer.volunteerName }}
                    </li>
                    <li v-if="volunteer.volunteerSex == 0">
                        性别：女
                    </li>
                    <li v-if="volunteer.volunteerSex == 1">
                        性别：男
                    </li>
                    <li>
                        活动描述：{{ volunteer.volunteerPhone }}
                    </li>
                    <li>
                        开始时间：{{ volunteer.volunteerMail }}
                    </li>
                    <li>
                        结束时间：{{ volunteer.endTime }}
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
        </div>
    </div>
</div>
<script src="${request.contextPath}/js/adminVolunteer.js"></script>
</body>
<#include "common/footer.html">
</html>