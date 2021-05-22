package in.nethaji.validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.nethaji.validation.DoctorValidation;
import in.nethaji.model.Doctor;

public class TestDoctorValidation {

	@Test
	public void testDoctorValidation1() {
		try {
			Doctor doctor = new Doctor("Venkataraman", "ENT");
			Boolean isValid = DoctorValidation.isValidDoctor(doctor);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test null value to the doctor name
	 */
	@Test
	public void testDoctorValidation2() {
		try {
			Doctor doctor = new Doctor(null, "Cardiology");
			DoctorValidation.isValidDoctor(doctor);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
		}
	}

	/**
	 * This method is used to test the null value to the specialist
	 */

	@Test
	public void testDoctorValidation3() {
		try {
			Doctor doctor = new Doctor("Rahul", null);
			DoctorValidation.isValidDoctor(doctor);
		} catch (Exception e) {
			assertEquals("Invalid specialist", e.getMessage());
		}
	}

	@Test
	public void testDoctorValidation4() {
		try {
			Doctor doctor = new Doctor("Venkataraman", "General");
			Boolean isValid = DoctorValidation.isValidDoctor(doctor);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test empty value to the doctor name
	 */

	@Test
	public void testDoctorValidation5() {
		try {
			Doctor doctor = new Doctor("  ", "ENT");
			DoctorValidation.isValidDoctor(doctor);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
		}
	}

}
