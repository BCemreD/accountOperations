package accountOperations;

import accountOperations.adapters.GoogleManagerAdapter;
import accountOperations.business.abstracts.UserService;
import accountOperations.business.concretes.CheckManager;
import accountOperations.business.concretes.EmailManager;
import accountOperations.business.concretes.LoginManager;
import accountOperations.business.concretes.UserManager;
import accountOperations.dataAccess.concrete.InMemoryUserDao;
import accountOperations.entities.User;

public class Main {

	public static void main(String[] args) {
			UserService userService=new UserManager(new LoginManager(new EmailManager(), new CheckManager(), new InMemoryUserDao()), new GoogleManagerAdapter()); 

		
		User user = new User(1, "Cemre", "DÝÞLÝ","bcemred@gmail.com","123456");
		userService.register(user);
		userService.login("bcemred@gmail.com", "123456");

		
		System.out.println("Google simulated");
		userService.registerToGoogle();
		
		User user1 = new User(2, "Cemre", "DÝÞLÝ", "bcemred@gmail.com","29");
		userService.register(user1);
		userService.login("bcemred@gmail.com", "852");

		
		
		
	}

}
