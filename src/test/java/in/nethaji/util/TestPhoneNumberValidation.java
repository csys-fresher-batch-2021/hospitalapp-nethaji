package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPhoneNumberValidation {

	@Test
	public void testPhoneNumberValidation1() {
		try {
			boolean isValid = PhoneNumberValidation.isValidMobileNumber("9751713840" ,"No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test false case .Here Phone number is wrong value
	 */
	
	@Test
	public void testPhoneNumberValidation2() {
		try {
			PhoneNumberValidation.isValidMobileNumber("9876", "Invalid Phone Number");
		} catch (Exception e) {
			assertEquals("Invalid Phone Number",e.getMessage());
		}
	}

}
