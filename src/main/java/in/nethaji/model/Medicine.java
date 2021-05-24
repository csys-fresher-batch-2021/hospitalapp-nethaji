package in.nethaji.model;

public class Medicine {

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + "]";
	}
	
	private int medicineId;
	private String medicineName;
	private double price;
	private String expiryDate;
	private int quantity;
	
	public Medicine(String medicineName, double price, String expiryDate, int quantity) {
		super();
		this.medicineName = medicineName;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
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
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
