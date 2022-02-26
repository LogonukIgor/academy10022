package by.academy.lesson1;

public class Main {
    public static void main(String[] args) {
    	Cat cat1 = new Cat();
    	Cat cat2 = new Cat(2);
    	Cat cat3 = new Cat(3,"Bob");
    	Cat cat4 = new Cat(4,"Billy");
    	
    	cat3.sleep();
    	cat4.grow(5);
    	
    	System.out.println(cat3.getAge());
    	cat3.setAge(20);
    	System.out.println(cat3.getAge());
    	
    	System.out.println(cat3.getNickname());
    	cat3.setNickname("Billy");
    	System.out.println(cat3.getNickname());
    }  
}
