package in.nethaji.model;

import java.time.LocalDate;

public class Medicine {

	private int medicineId;
	private String medicineName;
	private double price;
	private LocalDate expiryDate;
	private int quantity;
	

	public Medicine() {
		// Default Constructor 
		}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + "]";
	}

}
