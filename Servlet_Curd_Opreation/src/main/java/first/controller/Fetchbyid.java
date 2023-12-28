package first.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
@WebServlet("/fetch")
public class Fetchbyid extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("id");
	System.out.println(id);
	EmployeeDao dao=new EmployeeDao();
	int cid=Integer.parseInt(id);
	Object o= dao.find(cid);
	res.getWriter().print(o);
		
	}

}
