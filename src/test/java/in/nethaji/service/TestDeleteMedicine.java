package in.nethaji.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestDeleteMedicine {
	
	@Before
	public void setUp() throws Exception {
		List<Medicine> medicineList = MedicineService.getMedicineList();

		Medicine medicine1 = new Medicine("Paracetomal", 10, "2022-10-12", 20);
		Medicine medicine2 = new Medicine("Benadryl", 40, "2021-10-02", 10);

		medicineList.add(medicine1);
		medicineList.add(medicine2);

	}

	@After
	public void tearDown() throws Exception {
		MedicineService.getMedicineList().clear();
	}

	@Test
	public void testDeleteMedicine() {
		try {
			boolean isDeleted = MedicineService.deleteMedicine("Paracetomal");
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
			MedicineService.deleteMedicine(null);
		} catch (Exception e) {
			assertEquals("Invalid Medicine Name", e.getMessage());
			e.printStackTrace();
		}
	}

}
