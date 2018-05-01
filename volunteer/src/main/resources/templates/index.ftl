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

<!-- Intro -->
<div class="container text-center">
    <br> <br>
    <h2 class="thin">The best place to tell people why they are here</h2>
    <p class="text-muted">
        The difference between involvement and commitment is like an eggs-and-ham breakfast:<br>
        the chicken was involved; the pig was committed.
    </p>
</div>
<!-- /Intro-->

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

    <h2 class="text-center top-space">Frequently Asked Questions</h2>
    <br>

    <div class="row">
        <div class="col-sm-6">
            <h3>Which code editor would you recommend?</h3>
            <p>I'd highly recommend you <a href="http://www.sublimetext.com/">Sublime Text</a> - a free to try text
                editor which I'm using daily. Awesome tool!</p>
        </div>
        <div class="col-sm-6">
            <h3>Nice header. Where do I find more images like that one?</h3>
            <p>
                Well, there are thousands of stock art galleries, but personally,
                I prefer to use photos from these sites: <a href="http://unsplash.com">Unsplash.com</a>
                and <a href="http://www.flickr.com/creativecommons/by-2.0/tags/">Flickr - Creative Commons</a></p>
        </div>
    </div> <!-- /row -->

    <div class="row">
        <div class="col-sm-6">
            <h3>Can I use it to build a site for my client?</h3>
            <p>
                Yes, you can. You may use this template for any purpose, just don't forget about the <a
                    href="http://creativecommons.org/licenses/by/3.0/">license</a>,
                which says: "You must give appropriate credit", i.e. you must provide the name of the creator and a link
                to the original template in your work.
            </p>
        </div>
        <div class="col-sm-6">
            <h3>Can you customize this template for me?</h3>
            <p>Yes, I can. Please drop me a line to sergey-at-pozhilov.com and describe your needs in details. Please
                note, my services are not cheap.</p>
        </div>
    </div> <!-- /row -->

    <!-- container -->
    <div id="vm" class="container">

        <h2 class="text-center top-space">活动一览</h2>
        <br>
        <div class="row">
            <ol class="col-sm-4" v-for="activity in activities" :key="activity.id">
                <div >
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
                    <li v-if="activity.status == 1">
                        <input type="button" v-on:click="toAdopt(activity.id)" value="通过"/>
                        &nbsp;&nbsp;<input type="button" v-on:click="toRefuse(activity.id)" value="驳回"/>
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