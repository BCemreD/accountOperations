package accountOperations.business.abstracts;

import accountOperations.entities.User;

public interface LoginService {

	void register(User user);
	void login (String email, String password);
}
