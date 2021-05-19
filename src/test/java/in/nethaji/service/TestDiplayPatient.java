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
		List<Patient> patientList = PatientService.getPatients();

		Patient patient1 = new Patient();
		patient1.setPatientId(100);
		patient1.setPatientName("Vibin Kumar");
		patient1.setPatientAge(23);
		patient1.setPatientGender("Male");
		patient1.setReason("Fever");

		Patient patient2 = new Patient();
		patient2.setPatientId(103);
		patient2.setPatientName("RamaNathan");
		patient2.setPatientAge(56);
		patient2.setPatientGender("Male");
		patient2.setReason("Heart Problems");

		patientList.add(patient1);
		patientList.add(patient2);
	}
	
	/**
	 * This method is used to test display patients
	 */

	@Test
	public void testGetPatient() {
		List<Patient> patientList = PatientService.getPatients();
		assertEquals(2, patientList.size());
	}

}
