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
 * Servlet implementation class UpdateDoctorServlet
 */
@WebServlet("/UpdateDoctorServlet")
public class UpdateDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String doctorId = request.getParameter("doctorId");
			String doctorName = request.getParameter("doctorName");
			String specialist = request.getParameter("specialist");
			Doctor doctor = new Doctor(doctorId, doctorName, specialist);
			DoctorService doctorService = new DoctorService();
			doctorService.updateDoctor(doctor);
			response.sendRedirect("ListDoctors.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("UpdateDoctor.jsp?errorMessage=" + e.getMessage());
		}
	}

}
