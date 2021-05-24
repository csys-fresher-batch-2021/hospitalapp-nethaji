package in.nethaji.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nethaji.model.Medicine;
import in.nethaji.service.MedicineService;

/**
 * Servlet implementation class AddMedicineServlet
 */
@WebServlet("/AddMedicineServlet")
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String medicineName = request.getParameter("medicineName");
			double price = Double.parseDouble(request.getParameter("price"));
			String expiryDate = request.getParameter("expiryDate");
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			Medicine medicine = new Medicine(medicineName, price, expiryDate, quantity);
			MedicineService.addMedicine(medicine);
			response.sendRedirect("ListMedicines.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListMedicines.jsp?errorMessage" + e.getMessage());
		}
	}

}
