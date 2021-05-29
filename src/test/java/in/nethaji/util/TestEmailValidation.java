package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmailValidation {

	@Test
	public void testEmailValidation1() {
		try {
			boolean isValid = EmailValidation.isValidEmail("nethaji@gmail.com", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test false email validation. Here the input for email is null
	 */
	
	@Test
	public void testEmailValidation2() {
		try {
			EmailValidation.isValidEmail("nethaji", "Invalid email");
		} catch (Exception e) {
			assertEquals("Invalid email" , e.getMessage());
		}
	}

}
