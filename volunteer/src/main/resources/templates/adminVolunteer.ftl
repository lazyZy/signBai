<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
</head>
<body>

<div  class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}

        <div class="form-group" id="vm">
            <p>欢迎{{admin.adminName}}</p>


        </div>

        <div id="vm" >
            <ol v-for="volunteer in volunteers" :key="activity.id" >
                <li >
                    活动名称：{{volunteer.volunteerName }}
                </li>
                <li v-if="volunteer.volunteerSex == 0">
                    性别：女
                </li>
                <li v-if="volunteer.volunteerSex == 1">
                    性别：男
                </li>
                <li >
                    活动描述：{{ volunteer.volunteerPhone }}
                </li>
                <li >
                    开始时间：{{ volunteer.volunteerMail }}
                </li>
                <li >
                    结束时间：{{ volunteer.endTime }}
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
<script src="${request.contextPath}/js/adminVolunteer.js"></script>
</body>
</html>