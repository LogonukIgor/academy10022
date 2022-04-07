package by.academy.classwork.lesson7;

public class Shop {

	public static void main(String[] args) {

		User buyer = new User(20, "Alex", 65);
		User seller = new User(21, "Igor", 20);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "A", "1");
		Product bread = new Bread(2, 1, "B", "1");
		Product cheese = new Cheese(5, 2, "C", "1");
		Product butter = new Butter(3, 1, "D", "1");

		Deal deal = new Deal("12:16 Mn", "Minsk", buyer, seller,products);
		System.out.println(deal);

		deal.addProduct(milk);
		deal.addProduct(bread);
		deal.addProduct(cheese);
		deal.addProduct(butter);
		System.out.println(deal);
		
		deal.removeProduct(1);
		System.out.println(deal);
	}
}
