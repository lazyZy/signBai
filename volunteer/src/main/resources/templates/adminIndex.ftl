<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <#include "common/main.html">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
    <title>“心·青年”志愿活动平台</title>

</head>
<body>

<div v-show="!showList" class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}

        <div class="form-group" id="vm">
            <div class="col-sm-2 control-label"></div>
            <input type="button" class="btn btn-primary" @click="toLogin" value="登录"/>
            &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="toRegister" value="注册"/>


        </div>

        </form>
    </div>

</div>
<script src="${request.contextPath}/js/adminIndex.js"></script>

</body>
</html>