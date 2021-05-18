package accountOperations.business.abstracts;

import accountOperations.entities.User;

public interface EmailService {

	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}
