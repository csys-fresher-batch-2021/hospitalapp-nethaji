package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.model.Medicine;
import in.nethaji.validation.MedicineValidation;
import in.nethaji.validation.PatientValidation;

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
	
	/**
	 * This method is used to add medicine
	 * @param medicine
	 * @return
	 */

	public static boolean addMedicine(Medicine medicine) {
		boolean isAdded = false;
		if (MedicineValidation.isValidMedicine(medicine)) {
			medicineList.add(medicine);
			isAdded = true;
		}
		return isAdded;
	}
}
