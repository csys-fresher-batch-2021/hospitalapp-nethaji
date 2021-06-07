package in.nethaji.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.service.AppointmentService;

/**
 * Servlet implementation class SpecailistDoctorBookAppointment
 */
@WebServlet("/DoctorDateServlet")
public class DoctorDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorId = request.getParameter("doctorId");
		LocalDate appointmentdate = LocalDate.parse(request.getParameter("Adate"));
		try {
			AppointmentService appointmentService = new AppointmentService();
			int count = appointmentService.getBookedcount(doctorId, appointmentdate);
			request.setAttribute("doctorId", doctorId);
			request.setAttribute("Adate", appointmentService);
			request.setAttribute("count", count);
			request.getRequestDispatcher("BookAppointment.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
