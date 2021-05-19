package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

import in.nethaji.model.Doctor;
import in.nethaji.util.StringValidation;

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

	public static void addDoctor(Doctor obj) {
		if (StringValidation.isValidString(obj.getDoctorName())) {
			doctorList.add(obj);
		} else {
			throw new RuntimeException("Invalid Doctor Name");
		}
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
		if (StringValidation.isValidString(doctorName)) {
			for (Doctor doctor : doctorList) {
				if (doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
					searchDoctor = doctor;
					break;
				}
			}
		}
		if (searchDoctor != null) {
			doctorList.remove(searchDoctor);
			isDeleted = true;
		} else {
			throw new RuntimeException("Invalid Doctor Name");
		}
		return isDeleted;
	}

}
