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

		Medicine medicine1 = new Medicine();
		medicine1.setMedicineId(10);
		medicine1.setMedicineName("Paracetamol");
		medicine1.setMedicinePrice(10.00);
		medicine1.setMedicineExpiry("2021-10-10");
		medicine1.setQuantity(100);

		Medicine medicine2 = new Medicine();
		medicine2.setMedicineId(10);
		medicine2.setMedicineName("Eye drops");
		medicine2.setMedicinePrice(65.00);
		medicine2.setMedicineExpiry("2021-10-10");
		medicine2.setQuantity(100);

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
