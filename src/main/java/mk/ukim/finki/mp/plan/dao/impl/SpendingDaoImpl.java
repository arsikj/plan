package mk.ukim.finki.mp.plan.dao.impl;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.dao.SpendingDao;
import mk.ukim.finki.mp.plan.model.Spending;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SpendingDaoImpl implements SpendingDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addSpending(Spending s) {
		getCurrentSession().save(s);
	}

	@Override
	public Spending getSpending(int id) {
		return (Spending) getCurrentSession().get(Spending.class, id);
	}

	@Override
	public List<Spending> getAllSpendings() {
		return (List<Spending>) getCurrentSession()
				.createQuery("from Spending").list();
	}

	@Override
	public void deleteSpending(Spending s) {
		Spending tmp = getSpending(s.getId());
		if (tmp != null) {
			getCurrentSession().delete(s);
		}

	}

	@Override
	public void updateSpending(Spending s) {
		Spending tmp = getSpending(s.getId());
		if (tmp != null) {
			tmp.setAmount(s.getAmount());
			tmp.setCurrency(s.getCurrency());
			tmp.setFrequency(s.getFrequency());
			tmp.setFromDate(s.getFromDate());
			tmp.setUser(s.getUser());
			getCurrentSession().update(tmp);
		}

	}
	//gets all spendings for the given date
	@Override
	public List<Spending> getAllSpendingsByDate(Date d) {
		return (List<Spending>) getCurrentSession().createQuery(
				"from Spending where fromDate=:d").list();
	}
	//gets all spendings for a given time period, from one date to another
	@Override
	public List<Spending> getAllSpendingsFromDateToDate(Date d1, Date d2) {
		return (List<Spending>) getCurrentSession().createQuery(
				"from Spending where fromDate between " + d1 + " and " + d2)
				.list();
	}

}
