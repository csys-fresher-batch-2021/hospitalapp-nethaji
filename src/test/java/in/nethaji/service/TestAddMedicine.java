package in.nethaji.service;

import static org.junit.Assert.*;

import org.junit.Test;

import in.nethaji.model.Medicine;

public class TestAddMedicine {

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

}
