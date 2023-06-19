package NewStudent.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import NewStudent.Dao.NewStudentDao;
import NewStudentDto.NewStudent;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
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
			
			NewStudent student = dao.getStudentByEmail(email);
			if (true) {
//				student.getsPassword().equals(password)[it should be in place of true above]
				req.setAttribute("list", listofstudents);
//				req.setAttribute("message", "signed in successfully");
				RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("message", "incorrect password");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);

			}
		} else {
			req.setAttribute("message", "email doesnt exist");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}
}
