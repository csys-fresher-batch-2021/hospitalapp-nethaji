package in.nethaji.validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.nethaji.model.Medicine;
import in.nethaji.service.MedicineService;

public class TestMedicineValidation {

	@Test
	public void testMedicineValidation1() {
		try {
			Medicine medicine = new Medicine("Paracetomal", 10, "2021-10-10", 20);
			boolean isAdded = MedicineValidation.isValidMedicine(medicine);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMedicineValidation2() {
		try {
			Medicine medicine = new Medicine(null, 20.0, "20-10-2022", 30);
			MedicineValidation.isValidMedicine(medicine);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
		}
	}

}
