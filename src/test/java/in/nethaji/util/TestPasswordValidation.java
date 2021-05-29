package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPasswordValidation {

	@Test
	public void testPasswordValidation1() {
		try {
			boolean isValid = PasswordValidation.isPasswordValid("Admin@123", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPasswordValidation2() {
		try {
			boolean isValid = PasswordValidation.isPasswordValid("Nethaji@123", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test false password. Here the password is null
	 */
	
	@Test
	public void testPasswordValidation3() {
		try {
			PasswordValidation.isPasswordValid(null, "Invalid Password");
		} catch (Exception e) {
			assertEquals("Invalid Password",e.getMessage());
		}
	}

}
