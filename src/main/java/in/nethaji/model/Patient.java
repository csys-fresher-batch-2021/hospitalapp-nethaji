package in.nethaji.model;

public class Patient {

	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private String reason;

	public Patient(String patientName, int patientAge, String patientGender, String reason) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.reason = reason;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
