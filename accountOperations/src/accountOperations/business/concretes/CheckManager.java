package accountOperations.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import accountOperations.business.abstracts.CheckService;

public class CheckManager implements CheckService{
public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	@Override
	public boolean checkName(String name) {
		if (name.length()<3) {
			System.out.println("The name should contain at least 2 characters.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length()<3) {
		System.out.println("Lastname should contains at least 2 characters");
			return false;}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(!matcher.matches()) {
			System.err.println("The e-mail should contain @gmail");
		return false;}
	return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length()<6) {

			System.out.println("Password should contain at least 6 charaters.");
			return false;
				
		}
		return true;
	}

}
