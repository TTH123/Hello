<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="ISO-8859-1">
<title>荷兰式拍卖首页</title>
</head>
<body>
<h1>荷兰式拍卖</h1>

    <div>
    	<label>荷兰式拍卖亦称“减价式拍卖”。一种特殊的拍卖形式。拍卖标的的竞价由高到低依次递减直到第一个竞买入应价（达到或超过底价）时击槌成交的拍卖。
           	减价式拍卖通常从非常高的价格开始，高得有时没有人竞价，这时，价格就以事先确定的降价阶梯，由高到低递减，直到有竞买人愿意接受为止。如有两个或两个以上
           	竞价人同时应价时，转入增价拍卖形式。在大部分减价式拍卖中，实际上有许多竞价。因为减价式拍卖经常用于拍卖品具有多样品质的场合，如质量上的不同，第一个
           	出价最高的竞买人可以买走全部物品，但往往只以最高价买走这些物品中最好的，然后拍卖继续，价格下降，当另有竞买人愿意接受竞价，他也有同样的选择，也是买
           	走余下中最好的，然后拍卖又继续。在这种情况下，虽然竞买入大部分时间都沉默不语，但是在竞买者之间确实存在持续的竞争。减价拍卖最大的优点在于：成交过程
           	特别迅速，尤其是使用表盘式无声拍卖方式，使拍卖过程机械化、电子化，交易速度大大加快。但是，叫价递减过程往往导致竞买人坐等观望，企盼价格不断减低，因
        	  而现场竞争气氛不够热烈。
        </label>
   </div>
   
   <div>
		<a href=''>拍卖入口</a>
   
   </div>
</body>
</html>