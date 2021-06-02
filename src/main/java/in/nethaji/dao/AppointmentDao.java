package in.nethaji.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import in.nethaji.exception.DBException;
import in.nethaji.model.Appointment;
import in.nethaji.util.ConnectionUtil;

public class AppointmentDao {

	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	/**
	 * This method is used to get appointment
	 * 
	 * @return
	 */

	public List<Appointment> getAppointmentList() {
		List<Appointment> appointmentList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();

			String sql = "select * from appointmentbooking where status = 0";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("appointment_id");
				String patientName = rs.getString("patientName");
				int age = rs.getInt("age");
				Long phoneNumber = rs.getLong("phoneNumber");
				String gender = rs.getString("gender");
				String doctorName = rs.getString("doctorName");
				String specialist = rs.getString("specialist");
				Appointment appointment = new Appointment(id, patientName, age, phoneNumber, gender, doctorName,
						specialist);
				appointmentList.add(appointment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return appointmentList;
	}

	/**
	 * This method is used to save appointment
	 * 
	 * @param appointment
	 */

	public void save(Appointment appointment) {
		String sql = "insert into appointmentbooking(patientName,age,phoneNumber,gender,doctorName,specialist) values ( ?,?,?,?,?,? )";
		try {
			connection = ConnectionUtil.getConnection();

			pst = connection.prepareStatement(sql);
			pst.setString(1, appointment.getPatientName());
			pst.setInt(2, appointment.getAge());
			pst.setLong(3, appointment.getPhoneNumber());
			pst.setString(4, appointment.getGender());
			pst.setString(5, appointment.getDoctorName());
			pst.setString(6, appointment.getSpecialist());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Appointment can't be Fixed");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}

	/**
	 * 
	 */
	public Appointment getRecordByAppointment(int appointmentId) {
		Appointment appointment = null;
		try {
			String sql = "select * from appointmentbooking where appointmentId = ?";
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setInt(1, appointmentId);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("appointmentId");
				String patientName = rs.getString("patientName");
				int age = rs.getInt("age");
				Long phoneNumber = rs.getLong("phoneNumber");
				String gender = rs.getString("gender");
				String doctorName = rs.getString("doctorName");
				String specialist = rs.getString("specialist");
				LocalDate appointmentDate = rs.getDate("appointmentDate").toLocalDate();
				LocalTime appointmentTime = rs.getTime("appointmentTime").toLocalTime();
				int status = rs.getInt("status");
				// Store the data in model
				appointment = new Appointment(id, patientName, age, phoneNumber, gender, doctorName,
						specialist, appointmentDate, appointmentTime, status);

			}
		} catch (SQLException e) {
			throw new DBException("Appointment list data can't be find");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return appointment;
	}

}
