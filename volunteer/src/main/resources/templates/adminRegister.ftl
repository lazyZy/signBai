<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}
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
                    <input v-model="register.sex" type="radio" value=0/>女
                    <input v-model="register.sex" type="radio" value=1/>男
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
                    <input v-model="register.authority" type="radio" value=1/>只可审核活动
                    <input v-model="register.authority" type="radio" value=2/>最高权限
                </div>
            </div>
            <div class="form-group" id="vm">
                <div class="col-sm-2 control-label"></div>
                <input type="button" class="btn btn-primary" @click="confirm" value="注册"/>
                &nbsp;&nbsp;<input type="button" class="btn btn-primary" @click="toLogin" value="返回管理首页"/>
                &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="toIndex" value="返回主页"/>

            </div>

        </form>
    </div>

</div>

<script src="${request.contextPath}/js/adminRegister.js"></script>
</body>
</html>