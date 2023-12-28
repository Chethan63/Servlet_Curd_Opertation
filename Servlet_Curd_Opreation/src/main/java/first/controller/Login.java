package first.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

@WebServlet("/signup")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fronted_id = req.getParameter("id");
		int cid = Integer.parseInt(fronted_id);
		String fronted_pwd = req.getParameter("pwd");
		EmployeeDao dao = new EmployeeDao();
		Employee e1 = dao.findid(cid);
		if (e1 != null) {
			if (fronted_pwd.equals(e1.getPwd()) && cid == (e1.getId())) {
				resp.getWriter().print("<h1>wellcome to home page</h1>");
			} else {
				resp.getWriter().print("<h1>Please enter the proper pasword</h1>");
			}
		} else {
			resp.getWriter().print("<h1>Please enter the proper id</h1>");
			resp.getWriter().print("<a href=register.html>Click Here to Sign in</a>");
		}
	}

}
