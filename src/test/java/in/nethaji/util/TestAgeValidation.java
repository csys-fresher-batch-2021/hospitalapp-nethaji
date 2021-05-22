package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAgeValidation {

	@Test
	public void testAge1() {
		try {
			boolean isValid = AgeValidation.isValidAge(18, "No exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to test invalid age
	 */

	@Test
	public void testAge2() {
		try {
			AgeValidation.isValidAge(120, "Invalid Age");
		} catch (Exception e) {
			assertEquals("Invalid Age", e.getMessage());
		}
	}

	/*
	 * This method is used to test the negative value to age.
	 */

	@Test
	public void testAge3() {
		try {
			AgeValidation.isValidAge(-12, "Invalid Age");
		} catch (Exception e) {
			assertEquals("Invalid Age", e.getMessage());
		}
	}

}
