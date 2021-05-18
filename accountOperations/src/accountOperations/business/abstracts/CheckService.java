package accountOperations.business.abstracts;

public interface CheckService {

	boolean checkName(String name);
	boolean checkLastName(String lastName);
	boolean checkEmail(String email);
	boolean checkPassword(String password);
}
