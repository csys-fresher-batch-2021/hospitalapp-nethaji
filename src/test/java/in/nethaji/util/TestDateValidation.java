package in.nethaji.util;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestDateValidation {

	@Test
	public void testDateValidation1() {
		try {
			boolean isValid = DateValidation.isDateValid(LocalDate.parse("2022-10-03"), "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDateValidation2() {
		try {
		    DateValidation.isDateValid(LocalDate.parse("2020-10-03"), "Invalid Expiry Date");
		} catch (Exception e) {
			assertEquals("Invalid Expiry Date", e.getMessage());
		}
	}
	
	/**
	 * This method is used to test Birth date.
	 */
	
	@Test
	public void testDateValidation3() {
		try {
		    DateValidation.isBirthDateValid(LocalDate.parse("2025-10-03"), "Invalid Expiry Date");
		} catch (Exception e) {
			assertEquals("Invalid Expiry Date", e.getMessage());
		}
	}
	
	@Test
	public void testDateValidation4() {
		try {
			boolean isValid = DateValidation.isDateValid(LocalDate.parse("1999-10-03"), "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
