package in.nethaji.model;

public class Doctor {
	
	private String doctorName;
	
	private String specialist;
	
	public String getDoctorName() {
		return this.doctorName;
	}
	
	public String getSpecialist() {
		return this.specialist;
	}

	//Constructor
	public  Doctor (String doctorName, String specialist) {
		super();
		this.doctorName =doctorName;
		this.specialist = specialist;
	}

}
