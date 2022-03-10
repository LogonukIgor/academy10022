package by.academy.lesson3;

public class operators4 {
	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int d;
		int day;
		int mo;
		int month;
		int y;
		int year;
		
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		
		
		System.out.println(h + " часов " + min + " минут " + sec + " секунд");
	}
}
