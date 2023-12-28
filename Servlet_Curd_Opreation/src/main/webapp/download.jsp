<%@page import="dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> emps =(List<Employee>)request.getAttribute("objects"); %>
 <table border="2px">
 <tr>
 <th>id</th>
 <th>name</th>
 <th>email</th>
 <th>pwd</th>
 <th>date</th>
 <th>gender</th>
 <th>Delete</th>
 <th>Update</th>
 </tr>
 <% for(Employee emp:emps) { %>
  <tr>
  <td><%=emp.getId() %></td>
  <td><%=emp.getName() %></td>
  <td><%=emp.getEmail() %></td>
  <td><%=emp.getPwd() %></td>
  <td><%=emp.getDate() %></td>
  <td><%=emp.getGender() %></td>
  <td> <a href="def?primarykey=<%emp.getId();%>">Delete</a></td>
  <td><a href="update.jsp?primarykey=<%=emp.getId() %>&&name=<%=emp.getName() %>&&email=<%=emp.getEmail() %>&&password=<%=emp.getPwd() %>&&date=<%=emp.getDate() %>&&gender=<%=emp.getGender() %>">Update</a></td>
  </tr>
 <% }%>
 </table>
</body>
</html>