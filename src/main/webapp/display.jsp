<%@page import="NewStudentDto.NewStudent"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.block2{
   border: 2px solid red;
   height: 750px;
   background-color: lightblue;
   background: linear-gradient(lightgreen,rgb(253, 82, 253),black);
   align-items: center;
   padding-left: 400px;
   padding-top: 300px
}
</style>
</head>
<body>
<%List<NewStudent> listofstudents=(List)request.getAttribute("list"); %>
<div class="block2">
<table border="2px" style="background-color: purple; color: yellow">
<tr>

<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Address</th>
<th>Phone</th>
<th>Fees</th>
<th>update</th>
<th>delete</th>

</tr>

<% for(NewStudent student:listofstudents){ %>
<tr>
<td><%=student.getsId() %></td>
<td><%=student.getsName() %></td>
<td><%=student.getsEmail() %></td>
<td><%=student.getsPassword() %></td>
<td><%=student.getsAddress() %></td>
<td><%=student.getsPhone() %></td>
<td><%=student.getsFees() %></td>

<td><a href="update?id=<%= student.getsId()%>" style="color: white">update</a></td>
<td><a href="delete?id=<%= student.getsId()%>" style="color: red">delete</a></td>

</tr>
<%} %>

</table>
</div>
</body>
</html>