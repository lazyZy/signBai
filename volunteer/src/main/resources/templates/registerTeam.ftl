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
<script src="${request.contextPath}/js/teamRegister.js"></script>

</body>
</html>