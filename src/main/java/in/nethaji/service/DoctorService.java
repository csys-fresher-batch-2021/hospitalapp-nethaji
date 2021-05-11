package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.model.Doctor;

public class DoctorService {
	
	private DoctorService() {
		//Default Constructor
	}

	private static final List<Doctor> doctorList = new ArrayList<>();
	
	static {
		 Doctor doctor1 = new Doctor("Gopala Krishnan", "Cardiology");
		 Doctor doctor2 = new Doctor("Venkataraman", "General");
		 Doctor doctor3 = new Doctor("Rajaraghupathy", "ENT");
		 Doctor doctor4 = new Doctor("Gopalachari", "General");
		
		doctorList.add(doctor1);
		doctorList.add(doctor2);
		doctorList.add(doctor3);
		doctorList.add(doctor4);
	}
	/**
	 *  This method is used to get the list of doctors
	 * @return
	 */
	public static List<Doctor> getDoctors() {
		return doctorList;
	}
	
}
