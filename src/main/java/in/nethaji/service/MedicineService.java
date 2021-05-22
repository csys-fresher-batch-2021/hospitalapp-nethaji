package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.model.Medicine;

public class MedicineService {

	private MedicineService() {
		// Default Constructor
	}

	private static final List<Medicine> medicineList = new ArrayList<>();

	/**
	 * This method is used to get the list of doctors
	 * 
	 * @return
	 */
	public static List<Medicine> getMedicineList() {
		return medicineList;
	}
}
