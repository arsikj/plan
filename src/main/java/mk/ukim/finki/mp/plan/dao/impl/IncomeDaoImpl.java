package mk.ukim.finki.mp.plan.dao.impl;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.dao.IncomeDao;
import mk.ukim.finki.mp.plan.model.Income;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IncomeDaoImpl implements IncomeDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addIncome(Income i) {
		getCurrentSession().save(i);
	}

	@Override
	public List<Income> getAllIncomes() {
		List<Income> incomes = (List<Income>) getCurrentSession().createQuery(
				"from Income").list();
		return incomes;
	}

	@Override
	public void deleteIncome(Income i) {
		Income tmp = getIncome(i.getId());
		if (tmp != null) {
			getCurrentSession().delete(i);
		}
	}

	@Override
	public void updateIncome(Income i) {
		Income tmp = getIncome(i.getId());
		if (tmp != null) {
			tmp.setAmount(i.getAmount());
			tmp.setCurrency(i.getCurrency());
			tmp.setFrequency(i.getFrequency());
			tmp.setFromDate(i.getFromDate());
			tmp.setUser(i.getUser());
			getCurrentSession().update(tmp);
		}
	}

	@Override
	public List<Income> getAllIncomesByDate(Date d) {
		List<Income> incomes = (List<Income>) getCurrentSession().createQuery(
				"from Income where fromDate=:d").list();
		return incomes;
	}

	@Override
	public List<Income> getAllIncomesFromDateToDate(Date d1, Date d2) {
		List<Income> incomes = (List<Income>) getCurrentSession().createQuery(
				"from Income where fromDate between "+d1+" and "+d2).list();
		return incomes;
	}

	@Override
	public Income getIncome(int id) {
		return (Income) getCurrentSession().get(Income.class, id);
	}

}
