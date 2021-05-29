package in.nethaji.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import in.nethaji.model.Patient;
import in.nethaji.service.PatientService;

/**
 * Servlet implementation class DisplayPatientDetails
 */
@WebServlet("/DisplayPatientDetails")
public class DisplayPatientDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientService patientService = new PatientService();
		// Step 1: Call Service and get List of Patients
		List<Patient> list = patientService.getPatients();

		// Step 2: Convert to Json string
		Gson gson = new Gson();
		String json = gson.toJson(list);
		// Step 3: Write the json in response and flush it
		PrintWriter out = response.getWriter();
		out.print(json);
		out.flush();
	}

}
