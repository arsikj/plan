package mk.ukim.finki.mp.plan.dao;

import java.util.List;

import mk.ukim.finki.mp.plan.model.User;

public interface UserDao {

	public void addUser(User u);
	
	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
	
	public List<String> getAllUsersUsername();
	
	public void deleteUser(User u);
	
	public void updateUser(User u);
	
}
