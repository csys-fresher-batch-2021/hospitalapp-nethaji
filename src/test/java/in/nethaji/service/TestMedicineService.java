package in.nethaji.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestMedicineService {
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		List<Medicine> medicineList = MedicineService.getMedicineList();

		Medicine medicine1 = new Medicine("Paracetamol", 10.0, "2021-10-10", 100);

		Medicine medicine2 = new Medicine("Benadryl", 70.0, "2022-12-03", 30);

		medicineList.add(medicine1);
		medicineList.add(medicine2);
	}

	@Test
	public void testAddMedicine1() {
		try {
			Medicine medicine = new Medicine("Paracetomal", 10, "2021-10-10", 20);
			boolean isAdded = MedicineService.addMedicine(medicine);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddMedicine2() {
		try {
			Medicine medicine = new Medicine(null, 20.0, "20-10-2022", 30);
			MedicineService.addMedicine(medicine);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
		}
	}
	
	/**
	 * This method is used to test display patients
	 */

	@Test
	public void testGetMedicine() {
		List<Medicine> medicineList = MedicineService.getMedicineList();
		assertEquals(3, medicineList.size());
	}

}
