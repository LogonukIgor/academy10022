package by.academy.classwork.lesson7;

public class Bread extends Product{
	
	private String grade;

	public Bread() {
		super();
	}
	
	public Bread(double price, int quantity, String name, String grade) {
		super(price,quantity,name);
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
		builder.append("Bread [price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
