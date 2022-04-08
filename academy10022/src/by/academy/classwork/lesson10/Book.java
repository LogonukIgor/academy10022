package by.academy.classwork.lesson10;

public class Book implements Printable{

	@Override
	public void print() {
		System.out.println("книга");
	}
	
	public static void printBook(Printable[] printable) {
		for(Printable printables: printable) {
			if(printables instanceof Book) {
				printables.print();
				System.out.println("ikik");
			}
		}
	}
}
