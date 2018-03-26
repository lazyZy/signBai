<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <meta content="text/html;charset=utf-8"></meta>
    <title>Hello World!</title>

</head>
<body>
<h2 class="mg-b20 text-center"></h2>
<div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content">
    <p class="text-center font16">用户登录</p>
    <form action="" method="post">

        <div class="form-group mg-t20">
            <i class="glyphicon glyphicon-phone"></i>
            <input type="text" class="login_input" id="phone" placeholder="请输入手机号"/>
        </div>
        <div class="form-group mg-t20">
            <i class="glyphicon glyphicon-ok-sign"></i>
            <input type="text" class="login_input small-input" id="yz1" placeholder="请输入验证码"/>
            <i class="img-box"><img src="captcha.jpg" alt="单击图片刷新" ;title="看不清可单击图片刷新"
                                    onclick="this.src='captcha.jpg?d='+Math.random();"></i>
        </div>
        <div class="form-group mg-t20">
            <i class="glyphicon glyphicon-info-sign"></i>
            <input type="text" class="login_input" id="yz" placeholder="请输入验证码"/>
            <button type="button" class="verification">获取验证码</button>
        </div>
        <div class="checkbox mg-b25">

        </div>
        <button type="button" class="login_btn">登 录</button>
    </form>
</div>
</div>
<script src="../statics/libs/vue.min.js"></script>
<script src="../statics/libs/jquery.jqGrid.min.js"></script>
<script src="../statics/js/index.js"></script>
</body>
</html>