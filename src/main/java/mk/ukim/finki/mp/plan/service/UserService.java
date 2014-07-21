package mk.ukim.finki.mp.plan.service;

import java.util.List;

import mk.ukim.finki.mp.plan.model.User;
public interface UserService {
	
public void addUser(User u);
	
	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
	
	public List<String> getAllUsersUsername();
	
}
