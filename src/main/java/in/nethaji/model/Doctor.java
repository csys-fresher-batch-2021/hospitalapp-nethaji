package in.nethaji.model;

import java.time.LocalTime;

public class Doctor {

	private String doctorId;

	private String doctorName;

	private String specialist;

	private LocalTime opFrom;

	private LocalTime opTo;

	public LocalTime getOpFrom() {
		return opFrom;
	}

	public void setOpFrom(LocalTime opFrom) {
		this.opFrom = opFrom;
	}

	public LocalTime getOpTo() {
		return opTo;
	}

	public void setOpTo(LocalTime opTo) {
		this.opTo = opTo;
	}

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

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialist=" + specialist
				+ ", opFrom=" + opFrom + ", opTo=" + opTo + "]";
	}

	public Doctor(String doctorId, String doctorName, String specialist) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialist = specialist;
	}

	public Doctor(String doctorId, String doctorName, String specialist, LocalTime opFrom, LocalTime opTo) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialist = specialist;
		this.opFrom = opFrom;
		this.opTo = opTo;
	}

	

}
