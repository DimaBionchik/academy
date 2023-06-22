package by.academy.lesson.homeWork3.dealApp;

public class Banan extends Product {
	protected int vetv;

	public Banan(double price, int quantity, String name, int vetv) {
		super(price, quantity, name);
		this.vetv = vetv;

	}

	@Override
	public double discount() {

		if (quantity > 5) {
			return 0.7;

		}

		return 1;
	}

}
