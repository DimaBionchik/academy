package by.academy.lesson.homeWork3.dealApp;

import java.util.Arrays;
import java.util.Objects;

public class Deal1 {
	String adress;
	User buer;
	User seller;
	Product[] products;
	int currentIndex = 0;

	public Deal1() {
		super();
		products = new Product[10];
	}

	public Deal1(String adress, User buer, User seller, Product[] product) {
		super();
		this.adress = adress;
		this.buer = buer;
		this.seller = seller;
		this.products = product;

	}

	public double calcPrice() {
		double price = 0;
		for (Product p : products) {
			if (p == null) {
				continue;
			}
			price += p.calcFullPrice();

		}

		return price;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public User getBuer() {
		return buer;
	}

	public void setBuer(User buer) {
		this.buer = buer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProduct() {
		return products;
	}

	public void setProduct(Product[] product) {
		this.products = product;
	}

	@Override
	public String toString() {
		return "Deal1 [adress=" + adress + ", buer=" + buer + ", seller=" + seller + ", product="
				+ Arrays.toString(products) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(adress, buer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal1 other = (Deal1) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(buer, other.buer)
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	private void grows() {
		Product[] temp = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, temp, 0, products.length);
		products = temp;

	}

	public void addProduct(Product p) {

		if (currentIndex >= products.length) {
			grows();
		}
		products[currentIndex++] = p;

	}

	public void remove() {
		if (currentIndex == 0) {
			return;

		}
		products[--currentIndex] = null;
	}

	public boolean removeProduct(String productToRemove) {
		for (int i = 0; i < products.length; i++) {
			Product product = products[i];
			if (product.getName().equalsIgnoreCase(productToRemove)) {

				for (int j = i; j < products.length - 1; j++) {
					products[j] = products[j + 1];
				}
				products[products.length - 1] = null;
				return true;
			}
		}
		return false;
	}

}
