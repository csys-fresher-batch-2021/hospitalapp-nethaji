package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

public class PatientReason {

	public PatientReason() {
		// TODO Auto-generated constructor stub
	}

	private static final List<String> reasonList = new ArrayList<>();

	static {
		reasonList.add("Fever");
		reasonList.add("Cold");
		reasonList.add("Cardiology");
		reasonList.add("Ear,Nose,Throat Infections");
		reasonList.add("Heart Problems");
		reasonList.add("Eye problems");
	}

	/**
	 * This method is used to display specialist drop down in addPatient.jsp
	 * 
	 * @return
	 */

	public static List<String> getSpecialistList() {
		return reasonList;
	}

}
