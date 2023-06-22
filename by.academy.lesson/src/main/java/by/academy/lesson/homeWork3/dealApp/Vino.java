package by.academy.lesson.homeWork3.dealApp;

public class Vino extends Product {
	protected String colorVine;

	public Vino(double price, int quantity, String name,String colorVine) {
		super(price, quantity, name);
		this.colorVine = colorVine;
		
	}

	@Override
	public double discount() {
		if(price > 50) {
			return 0.7;
		}
		
		return 1;
	}
	

}
