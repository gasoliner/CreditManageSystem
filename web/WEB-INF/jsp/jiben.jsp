<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>basic</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
    <script type="text/javascript">
        function scoreChange() {
            $("#bsscore").val(
                    Math.round((Number($("#classmatescore").val())+Number($("#teacherscore").val()))/2)
            );
        };
    </script>
</head>
<body>
<div align="center">
    <table id="dg" title="基本情况相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/basic/list',
</c:if>
<c:if test="${role== 2}">
            url:'/basic/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="school" width="50">学校</th>
            <th field="startschool" width="50">入学时间</th>
            <th field="classmatescore" width="50">同学评价</th>
            <th field="teacherscore" width="50">老师评价</th>
            <th field="bsscore" width="50">基本素质情况评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newBasic()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editBasic()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyBasic()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="showRule()">查看评分细则</a>
    </div>
</c:if>
<div id="basicDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#basicForm-buttons">
    <div class="ftitle">基本素质评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>学校&nbsp;&nbsp;&nbsp;</label>
            <input name="school" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>入学时间&nbsp;&nbsp;&nbsp;</label>
            <input name="startschool">
        </div><br/>
        <div class="fitem">
            <label>同学评分&nbsp;&nbsp;&nbsp;</label>
            <input id="classmatescore" name="classmatescore" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>老师评分&nbsp;&nbsp;&nbsp;</label>
            <input id="teacherscore" name="teacherscore" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>基本素质评分&nbsp;&nbsp;&nbsp;</label>
            <input id="bsscore" name="bsscore">
        </div>
    </form>
</div>
<div id="ruleDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rule-buttons">
    <p>
        <strong><span style="font-size: 18px;">基本情况评分规则</span></strong><br/>
    </p>
    <p>
        <strong><span style="font-size: 18px;"><br/></span></strong>
    </p>
    <p>
        <span style="font-size: 16px;">同学评分由随机抽取一名同学对其进行评分，老师评分由班主任评价。</span><br/>
    </p>
    <p>
        <br/>
    </p>
    <table>
        <tbody>
        <tr class="firstRow">
            <td width="401" valign="top" style="word-break: break-all;">
                评分项
            </td>
            <td width="401" valign="top" style="word-break: break-all;">
                评分规则
            </td>
        </tr>
        <tr>
            <td width="401" valign="top" style="word-break: break-all;">
                同学评分
            </td>
            <td width="401" valign="top" style="word-break: break-all;">
                满分100分，根据对该同学平时生活表现进行打分
            </td>
        </tr>
        <tr>
            <td width="401" valign="top" style="word-break: break-all;">
                老师评分
            </td>
            <td width="401" valign="top" style="word-break: break-all;">
                满分100分，老师根据该同学平时表现打分
            </td>
        </tr>
        <tr>
            <td width="401" valign="top" style="word-break: break-all;">
                基本情况评分
            </td>
            <td width="401" valign="top" style="word-break: break-all;">
                （同学评分+老师评分）/2，四舍五入处理
            </td>
        </tr>
        </tbody>
    </table>
    <p>
        <br/>
    </p>
</div>
<div id="rule-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="closeRuleDialog()">好的</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#ruleDialog').dialog('close')">取消</a>
</div>
<div id="basicForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveBasic()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#basicDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
