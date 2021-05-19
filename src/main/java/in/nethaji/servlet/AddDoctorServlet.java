package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.Doctor;
import in.nethaji.service.DoctorService;

/**
 * Servlet implementation class AddDoctorServlet
 */
@WebServlet("/AddDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String doctorName = request.getParameter("doctorName");
		String specialist = request.getParameter("specialist");
		try {
			Doctor doctor = new Doctor(doctorName, specialist);
			DoctorService.addDoctor(doctor);
			response.sendRedirect("ListDoctors.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("AddDoctor.jsp?errorMessage=" + e.getMessage());
		}
	}
}
