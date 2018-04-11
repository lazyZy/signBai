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
            <p>欢迎{{admin.adminName}}</p>


        </div>

        </form>
    </div>

</div>
<script src="${request.contextPath}/js/adminIndex.js"></script>

</body>
</html>