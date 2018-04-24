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
        <li><a href="index.html">Home</a></li>
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
                        <p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signup.html">Register</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>
                        <hr>

                        <form id="vm">
                            <div class="top-margin">
                                <label>Username/Email <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="register.email">
                            </div>
                            <div class="top-margin">
                                <label>Password <span class="text-danger">*</span></label>
                                <input type="password" class="form-control" v-model="register.pwd">
                            </div>
                            <div class="top-margin">
                                <label>姓名 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="register.name" placeholder="姓名"/>
                            </div>
                            <div class="top-margin">
                                <label>性别 <span class="text-danger">*</span></label>
                                <br/>
                                <input v-model="register.sex" type="radio" value="0"/>女
                                <input v-model="register.sex" type="radio" value="1"/>男
                            </div>
                            <div class="top-margin">
                                <label>地址 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="register.adrress" placeholder="地址"/>
                            </div>
                            <div class="top-margin">
                                <label>手机号 <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" v-model="register.phone" placeholder="手机号"/>
                            </div>
                            <div class="top-margin">
                                <input type="checkbox" v-model="isTeamLeader" value=true checked="checked"/>是否创建团队？
                            </div>

                            <hr>

                            <div class="row">
                                <div class="col-lg-8">
                                    <b><a href="">Forgot password?</a></b>
                                </div>
                                <div class="col-lg-4 text-right">
                                    <button class="btn btn-action" type="submit" v-on:click="confirm">Sign in</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>

        </article>
        <!-- /Article -->

    </div>
</div>	<!-- /container -->
<script src="${request.contextPath}/js/register.js"></script>

</body>
<#include "common/footer.html">
</html>