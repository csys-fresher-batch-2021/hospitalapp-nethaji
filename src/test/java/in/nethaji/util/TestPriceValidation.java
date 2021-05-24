package in.nethaji.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPriceValidation {

	@Test
	public void TestPriceValidation1() {
		try {
			boolean isValid = PriceValidation.isValidPrice(12.00, "No Exception");
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestPriceValidation2() {
		try {
			PriceValidation.isValidPrice(0, "Invalid Price");
		} catch (Exception e) {
			assertEquals("Invalid Price", e.getMessage());
		}
	}

	@Test
	public void TestPriceValidation3() {
		try {
			PriceValidation.isValidPrice(-10.00, "Invalid Price");
		} catch (Exception e) {
			assertEquals("Invalid Price", e.getMessage());
		}
	}

}
