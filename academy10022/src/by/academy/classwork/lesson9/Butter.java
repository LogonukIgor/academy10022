package by.academy.classwork.lesson9;

public class Butter extends Milk {

	public Butter() {
		super();
	}

	public Butter(double price, int quantity, String name, String color) {
		super(price, quantity, name, color);
		this.color = color;
	}
	
	@Override
	public double getDiscount() {
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Butter  ");
		builder.append(name);
		builder.append(" ");
		builder.append(" "+quantity);
		builder.append(" шт.");
		return builder.toString();
	}

}
