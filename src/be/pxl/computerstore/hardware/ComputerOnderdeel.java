package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerOnderdeel {

	private String vendor;
	private String name;
	private double price;
	private String articleNumber;
	private Random rand = new Random();
	private static int counter = 0;

	{
		counter++;
	}

	public ComputerOnderdeel(String vendor, String name, double price) {
		setVendor(vendor);
		setName(name);
		setPrice(price);
		setArticleNumber();
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

	public void setArticleNumber() {
		StringBuilder articleNumber = new StringBuilder();
		StringBuilder middleNumber = new StringBuilder();
		String lastNumber = String.format("%d", rand.nextInt(999));
		int vendorLength = vendor.length();
		middleNumber.append(counter);
		articleNumber.append(middleNumber.toString());
		while (middleNumber.length() < 5) {
				middleNumber.insert(0, "0");
		}
		if (vendor.length() < 3) {
			articleNumber.append(vendor.toUpperCase());
			while (vendorLength < 3) {
				articleNumber.append('X');
				vendorLength++;
			}

		} else {
			articleNumber.append(getVendor().substring(0, 3).toUpperCase());
		}

		if (lastNumber.length() == 2) {
			lastNumber = lastNumber + "9";
		}
		if (lastNumber.length() == 1) {
			lastNumber = lastNumber + "99";
		}

		lastNumber.replace('0', '9');

		articleNumber.append('-');
		articleNumber.append(middleNumber);
		articleNumber.append('-');
		articleNumber.append(lastNumber);

		this.articleNumber = articleNumber.toString();
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	@Override
	public String toString() {
		String gegevens = String.format("ArticleNumber = %s\nVendor = %s\nName = %s\nPrice = %.2f\n",
				getArticleNumber(), getVendor(), getName(), getPrice());
		return gegevens;
	}

}
