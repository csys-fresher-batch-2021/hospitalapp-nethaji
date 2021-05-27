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
		PatientService patientService = new PatientService();
		List<Patient> patientList = patientService.getPatients();

		Patient patient1 = new Patient("Ponram", 10, "male", "Heart Problems");
		Patient patient2 = new Patient("Vibin", 40, "male", "Fever");

		patientList.add(patient1);
		patientList.add(patient2);

	}

	@After
	public void tearDown() throws Exception {
		PatientService patientService = new PatientService();
		patientService.getPatients().clear();
	}

	@Test
	public void testDeletePatient1() {
		try {
			PatientService patientService = new PatientService();
			boolean isDeleted = patientService.deletePatient("Ponram");
			assertTrue(isDeleted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test delete Patient.Here null value is checked.
	 */
	@Test
	public void testDeleteDoctor2() {

		try {
			PatientService patientService = new PatientService();
			patientService.deletePatient(null);
		} catch (Exception e) {
			assertEquals("Invalid Patient Name", e.getMessage());
			e.printStackTrace();
		}
	}
}
