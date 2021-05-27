package in.nethaji.service;

import java.util.List;

import in.nethaji.dao.MedicineDao;
import in.nethaji.model.Medicine;
import in.nethaji.util.StringValidation;
import in.nethaji.validation.MedicineValidation;

public class MedicineService {

	MedicineDao medicineDao = new MedicineDao();

	/**
	 * This method is used to get the list of medicine
	 * 
	 * @return
	 */
	public List<Medicine> getMedicineList() {
		return medicineDao.findAllMedicine();
	}

	/**
	 * This method is used to add medicine
	 * 
	 * @param medicine
	 * @return
	 */

	public boolean addMedicine(Medicine medicine) {
		boolean isAdded = false;
		if (MedicineValidation.isValidMedicine(medicine)) {
			medicineDao.save(medicine);
			isAdded = true;
		}
		return isAdded;
	}

	/**
	 * This method is used to delete medicine in arrayList
	 * 
	 * @param medicineName
	 * @return
	 */

	public boolean deleteMedicine(String medicineName) {
		boolean isDeleted = false;

		if (StringValidation.isValidString(medicineName, "Invalid Medicine Name")) {
			medicineDao.delete(medicineName);
			isDeleted = true;
		}

		return isDeleted;
	}
}
