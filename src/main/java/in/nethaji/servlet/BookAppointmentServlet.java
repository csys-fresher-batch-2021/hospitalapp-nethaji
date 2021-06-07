package in.nethaji.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.nethaji.dao.DoctorDao;
import in.nethaji.model.Appointment;
import in.nethaji.model.Doctor;
import in.nethaji.service.AppointmentService;

/**
 * Servlet implementation class BookAppointmentServlet
 */
@WebServlet("/BookAppointmentServlet")
public class BookAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String patientName = request.getParameter("patientName");
			int patientAge = Integer.parseInt(request.getParameter("age"));
			Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
			String patientGender = request.getParameter("gender");
			String doctorId = request.getParameter("doctorId");
			LocalDate appointmentDate = LocalDate.parse(request.getParameter("aDate"));
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("LOGGED_IN_USER");
			Appointment appointment = new Appointment(patientName, patientAge, phoneNumber, patientGender, doctorId,appointmentDate,username);
			AppointmentService appointmentService = new AppointmentService();
			appointmentService.addAppointment(appointment);
			response.sendRedirect("Home.jsp");
		} catch (IOException e) {
			e.printStackTrace();
			response.sendRedirect("ListAppointment.jsp?errorMessage=" + e.getMessage());
		}

	}

}
