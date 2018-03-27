<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link href="/static/favicon.ico" rel="shortcut icon" />
    <meta content="text/html;charset=utf-8"></meta>
    <title>“心·青年”志愿活动平台</title>

</head><body>

<div v-show="!showList" class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}
    <input v-model="login.email" placeholder="edit me">
    <p>Message is: {{login.email}}</p>

    <form class="form-horizontal">
        <div class="form-group">
            <div class="col-sm-2 control-label">账号</div>

        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">密码</div>
            <div class="col-sm-10" id="vm">
                <input type="text" class="form-control" v-model="login.pwd" placeholder="密码"/>
            </div>
        </div>
        <div class="form-group" id="vm">
            <div class="col-sm-2 control-label"></div>
            <input type="button" class="btn btn-primary" @click="reload" value="确定"/>
            &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="reload" value="返回"/>
        </div>
    </form>
    </div>
</div>
<script src="lib/vue.min.js"></script>
<script src="lib/jquery.min.js"></script>
<script src="lib/jquery.jqGrid.min.js"></script>
<script src="lib/jquery.js"></script>
<script src="js/index.js"></script>
<script src="https://cdn.bootcss.com/axios/0.18.0/axios.js"></script>

</body>
</html>