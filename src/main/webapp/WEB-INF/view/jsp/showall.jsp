<%--
  Created by IntelliJ IDEA.
  User: jinyugai
  Date: 2018/6/2
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>show the all date</title>
</head>
<body>
private String linkId;

private String updateTime;

private Integer travelTime;

private Integer speed;

private Integer reliabilitycode;

private Integer linkLen;

private Integer adcode;
    <h2>
        Zncu show用户
    </h2>
    <table width="100%" border="1">
        <tr>
            <th>linkId</th>
            <th>updateTime</th>
            <th>travelTime</th>
            <th>speed</th>
            <th>reliabilitycode</th>
            <th>linkLen</th>
            <th>speed</th>
            <th>adcode</th>

        </tr>
        <c:forEach items="${list}" var="TrafficEconomyAmapSpeedRawHz">
        <tr>
            <td>${TrafficEconomyAmapSpeedRawHz.linkId}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.updateTime}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.travelTime}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.speed}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.reliabilitycode}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.linkLen}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.speed}</td>
            <td>${TrafficEconomyAmapSpeedRawHz.adcode}</td>
            <td>
                <%--<a href="delete/${user.id}" class="del" >删除</a>|--%>
                <a href="/edit/${TrafficEconomyAmapSpeedRawHz.linkId}" >修改</a>
            </td>
        </tr>
        </c:forEach>
    </table>
<%--<p>
    <a href="add">新增</a>
</p>
<script>
    var items = document.querySelectorAll(".del");
    for(var i = 0; i < items.length ;i++){
        items[i].onclick=function () {
            return confirm("ZnCu你确定删除吗 ？");
        }
    }
</script>--%>
</body>
</html>
