package com.jsp.banking.dto;


public class accountDto {
private Long id;
private String accountHolderName;
private double balance;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "accountDto [id=" + id + ", accountHolderName=" + accountHolderName + ", balance=" + balance + "]";
}

}
