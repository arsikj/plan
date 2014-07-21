package mk.ukim.finki.mp.plan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	public String username;

	private String mail;

	private String password;

	private String name;

	private String surname;

	@OneToMany(mappedBy = "user")
	private List<Income> incomes;

	@OneToMany(mappedBy = "user")
	private List<Spending> spendings;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Income> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<Income> incomes) {
		this.incomes = incomes;
	}

	public List<Spending> getSpendings() {
		return spendings;
	}

	public void setSpendings(List<Spending> spendings) {
		this.spendings = spendings;
	}

}
