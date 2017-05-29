<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>trustworthy</title>
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
    <table id="dg" title="信用能力相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/trust/list',
</c:if>
<c:if test="${role== 2}">
            url:'/trust/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="activities" width="50">参加活动情况</th>
            <th field="iscojob" width="50">是否在校内兼职</th>
            <th field="jingdong" width="50">京东小白评分</th>
            <th field="zhima" width="50">芝麻信用评分</th>
            <th field="twscore" width="50">信用能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newTrust()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editTrust()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyTrust()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="showRule()">查看评分细则</a>
    </div>
</c:if>
<div id="trustDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#trustForm-buttons">
    <div class="ftitle">信用能力评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>参加活动情况&nbsp;&nbsp;&nbsp;</label>
            <input name="activities" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>是否在校内兼职&nbsp;&nbsp;&nbsp;</label>
            <input name="iscojob">
        </div><br/>
        <div class="fitem">
            <label>京东小白评分&nbsp;&nbsp;&nbsp;</label>
            <input name="jingdong">
        </div><br/>
        <div class="fitem">
            <label>芝麻信用评分&nbsp;&nbsp;&nbsp;</label>
            <input name="zhima">
        </div><br/>
        <div class="fitem">
            <label>信用能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="twscore" name="twscore">
        </div>
    </form>
</div>
<div id="trustForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveTrust()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#trustDialog').dialog('close')">取消</a>
</div>
<div id="ruleDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rule-buttons">
    <h2 style="box-sizing: border-box; padding-bottom: 0.3em; border-bottom-width: 1px; border-bottom-style: solid; border-bottom-color: rgb(238, 238, 238); margin-top: 1em; margin-bottom: 16px; line-height: 1.225; font-size: 1.75em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; white-space: normal;">
        <span style="font-size: 18px;">信用能力评分</span>
    </h2>
    <p style="box-sizing: border-box; margin-top: 0px; margin-bottom: 16px; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;">
        满分100分，参加活动情况，是否在校内兼职	，京东小白评分，芝麻信用评分	各占25分，采取加分制，各项规则如下。
    </p>
    <ul style="box-sizing: border-box; padding-left: 2em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;" class=" list-paddingleft-2">
        <li>
            <p>
                参加活动情况
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，占5分
                </p>
            </li>
            <li>
                <p>
                    B：占4分
                </p>
            </li>
            <li>
                <p>
                    C：占3分
                </p>
            </li>
            <li>
                <p>
                    D：占2分
                </p>
            </li>
            <li>
                <p>
                    参加活动情况根据事件程度按ABCD分等级
                </p>
            </li>
            <li>
                <p>
                    通过 A+A+...的方式累加，上限25分
                </p>
            </li>
        </ul>
        <li>
            <p>
                是否在校内兼职
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    是，25分
                </p>
            </li>
            <li>
                <p>
                    否，0分
                </p>
            </li>
        </ul>
        <li>
            <p>
                京东小白评分
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    0-60 ， 一般，占5分
                </p>
            </li>
            <li>
                <p>
                    60-70， 中等，占10分
                </p>
            </li>
            <li>
                <p>
                    70-80， 良好，占15分
                </p>
            </li>
            <li>
                <p>
                    80-90， 优秀，占20分
                </p>
            </li>
            <li>
                <p>
                    90-100， 极好，占25分
                </p>
            </li>
            <li>
                <p>
                    通过第三方评价对其评分
                </p>
            </li>
        </ul>
        <li>
            <p>
                芝麻信用评分
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    0-400 ， 一般，占5分
                </p>
            </li>
            <li>
                <p>
                    400-550， 中等，占10分
                </p>
            </li>
            <li>
                <p>
                    550-700， 良好，占15分
                </p>
            </li>
            <li>
                <p>
                    700-800， 优秀，占20分
                </p>
            </li>
            <li>
                <p>
                    800-950， 极好，占25分
                </p>
            </li>
            <li>
                <p>
                    通过第三方评价对其评分
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
