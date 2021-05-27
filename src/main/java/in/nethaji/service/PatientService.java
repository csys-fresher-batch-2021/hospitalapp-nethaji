package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.PatientValidation;
import in.nethaji.dao.PatientDao;
import in.nethaji.model.Patient;
import in.nethaji.util.StringValidation;

public class PatientService {

	PatientDao patientDao = new PatientDao();

	/**
	 * This method is used to get the list of patient in db
	 * 
	 * @return
	 */
	public List<Patient> getPatients() {
		List<Patient> patientList = new ArrayList<>();
		patientList = patientDao.findAllPatient();
		return patientList;
	}
	
	/**
	 * This method is used to add patient in array list
	 * @param patient
	 * @return
	 */

	public boolean addPatient(Patient patient) {
		boolean isAdded = false;
		if (PatientValidation.isValidPatient(patient)) {
			patientDao.save(patient);
			isAdded = true;
		}
		return isAdded;
	}

	/**
	 * This method is used to delete patient in db
	 * @param patientName
	 * @return
	 */
	public boolean deletePatient(String patientName) {
		boolean isDeleted = false;
		if (StringValidation.isValidString(patientName, "Invalid Patient Name")) {
			patientDao.delete(patientName);
		}
		return isDeleted;
	}

}
