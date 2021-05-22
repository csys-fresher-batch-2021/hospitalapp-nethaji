package in.nethaji.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStringValidation {

	@Test
	public void TestStringValidation1() {
		try {
			boolean isValid = StringValidation.isValidString("Nethaji", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to check false string value
	 */

	@Test
	public void TestStringValidation2() {
		try {
			StringValidation.isValidString(null, "Test case for input is null");
		} catch (Exception e) {
			assertEquals("Test case for input is null", e.getMessage());
		}
	}

	/**
	 * This method is used to test wrong string value
	 */
	@Test
	public void TestStringValidation3() {
		try {
			StringValidation.isValidString("    ", "Wrong Value");
		} catch (Exception e) {
			assertEquals("Wrong Value", e.getMessage());
		}
	}

	@Test
	public void TestStringValidation4() {
		try {
			boolean isValid = StringValidation.isValidString("Gopala Krishnan", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestStringValidation5() {
		try {
			boolean isValid = StringValidation.isValidString("a", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestStringValidation6() {
		try {
			boolean isValid = StringValidation.isValidString("Sachin Ramesh Tendulkar", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
