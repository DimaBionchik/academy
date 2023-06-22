package by.academy.lesson.homeWork3.dealApp;

public class Apelsin extends Product {
	protected String sort;

	public Apelsin(double price, int quantity, String name, String sort) {
		super(price, quantity, name);
		this.sort = sort;

	}

	@Override
	public double discount() {

		return 0.9;
	}

}
