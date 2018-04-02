<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link href="/static/favicon.ico" rel="shortcut icon" />
<#include "common/main.html">
    <title>“心·青年”志愿活动平台</title>

</head><body>

<div v-show="!showList" class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}
        <form class="form-horizontal">
            <div class="form-group">
                <div class="col-sm-2 control-label">邮箱</div>
                <div class="col-sm-10" id="vm">
                    <input type="text" class="form-control" v-model="login.email" placeholder="邮箱"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">密码</div>
                <div class="col-sm-10" id="vm">
                    <input type="text" class="form-control" v-model="login.pwd" placeholder="密码"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">姓名</div>
                <div class="col-sm-10" id="vm">
                    <input type="text" class="form-control" v-model="login.name" placeholder="姓名"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">性别</div>
                <div class="col-sm-10" id="vm">
                    <input v-model="login.sex" type="radio" value=0 />女
                    <input v-model="login.sex" type="radio" value=1 />男
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">地址</div>
                <div class="col-sm-10" id="vm">
                    <input type="text" class="form-control" v-model="login.adrress" placeholder="地址"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2 control-label">手机号</div>
                <div class="col-sm-10" id="vm">
                    <input type="text" class="form-control" v-model="login.phone" placeholder="手机号"/>
                </div>
            </div>
            <div class="form-group" id="vm" >
                <div class="col-sm-2 control-label"></div>
                <input type="button" class="btn btn-primary" @click="confirm" value="注册"/>
                &nbsp;&nbsp;<input type="button" class="btn btn-primary" @click="toLogin" value="返回登录"/>
                &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="toIndex" value="返回主页"/>


            </div>

        </form>
    </div>

</div>
<script src="${request.contextPath}/js/register.js"></script>

</body>
</html>