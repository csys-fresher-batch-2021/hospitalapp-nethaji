package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.Patient;
import in.nethaji.service.PatientService;

/**
 * Servlet implementation class AddPatientServlet
 */
@WebServlet("/AddPatientServlet")
public class AddPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String patientName = request.getParameter("patientName");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String reason = request.getParameter("reason");
		try {
			int patientAge = Integer.parseInt(age);
			Patient patient = new Patient(patientName, patientAge, gender, reason);
			PatientService patientService = new PatientService();
			patientService.addPatient(patient);
			response.sendRedirect("ListPatients.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListPatients.jsp?errorMessage" + e.getMessage());
		}
	}

}
