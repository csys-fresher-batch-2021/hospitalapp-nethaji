package in.nethaji.model;

public class Doctor {

	private String doctorName;

	private String specialist;

	// Constructor
	public Doctor(String doctorName, String specialist) {
		this.doctorName = doctorName;
		this.specialist = specialist;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public String getSpecialist() {
		return specialist;
	}

}
