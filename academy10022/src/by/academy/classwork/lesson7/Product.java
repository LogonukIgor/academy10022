package by.academy.classwork.lesson7;

public class Product {
	private double price;
	private int quantity;
	private String name;
	
	public Product() {
		System.out.println("Конструирование объекта Product");
		price = 9.49;
		quantity = 10;
		name = "Cheese";
	}
	
	public Product(double price, int quantity) {
		this();
	}
	
	public Product(double price, int quantity, String name) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void onShelf() {
		System.out.println("Тавар " + name + " выставлен на продажу.");
	}
	
	public void debited() {
		System.out.println("Тавар " + name + " списан.");
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getValue() {
		return quantity;
	}

	public void setMoney(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
