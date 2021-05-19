package in.nethaji.util;

public class StringValidation {

	private StringValidation() {
		// Default Constructor
	}
	
	/**
	 * This method is used to validate String
	 * 
	 * @param value
	 * @return
	 */

	public static boolean isValidString(String value) {
		boolean valid = false;
		if (value != null && !value.trim().equals("")) {
			valid = true;
		}
		return valid;
	}

}
