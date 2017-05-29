<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>learning</title>
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
    <table id="dg" title="学习能力相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/learning/list',
</c:if>
<c:if test="${role== 2}">
            url:'/learning/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="jidian" width="50">绩点</th>
            <th field="losemajor" width="50">挂科数</th>
            <th field="scholarship" width="50">奖学金</th>
            <th field="ranking" width="50">专业排名</th>
            <th field="lascore" width="50">学习能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newLearning()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editLearning()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyLearning()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="showRule()">查看评分细则</a>
    </div>
</c:if>
<div id="learningDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#learningForm-buttons">
    <div class="ftitle">学习能力评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>绩点&nbsp;&nbsp;&nbsp;</label>
            <input name="jidian" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>挂科数&nbsp;&nbsp;&nbsp;</label>
            <input name="losemajor">
        </div><br/>
        <div class="fitem">
            <label>奖学金&nbsp;&nbsp;&nbsp;</label>
            <%--<input id="scholarship" name="scholarship" onchange="scoreChange()">--%>
            <input name="scholarship">
        </div><br/>
        <div class="fitem">
            <label>专业排名&nbsp;&nbsp;&nbsp;</label>
            <%--<input name="ranking" onchange="scoreChange()">--%>
            <input name="ranking">
        </div><br/>
        <div class="fitem">
            <label>学习能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="lascore" name="lascore">
        </div>
    </form>
</div>
<div id="learningForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveLearning()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#basicDialog').dialog('close')">取消</a>
</div>
<div id="ruleDialog" class="easyui-dialog" style="width:800px;height:550px;padding:10px 20px"
     closed="true" buttons="#rule-buttons">
    <p>
        <span style="font-size: 18px;"><strong><span style="color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; line-height: 1.225; background-color: rgb(255, 255, 255);">学习能力评分规则</span></strong></span><br/>
    </p>
    <p>
        <br/>
    </p>
    <p>
        <span style="color: rgb(51, 51, 51); font-family: #39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; line-height: 19.6px; background-color: rgb(255, 255, 255);">满分100分，其中绩点、专业排名、挂科数、奖学金各占25分，各项评分细则如下：</span><br/>
    </p>
    <ul style="box-sizing: border-box; padding-left: 2em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal; background-color: rgb(255, 255, 255);" class=" list-paddingleft-2">
        <li>
            <p>
                绩点
            </p>
            <table width="788">
                <thead style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);" class="firstRow">
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        区间
                    </th>
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        绩点所占分数
                    </th>
                </tr>
                </thead>
                <tbody style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &lt;=60
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        10
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;60 &amp;&amp; &lt;= 65
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        12
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;65 &amp;&amp; &lt;= 70
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        14
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;70 &amp;&amp; &lt;= 75
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        16
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;75 &amp;&amp; &lt;= 80
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        18
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;80 &amp;&amp; &lt;= 85
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        20
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;85
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        25
                    </td>
                </tr>
                </tbody>
            </table>
        </li>
        <li>
            <p>
                专业排名
            </p>
            <table width="788">
                <thead style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);" class="firstRow">
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        专业排名前(%)
                    </th>
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        专业排名所占分数
                    </th>
                </tr>
                </thead>
                <tbody style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &lt;=20
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        25
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;20 &amp;&amp; &lt;= 40
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        20
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;40 &amp;&amp; &lt;= 60
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        15
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;60 &amp;&amp; &lt;= 80
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        10
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;80 &amp;&amp; &lt;= 100
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        5
                    </td>
                </tr>
                </tbody>
            </table>
        </li>
        <li>
            <p>
                挂科数
            </p>
            <table width="788">
                <thead style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);" class="firstRow">
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        挂科数(门)
                    </th>
                    <th style="box-sizing: border-box; padding: 6px 13px; border-top-color: rgb(221, 221, 221); word-break: break-all;">
                        挂科数所占分数
                    </th>
                </tr>
                </thead>
                <tbody style="box-sizing: border-box;">
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        0
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        25
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        1
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        20
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        2
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        15
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        3
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        10
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        4
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        5
                    </td>
                </tr>
                <tr style="box-sizing: border-box; border-top-width: 1px; border-top-style: solid; border-top-color: rgb(204, 204, 204); background-color: rgb(248, 248, 248);">
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        &gt;=5
                    </td>
                    <td style="box-sizing: border-box; padding: 6px 13px; word-break: break-all;">
                        0
                    </td>
                </tr>
                </tbody>
            </table>
        </li>
        <li>
            <p>
                奖学金
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A：国家级，占5分
                </p>
            </li>
            <li>
                <p>
                    B：省级，占4分
                </p>
            </li>
            <li>
                <p>
                    C：校级，占3分
                </p>
            </li>
            <li>
                <p>
                    D：其他，占2分
                </p>
            </li>
            <li>
                <p>
                    奖学金通过ABCDE分等级
                </p>
            </li>
            <li>
                <p>
                    通过 A+A+...的方式累加，上限25分
                </p>
            </li>
        </ul>
    </ul>
    <p>
        <br/>
    </p>
</div>
<div id="rule-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="closeRuleDialog()">好的</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#ruleDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
