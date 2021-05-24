package in.nethaji.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestDisplayMedicine {

	@BeforeClass
	public static void setUp() throws Exception {
		List<Medicine> medicineList = MedicineService.getMedicineList();

		Medicine medicine1 = new Medicine("Paracetamol", 10.0, "2021-10-10", 100);

		Medicine medicine2 = new Medicine("Benadryl", 70.0, "2022-12-03", 30);

		medicineList.add(medicine1);
		medicineList.add(medicine2);
	}

	/**
	 * This method is used to test display patients
	 */

	@Test
	public void testGetMedicine() {
		List<Medicine> medicineList = MedicineService.getMedicineList();
		assertEquals(2, medicineList.size());
	}

}
