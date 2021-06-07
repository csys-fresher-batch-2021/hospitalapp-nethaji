package in.nethaji.model;

import java.time.LocalDate;

public class Appointment {

	private int appointmentId;

	private String patientName;

	private int age;

	private Long phoneNumber;

	private String gender;

	private String doctorId;

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Appointment(String patientName, int age, Long phoneNumber, String gender, String doctorId,
			LocalDate appointmentDate, String username) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.username = username;
	}


	public String getPatientName() {
		return patientName;
	}

	public Appointment(int appointmentId, String patientName, int age, Long phoneNumber, String gender, String doctorId,
			LocalDate appointmentDate, String username, int status) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.username = username;
		this.status = status;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	private LocalDate appointmentDate;

	private String username;

	private int status;

}
