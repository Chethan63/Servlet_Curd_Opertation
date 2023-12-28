package first.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;

@WebServlet("/insert")
public class Duster implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//System.out.println("well come to Friday");
	  String empid =req.getParameter("id");
	  String empname=req.getParameter("Name");
	   String empgender=req.getParameter("gender");
	   String checkbox=req.getParameter("checkbox");
	   String empemail=req.getParameter("email");
	  String emppwd=req.getParameter("pwd");
	  String empdob=req.getParameter("dob");
	 String country=req.getParameter("country");
	  
	  System.out.println(empid);
	  System.out.println(empname);
	  System.out.println(empemail);
	  System.out.println(emppwd);
	  System.out.println(empdob);
	  System.out.println(empgender);
	  System.out.println(checkbox);
	  System.out.println(country);
	  
	  Employee employee=new Employee();
	  employee.setName(empname);
	  
	  int cid=Integer.parseInt(empid);
	  employee.setId(cid);
	  employee.setEmail(empemail);
	  employee.setPwd(emppwd);
	  employee.setGender(empgender);
	  employee.setCheckbox(checkbox);
	  employee.setDate(empdob);
	  employee.setCountry(country);
	  
	  
	  System.out.println(employee);
	  
	  
	  EmployeeDao employeeDao=new EmployeeDao();
	  employeeDao.insert(employee);
	  
	  
	  
//	  res.getWriter().print(empid);
//	  res.getWriter().print(empname);
	  
	  
	}

}
