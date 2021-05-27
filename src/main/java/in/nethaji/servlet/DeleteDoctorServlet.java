package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.service.DoctorService;

/**
 * Servlet implementation class DeleteDoctorServlet
 */
@WebServlet("/DeleteDoctorServlet")
public class DeleteDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String doctorName = request.getParameter("doctorName");
			DoctorService doctorService = new DoctorService();
			boolean isDeleted = doctorService.deleteDoctor(doctorName);
			if (isDeleted) {
				response.sendRedirect("ListDoctors.jsp");
			} else {
				String errorMessage = "Unable to delete doctor";
				response.sendRedirect("ListDoctors.jsp?errorMessage " + errorMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListDoctors.jsp?errorMessage=" + e.getMessage());
		}
	}
}
