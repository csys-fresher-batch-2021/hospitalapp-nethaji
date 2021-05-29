package in.nethaji.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.User;
import in.nethaji.service.UserRegister;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			LocalDate bDate = LocalDate.parse(request.getParameter("Bdate"));
			int age = Integer.parseInt(request.getParameter("age"));
			Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			User user = new User(username,bDate,age,phoneNumber,password,email,gender);
			UserRegister userRegister = new UserRegister();
			userRegister.addUser(user);
			response.sendRedirect("Index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("Register.jsp?errorMessage=" + e.getMessage());
		}
	}

}
