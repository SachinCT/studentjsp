<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
.block1{
   border: 2px solid red;
   height: 750px;
   background-color: lightblue;
   background: linear-gradient(lightgreen,rgb(253, 82, 253),black);
}
</style>
</head>
<body>
<%String message=(String)request.getAttribute("message"); %>
<%if(message!=null) {%>
<%=message %>
<%} %>
<div class="block1">
<form action="login" method="post">
Email:<input type="text" name=email>
Password:<input type="password" name=pasword>
<input type="submit" value="LOGIN">

</form>
</div>
</body>
</html>