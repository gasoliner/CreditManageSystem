<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allCredit</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/ui-pepper-grinder/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
</head>
<body>
<c:if test="${role} == '1'">
    <div align="center">
        <table id="dg" title="信用信息汇总表" class="easyui-datagrid" style="width: 100%;height:auto"
               toolbar="#toolbar"
               fitColumns="true" singleSelect="true" pagination="true"
               data-options="rownumbers:true,
            url:'/all/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
            <thead>
            <tr>
                <th field="username" width="50">姓名</th>
                <th field="bsscore" width="50">基本情况评分</th>
                <th field="lascore" width="50">学习能力评分</th>
                <th field="rpscore" width="50">奖惩记录评分</th>
                <th field="twscore" width="50">信用能力评分</th>
                <th field="rescore" width="50">信誉能力评分</th>
                <th field="allscore" width="50">总分</th>
            </tr>
            </thead>
        </table>
    </div>
</c:if>
<c:if test="${role} == '2'">
<div align="center">
    <table id="dg" title="信用信息汇总表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/all/list?user=${user}',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="bsscore" width="50">基本情况评分</th>
            <th field="lascore" width="50">学习能力评分</th>
            <th field="rpscore" width="50">奖惩记录评分</th>
            <th field="twscore" width="50">信用能力评分</th>
            <th field="rescore" width="50">信誉能力评分</th>
            <th field="allscore" width="50">总分</th>
        </tr>
        </thead>
    </table>
</div>
</c:if>
</body>
</html>
