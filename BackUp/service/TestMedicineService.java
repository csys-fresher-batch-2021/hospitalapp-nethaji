package in.nethaji.service;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestMedicineService {
	
	@BeforeClass
	public static void setUp() throws Exception {
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

	@Test
	public void testAddMedicine1() {
		try {
			Medicine medicine1 = new Medicine();
			medicine1.setMedicineName("Paracetomal");
			medicine1.setPrice(10.0);
			medicine1.setExpiryDate(LocalDate.parse("2021-10-10"));
			medicine1.setQuantity(100);
			
			MedicineService medicineService = new MedicineService();
			boolean isAdded = medicineService.addMedicine(medicine1);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddMedicine2() {
		try {
			Medicine medicine1 = new Medicine();
			medicine1.setMedicineName(null);
			medicine1.setPrice(10.0);
			medicine1.setExpiryDate(LocalDate.parse("2021-10-10"));
			medicine1.setQuantity(100);
			
			MedicineService medicineService = new MedicineService();
			medicineService.addMedicine(medicine1);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
		}
	}
	
	/**
	 * This method is used to test display patients
	 */

	@Test
	public void testGetMedicine3() {
		
		MedicineService medicineService = new MedicineService();
		List<Medicine> medicineList = medicineService.getMedicineList();
		assertEquals(4, medicineList.size());
	}

}
