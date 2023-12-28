package first.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/fetchall")
public class FetchAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
//		System.out.println("Data is Fetched");
//		resp.getWriter().print("Data fetched");
		
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list=dao.Fetchall();
		resp.getWriter().println(list);
		
		req.setAttribute("objects", list);
		
		   RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		   rd.forward(req, resp);
	}

}
