<%@page import="NewStudentDto.NewStudent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<style type="text/css">
.block3{
   border: 2px solid red;
   height: 750px;
   background-color: lightblue;
   background: linear-gradient(lightgreen,rgb(253, 82, 253),black);
   align-items: center;
}
</style>
</head>
<body>

<%NewStudent student=(NewStudent)request.getAttribute("student"); %>
<div class="block3">
<form action="edit" method="post">

<table border="1">
  <tr>
     <th>Id:</th>
     <td><input type="text" name=id value="<%=student.getsId() %>" readonly="readonly"></td>
  </tr>
  <tr>
     <th>Name:</th>
     <td><input type="text" name="name" value="<%=student.getsName() %>" required="required"></td>
  </tr>  
  <tr>
     <th>Email:</th>
     <td><input type="text" name="email" value="<%=student.getsEmail() %>" required="required"></td>
  </tr> 
   <tr>
     <th>Password:</th>
     <td><input type="password" name="password" value="<%=student.getsPassword() %>" required="required"></td>
  </tr>  
  <tr>
     <th>Address:</th>
     <td><input type="text" name=address value="<%=student.getsAddress() %>" required="required"></td>
  </tr>  
  <tr>
     <th>PhoneNumber:</th>
     <td><input type="number" name=phone value="<%=student.getsPhone() %>" required="required"></td>
  </tr>  

</table>

<input type="submit" value="SIGNUP">

</form>
</div>
</body>
</html>