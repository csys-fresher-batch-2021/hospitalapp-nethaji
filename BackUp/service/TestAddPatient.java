package in.nethaji.service;

import static org.junit.Assert.*;

import org.junit.Test;

import in.nethaji.model.Patient;

public class TestAddPatient {

	@Test
	public void testAddPatient1() {
		try {
			Patient patient1 = new Patient("Ponram", 10, "male", "Heart Problems");
			PatientService patientService = new PatientService();
			boolean isAdded = patientService.addPatient(patient1);
			assertTrue(isAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test invalid doctor name adding
	 */
	@Test
	public void testAddPatient2() {
		try {
			Patient patient1 = new Patient(null, 10, "male", "Heart Problems");
			PatientService patientService = new PatientService();
			patientService.addPatient(patient1);
		} catch (Exception e) {
			assertEquals("Invalid Patient Name", e.getMessage());
		}
	}

}
