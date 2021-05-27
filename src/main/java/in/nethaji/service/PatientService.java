package in.nethaji.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.PatientValidation;
import in.nethaji.dao.PatientDao;
import in.nethaji.model.Patient;
import in.nethaji.util.StringValidation;

public class PatientService {

	PatientDao patientDao = new PatientDao();

	/**
	 * This method is used to get the list of doctors
	 * 
	 * @return
	 */
	public List<Patient> getPatients() {
		List<Patient> patientList = new ArrayList<>();
		try {
			patientList = patientDao.findAllPatient();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return patientList;
	}

	public boolean addPatient(Patient patient) throws ClassNotFoundException {
		boolean isAdded = false;
		if (PatientValidation.isValidPatient(patient)) {
			try {
				patientDao.save(patient);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			isAdded = true;
		}
		return isAdded;
	}

	public boolean deletePatient(String patientName) throws ClassNotFoundException {
		boolean isDeleted = false;
		if (StringValidation.isValidString(patientName, "Invalid Patient Name")) {
			patientDao.delete(patientName);
		}
		return isDeleted;
	}

}
