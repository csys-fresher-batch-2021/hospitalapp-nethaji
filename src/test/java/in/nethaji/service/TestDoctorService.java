package in.nethaji.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestDoctorService {
	
	@Before
	public void setUp() throws Exception {
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
	public void testGetDoctors() {
		List<Doctor> doctorList = DoctorService.getDoctors();
		assertEquals(4, doctorList.size() );
	}

}
