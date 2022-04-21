package by.academy.classwork.lesson13.task1;

public class Test {

	public static void main(String[] args) {
		
		User us1= new User("logon2022","163456");
		us1.createQuery();
		
		User.Query q1 = us1. new Query();
		q1.printToLog();
	}
}
