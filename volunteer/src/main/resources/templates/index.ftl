<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link href="/static/favicon.ico" rel="shortcut icon" />
    <meta content="text/html;charset=utf-8"></meta>
    <title>“心·青年”志愿活动平台</title>

</head><body>
<div class="mainhd">
    <div class="logo">“心·青年”志愿活动平台</div>
    <div class="uinfo" id="frameuinfo">
        <p><em>游客,您好!</em><em>请</em><a href="<%=weburl%>?m=member&a=logout" target="_top">登录</a></p>
    </div>
    <div class="navbg"></div>
    <div class="nav">
        <ul id="topmenu"></ul>
        <div class="currentloca">
            <p id="admincpnav"><a href="<%=weburl%>">首页</a>&nbsp;>&nbsp;</p></div>
        <div class="navbd"></div>
        <div class="sitemapbtn">
            <div style="margin: 0px 10px 0pt 0pt; float: left;">
                <form action="<%=weburl%>?m=index&a=index" method="post" name="cha">找找我感兴趣的活动：
                    <select name="org" id="org">
                        <option value="0"<%if zz=0 then%>>不限发起组织</option>
                    </select><select name="week" id="week">
                        <option value="0"<%if wd=0 then%>>不限活动日</option>
                        <option value="1"<%if wd=1 then%>>周一</option>
                        <option value="2"<%if wd=2 then%>>周二</option>
                        <option value="3"<%if wd=3 then%>>周三</option>
                        <option value="4"<%if wd=4 then%>>周四</option>
                        <option value="5"<%if wd=5 then%>>周五</option>
                        <option value="6"<%if wd=6 then%>>周六</option>
                        <option value="7"<%if wd=7 then%>>周日</option>
                        <option value="8"<%if wd=8 then%>>多日连续活动</option>
                    </select><select name="oc" id="oc">
                        <option value="0"<%if xb=0 then%>>所有报名状态</option>
                        <option value="1"<%if xb=1 then%>>报名进行中的</option>
                        <option value="2"<%if xb=2 then%>>报名已结束的</option>
                    </select><input type="hidden" name="vsclass" value="0" />
                    <input type="submit" name="myselect" value="筛选" /></form>
            </div>
        </div>
    </div>
</div>
<table width="100%" cellpadding="0" cellspacing="0"><tr>
    <td class="menutd" width="160" valign="top">
        <div id="leftmenu" class="menu">

        </div>
    </td>
    <td class="mask" width="100%" valign="top">

    </td></tr></table>
<table width="100%" border="0" align="center" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC">
    <tr>
        <td align="center" bgcolor="#F9F9F9">
            <p align="center">
            <a href="<%=weburl%>">zcz 版权所有</a></a><br />
            <a href="<%=weburl%>?app=55"><strong>关于我们</strong></a>
            </p>
        </td>
    </tr>
</table>
</body>
</html>