<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
<#include "common/main.html">
</head>
<body>
<div id="vm">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top headroom">
        <div class="container">
            <div class="navbar-header">
                <!-- Button for smallest screens -->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
                <a class="navbar-brand" href="/page/adminIndex"><img src="${request.contextPath}/img/heart.png" height="60"></a>
                <h4 align="center" style="color: #bce8f1">"心·青年"志愿活动平台</h4>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/page/adminIndex">Home</a></li>
                    <li><a href="/page/adminIndex">About</a></li>
                    <li><a href="/page/adminIndex">Contact</a></li>
                    <li class="active"><a class="btn" href="/page/login">SIGN IN / SIGN UP</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
    <!-- /.navbar -->

</div>

<script src="${request.contextPath}/js/volunteerActivity.js"></script>
</body>
<#include "common/footer.html">
</html>