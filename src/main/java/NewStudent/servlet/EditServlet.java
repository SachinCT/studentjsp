package NewStudent.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import NewStudent.Dao.NewStudentDao;
import NewStudentDto.NewStudent;

@WebServlet("/edit")
public class EditServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		
		ServletContext context=req.getServletContext();
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
		dao.updateStudent(id, student);
		
		List<NewStudent> listofstudents = dao.getAllStudents();
		
		req.setAttribute("list", listofstudents);
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.include(req, resp);
		
		
		
		
		
		
		
	}
}
