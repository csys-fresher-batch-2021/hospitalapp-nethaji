package in.nethaji.util;

public class StringValidation {

	private StringValidation() {
		//Default Constructor
	}
	
	public static boolean isValidString(String value) {
		boolean valid = false;
		if (value != null && !value.trim().equals("")) {
			valid = true;
		}
		return valid;
	}

}
