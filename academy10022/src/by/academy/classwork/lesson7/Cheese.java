package by.academy.classwork.lesson7;

public class Cheese extends Product {

	protected String grade;

	public Cheese() {
		super();
	}

	public Cheese(double price, int quantity, String name, String grade) {
		super(price, quantity, name);
		this.grade = grade;
	}
	
	@Override
	public double getDiscount() {
		return 1;
	}

	public String getColor() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
