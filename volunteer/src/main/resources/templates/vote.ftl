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
                <a class="navbar-brand" href="/page/index"><img src="${request.contextPath}/img/heart.png" height="60"></a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/index">首页</a></li>
                    <li><a href="/page/vote">为志愿者投票</a></li>
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
                <h1 id="vm" class="lead">{{title}}</h1>
                <h3 id="vm" v-if="volunteer.volunteerName.length > 0">欢迎{{volunteer.volunteerName}}</h3>
                <p class="tagline">以心化力，投身公益。</p>
            </div>
        </div>
    </header>

    <!-- container -->
    <div class="container">

        <h2 class="text-center top-space">为志愿者投票</h2>
        <br>
            <div class="row">
                <ol v-for="volunteer in volunteers" :key="volunteer.id" >
                    <div class="col-sm-3" >
                        <li>
                            <img v-if="volunteer.id%10 == 1" src="../img/header/1.jpg">
                            <img v-if="volunteer.id%10 == 2" src="../img/header/2.jpg">
                            <img v-if="volunteer.id%10 == 3" src="../img/header/3.jpg">
                            <img v-if="volunteer.id%10 == 4" src="../img/header/4.jpg">
                            <img v-if="volunteer.id%10 == 5" src="../img/header/5.jpg">
                            <img v-if="volunteer.id%10 == 6" src="../img/header/6.jpg">
                            <img v-if="volunteer.id%10 == 7" src="../img/header/7.jpg">
                            <img v-if="volunteer.id%10 == 8" src="../img/header/8.jpg">
                            <img v-if="volunteer.id%10 == 9" src="../img/header/9.jpg">
                        </li>
                        <li>
                            成员名称：{{ volunteer.volunteerName }}
                        </li>
                        <li v-if="volunteer.volunteerSex==1">
                            成员性别：男
                        </li>
                        <li v-if="volunteer.volunteerSex==0">
                            成员性别：女
                        </li>
                        <li>
                            当前票数：{{ volunteer.star}}
                        </li>
                        <li v-show="stars.length<3">
                            <input type="button" v-on:click="toApproval(volunteer.id)" value="投票"/>
                        </li>
                        </br>
                        </br>
                    </div>
            </ol>
        </div> <!-- /row -->

    </div>    <!-- /container -->

    <!-- Social links. @TODO: replace by link/instructions in template -->
    <section id="social">
        <div class="container">
            <div class="wrapper clearfix">
                <!-- AddThis Button BEGIN -->
                <div class="addthis_toolbox addthis_default_style">
                    <a class="addthis_button_facebook_like" fb:like:layout="button_count"></a>
                    <a class="addthis_button_tweet"></a>
                    <a class="addthis_button_linkedin_counter"></a>
                    <a class="addthis_button_google_plusone" g:plusone:size="medium"></a>
                </div>
                <!-- AddThis Button END -->
            </div>
        </div>
    </section>
</div>

<script src="${request.contextPath}/js/index.js"></script>

</body>
<#include "common/footer.html">
</html>
