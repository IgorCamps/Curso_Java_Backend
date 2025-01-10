package entities;

public class Transation {
	private String name;
	private String accountNumber;
	private char deposit;
	private double depositAccount;
	
	
	public Transation() {
		
	}
	
	public Transation(String name, String accountNumber, char deposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public char getDeposit() {
		return deposit;
	}
	
	public void setDeposit(char deposit) {
		this.deposit = deposit;
	}
	
	public double getDepositAccount() {
		return depositAccount;
	}
	
	public void setDepositAccount(double depositAccount) {
		this.depositAccount += depositAccount;
	}
	
	public void setWitdrawAccount(double withdrawAccount) {
		this.depositAccount -= withdrawAccount + 5;
	}
	
	public String toString() {
		return "Account " + accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ String.format("%.2f", depositAccount);
	}
	
}
