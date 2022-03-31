package by.academy.classwork.lesson9;

public class Cheese extends Product {

	protected String color;

	public Cheese() {
		super();
	}

	public Cheese(double price, int quantity, String name, String color) {
		super(price, quantity, name);
		this.color = color;
	}

	@Override
	public double getDiscount() {
		return 1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese  ");
		builder.append(name);
		builder.append(" ");
		builder.append(" " + quantity);
		builder.append(" шт.");
		return builder.toString();
	}

}
