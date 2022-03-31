package by.academy.classwork.fruits9;

public class FruitTest {

	public static void main(String[] args) {

		Fruit apple = new Apple(2, 4);
		apple.printManufactoryInfo();
		System.out.println(apple.fruitPrice());
	}
}
