package in.nethaji.service;

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
		return doctorDao.findAllDoctor();
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

	public boolean deleteDoctor(String doctorId) {

		boolean isDeleted = false;
		if (StringValidation.isValidString(doctorId, "Invalid Doctor Id")) {
			doctorDao.delete(doctorId);
			isDeleted = true;
		}

		return isDeleted;
	}

	public boolean updateDoctor(Doctor doctor) {
		boolean isUpdated = false;
		if (DoctorValidation.isValidDoctor(doctor)) {
			doctorDao.update(doctor);
		}
		return isUpdated;
	}

}
