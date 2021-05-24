package in.nethaji.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.nethaji.model.Patient;

public class TestDeletePatient {

	@Before
	public void setUp() throws Exception {
		List<Patient> patientList = PatientService.getPatients();

		Patient patient1 = new Patient("Ponram", 10, "male", "Heart Problems");
		Patient patient2 = new Patient("Vibin", 40, "male", "Fever");

		patientList.add(patient1);
		patientList.add(patient2);

	}

	@After
	public void tearDown() throws Exception {
		PatientService.getPatients().clear();
	}

	@Test
	public void testDeletePatient1() {
		try {
			boolean isDeleted = PatientService.deletePatient("Vibin");
			assertTrue(isDeleted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test delete Patient.Here null value is checked.
	 */
	@Test
	public void testDeleteDoctor3() {

		try {
			PatientService.deletePatient(null);
		} catch (Exception e) {
			assertEquals("Invalid Patient Name", e.getMessage());
			e.printStackTrace();
		}
	}
}
