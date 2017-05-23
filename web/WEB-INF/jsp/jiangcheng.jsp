<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reward_punishment</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
</head>
<body>
<div align="center">
    <table id="dg" title="奖惩记录相关表" class="easyui-datagrid" style="width: 100%;height:auto"
    <c:if test="${role== 1}">
        toolbar="#toolbar"
    </c:if>
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/reward/list',
</c:if>
<c:if test="${role== 2}">
            url:'/reward/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="goodthing" width="50">好人好事</th>
            <th field="schoolreward" width="50">学校奖励</th>
            <th field="breakrule" width="50">违反校规校纪</th>
            <th field="breaklaw" width="50">违法</th>
            <th field="rpscore" width="50">奖惩能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newReward()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editReward()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyReward()">删除</a>
    </div>
</c:if>
<div id="rewardDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rewardForm-buttons">
    <div class="ftitle">奖惩记录评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>好人好事&nbsp;&nbsp;&nbsp;</label>
            <input name="goodthing" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>学校奖励&nbsp;&nbsp;&nbsp;</label>
            <input name="schoolreward">
        </div><br/>
        <div class="fitem">
            <label>违反校规校纪&nbsp;&nbsp;&nbsp;</label>
            <input name="breakrule">
        </div><br/>
        <div class="fitem">
            <label>违法&nbsp;&nbsp;&nbsp;</label>
            <input name="breaklaw">
        </div><br/>
        <div class="fitem">
            <label>奖惩能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="rpscore" name="rpscore">
        </div>
    </form>
</div>
<div id="rewardForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveReward()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#rewardDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
