package by.academy.classwork.lesson1;

public class Cat {
	private int age;
	private int money;
	private String nickname;
	private char initials;
	private boolean isHomeAnimal;

	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void sleep() {
		System.out.println("Кот " + nickname + " спит.");
	}

	public void eat() {
		System.out.println("Кот " + nickname + " ест.");
	}

	public void walk() {
		System.out.println("Кот " + nickname + " гуляет.");
	}

	public void grow(int addAge) {
		this.age = age + addAge;
		System.out.println("Кот" + nickname + " вырос на " + addAge + " лет(год)." + "Ему сейчас " + age + " лет(года).");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
}
