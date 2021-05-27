package in.nethaji.service;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestDeleteMedicine {
	
	@Before
	public void setUp() throws Exception {
		MedicineService medicineService = new MedicineService();
		List<Medicine> medicineList = medicineService.getMedicineList();

		Medicine medicine1 = new Medicine();
		medicine1.setMedicineName("Paracetomal");
		medicine1.setPrice(10.0);
		medicine1.setExpiryDate(LocalDate.parse("2021-10-10"));
		medicine1.setQuantity(100);
		
		Medicine medicine2 = new Medicine();
		medicine2.setMedicineName("Zaridon");
		medicine2.setPrice(10.0);
		medicine2.setExpiryDate(LocalDate.parse("2021-10-10"));
		medicine2.setQuantity(100);

		medicineList.add(medicine1);
		medicineList.add(medicine2);

	}

	@After
	public void tearDown() throws Exception {
		MedicineService medicineService = new MedicineService();
		medicineService.getMedicineList().clear();
	}

	@Test
	public void testDeleteMedicine() {
		try {
			MedicineService medicineService = new MedicineService();
			boolean isDeleted = medicineService.deleteMedicine("Paracetomal");
			assertTrue(isDeleted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test delete Medicine.Here null value is checked.
	 */
	@Test
	public void testDeleteDoctor3() {

		try {
			MedicineService medicineService = new MedicineService();
			medicineService.deleteMedicine(null);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
			e.printStackTrace();
		}
	}

}
