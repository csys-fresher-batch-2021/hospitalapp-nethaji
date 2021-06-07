package in.nethaji.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.Appointment;
import in.nethaji.service.AppointmentService;

/**
 * Servlet implementation class AdminDoctorAppointment
 */
@WebServlet("/AdminDoctorAppointment")
public class AdminDoctorAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AppointmentService appointmentService = new AppointmentService();
    	List<Appointment> appointmentList = appointmentService.getAppointment();
    	request.setAttribute("List", appointmentList);
    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminListAppointment.jsp");
    	requestDispatcher.forward(request, response);
    	
	}

}
