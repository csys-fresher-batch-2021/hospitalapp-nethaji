package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.service.DoctorService;

/**
 * Servlet implementation class WardSelectionServlet
 */
@WebServlet("/WardSelectionServlet")
public class WardSelectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String specialist = request.getParameter("specialist");
			DoctorService doctorService = new DoctorService();
			doctorService.getDoctorBySpecialist(specialist);
			request.setAttribute("specialist", specialist);
			request.getRequestDispatcher("ListDoctorSpecialist.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
