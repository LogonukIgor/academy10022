package by.academy.classwork.lesson7;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if(RegexDate.validEmail(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}
