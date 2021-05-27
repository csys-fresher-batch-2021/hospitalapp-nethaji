package in.nethaji.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.nethaji.exception.DBException;
import in.nethaji.model.Medicine;
import in.nethaji.util.ConnectionUtil;

public class MedicineDao {

	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	/**
	 * This method is used to get all the medicine details from the database
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public List<Medicine> findAllMedicine() throws ClassNotFoundException, SQLException {
		List<Medicine> medicineList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();

			String sql = "select * from medicine";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String medicineName = rs.getString("medicineName");
				double price = rs.getDouble("price");
				LocalDate expiryDate = (rs.getDate("expiryDate")).toLocalDate();
				int quantity = rs.getInt("quantity");
				Medicine medicine = new Medicine();
				medicine.setMedicineName(medicineName);
				medicine.setPrice(price);
				medicine.setExpiryDate(expiryDate);
				medicine.setQuantity(quantity);
				medicineList.add(medicine);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return medicineList;
	}

	/**
	 * This method is used to add medicine in array list
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public void save(Medicine medicine) throws SQLException, ClassNotFoundException {
		String sql = "insert into medicine(medicineName,price,expiryDate,quantity) values ( ?,?,?,? )";
		try {
			connection = ConnectionUtil.getConnection();

			pst = connection.prepareStatement(sql);
			pst.setString(1, medicine.getMedicineName());
			pst.setDouble(2, medicine.getPrice());
			pst.setDate(3, Date.valueOf(medicine.getExpiryDate()));
			pst.setInt(4, medicine.getQuantity());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Medicine can't be added");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	
	/**
	 * This method is used to delete patient in array list
	 * @param product
	 * @throws ClassNotFoundException 
	 */
	
	public void delete(String medicineName) throws ClassNotFoundException {
		String sql = "DELETE FROM medicine where medicineName = ?;";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, medicineName);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Medicine can't be deleted");
		} finally {
			ConnectionUtil.close(connection,pst, rs);
		}
	}

}
