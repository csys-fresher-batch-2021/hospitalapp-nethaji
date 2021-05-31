package in.nethaji.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.nethaji.exception.DBException;
import in.nethaji.model.Doctor;
import in.nethaji.util.ConnectionUtil;

public class DoctorDao {

	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	List<Doctor> doctorList = new ArrayList<>();

	/**
	 * This method is used to get all the doctor from database
	 * 
	 * @return doctor ArrayList
	 * @throws ClassNotFoundException
	 */
	public List<Doctor> findAllDoctor() {
		try {
			// Step 1: Get the connection
			connection = ConnectionUtil.getConnection();
			// Step 2: Query
			String sql = "select * from doctor";
			pst = connection.prepareStatement(sql);
			// Step 3: execute query
			rs = pst.executeQuery();
			while (rs.next()) {
				String doctorId = rs.getString("doctorId");
				String doctorName = rs.getString("doctorName");
				String specialist = rs.getString("specialist");
				// Store the data in model
				Doctor doctor = new Doctor(doctorId,doctorName, specialist);
				// Store all doctor in list
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return doctorList;
	}

	/**
	 * This method is used to add doctor in array list
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public void save(Doctor doctor) {
		String sql = "insert into doctor(doctorId,doctorName,specialist) values ( ?,?,? )";
		try {
			connection = ConnectionUtil.getConnection();

			pst = connection.prepareStatement(sql);
			pst.setString(1, doctor.getDoctorId());
			pst.setString(2, doctor.getDoctorName());
			pst.setString(3, doctor.getSpecialist());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Doctor can't be added");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}

	/**
	 * This method is used to delete doctor in array list
	 * 
	 * @param product
	 * @throws ClassNotFoundException
	 */

	public void delete(String doctorId) {
		String sql = "DELETE FROM doctor where doctorId = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, doctorId);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Doctor can't be deleted");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}

	public void update(Doctor doctor) {
		String sql = "update doctor set doctorName = ?,specialist =? where doctorId = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, doctor.getDoctorName());
			pst.setString(2, doctor.getSpecialist());
			pst.setString(3, doctor.getDoctorId());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Doctor data can't be updated");
		} finally {
			ConnectionUtil.close(connection, pst,rs);
		}
	}

	public Doctor getRecordById(String doctorId) {
		Doctor doctor = null;
		String sql = "select * from doctor where doctorId = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, doctorId);
			rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString("doctorId");
				String doctorName = rs.getString("doctorName");
				String specialist = rs.getString("specialist");
				// Store the data in model
				doctor = new Doctor(id,doctorName, specialist);

			}
		} catch (SQLException e) {
			throw new DBException("Doctor data can't be find");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return doctor;
	}

}
