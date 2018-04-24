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
            <a class="navbar-brand" href="index.html"><img src="${request.contextPath}/img/heart.png" height="60"></a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li><a href="/page/index">Home</a></li>
                <li><a href="/page/index">About</a></li>
                <li><a href="/page/index">Contact</a></li>
                <li class="active"><a class="btn" href="/page/login">SIGN IN / SIGN UP</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
<!-- /.navbar -->

<header id="head" class="secondary"></header>

<!-- container -->
<div class="container">

    <ol class="breadcrumb">
        <li><a href="/page/index">Home</a></li>
        <li class="active">User access</li>
    </ol>

    <div class="row">

        <!-- Article main content -->
        <article class="col-xs-12 maincontent">
            <header class="page-header">
                <h1 class="page-title">Sign in</h1>
            </header>

            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <h3 class="thin text-center">Sign in to your account</h3>
                        <p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="/page/register">Register</a>
                            adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis
                            odio. </p>
                        <hr>

                        <form id="vm1">
                            <div id="vm1" class="top-margin">
                                <label>Username/Email <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="login.email">
                            </div>
                            <div id="vm1" class="top-margin">
                                <label>Password <span class="text-danger">*</span></label>
                                <input type="password" class="form-control" v-model="login.pwd">
                            </div>

                            <div id="vm1" class="top-margin">
                                <input type="checkbox" v-model="login.isAdmin" value=true checked="checked"/>管理员登录？
                            </div>

                            <div id="vm1" class="row">
                                <div class="col-lg-4 text-right">
                                    <button class="btn btn-action" type="submit" v-on:click="doLogin">Sign in</button>
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


<script src="${request.contextPath}/js/login.js"></script>
</body>
<#include "common/footer.html">
</html>