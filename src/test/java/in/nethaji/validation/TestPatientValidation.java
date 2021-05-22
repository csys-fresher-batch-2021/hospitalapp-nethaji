package in.nethaji.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nethaji.model.Patient;

public class TestPatientValidation {

	@Test
	public void TestPatientValidation1() {
		try {
			Patient patient1 = new Patient("Raghu", 37, "male", "fever");
			boolean isValid = PatientValidation.isValidPatient(patient1);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test patient name. Here the value of patient name is
	 * wrong.
	 */

	@Test
	public void TestPatientValidation2() {
		try {
			Patient patient1 = new Patient(null, 37, "Female", "cold");
			PatientValidation.isValidPatient(patient1);
		} catch (Exception e) {
			assertEquals("Invalid Patient Name", e.getMessage());
		}
	}

	/**
	 * This method is used to test Patient Gender. Here, the value of patient gender
	 * is wrong.
	 */

	@Test
	public void TestPatientValidation3() {
		try {
			Patient patient1 = new Patient("raman", 37, null, "cold");
			PatientValidation.isValidPatient(patient1);
		} catch (Exception e) {
			assertEquals("Invalid Gender", e.getMessage());
		}
	}

	/**
	 * This method is used to test patient Age.Here the input is wrong.
	 */

	@Test
	public void TestPatientValidation4() {
		try {
			Patient patient1 = new Patient("raman", 137, "Male", "cold");
			PatientValidation.isValidPatient(patient1);
		} catch (Exception e) {
			assertEquals("Invalid Patient Age", e.getMessage());
		}
	}

}
