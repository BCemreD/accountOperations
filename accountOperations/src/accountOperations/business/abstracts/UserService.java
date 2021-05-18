package accountOperations.business.abstracts;

import accountOperations.entities.User;

public interface UserService {

	void register(User user);
	void login(String email, String password);
	void registerToGoogle();
	
}
