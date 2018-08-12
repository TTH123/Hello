<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type='text/javascript'>

var maxtime = 10; //半个小时，按秒计算，自己调整! 
function initStopwatch(){
	if(maxtime>0){
		minutes = Math.floor(maxtime/60);
		seconds = Math.floor(maxtime%60);
		var t = minutes+"分"+seconds+"秒";
		document.form1.timespent.value=t;

		maxtime--;
		} else if(maxtime==0){
			var form = document.getElementById('form1');
			form.submit();
		}
}
function getSecs(){
	initStopwatch();	
	window.setTimeout('getSecs()',1000);
}
</script>
</head>
<body onLoad="getSecs()">
<form id="form1" name="form1" action="/DutchAuction/test/random" method="post">

    倒计时：<input size=50 name=timespent readonly>  <br>
    
   拍卖价格： <input id="random" name="random" value="${initValue}">
</form>

</body>
</html>