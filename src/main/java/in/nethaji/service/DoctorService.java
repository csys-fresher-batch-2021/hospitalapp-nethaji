package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {
	

	private static List<String> doctorList = new ArrayList<String>();
	
	static {
		doctorList.add("Rahul");
		doctorList.add("Ramakrishanan");
	}
	/**
	 *  This method is used to get the list of doctors
	 * @return
	 */
	public static List<String> getDoctors() {
		return doctorList;
	}
	

}
