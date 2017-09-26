package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

	public static final int MAX_PERIPHERAL = 3;
	private Processor processor;
	private ComputerCase computerCase;
	private Peripheral[] peripherals = new Peripheral[MAX_PERIPHERAL];
	private int counter = 0;

	public Peripheral[] getPeripherals() {

		return peripherals;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
		for (int i = 0; i < peripherals.length; i++) {
			if (peripherals[i] == null) {
				peripherals[i] = peripheral;
			} else if (i >= peripherals.length) {
				throw new TooManyPeripheralsException();
			}
		}
		counter++;
	}

	public void removePeripheral(String articleNumber) {
		for (int i = 0; i < peripherals.length; i++) {
			if (peripherals[i] != null) {
				if (peripherals[i].getArticleNumber().equals(articleNumber)) {
					peripherals[i] = null;
					counter--;
				}
			}
		}
	}

	public int getNumberOfPeripherals() {
		return counter;
	}

	@Override
	public double totalPriceExcl() {
		return 0;
	}
}
