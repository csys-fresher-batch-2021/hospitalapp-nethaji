package in.nethaji.model;

public class Medicine {

	private int medicineId;
	private String medicineName;
	private double medicinePrice;
	private String medicineExpiry;
	private int quantity;

	public String getMedicineName() {
		return medicineName;
	}

	public String getMedicineExpiry() {
		return medicineExpiry;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setMedicineExpiry(String string) {
		this.medicineExpiry = string;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

}
