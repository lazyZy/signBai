<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
</head>
<body>
<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top headroom">
    <div class="container">
        <div class="navbar-header">
            <!-- Button for smallest screens -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
            <a class="navbar-brand" href="/page/index"><img src="${request.contextPath}/img/heart.png" height="60"></a>
            <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li><a href="/page/volunteerIndex">志愿者首页</a></li>
                <li class="active"><a class="btn" href="/page/login">登录/注册</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
<!-- /.navbar -->

<header id="head" class="secondary"></header>

<div id="vm">
<!-- container -->
<div class="container">

    <ol class="breadcrumb">
        <li><a href="/page/index">主页</a></li>
        <li class="active">个人信息修改</li>
    </ol>

    <div class="row">

        <!-- Article main content -->
        <article class="col-xs-12 maincontent">
            <header class="page-header">
                <h1 class="page-title">个人信息修改</h1>
            </header>

            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <h3 class="thin text-center">修改你的账号</h3>
                        <hr>

                        <form id="vm">
                            <div class="top-margin">
                                <label>旧邮箱 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="loginReq.email">
                            </div>
                            <div class="top-margin">
                                <label>旧密码 <span class="text-danger">*</span></label>
                                <input type="password" class="form-control" v-model="loginReq.pwd">
                            </div>
                            <div class="top-margin">
                                <label>新邮箱 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="volunteer.volunteerMail">
                            </div>
                            <div class="top-margin">
                                <label>新密码 <span class="text-danger">*</span></label>
                                <input type="password" class="form-control" v-model="volunteer.volunteerPwd">
                            </div>
                            <div class="top-margin">
                                <label>姓名 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="volunteer.volunteerName" placeholder="姓名"/>
                            </div>
                            <div class="top-margin">
                                <label>性别 <span class="text-danger">*</span></label>
                                <br/>
                                <input v-model="volunteer.volunteerSex" type="radio" value="0"/>女
                                <input v-model="volunteer.volunteerSex" type="radio" value="1"/>男
                            </div>
                            <div class="top-margin">
                                <label>地址 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="volunteer.volunteerAdrress" placeholder="地址"/>
                            </div>
                            <div class="top-margin">
                                <label>手机号 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="volunteer.volunteerPhone" placeholder="手机号"/>
                            </div>

                            <hr>

                            <div class="row">
                                <div class="col-lg-8">
                                </div>
                                <div class="col-lg-4 text-right">
                                    <span class="btn btn-action" type="submit" v-on:click="confirm">修改</span>
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
<script src="${request.contextPath}/js/volunteerInfo.js"></script>

</body>
<#include "common/footer.html">
</html>