<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>
<style type="text/css">
.domain > h1 {
  font-size: xx-large;
  /* border:2px solid rgb(21, 21, 44); */
  color: aliceblue;
  background-color: rgb(18, 18, 53);
  border-radius: 10px 10px;
  border-color: none;
  height: 60px;
  width: 100px;
  padding: auto;
  animation: t;
  animation-delay: 1s;
  animation-duration: 14s;
  animation-iteration-count: infinite;
}
@keyframes t {
  15% {
    height: 60px;
    width: 40px;
    padding: auto;
    border-radius: 100%;
    background-color: rgb(14, 3, 3);
    color: antiquewhite;
    font-size: xx-large;
    border-color: none;
    padding-left: 5px;
  }
  35% {
    height: 60px;
    width: 60px;
    padding: auto;
    /* border-radius: 100%; */
    background-color: rgb(7, 40, 53);
    color: rgb(231, 52, 52);
    font-size: xx-large;
    border-color: none;
    padding-left: 15px;
  }
  65% {
    height: 60px;
    width: 60px;
    padding: auto;
    /* border-radius: 100%; */
    background-color: rgb(15, 9, 9);
    color: rgb(73, 191, 227);
    font-size: xx-large;
    border-color: none;
    padding-left: 5px;
  }
  85% {
    height: 60px;
    width: 60px;
    padding: auto;
    /* border-radius: 100%; */
    background-color: rgb(11, 11, 29);
    color: antiquewhite;
    font-size: xx-large;
    border-color: none;
    padding-left: 5px;
  }
  100% {
    height: 60px;
    width: 60px;
    padding: auto;
    font-size: xx-large;
    border: 2px solid rgb(21, 21, 44);
    background-color: aliceblue;
    color: rgb(18, 18, 53);

    padding-top: 15px;
    border-color: none;
    padding-left: 40px;
  }
}
.main-block{
   border: 2px solid red;
   height: 750px;
   background-color: lightblue;
   background: linear-gradient(lightgreen,rgb(253, 82, 253),black);
}



</style>
</head>
<body>

<%String message=(String)request.getAttribute("message"); %>
<%if(message!=null){ %>
<%=message %>
<%} %>





<div class="main-block">

<div class="domain">
      <h1>Sachin</h1>   
</div>


<div style="margin-left: 507px; margin-top: 200px; border: thick; width: 300px">
<header style="background-color: black; color: white; padding-left: 8px"><h1>Student Registration</h1></header>

<form action="signup" style="background-color: purple">

<table border="1">
  <tr>
     <th>Id:</th>
     <td><input type="text" name=id required="required"></td>
  </tr>
  <tr>
     <th>Name:</th>
     <td><input type="text" name="name" required="required"></td>
  </tr>  
  <tr>
     <th>Email:</th>
     <td><input type="text" name="email" required="required"></td>
  </tr> 
   <tr>
     <th>Password:</th>
     <td><input type="password" name="password" required="required"></td>
  </tr>  
  <tr>
     <th>Address:</th>
     <td><input type="text" name=address required="required"></td>
  </tr>  
  <tr>
     <th>PhoneNumber:</th>
     <td><input type="number" name=phone required="required"></td>
  </tr>  

</table>
<div style="margin-left: 115px"><input type="submit" value="SIGNUP"></div>
</div>

</form>
</div>

</body>
</html>