package accountOperations.business.concretes;

import accountOperations.business.abstracts.GoogleService;
import accountOperations.business.abstracts.LoginService;
import accountOperations.business.abstracts.UserService;
import accountOperations.entities.User;

public class UserManager implements UserService {
	
	private LoginService loginService;
	private GoogleService googleService;
	
	public UserManager (LoginService loginService, GoogleService googleService) {
		this.loginService = loginService;
		this.googleService= googleService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
	}

	@Override
	public void registerToGoogle() {
		googleService.registerToSystem();
		
	}

}
