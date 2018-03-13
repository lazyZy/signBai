<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta content="text/html;charset=utf-8"></meta>
    <title>Hello World!</title>

</head>
<body>
    <table class="table">
        <caption>${sysUser}</caption>
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>User Name</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <from>
                <td></td>
            </from>
        </tr>
        <#list loginModel as login>
        <tr>
            <td>${login.id}</td>
            <td>${login.userPwd}</td>
            <td>${login.userAccount}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</body>
</html>