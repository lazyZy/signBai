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
            <p class="tagline">以心化力，投身公益。</p>
        </div>
    </div>
</header>
<!-- /Header -->
    </br>
    </br>
    <div class="container myCarousel">
        <div id="carousel-example-generic" class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1" ></li>
                <li data-target="#carousel-example-generic" data-slide-to="2" ></li>
                <li data-target="#carousel-example-generic" data-slide-to="3" ></li>
            </ol>
            <div class="carousel-inner" >
                <div class="item active">
                    <p style="text-align: center"><img src="../img/志愿者活动照片.jpg" style="height: 440px;"width="912px" ></p>
                    <div class="carousel-caption">
                        <h3>天工大爱心团</h3>
                        <p>鹤童养老院之行</p>
                    </div>
                </div>
                <div class="item">
                    <p style="text-align: center"><img src="../img/志愿者活动2.jpg" style="height: 440px;"width="912px" ></p>
                    <div class="carousel-caption">
                        <h3>天大志愿者协会</h3>
                        <p>义工活动</p>
                    </div>
                </div>
                <div class="item">
                    <p style="text-align: center"><img src="../img/志愿者活动3.jpg" style="height: 440px;"width="912px" ></p>
                    <div class="carousel-caption">
                        <h3>天津财经大学志愿者协会</h3>
                        <p>李楼养老院之行</p>
                    </div>
                </div>
                <div class="item">
                    <p style="text-align: center"><img src="../img/志愿者活动4.jpg" style="height: 440px;"width="912px" ></p>
                    <div class="carousel-caption">
                        <h3>天津商业大学志愿者协会</h3>
                        <p>老年运动会象棋比赛</p>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                <span class="&glyphicon glyphicon-chevron-left"></span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                <span class="&glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>
    </div>

    <!-- Highlights - jumbotron -->
<div class="jumbotron top-space">
    <div class="container">

        <h3 class="text-center thin">使用我们平台的理由</h3>

        <div class="row">
            <div class="col-md-3 col-sm-6 highlight">
                <div class="h-caption"><h4><i class="fa fa-cogs fa-5"></i>提供更好的服务 </h4></div>
                <div class="h-body text-center">
                    <p> &nbsp;“心·青年”志愿活动平台系统可以迅速、有效地收集各种信息，加强内部的信息沟通。各种用户可以直接从系统中获得自己所需的各种信息，并根据相关的信息做出决策和相应和行动方案。
                    </p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6 highlight">
                <div class="h-caption"><h4><i class="fa fa-flash fa-5"></i>降低成本</h4></div>
                <div class="h-body text-center">
                    <p> &nbsp;“心·青年”志愿活动平台系统通过减少志愿团队管理工作的操作成本，降低志愿者流动率、减少通讯费用等达到降低志愿者团队成本的目的。
                    </p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6 highlight">
                <div class="h-caption"><h4><i class="fa fa-heart fa-5"></i>革新管理理念</h4></div>
                <div class="h-body text-center">
                    <p> &nbsp;“心·青年”志愿活动平台系统的最终目的是革新管理理念而不仅仅是改进管理方式、优化志愿者资源管理。先进技术应用于志愿活动平台不仅仅是为了将现有的资源工作做的更好，更重要的是，做些对于公益团队来讲有效率的事情，成为管理层的决策支持者，为志愿服务提供信息和解决方案。</p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6 highlight">
                <div class="h-caption"><h4><i class="fa fa-smile-o fa-5"></i>完善的奖励机制</h4></div>
                <div class="h-body text-center">
                    <p> &nbsp;在传统的志愿平台中，管理人员的很大一部分精力将耗费在繁琐的日常事务处理上，随着时间的推移和活动的进行，很多志愿者奉献的热情会慢慢消退，那么我们需要建立完善的奖励机制来鼓励这些为社会公益事业付出的人们。而相比于使用传统工具记录出勤与活动次数，“心·青年”会用更善于使用数据来对志愿者们进行奖励。
                    </p>
                </div>
            </div>
        </div> <!-- /row  -->

    </div>
</div>
<!-- /Highlights -->

<!-- container -->
<div class="container">

    <h2 class="text-center top-space">为志愿者投票</h2>
    <br>

    <div class="row">
        <ol v-for="volunteer in volunteers" :key="volunteer.id" >
            <div class="col-sm-3" >
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

    <!-- container -->
    <div id="vm" class="container">

        <h2 class="text-center top-space">活动信息展示</h2>
        <br>
        <div class="row">
            <div class="col-sm-12" v-if="activities.length == 0">
                <p align="middle">暂无可展示活动</p>
            </div>
            <ol v-for="activity in activities" :key="activity.id">
                <div class="col-sm-4" >
                    <li>
                        活动名称：{{ activity.name }}
                    </li>
                    <li v-if="2 == activity.status">
                        活动进行中
                    </li>
                    <li v-if="3 == activity.status">
                        活动已完成
                    </li>
                    <li>
                        活动描述：{{ activity.introduce }}
                    </li>
                    <li v-if="3 == activity.status">
                        活动总结：{{activity.summary}}
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
