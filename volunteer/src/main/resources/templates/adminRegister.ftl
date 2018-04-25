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
                <a class="navbar-brand" href="/page/adminIndex"><img src="${request.contextPath}/img/heart.png" height="60"></a>
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
    <header id="head" class="secondary"></header>

    <!-- container -->
    <div class="container">

        <ol class="breadcrumb">
            <li><a href="/page/adminIndex">管理员首页</a></li>
            <li class="active">注册管理员账号</li>
        </ol>

        <div class="row">

            <!-- Article main content -->
            <article class="col-xs-12 maincontent">
                <header class="page-header">
                    <h1 class="page-title">注册管理员账号</h1>
                </header>

                <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <h3 class="thin text-center">注册一个管理员账号</h3>
                            <hr>
                            <form class="form-horizontal">
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">邮箱</div>
                                    <div class="col-sm-10" id="vm">
                                        <input type="text" class="form-control" v-model="register.email" placeholder="邮箱"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">密码</div>
                                    <div class="col-sm-10" id="vm">
                                        <input type="text" class="form-control" v-model="register.pwd" placeholder="密码"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">姓名</div>
                                    <div class="col-sm-10" id="vm">
                                        <input type="text" class="form-control" v-model="register.name" placeholder="姓名"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">性别</div>
                                    <div class="col-sm-10" id="vm">
                                        <input v-model="register.sex" type="radio" value="0"/>女
                                        <input v-model="register.sex" type="radio" value="1"/>男
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">地址</div>
                                    <div class="col-sm-10" id="vm">
                                        <input type="text" class="form-control" v-model="register.adrress" placeholder="地址"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">手机号</div>
                                    <div class="col-sm-10" id="vm">
                                        <input type="text" class="form-control" v-model="register.phone" placeholder="手机号"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-2 control-label">权限</div>
                                    <div class="col-sm-10" id="vm">
                                        <input v-model="register.authority" type="radio" value="1"/>只可审核活动
                                        <input v-model="register.authority" type="radio" value="2"/>最高权限
                                    </div>
                                </div>
                                <div class="form-group" id="vm">
                                    <div class="col-sm-2 control-label"></div>
                                    <input type="button" class="btn btn-primary" @click="confirm" value="注册"/>
                                </div>

                            </form>
                        </div>
                    </div>

                </div>

            </article>
            <!-- /Article -->

        </div>
    </div>	<!-- /container -->

</div>
<script src="${request.contextPath}/js/adminRegister.js"></script>
</body>
<#include "common/footer.html">
</html>