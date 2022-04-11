package by.academy.classwork.lesson7;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if(RegexDate.validBelarus(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}
