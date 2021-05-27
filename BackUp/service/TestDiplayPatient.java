package in.nethaji.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Doctor;
import in.nethaji.model.Patient;

public class TestDiplayPatient {

	@BeforeClass
	public static void setUp() throws Exception {
		PatientService patientService = new PatientService();
		List<Patient> patientList = patientService.getPatients();

		Patient patient1 = new Patient("Vibin kumar", 23, "male", "fever");

		Patient patient2 = new Patient("lakshmi", 56, "female", null);

		patientList.add(patient1);
		patientList.add(patient2);
	}

	/**
	 * This method is used to test display patients
	 */

	@Test
	public void testGetPatient() {
		PatientService patientService = new PatientService();
		List<Patient> patientList = patientService.getPatients();
		assertEquals(3, patientList.size());
	}

}
