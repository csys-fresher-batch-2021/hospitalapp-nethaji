package in.nethaji.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import in.nethaji.model.Doctor;

public class TestDoctorService {
	
	@Test
	public void testGetDotors() {
		List<Doctor> doctorList = DoctorService.getDoctors();
		assertEquals(4,doctorList.size());
	}


}
