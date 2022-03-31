package by.academy.classwork.lesson7;

public class Shop {

	public static void main(String[] args) {

		User buyer = new User(20, "Alex", 65);
		User seller = new User(21, "Igor", 20);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "Brest-litovsk", "white");
		Product bread = new Bread(2, 1, "Vodar", "brown");
		Product cheese = new Cheese(5, 2, "Brest-litovsk", "yellow");
		Product butter = new Butter(3, 1, "Brest-litovsk", "yellow");

//		products[0] = milk;
//		products[1] = bread;
//		products[2] = cheese;
//		products[3] = butter;

		Deal deal = new Deal("12:16 Mondey", "Minsk", buyer, seller);
//		deal.deal();
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
