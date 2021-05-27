package in.nethaji.service;

import java.sql.SQLException;
import java.util.ArrayList;
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
		List<Medicine> medicineList = new ArrayList<>();
		try {
			medicineList = medicineDao.findAllMedicine();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return medicineList;
	}
	
	/**
	 * This method is used to add medicine
	 * @param medicine
	 * @return
	 * @throws ClassNotFoundException 
	 */

	public boolean addMedicine(Medicine medicine) throws ClassNotFoundException {
		boolean isAdded = false;
		if (MedicineValidation.isValidMedicine(medicine)) {
			try {
				medicineDao.save(medicine);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			isAdded = true;
		}
		return isAdded;
	}
	
	public boolean deleteMedicine(String medicineName) throws ClassNotFoundException {
		boolean isDeleted = false;
		
			if (StringValidation.isValidString(medicineName,"Invalid Medicine Name")) {
				medicineDao.delete(medicineName);
				isDeleted = true;
			}
		
		return isDeleted;
	}
}
