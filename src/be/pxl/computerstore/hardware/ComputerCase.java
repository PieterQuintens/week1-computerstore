package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerOnderdeel {

	private Dimension dimension;
	private double weight;

	public ComputerCase(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		String gegevens = String.format("%sWidth = %smm\nHeight = %smm\nDepth = %smm\nWeight = %.1fkg", super.toString(),
				getDimension().getWidth(), getDimension().getHeight(), getDimension().getDepth(), getWeight());
		return gegevens;
	}
}
