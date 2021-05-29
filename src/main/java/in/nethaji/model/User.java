package in.nethaji.model;

import java.time.LocalDate;

public class User {

	private String username;
	private LocalDate dob;
	private int age;
	private Long phoneNumber;
	private String email;
	private String password;
	private String gender;

	@Override
	public String toString() {
		return "User [username=" + username + ", dob=" + dob + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + ", gender=" + gender + "]";
	}

	public User(String username, LocalDate dob, int age, Long phoneNumber, String password,String email,
			String gender) {
		super();
		this.username = username;
		this.dob = dob;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
