package accountOperations.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import accountOperations.dataAccess.abstracts.UserDao;
import accountOperations.entities.User;

public class InMemoryUserDao implements UserDao {

	public List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("User added to database : " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("User deleted to database : " + user.getName());
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public boolean checkEmailExists(User user) {
		for (User person: users) {
			if (person.getEmail()==user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	
}
