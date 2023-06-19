package NewStudent.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import NewStudent.Dao.NewStudentDao;
import NewStudentDto.NewStudent;

public class NewStudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		
		ServletContext context = getServletContext();
		double fees=Double.parseDouble(context.getInitParameter("fees"));
		
		NewStudent student=new NewStudent();
		student.setsId(id);
		student.setsName(name);
		student.setsEmail(email);
		student.setsPassword(password);
		student.setsPhone(phone);
		student.setsAddress(address);
		student.setsFees(fees);
		
		NewStudentDao dao=new NewStudentDao();
		List<NewStudent> listofstudents = dao.getAllStudents();
	    
		boolean value=false;
		for (NewStudent newStudent : listofstudents) {
			if (newStudent.getsEmail().equals(email)) {
				value=true;
				break;
			}
		}
		if (value) {
			req.setAttribute("message", "email already exists");
			RequestDispatcher dispatcher=req.getRequestDispatcher("signup.jsp");
			dispatcher.include(req, resp);
		} else {
			dao.studentSignIn(student);
			req.setAttribute("message", "signedin successfully");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
	}
}
