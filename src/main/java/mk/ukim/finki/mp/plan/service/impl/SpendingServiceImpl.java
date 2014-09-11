package mk.ukim.finki.mp.plan.service.impl;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.dao.SpendingDao;
import mk.ukim.finki.mp.plan.model.Spending;
import mk.ukim.finki.mp.plan.service.SpendingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpendingServiceImpl implements SpendingService {

	@Autowired
	SpendingDao spendingDao;

	@Override
	public void addSpending(Spending s) {
		spendingDao.addSpending(s);
	}

	@Override
	public Spending getSpending(int id) {
		return spendingDao.getSpending(id);
	}

	@Override
	public List<Spending> getAllSpendings() {
		return spendingDao.getAllSpendings();
	}

	@Override
	public void deleteSpending(Spending s) {
		spendingDao.deleteSpending(s);
	}

	@Override
	public void updateSpending(Spending s) {
		spendingDao.updateSpending(s);
	}
	//lists all the spendings for a given date
	@Override
	public List<Spending> getAllSpendingsByDate(Date d) {
		return spendingDao.getAllSpendingsByDate(d);
	}
	//lists all the spending for a given time period, from one date to another
	@Override
	public List<Spending> getAllSpendingsFromDateToDate(Date d1, Date d2) {
		return spendingDao.getAllSpendingsFromDateToDate(d1, d2);
	}

}
