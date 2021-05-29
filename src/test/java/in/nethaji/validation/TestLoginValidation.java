package in.nethaji.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLoginValidation {

	@Test
	public void testLoginValidation1() {
		try {
			boolean isValid = LoginValidation.isLoginValidation("admin", "Admin@123");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test false test case.Here the user value is null.
	 */
	
	@Test
	public void testLoginValidation2() {
		try {
			LoginValidation.isLoginValidation(null, "admin@123");
		} catch (Exception e) {
			assertEquals("Invalid User Name",e.getMessage());
		}
	}

}
