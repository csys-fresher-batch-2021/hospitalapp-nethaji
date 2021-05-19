package in.nethaji.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestDeleteDoctor {

	@BeforeClass
	public static void setUp() throws Exception {
		List<Doctor> doctorList = DoctorService.getDoctors();
		Doctor doctor1 = new Doctor("Gopala Krishnan", "ENT");
		Doctor doctor2 = new Doctor("Venkataraman", "General");
		Doctor doctor3 = new Doctor("Rajaraghupathy", "Cardiology");
		Doctor doctor4 = new Doctor("Gopalachari", "opthalmologist");

		doctorList.add(doctor1);
		doctorList.add(doctor2);
		doctorList.add(doctor3);
		doctorList.add(doctor4);
	}

	@Test
	public void testDeleteDoctor1() {

		try {
			boolean isDeleted = DoctorService.deleteDoctor("Gopalachari");
			assertTrue(isDeleted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDeleteDoctor2() {

		try {
			boolean isDeleted = DoctorService.deleteDoctor("venkataraman");
			assertTrue(isDeleted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDeleteDoctor3() {

		try {
			DoctorService.deleteDoctor(null);
		} catch (Exception e) {
			assertEquals("Invalid Doctor Name", e.getMessage());
			e.printStackTrace();
		}
	}

}