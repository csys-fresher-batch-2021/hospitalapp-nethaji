package in.nethaji.validation;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import in.nethaji.model.User;

public class TestUserValidation {

	@Test
	public void testUserValidation1() {
		try {
			User user = new User("nethaji", LocalDate.parse("1999-10-10"), 21, Long.parseLong("9751713840"),"pass1234"  , "nethaji@gmail.com" , "male");
			boolean isValid = UserValidation.isValidUser(user);
			assertTrue(isValid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to test false test case. Here the user name is null.
	 */
	
	@Test
	public void testUserValidation2() {
		try {
			User user = new User(null, LocalDate.parse("1999-10-10"), 21, Long.parseLong("9751713840"),"pass1234"  , "nethaji@gmail.com" , "male");
			UserValidation.isValidUser(user);
		} catch (Exception e) {
			assertEquals("Invalid User Name", e.getMessage());
		}	
	}

}
