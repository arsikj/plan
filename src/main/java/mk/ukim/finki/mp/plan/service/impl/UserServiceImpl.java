package mk.ukim.finki.mp.plan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mk.ukim.finki.mp.plan.dao.UserDao;
import mk.ukim.finki.mp.plan.model.User;
import mk.ukim.finki.mp.plan.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public void addUser(User u) {
		userDao.addUser(u);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public List<String> getAllUsersUsername() {
		return userDao.getAllUsersUsername();
	}

	@Override
	public void deleteUser(User u) {
		userDao.deleteUser(u);		
	}

	@Override
	public void updateUser(User u) {
		userDao.updateUser(u);
	}

}
