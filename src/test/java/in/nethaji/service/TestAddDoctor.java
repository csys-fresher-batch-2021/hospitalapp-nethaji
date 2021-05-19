package in.nethaji.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestAddDoctor {

	@Test
	public void TestAddDoctor1() {
		
		String doctorName = "Radha Krishnan";
		String specialist = "ENT";
		Doctor doctor = new Doctor(doctorName, specialist);
	    DoctorService.addDoctor(doctor);
		
	}
	
	@Test
	public void TestAddDoctor2() {

		try {
			Doctor doctor = new Doctor ("Nethaji" , "Cardiology");
			DoctorService.addDoctor(doctor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestAddDoctor3() {
		
		try {
			Doctor doctor = new Doctor ("", "General");
			DoctorService.addDoctor(doctor);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
			e.printStackTrace();
		}
	}
	
}
