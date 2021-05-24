package in.nethaji.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.service.MedicineService;

/**
 * Servlet implementation class DeleteMedicineServlet
 */
@WebServlet("/DeleteMedicineServlet")
public class DeleteMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String medicineName = request.getParameter("medicineName");
			boolean isDeleted = MedicineService.deleteMedicine(medicineName);
			if (isDeleted) {
				response.sendRedirect("ListMedicines.jsp");
			} else {
				String errorMessage = "Unable to delete Medicine";
				response.sendRedirect("ListMedicines.jsp?errorMessage " + errorMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListMedicines.jsp?errorMessage=" + e.getMessage());
		}
	}
	

}
