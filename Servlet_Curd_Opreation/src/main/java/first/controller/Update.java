package first.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/update")
public class Update extends HttpServlet {
    
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		  
		  String id=req.getParameter("id");
		  String name =req.getParameter("name");
		  String email=req.getParameter("email");
		  String pwd=req.getParameter("password");
		  String gender=req.getParameter("gender");
		  String date=req.getParameter("date");
		
		  
		  int cid=Integer.parseInt(id);
		  Employee emp=new Employee();
		  emp.setId(cid);
		  emp.setName(name);
		  emp.setEmail(email);
		  emp.setPwd(pwd);
		  emp.setGender(gender);
		  emp.setDate(date);
		
		  
		 EmployeeDao dao=new EmployeeDao();
		 dao.update(emp);
	}
}
