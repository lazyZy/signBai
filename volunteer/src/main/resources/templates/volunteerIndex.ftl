<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
    <style>
        li{
            list-style:none;
        }
    </style>
</head>
<body>
<div id="vm" v-show="isShow" class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}

        <div class="form-group" id="vm">
            <p>欢迎{{volunteer.volunteerName}}</p>


        </div>

        <div id="vm">
            <ol v-for="activity in activities" :key="activity.id">
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

            </ol>
        </div>

    </div>

</div>

<script src="${request.contextPath}/js/volunteerIndex.js"></script>
</body>
<#include "common/footer.html">
</html>