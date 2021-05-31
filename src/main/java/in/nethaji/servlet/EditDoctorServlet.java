package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.dao.DoctorDao;
import in.nethaji.model.Doctor;

/**
 * Servlet implementation class EditDoctorServlet
 */
@WebServlet("/EditDoctorServlet")
public class EditDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorId = request.getParameter("doctorId");
		//DoctorDao doctorDao = new DoctorDao();
		request.setAttribute("DOCTOR_DETAILS", doctorId);
		request.getRequestDispatcher("UpdateDoctor.jsp").forward(request, response);
		
	}

}
