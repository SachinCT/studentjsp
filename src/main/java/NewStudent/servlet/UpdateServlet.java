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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		NewStudentDao dao=new NewStudentDao();
		NewStudent student = dao.getStudentById(id);
		
		
//		List<NewStudent> listofstudents = dao.getAllStudents();
//		req.setAttribute("list", listofstudents);
		
		
		req.setAttribute("student", student);
		RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
		dispatcher.include(req, resp);
	}
}
