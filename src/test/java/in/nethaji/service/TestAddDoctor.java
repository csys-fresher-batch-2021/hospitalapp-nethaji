package in.nethaji.service;

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

		Doctor doctor = new Doctor ("Nethaji" , "Cardiology");
		DoctorService.addDoctor(doctor);
	}

	@Test
	public void TestAddDoctor3() {
		
		Doctor doctor = new Doctor ("", "General");
		DoctorService.addDoctor(doctor);
	}
	
}
