package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

public class DoctorSpecialist {

	public DoctorSpecialist() {
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

}
