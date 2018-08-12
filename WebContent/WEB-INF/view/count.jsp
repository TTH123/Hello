<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type='text/javascript'>

//获取当前时间
startday=new Date();
clockStart=startday.getTime();
function initStopwatch(){
	var myTime=new Date();
	var timeNow=myTime.getTime();
	var timeDiff=timeNow-clockStart;//获取间隔时间
	this.diffSecs=timeDiff/1000; //时间以毫秒为单位
	return(this.diffSecs);
}
function getSecs(){
	var mySecs=initStopwatch();
	var mySecs1=""+mySecs;
	var time = parseInt(mySecs1);
 
	var h = (time/3600); 
	var h1 = ""+h;
	var h2 = parseInt(h1);
 
	var m = ((time-3600*h2)/60);
	var m1 = ""+m;
	var m2 = parseInt(m1);
 
	var s = (time-3600*h2-60*m2);
	var s1 = ""+s;
	var s2 = parseInt(s1);
 
	var t = h2+"时"+m2+"分"+s2+"秒";
	document.form1.timespent.value=t;
	window.setTimeout('getSecs()',1000);
}
</script>
</head>
<body onLoad="getSecs()">
<form name=form1><input size=90 name=timespent></form>

</body>
</html>