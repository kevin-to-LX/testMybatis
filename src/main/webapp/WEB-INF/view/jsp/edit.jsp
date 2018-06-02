<%--
  Created by IntelliJ IDEA.
  User: jinyugai
  Date: 2018/6/2
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>数据信息管理</title>
</head>
<body>
<h2>
    ZNCU 修改数据
</h2>
<form method="post" action="../edit">
    <fieldset>

        <legend>用户信息</legend>
        <p>
            <label for="linkId"> linkId：</label>
            <input name="linkId" id="linkId" type="text" required="required" readonly="readonly" maxlength="64"
                   value="${trafficEconomyAmapSpeedRawHz.linkId}">
        </p>
        <p>
            <label for="updateTime">updateTime：</label>
            <input name="updateTime" id="updateTime" type="text" required="required" maxlength="32"
                   value="${trafficEconomyAmapSpeedRawHz.updateTime}"/>
        </p>
        <p>
            <label for="travelTime">travelTime：</label>
            <input name="travelTime" id="travelTime" type="text" required="required" maxlength="128"
                   value="${trafficEconomyAmapSpeedRawHz.travelTime}"/>
        </p>
        <p>
            <label for="speed">speed：</label>
            <input name="speed" id="speed" type="text" required="required" maxlength="110"
                   value="${trafficEconomyAmapSpeedRawHz.speed}"/>
        </p>
        <p>
            <label for="reliabilitycode">reliabilitycode：</label>
            <input name="reliabilitycode" id="reliabilitycode" type="text" required="required" maxlength="110"
                   value="${trafficEconomyAmapSpeedRawHz.reliabilitycode}"/>
        </p>
        <p>
            <label for="linkLen">linkLen：</label>
            <input name="linkLen" id="linkLen" type="text" required="required" maxlength="110"
                   value="${trafficEconomyAmapSpeedRawHz.linkLen}"/>
        </p>
        <p>
            <button>提交</button>
        </p>
    </fieldset>
</form>
<a href="index">列表</a>
</body>
</html>
