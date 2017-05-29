<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reputation</title>
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
    <table id="dg" title="信誉能力相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/reputation/list',
</c:if>
<c:if test="${role== 2}">
            url:'/reputation/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="paytuition" width="50">缴纳学费情况</th>
            <th field="nationalloan" width="50">国家贷款还款情况</th>
            <th field="other" width="50">其他</th>
            <th field="rescore" width="50">信誉能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newReputation()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editReputation()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyReputation()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="showRule()">查看评分细则</a>
    </div>
</c:if>
<div id="reputationDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#reputationForm-buttons">
    <div class="ftitle">信誉能力评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>学费缴纳情况&nbsp;&nbsp;&nbsp;</label>
            <input name="paytuition" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>国家贷款还款情况&nbsp;&nbsp;&nbsp;</label>
            <input name="nationalloan">
        </div><br/>
        <div class="fitem">
            <label>其他&nbsp;&nbsp;&nbsp;</label>
            <input name="other">
        </div><br/>
        <div class="fitem">
            <label>信誉能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="rescore" name="rescore">
        </div>
    </form>
</div>
<div id="reputationForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveReputation()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#reputationDialog').dialog('close')">取消</a>
</div>
<div id="ruleDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rule-buttons">
    <h2 style="box-sizing: border-box; padding-bottom: 0.3em; border-bottom-width: 1px; border-bottom-style: solid; border-bottom-color: rgb(238, 238, 238); margin-top: 1em; margin-bottom: 16px; line-height: 1.225; font-size: 1.75em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; white-space: normal;">
        <span style="font-size: 18px;">信誉能力评分</span>
    </h2>
    <p style="box-sizing: border-box; margin-top: 0px; margin-bottom: 16px; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;">
        满分100分，缴纳学费情况占30分，国家贷款还款情况占40分，其他占30分，各项初值为各项满分，采取减分制，各项规则如下。
    </p>
    <ul style="box-sizing: border-box; padding-left: 2em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;" class=" list-paddingleft-2">
        <li>
            <p>
                缴纳学费情况
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，-5分
                </p>
            </li>
            <li>
                <p>
                    B：-4分
                </p>
            </li>
            <li>
                <p>
                    C：-3分
                </p>
            </li>
            <li>
                <p>
                    D：-2分
                </p>
            </li>
            <li>
                <p>
                    扣满30分为止
                </p>
            </li>
            <li>
                <p>
                    按照情况恶劣程度分ABCD级
                </p>
            </li>
        </ul>
        <li>
            <p>
                国家贷款还款情况
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，-5分
                </p>
            </li>
            <li>
                <p>
                    B：-4分
                </p>
            </li>
            <li>
                <p>
                    C：-3分
                </p>
            </li>
            <li>
                <p>
                    D：-2分
                </p>
            </li>
            <li>
                <p>
                    扣满40分为止
                </p>
            </li>
            <li>
                <p>
                    按照情况恶劣程度分ABCD级
                </p>
            </li>
        </ul>
        <li>
            <p>
                其他
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，-5分
                </p>
            </li>
            <li>
                <p>
                    B：-4分
                </p>
            </li>
            <li>
                <p>
                    C：-3分
                </p>
            </li>
            <li>
                <p>
                    D：-2分
                </p>
            </li>
            <li>
                <p>
                    扣满30分为止
                </p>
            </li>
            <li>
                <p>
                    按照情况恶劣程度分ABCD级
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
