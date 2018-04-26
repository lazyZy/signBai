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
                    <li><a href="/page/adminIndex">志愿者首页</a></li>
                    <li><a href="/page/adminIndex">About</a></li>
                    <li><a href="/page/adminIndex">Contact</a></li>
                    <li class="active"><a class="btn" href="/page/login">登录/注册</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->
    <div v-show="!showList" class="panel panel-default">
        <div class="panel-heading" id="vm">{{title}}
            <form class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-2 control-label">团队名称</div>
                    <div class="col-sm-10" id="vm">
                        <input type="text" class="form-control" v-model="registerTeam.teamName" placeholder="团队名称"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2 control-label">团队活动区域</div>
                    <div class="col-sm-10" id="vm">
                        <input type="text" class="form-control" v-model="registerTeam.teamRegion" placeholder="团队活动区域"/>
                    </div>
                </div>
                <div class="form-group" id="vm">
                    <div class="col-sm-2 control-label"></div>
                    <input type="button" class="btn btn-primary" @click="confirm" value="确认"/>
                </div>

            </form>
        </div>

    </div>
</div>
<script src="${request.contextPath}/js/teamRegister.js"></script>

</body>
<#include "common/footer.html">
</html>