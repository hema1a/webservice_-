<%--
  Created by IntelliJ IDEA.
  User: honor
  Date: 2023/11/18
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
  <head>
    <link href="favicon.ico" rel="shortcut icon">
    <title>胡桃的天气小灵通</title>
  </head>
  <body>
  <%--<h1>天气小灵通</h1>--%>
  <%--<div class="box1">请输入您要查找的城市：--%>
    <%--<span>--%>
                <%--<input type="text">--%>
            <%--</span>--%>
  <%--</div>--%>
  <input type="button" value="点击查询">
  <form action="control.jsp" method="post">
    <p>请输入要查询的城市:<input type="text" name="CityName"></p>
    <p><input type="submit" value="查询"></p>
  </form>
  </body>
</html>
