package in.nethaji.service;

import java.util.ArrayList;
import java.util.List;

import in.nethaji.exception.ServiceException;
import in.nethaji.model.Medicine;
import in.nethaji.validation.MedicineValidation;

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
	
	public static boolean deleteMedicine(String medicineName) {
		boolean isDeleted = false;
		Medicine searchMedicine = null;
		for (Medicine medicine : medicineList) {
			if (medicine.getMedicineName().equalsIgnoreCase(medicineName)) {
				searchMedicine = medicine;
				break;
			}
		}
		if (searchMedicine != null) {
			medicineList.remove(searchMedicine);
			isDeleted = true;
		} else {
			throw new ServiceException("Invalid Medicine Name");
		}

		return isDeleted;
	}
}
