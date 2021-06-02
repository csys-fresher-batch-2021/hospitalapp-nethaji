package in.nethaji.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

	public Appointment(String patientName, int age, Long phoneNumber, String gender, String doctorName,
			String specialist) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.doctorName = doctorName;
		this.specialist = specialist;
	}

	public Appointment(int appointmentId, String patientName, int age, Long phoneNumber, String gender,
			String doctorName, String specialist) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.doctorName = doctorName;
		this.specialist = specialist;
	}

	
	public Appointment(int appointmentId, String patientName, int age, Long phoneNumber, String gender,
			String doctorName, String specialist, LocalDate appointmentDate, LocalTime appointmentTime, int status) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.doctorName = doctorName;
		this.specialist = specialist;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ",patientName=" + patientName + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", doctorName=" + doctorName + ", specialist="
				+ specialist + "]";
	}

	public String getPatientName() {
		return patientName;
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

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	private int appointmentId;

	private String patientName;

	private int age;

	private Long phoneNumber;

	private String gender;

	private String doctorName;

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	private String specialist;

	private LocalDate appointmentDate;

	private LocalTime appointmentTime;

	private int status;

}
