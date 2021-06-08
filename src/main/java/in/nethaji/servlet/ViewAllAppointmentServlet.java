package in.nethaji.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.Appointment;
import in.nethaji.service.AppointmentService;

/**
 * Servlet implementation class ViewAllAppointmentServlet
 */
@WebServlet("/ViewAllAppointmentServlet")
public class ViewAllAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			AppointmentService appointmentService = new AppointmentService();
			List<Appointment> appointments = appointmentService.getAllAppointmentList();
			request.setAttribute("Appointment", appointments);
			request.getRequestDispatcher("ViewAllAppointmentAdmin.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
