package in.nethaji.validation;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestMedicineValidation {

	@Test
	public void testMedicineValidation1() {
		try {
			Medicine medicine = new Medicine();
			medicine.setMedicineName("Paracetomal");
			medicine.setPrice(10.0);
			medicine.setExpiryDate(LocalDate.parse("2021-10-10"));
			medicine.setQuantity(100);
			
			boolean isAdded = MedicineValidation.isValidMedicine(medicine);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMedicineValidation2() {
		try {
			Medicine medicine = new Medicine();
			medicine.setMedicineName(null);
			medicine.setPrice(10.0);
			medicine.setExpiryDate(LocalDate.parse("2021-10-10"));
			medicine.setQuantity(100);
			MedicineValidation.isValidMedicine(medicine);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
		}
	}

}
