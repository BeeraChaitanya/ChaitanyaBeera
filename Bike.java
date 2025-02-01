package projecttt;
public class Bike {
	String brand;
	String model;
	int price;
	int mailage;
	public Bike(String brand, String model, int price, int mailage) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mailage = mailage;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", model=" + model + ", price=" + price + ", mailage=" + mailage + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMailage() {
		return mailage;
	}
	public void setMailage(int mailage) {
		this.mailage = mailage;
	}
	
}