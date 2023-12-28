<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Update Details</legend>
<form action="update">
<table align="center" border="2px">

    <tr>
        <td>Enter the id:<input type="number" name="id"
             value=<%request.getParameter("id");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
        <td>Enter the name:<input type="text" name="name"
             value=<%request.getParameter("name");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
        <td>Enter the Email:<input type="email" name="email"
             value=<%request.getParameter("email");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
        <td>Enter the Password:<input type="password" name="password"
             value=<%request.getParameter("password");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
        <td>Enter the Date:<input type="date" name="date"
             value=<%request.getParameter("date");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
        <td>Male:<input type="radio" name="gender" 
             value=<%request.getParameter("gender");%> readonly="readonly">
        </td>
    </tr>
    <tr>
        <td>Female:<input type="radio" name="gender" 
             value=<%request.getParameter("gender");%> readonly="readonly">
        </td>
    </tr>
    
    <tr>
		<td>
			<button type="submit">Update</button>
		</td>
	</tr>  
</table>
</form>
</fieldset>
</body>
</html>