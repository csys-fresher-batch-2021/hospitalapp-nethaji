package in.nethaji.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestAddDoctor {
	
	/**
	 * This is method is used to test doctor added
	 */

	@Test
	public void TestAddDoctor1() {
		
		String doctorName = "Radha Krishnan";
		String specialist = "ENT";
		Doctor doctor = new Doctor(doctorName, specialist);
	    boolean isAdded = DoctorService.addDoctor(doctor);
		assertTrue(isAdded);
	}
	

	/**
	 * This is method is used to test doctor added
	 */
	
	@Test
	public void TestAddDoctor2() {

		try {
			Doctor doctor = new Doctor ("Nethaji" , "Cardiology");
			boolean isAdded = DoctorService.addDoctor(doctor);
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
			Doctor doctor = new Doctor (" ", "General");
			boolean isAdded = DoctorService.addDoctor(doctor);
			assertTrue(isAdded);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
			e.printStackTrace();
		}
	}
	
}
