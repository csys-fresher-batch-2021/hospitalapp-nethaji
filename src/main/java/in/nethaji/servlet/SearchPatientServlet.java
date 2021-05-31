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
 * Servlet implementation class SearchPatientServlet
 */
@WebServlet("/SearchPatientServlet")
public class SearchPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String searchName = request.getParameter("search");
			PatientService patientService = new PatientService();
			Patient patientName = patientService.searchPatient((searchName).toUpperCase());
			request.setAttribute("patientName", patientName);
			request.getRequestDispatcher("SearchPatient.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		}
}
