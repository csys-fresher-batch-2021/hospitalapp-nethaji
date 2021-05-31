package in.nethaji.model;

public class Doctor {
	
	private String doctorId;

	private String doctorName;

	private String specialist;


	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public Doctor(String doctorId, String doctorName, String specialist) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialist = specialist;
	}

}
