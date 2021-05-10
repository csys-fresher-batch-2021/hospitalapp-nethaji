package in.nethaji.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import in.nethaji.service.DoctorService;

public class TestDoctorService {
	
	@Test
	public void testGetDotors() {
		List<String> doctorList = DoctorService.getDoctors();
		assertEquals(2,doctorList.size());
	}


}
