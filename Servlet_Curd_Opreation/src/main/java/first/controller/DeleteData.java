
package first.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;

@WebServlet("/def")
public class DeleteData extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String id=arg0.getParameter("primary key");
		System.out.println("controller"+id);
		
		int cid=Integer.parseInt(id);
		EmployeeDao dao=new EmployeeDao();
		String msg=dao.delete(cid);
		arg1.getWriter().print(msg);
		
		List<Employee> list =dao.Fetchall();
		arg0.setAttribute("objects", list);
		
		RequestDispatcher rd=arg0.getRequestDispatcher("download.jsp");
		rd.forward(arg0, arg1);
	}
	

}
