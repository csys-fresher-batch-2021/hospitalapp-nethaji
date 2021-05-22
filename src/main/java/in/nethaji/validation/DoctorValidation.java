package in.nethaji.validation;

import in.nethaji.model.Doctor;
import in.nethaji.util.StringValidation;

public class DoctorValidation {

	private DoctorValidation() {
		// Default Constructor
	}

	public static boolean isValidDoctor(Doctor doctor) {
		boolean isValid = false;
		boolean doctorName = StringValidation.isValidString(doctor.getDoctorName(), "Invalid Doctor Name");
		boolean specialist = StringValidation.isValidString(doctor.getSpecialist(), "Invalid specialist");

		if (doctorName && specialist) {
			isValid = true;
		}
		return isValid;

	}

}
