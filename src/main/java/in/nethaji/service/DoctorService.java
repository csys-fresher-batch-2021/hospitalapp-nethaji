package in.nethaji.service;

import java.sql.SQLException;
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
	 * @throws ClassNotFoundException
	 */
	public List<Doctor> getDoctors() {
		List<Doctor> doctorList = new ArrayList<>();
		try {
			doctorList = doctorDao.findAllDoctor();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return doctorList;
	}

	/**
	 * This method is used to add Doctor details
	 * 
	 * @param obj
	 */

	public boolean addDoctor(Doctor doctor) throws ClassNotFoundException {
		boolean isAdded = false;
		if (DoctorValidation.isValidDoctor(doctor)) {
			try {
				doctorDao.save(doctor);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			isAdded = true;
		}
		return isAdded;
	}

	/**
	 * This method is used to delete doctor name
	 * 
	 * @param doctorName
	 * @return
	 * @throws ClassNotFoundException
	 */

	public boolean deleteDoctor(String doctorName) throws ClassNotFoundException {

		boolean isDeleted = false;
		if (StringValidation.isValidString(doctorName, "Invalid Doctor Name")) {
			doctorDao.delete(doctorName);
			isDeleted = true;
		}

		return isDeleted;
	}

}
