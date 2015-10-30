<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="myTag" uri="http://com.hh/taglib" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<body>
<h2>Hello World!</h2>
要显示的信息1：<myTag:myTaglib name="张三"></myTag:myTaglib><br>
要显示的信息2：<myTag:myTaglib name="张三" age="20"></myTag:myTaglib>
</body>
</html>
