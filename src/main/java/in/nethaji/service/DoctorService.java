package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.model.Doctor;
import in.nethaji.util.StringValidation;

public class DoctorService {

	private DoctorService() {
		// Default Constructor
	}

	private static final List<String> specialistList = new ArrayList<>();

	static {
		specialistList.add("ENT");
		specialistList.add("General");
		specialistList.add("Cardiology");
		specialistList.add("ophthalmologist");
	}

	public static List<String> getSpecialistList() {
		return specialistList;
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

}
