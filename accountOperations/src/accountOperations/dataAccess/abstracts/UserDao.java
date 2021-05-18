package accountOperations.dataAccess.abstracts;

import java.util.List;

import accountOperations.entities.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean checkEmailExists(User user);
}
