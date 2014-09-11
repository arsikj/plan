package mk.ukim.finki.mp.plan.service.impl;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.dao.IncomeDao;
import mk.ukim.finki.mp.plan.model.Income;
import mk.ukim.finki.mp.plan.service.IncomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {

	@Autowired
	IncomeDao incomeDao;

	@Override
	public void addIncome(Income i) {
		incomeDao.addIncome(i);

	}

	@Override
	public Income getIncome(int id) {
		return incomeDao.getIncome(id);
	}

	@Override
	public List<Income> getAllIncomes() {
		return incomeDao.getAllIncomes();
	}

	@Override
	public void deleteIncome(Income i) {
		incomeDao.deleteIncome(i);
	}

	@Override
	public void updateIncome(Income i) {
		incomeDao.updateIncome(i);
	}
	//lists all the incomes for a given date
	@Override
	public List<Income> getAllIncomesByDate(Date d) {
		return incomeDao.getAllIncomesByDate(d);
	}
	//lists all the incomes for a given time period, from one date to another
	@Override
	public List<Income> getAllIncomesFromDateToDate(Date d1, Date d2) {
		return incomeDao.getAllIncomesFromDateToDate(d1, d2);
	}

}
