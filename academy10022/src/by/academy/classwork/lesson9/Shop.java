package by.academy.classwork.lesson9;

public class Shop {

	public static void main(String[] args) {

		User buyer = new User(20, "Alex", 65);
		User seller = new User(21, "Igor", 20);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "Brest-litovsk", 0,"white");
		Product bread = new Bread(2, 1, "Vodar", 0,"brown");
		Product cheese = new Cheese(5, 2, "Brest-litovsk", 20,"yellow");
		Product butter = new Butter(3, 1, "Brest-litovsk", 0,"yellow");

		products[0] = milk;
		products[1] = bread;
		products[2] = cheese;
		products[3] = butter;

		Deal deal = new Deal("12:16 Mondey", "Minsk", buyer, seller, products);
		deal.deal();
	}
}
