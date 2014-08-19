package mk.ukim.finki.mp.plan.service;

import java.util.Date;
import java.util.List;

import mk.ukim.finki.mp.plan.model.Income;

public interface IncomeService {

	public void addIncome(Income i);

	public Income getIncome(int id);

	public List<Income> getAllIncomes();

	public void deleteIncome(Income i);

	public void updateIncome(Income i);

	public List<Income> getAllIncomesByDate(Date d); // for 1 day

	public List<Income> getAllIncomesFromDateToDate(Date d1, Date d2);

}
