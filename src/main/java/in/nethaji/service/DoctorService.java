package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.validation.DoctorValidation;
import in.nethaji.exception.ServiceException;
import in.nethaji.model.Doctor;

public class DoctorService {

	private DoctorService() {
		// Default Constructor
	}

	private static final List<Doctor> doctorList = new ArrayList<>();

	/**
	 * This method is used to get the list of doctors
	 * 
	 * @return
	 */
	public static List<Doctor> getDoctors() {
		return doctorList;
	}

	/**
	 * This method is used to add Doctor details
	 * 
	 * @param obj
	 */

	public static boolean addDoctor(Doctor doctor) {
		boolean isAdded = false;
		if (DoctorValidation.isValidDoctor(doctor)) {
			doctorList.add(doctor);
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

	public static boolean deleteDoctor(String doctorName) {

		boolean isDeleted = false;
		Doctor searchDoctor = null;
		for (Doctor doctor : doctorList) {
			if (doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
				searchDoctor = doctor;
				break;
			}
		}
		if (searchDoctor != null) {
			doctorList.remove(searchDoctor);
			isDeleted = true;
		} else {
			throw new ServiceException("Invalid Doctor Name");
		}
		return isDeleted;
	}

}
