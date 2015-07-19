<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
#queries{
height: 500px;
width: 1200px;
margin:auto;
background-color:#F0F0F0;
}
#footer{
clear:both;
position:relative;
margin-top: 240px;
color:#00aced;
text-align:center;
}
h1{
height:60px;
background-color:#00aced;
color:white;
}
a{text-decoration: none;
color:black;}
#name{width:1300px;
text-align:center;
margin:auto;}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Twitter Data Analysis</title>
</head>
<body bgcolor="white">
<div id="name">
<h1 align ="center"> Twitter Data Analysis</h1>
</div>
<div id="queries">									
<h2 align ="center">Queries</h2><BR>
<div>
<img  src="/home/biadmin/Desktop/out.png" width = "160" height = "160" />
</div>
<form action="${pageContext.request.contextPath}/TwitterServlet" method="post">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;Tweet Content of most popular tweetww   fsgfsdg
 <INPUT TYPE="submit" name="button1"  VALUE="QueryDatabase" style="float: right;">
<p> ${TC}</p>
<p> ${sum1}</p>
 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;Tweet by most followed twitter account 
 <INPUT TYPE="submit" name="button2"  VALUE="QueryDatabase" style="float: right;">
 <p> ${TC}</p>
 <p> ${followers}</p>
 <p> ${username}</p><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;<a href="http://bivm:8080/bigsheets/client/collection/view?id=1">Number of tweets according to time category</a><br><br><br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;<a href="#">Tweets from celebrity/verified accounts & general account</a><br><br><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;<a href="#">Top 5 Countries that tweeted the most on Ebola</a><br><br><br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&bull;&nbsp;<a href="#">Tweets from celebrity/verified accounts & general account</a>
</form>
</div>
<div id="footer">twitter analysis project by UMKC students.</div>
</body>
</html>