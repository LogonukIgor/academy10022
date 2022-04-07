package by.academy.classwork.lesson7;

public class Butter extends Milk {
	
	protected String grade;

	public Butter() {
		super();
	}

	public Butter(double price, int quantity, String name, String grade) {
		super(price, quantity, name, grade);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Butter [price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
