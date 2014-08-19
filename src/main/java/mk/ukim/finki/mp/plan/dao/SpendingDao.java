package mk.ukim.finki.mp.plan.dao;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.model.Spending;

public interface SpendingDao {
	
	public void addSpending(Spending s);
	
	public Spending getSpending(int id);
	
	public List<Spending> getAllSpendings();
	
	public void deleteSpending(Spending s);
	
	public void updateSpending(Spending s);
	
	public List<Spending> getAllSpendingsByDate(Date d); //for 1 day
	
	public List<Spending> getAllSpendingsFromDateToDate(Date d1, Date d2);

}
