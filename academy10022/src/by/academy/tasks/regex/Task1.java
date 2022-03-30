package by.academy.tasks.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static final Pattern p = Pattern.compile("\\S\\D\\W");

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите строку (узнаем сколько знаков препинания):");
		String text = scanner.nextLine();
		int value = 0;

		Matcher matcher = p.matcher(text);
		while (matcher.find()) {
			value++;
		}
		System.out.println("Знаков препинания: " + value);
	}
}
