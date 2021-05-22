/**
 * 
 */
package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.PatientValidation;
import in.nethaji.model.Patient;

public class PatientService {

	private PatientService() {
		// Default Constructor
	}

	private static final List<Patient> patientList = new ArrayList<>();

	/**
	 * This method is used to get the list of doctors
	 * 
	 * @return
	 */
	public static List<Patient> getPatients() {
		return patientList;
	}

	public static boolean addPatient(Patient patient) {
		boolean isAdded = false;
		if (PatientValidation.isValidPatient(patient)) {
			patientList.add(patient);
			isAdded = true;
		}
		return isAdded;
	}

}
