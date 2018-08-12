<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
    
<title>荷兰式拍卖</title>
<meta charset="ISO-8859-1">


</head>
<body>
  <h1>荷兰式拍卖</h1>
  <br>
    <table style="width: 60%; border:2px; bgcolor:red">
    	<tr align="center" bgcolor="#FAFAF1" height="22">
			<td width="40%">ID</td>
			<td width="60%">名字</td>
		</tr>   
		 <c:forEach items="${result}" var="goodsInfo">
		 	<tr align='center' bgcolor="#FFFFFF" height="22">
		 		<td>${goodsInfo.goodsId}</td>
		 		<td>${goodsInfo.goodsName}</td>
		 	</tr>		 
		 </c:forEach>
    </table> 
  </body>
</html>