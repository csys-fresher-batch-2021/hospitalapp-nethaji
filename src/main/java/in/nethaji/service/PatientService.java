/**
 * 
 */
package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.PatientValidation;
import in.nethaji.exception.ServiceException;
import in.nethaji.model.Doctor;
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

	public static boolean deletePatient(String patientName) {
		boolean isDeleted = false;
		Patient searchPatient = null;
		for (Patient patient : patientList) {
			if (patient.getPatientName().equalsIgnoreCase(patientName)) {
				searchPatient = patient;
				break;
			}
		}
		if (searchPatient != null) {
			patientList.remove(searchPatient);
			isDeleted = true;
		} else {
			throw new ServiceException("Invalid Patient Name");
		}

		return isDeleted;

	}

}
