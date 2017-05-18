<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
</head>
<body>
<div class="easyui-layout" style="width: 100%;height: 700px;">
    <div region="north" split="true" style="width: 100%;height: 70px;border: 0px">
        <jsp:include page="north.jsp"/>
    </div>
    <div region="center" style="padding: 5px;border-left: 0px;border-right: 0px;border-top: 0px;">
        <form id="fm" method="post">
            <div style="margin-left:500px;margin-right:500px;">
                <div class="fitem">
                    <label>用户名&nbsp;&nbsp;&nbsp;</label>
                    <input class="easyui-textbox" name="username" style="width: 100%;height: 32px"/>
                </div><br/>
                <div class="fitem">
                    <label>密码&nbsp;&nbsp;&nbsp;</label>
                    <input class="easyui-textbox" name="password" style="width: 100%;height: 32px" type="password"/>
                </div>
                <div class="fitem">
                    <label>角色&nbsp;&nbsp;&nbsp;</label>
                    <input name="role" value="student" type="radio"/>学生&nbsp;&nbsp;
                    <input name="role" value="teacher" type="radio"/>教师
                </div>
                <div style="margin: 20px"></div>
                <div style="width: 25%;margin: 20px auto;">
                    <a class="easyui-linkbutton" iconCls="icon-ok" style="width: 100%;height: 32px;" onclick="login()">登录</a>
                </div>
            </div>
        </form>

    </div>
    <div region="south" split="true" style="width: 100%;height: 60px;border: 0px;">
        <jsp:include page="south.jsp"/>
    </div>
</div>
</body>
</html>
