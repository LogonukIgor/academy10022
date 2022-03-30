package by.academy.classwork.lesson7;

public class Milk extends Product {

	protected String color;

	public Milk() {
		super();
	}

	public Milk(double price, int quantity, String name, String color) {
		super(price, quantity, name);
		this.color = color;
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
		builder.append("Milk    ");
		builder.append(name);
		builder.append(" ");
		builder.append(" "+quantity);
		builder.append(" шт.");
		return builder.toString();
	}

}
