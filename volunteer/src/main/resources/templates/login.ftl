<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <title>Hello World!</title>
    <#include "common/main.html">
</head>
<body>
<h2 class="mg-b20 text-center"></h2>

<div v-show="!showList" class="panel panel-default">
    <div class="panel-heading" id="vm1">{{title}}


        <form class="form-horizontal">
            <div class="form-group">
                <div class="col-sm-2 control-label">邮箱</div>
                <input v-model="login.email" placeholder="edit me">
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">密码</div>
                <div class="col-sm-10" id="vm1">
                    <input type="text" class="form-control" v-model="login.pwd" placeholder="密码"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">密码</div>
                <div class="col-sm-10" id="vm1">
                    <input type="checkbox" v-model="login.isAdmin" value=true checked="checked" />管理员登录？
                </div>
            </div>

            <div class="form-group" id="vm1" >
                <div class="col-sm-2 control-label"></div>
                <input type="button" class="btn btn-primary" @click="reload" value="登录"/>
            </div>
            <div class="form-group" id="vm1" >
                <div class="col-sm-2 control-label"></div>
                &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="toRegister" value="去注册"/>
            </div>

        </form>
    </div>

</div>

<script src="${request.contextPath}/js/login.js"></script>
</body>
</html>