package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDateValidation {

	@Test
	public void testDateValidation1() {
		try {
			boolean isValid = DateValidation.isDateValid("2022-10-03", "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDateValidation2() {
		try {
		    DateValidation.isDateValid("2020-10-03", "Invalid Expiry Date");
		} catch (Exception e) {
			assertEquals("Invalid Expiry Date", e.getMessage());
		}
	}
	
}
