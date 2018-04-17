<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
    <style>
        li{
            list-style:none;
        }
    </style>
</head>
<body>

<div class="panel panel-default" >
    <div class="panel-heading" id="vm" >{{title}}

        <div class="form-group" id="vm"  >
            <p>欢迎进入</p>
            <input type="button"  v-on:click="addAdmin" value="添加管理员"/>

        </div>
        <div id="vm" >
            <ol v-for="activity in activities" :key="activity.id" >
                <li >
                    活动名称：{{ activity.name }}
                </li>
                <li v-if="activity.status == 1">
                    活动状态：待审核
                </li>
                <li v-if="activity.status == 2">
                    活动状态：已批准
                </li>
                <li v-if="activity.status == 0">
                    活动状态：已驳回
                </li>
                <li >
                    活动描述：{{ activity.introduce }}
                </li>
                <li >
                    开始时间：{{ activity.startTime }}
                </li>
                <li >
                    结束时间：{{ activity.endTime }}
                </li>
                <li v-if="activity.status == 1">
                    <input type="button"  v-on:click="toAdopt(activity.id)" value="通过"/>
                    &nbsp;&nbsp;<input type="button" v-on:click="toRefuse(activity.id)" value="驳回"/>
                </li>
                <li v-if="activity.status == 2">
                    <input type="button" v-on:click="toRefuse(activity.id)" value="驳回"/>
                </li>
                <li v-if="activity.status == 0">
                    <input type="button"  v-on:click="toAdopt(activity.id)" value="通过"/>
                </li>
            </ol>
        </div>

    </div>

</div>

<script src="${request.contextPath}/js/adminActivity.js"></script>
</body>
</html>