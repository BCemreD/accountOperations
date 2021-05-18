package accountOperations.business.concretes;

import accountOperations.business.abstracts.EmailService;
import accountOperations.entities.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Your verification link has been send to your email: " + user.getEmail());
		
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Click on the verification and verify your email: " + user.getName());
		
		
	}

}
