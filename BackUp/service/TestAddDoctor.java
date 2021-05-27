package in.nethaji.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestAddDoctor {

	/**
	 * This is method is used to test doctor added
	 * 
	 * @throws ClassNotFoundException
	 */

	@Test
	public void TestAddDoctor1() {
		try {
			Doctor doctor = new Doctor("Radha Krishnan", "ENT");
			DoctorService doctorService = new DoctorService();
			boolean isAdded = doctorService.addDoctor(doctor);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This is method is used to test doctor added
	 */

	@Test
	public void TestAddDoctor2() {

		try {
			Doctor doctor = new Doctor("Nethaji", "Cardiology");
			DoctorService doctorService = new DoctorService();
			boolean isAdded = doctorService.addDoctor(doctor);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This is method is used to test doctor added.Here empty value is passed
	 */

	@Test
	public void TestAddDoctor3() {

		try {
			Doctor doctor = new Doctor(" ", "General");
			DoctorService doctorService = new DoctorService();
			doctorService.addDoctor(doctor);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
			e.printStackTrace();
		}
	}

}
