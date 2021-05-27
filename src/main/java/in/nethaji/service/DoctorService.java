package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.DoctorValidation;
import in.nethaji.dao.DoctorDao;
import in.nethaji.model.Doctor;
import in.nethaji.util.StringValidation;

public class DoctorService {

	DoctorDao doctorDao = new DoctorDao();

	/**
	 * This method is used to get the list of doctors
	 * 
	 * @return
	 */
	public List<Doctor> getDoctors() {
		List<Doctor> doctorList = new ArrayList<>();
		doctorList = doctorDao.findAllDoctor();
		return doctorList;
	}

	/**
	 * This method is used to add Doctor details
	 * 
	 * @param obj
	 */

	public boolean addDoctor(Doctor doctor) {
		boolean isAdded = false;
		if (DoctorValidation.isValidDoctor(doctor)) {
			doctorDao.save(doctor);
			isAdded = true;
		}
		return isAdded;
	}

	/**
	 * This method is used to delete doctor name
	 * 
	 * @param doctorName
	 * @return
	 */

	public boolean deleteDoctor(String doctorName) {

		boolean isDeleted = false;
		if (StringValidation.isValidString(doctorName, "Invalid Doctor Name")) {
			doctorDao.delete(doctorName);
			isDeleted = true;
		}

		return isDeleted;
	}

}
