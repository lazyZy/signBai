<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
</head>
<body>
<div id="vm1">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top headroom">
        <div class="container">
            <div class="navbar-header">
                <!-- Button for smallest screens -->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
                <a class="navbar-brand" href="/page/index"><img src="${request.contextPath}/img/heart.png"
                                                                height="60"></a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/index">首页</a></li>
                    <li class="active"><a class="btn" href="/page/login">登录/注册</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->

    <header id="head" class="secondary"></header>

    <!-- container -->
    <div class="container">

        <ol class="breadcrumb">
            <li><a href="/page/index">主页</a></li>
            <li class="active">登录</li>
        </ol>

        <div class="row">

            <!-- Article main content -->
            <article class="col-xs-12 maincontent">
                <header class="page-header">
                    <h1 class="page-title">登录 </h1>
                </header>

                <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <h3 class="thin text-center">登录你的账号</h3>
                            <p class="text-center text-muted">尚未拥有自己的账号？请先<a href="/page/register">注册</a></p>
                            <hr>

                            <form>
                                <div class="top-margin">
                                    <label>邮箱 <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" v-model="login.email">
                                </div>
                                <div class="top-margin">
                                    <label>密码 <span class="text-danger">*</span></label>
                                    <input type="password" class="form-control" v-model="login.pwd">
                                </div>

                                <div class="top-margin">
                                    <input type="checkbox" v-model="login.isAdmin" value=true checked="checked"/>管理员登录？
                                </div>

                                <div class="row">
                                    <div class="col-lg-8">
                                    </div>
                                    <div class="col-lg-4 text-right">
                                        <span class="btn btn-action" type="submit" v-on:click="confirm">登录</span>
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


<script src="${request.contextPath}/js/login.js"></script>
</body>
<#include "common/footer.html">
</html>