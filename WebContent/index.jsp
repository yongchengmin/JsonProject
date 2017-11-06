<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>这是标题</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="这是关键词">
<meta http-equiv="description" content="这是详细内容">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	请在浏览器上输入:http://127.0.0.1:8080/JsonProject/servlet/JsonAction进行访问,
	<br /> 效果如下:
	<br />{"ListMap":[{"UserName":"hacker13A1","UserId":1},{"UserName":"hacker13A2","UserId":2},{"UserName":"hacker13A3","UserId":3},{"UserName":"hacker13A4","UserId":4},{"UserName":"hacker13A5","UserId":5}]}
	<br>
</body>
</html>