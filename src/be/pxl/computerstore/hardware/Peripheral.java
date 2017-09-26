package be.pxl.computerstore.hardware;

public abstract class Peripheral {
	
	String vendor;
	String name;
	double price;
	
	public Peripheral(String vendor, String name, double price){
		setVendor(vendor);
		setName(name);
		setPrice(price);
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
