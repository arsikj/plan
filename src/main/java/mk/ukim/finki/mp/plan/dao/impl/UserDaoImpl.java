package mk.ukim.finki.mp.plan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mk.ukim.finki.mp.plan.dao.UserDao;
import mk.ukim.finki.mp.plan.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addUser(User u) {
		getCurrentSession().save(u);
		
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) getCurrentSession().createQuery("from User").list();
		return users;
	}

	@Override
	public User getUserByUsername(String u) {
		return (User) getCurrentSession().createQuery("from User where username=:u").setParameter("u", u).uniqueResult();
	}
	

	@Override
	public List<String> getAllUsersUsername() {
		List<String> users = getCurrentSession().createQuery("select username from User").list();
		return users;
	}

	@Override
	public void deleteUser(User u) {
		User tmp = getUserByUsername(u.getUsername());
		if (tmp != null ){
			getCurrentSession().delete(tmp);
		}		
	}

	@Override
	public void updateUser(User u) {
		User tmp = getUserByUsername(u.getUsername());
		if (tmp != null ){
			tmp.setIncomes(u.getIncomes());
			tmp.setMail(u.getMail());
			tmp.setName(u.getName());
			tmp.setPassword(u.getPassword());
			tmp.setSpendings(u.getSpendings());
			tmp.setSurname(u.getSurname());
			getCurrentSession().update(tmp);
		}
	}

}
