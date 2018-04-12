<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
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

<script src="${request.contextPath}/js/adminActivity.js"></script>
</body>
</html>