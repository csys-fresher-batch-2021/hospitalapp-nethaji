package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.service.PatientService;

/**
 * Servlet implementation class DeletePatientServlet
 */
@WebServlet("/DeletePatientServlet")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String patientName = request.getParameter("patientName");
			PatientService patientService = new PatientService();
			boolean isDeleted = patientService.deletePatient(patientName);
			if (isDeleted) {
				response.sendRedirect("ListPatients.jsp");
			} else {
				String errorMessage = "Unable to delete Patient";
				response.sendRedirect("ListPatients.jsp?errorMessage " + errorMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListPatients.jsp?errorMessage=" + e.getMessage());
		}
	}
	

}
