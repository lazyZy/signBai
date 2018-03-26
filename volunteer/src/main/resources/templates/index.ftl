<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link href="/static/favicon.ico" rel="shortcut icon" />
    <meta content="text/html;charset=utf-8"></meta>
    <title>“心·青年”志愿活动平台</title>

</head><body>

<div v-show="!showList" class="panel panel-default">
    <div class="panel-heading" id="vm">{{title}}</div>
    <form class="form-horizontal">
        <div class="form-group">
            <div class="col-sm-2 control-label">订单ID</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.orderId" placeholder="订单ID"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">产品ID</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.productId" placeholder="产品ID"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">客户ID</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.customerId" placeholder="客户ID"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">产品oid</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.productCode" placeholder="产品oid"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">产品名称</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.productName" placeholder="产品名称"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">会员账号</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.userAccount" placeholder="会员账号"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">总期数</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.totalIssue" placeholder="总期数"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">当前期数</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.currentIssue" placeholder="当前期数"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">当期本金</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.currentCapital" placeholder="当期本金,单位分"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">当期利息</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.currentInterest" placeholder="当期利息,单位分"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">当期还款状态 1：repay 2：unRepay</div>
            <div class="col-sm-10">
                <label class="radio-inline">
                    <input type="radio" name="status" value="1" v-model="finTjsRepaymentPlan.currentRepaymentStatus"/>
                    repay
                </label>
                <label class="radio-inline">
                    <input type="radio" name="status" value="2" v-model="finTjsRepaymentPlan.currentRepaymentStatus"/>
                    unRepay
                </label>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">当期还款时间</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.currentRepaymentTime" placeholder="当期还款时间"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">申请中资产</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.confirmingInvestment" placeholder="申请中资产（当期本金中不包含这笔资产，会在购买后第二天确认）"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">产品到期日</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.interestEndDate" placeholder="产品到期日（起息结束日）"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label">产品起息日</div>
            <div class="col-sm-10">
                <input type="text" class="form-control" v-model="finTjsRepaymentPlan.interestStartDate" placeholder="产品起息日"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2 control-label"></div>
            <input type="button" class="btn btn-primary" @click="saveOrUpdate" value="确定"/>
            &nbsp;&nbsp;<input type="button" class="btn btn-warning" @click="reload" value="返回"/>
        </div>
    </form>
</div>
<script src="lib/vue.min.js"></script>
<script src="js/index.js"></script>

</body>
</html>