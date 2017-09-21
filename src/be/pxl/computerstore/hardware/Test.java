package be.pxl.computerstore.hardware;

import static org.junit.Assert.assertTrue;

import be.pxl.computerstore.hardware.builder.ComputerCaseBuilder;
import be.pxl.computerstore.hardware.builder.ProcessorBuilder;

public class Test {

	public static void main(String[] args) {
		final String VENDOR = "Intel";
		final String NAME = "i6";
		final double PRICE = 102.50;
		double CLOCKSPEED = 1.7;
		
		Processor processor = new Processor(VENDOR, NAME, PRICE, CLOCKSPEED);
		ComputerCase computerCase = new ComputerCaseBuilder().vendor("Il").build();
		System.out.println(computerCase.getArticleNumber());
		
		System.out.println(computerCase.toString());
		System.out.println();
		System.out.println(processor.toString());
		
		System.out.println(computerCase.getArticleNumber());
		System.out.println(ProcessorBuilder.PRICE);
		System.out.println(ProcessorBuilder.CLOCK_SPEED);
		System.out.println(ComputerCaseBuilder.WEIGHT);
	}
}
