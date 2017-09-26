package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral{
	
	String keyboardLayout;

	public Keyboard(String vendor, String name, double price, String keyboardLayout) {
		super(vendor, name, price);
		setKeyboardLayout(keyboardLayout);
	}
	
	public String getKeyboardLayout() {
		return keyboardLayout;
	}

	public void setKeyboardLayout(String keyboardLayout) {
		if(keyboardLayout.toUpperCase().equals("AZERTY")){
			this.keyboardLayout = keyboardLayout;
		} else {
			this.keyboardLayout = "QWERTY";
		}
	}

}
