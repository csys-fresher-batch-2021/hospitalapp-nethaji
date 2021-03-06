package in.nethaji.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestDisplayDoctor {

	@BeforeClass
	public static void setUp() throws Exception {
		DoctorService doctorService = new DoctorService();
		List<Doctor> doctorList = doctorService.getDoctors();
		Doctor doctor1 = new Doctor("Gopala Krishnan", "ENT");
		Doctor doctor2 = new Doctor("Venkataraman", "General");
		Doctor doctor3 = new Doctor("Rajaraghupathy", "Cardiology");
		Doctor doctor4 = new Doctor("Gopalachari", "opthalmologist");

		doctorList.add(doctor1);
		doctorList.add(doctor2);
		doctorList.add(doctor3);
		doctorList.add(doctor4);
	}

	/**
	 * This method is used to test display doctors
	 */

	@Test
	public void testGetDoctors() {
		DoctorService doctorService = new DoctorService();
		List<Doctor> doctorList = doctorService.getDoctors();
		assertEquals(5, doctorList.size());
	}

}
