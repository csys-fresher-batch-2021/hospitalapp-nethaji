package in.nethaji.validation;

import in.nethaji.model.Medicine;
import in.nethaji.util.*;

public class MedicineValidation {

	private MedicineValidation() {
		// Default Constructor
	}

	/**
	 * This method is used to check the input value is correct or not.
	 * 
	 * @param medicine
	 * @return
	 */

	public static boolean isValidMedicine(Medicine medicine) {
		boolean isValid = false;
		try {
			boolean medicineName = StringValidation.isValidString(medicine.getMedicineName(), "Invalid Medicine Name");
			boolean price = PriceValidation.isValidPrice(medicine.getPrice(), "Invalid Price");
			boolean expiryDate = DateValidation.isDateValid(medicine.getExpiryDate(), "Medicine is Expired");
			boolean quantity = IntegerValiadation.isIntValid(medicine.getQuantity(), "Invalid Quantity");
			if (medicineName && price && expiryDate && quantity) {
				isValid = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}

		return isValid;
	}

}
