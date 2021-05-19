package in.nethaji.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nethaji.util.StringValidation;

public class TestStringValidation {
	
	@Test
	public void TestStringValidation1() {
		boolean isValid = StringValidation.isValidString("Nethaji");
		assertTrue(isValid);
	}
	
	/**
	 * This method is used to check false string value
	 */
	
	@Test
	public void TestStringValidation2() {
		boolean isValid = StringValidation.isValidString(null);
		assertFalse(isValid);
	}

	/**
	 * This method is used to test wrong string value
	 */
	@Test
	public void TestStringValidation3() {
		boolean isValid = StringValidation.isValidString("    ");
		assertFalse(isValid);
	}
	
	@Test
	public void TestStringValidation4() {
		boolean isValid = StringValidation.isValidString("Gopala Krishnan");
		assertTrue(isValid);
	}
	
	@Test
	public void TestStringValidation5() {
		boolean isValid = StringValidation.isValidString("a");
		assertTrue(isValid);
	}
	
	@Test
	public void TestStringValidation6() {
		boolean isValid = StringValidation.isValidString("Sachin Ramesh Tendulkar");
		assertTrue(isValid);
	}
	
}
