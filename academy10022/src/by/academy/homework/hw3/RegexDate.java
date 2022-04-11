package by.academy.homework.hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate {

	public static final Pattern PATTERN = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");
	public static final Pattern VALIDATORAMERICAN = Pattern.compile("^\\+1\\d{10}$");
	public static final Pattern VALIDATORBELARUS = Pattern.compile("^\\+375\\d{9}$");
	public static final Pattern VALIDATOREMAIL = Pattern.compile("^([a-z0-9_-]+\\\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\\\.[a-z0-9_-]+)*\\\\.[a-z]{2,6}$");
	
	public static boolean test(String date) {
		Matcher matcher = PATTERN.matcher(date);
		return matcher.matches();
	}
	
	public static boolean validAmerican(String tel) {
		Matcher matcher = VALIDATORAMERICAN.matcher(tel);
		return matcher.matches();
	}
	
	public static boolean validBelarus(String tel) {
		Matcher matcher = VALIDATORBELARUS.matcher(tel);
		return matcher.matches();
	}
	
	public static boolean validEmail(String mail) {
		Matcher matcher = VALIDATOREMAIL.matcher(mail);
		return matcher.matches();
	}
}
