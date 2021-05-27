package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.nethaji.service.AdminLogin;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean isValid = AdminLogin.checkAdminLogin(username, password);

		if (isValid) {
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_ADMIN", username);
			session.setAttribute("ROLE", "ADMIN");
			response.sendRedirect("Home.jsp");
		} else {
			response.sendRedirect("AdminLogin.jsp?errorMessage=Invalid Login Credentials");
		}
	}

}
