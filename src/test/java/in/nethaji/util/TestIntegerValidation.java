package in.nethaji.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIntegerValidation {

	@Test
	public void testIntegerValidation1() {
		try {
			boolean isValid = IntegerValidation.isIntValid(10, null);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIntegerValidation2() {
		try {
			boolean isValid = IntegerValidation.isIntValid(-10, null);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
