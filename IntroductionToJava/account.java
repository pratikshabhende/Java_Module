package com.cybage.assignment;

public class account {
private String accountNo;
private String name;
private String accountType;
private long balance;
public account() {
	name="Pratiksha Bhende";
    accountNo="200";
	accountType="Saving";
	balance=298349997;
			}



public account(String accountNo, String name, String accountType, long balance) {
	super();
	this.accountNo = accountNo;
	this.name = name;
	this.accountType = accountType;
	this.balance = balance;
}



public static void main(String[] args) {
	account account= new account();
	System.out.println("Name: "+account.name);
    System.out.println("Account Number:" +account.accountNo);
	System.out.println("Account Type:"+account.accountType);
	System.out.println("Account Balance:"+account.balance);
	
	
	
	account newaccount=new account("300","Renuka","Salary",938378734);
	System.out.println(newaccount.name);
	System.out.println(newaccount.accountNo);
	System.out.println(newaccount.accountType);
	System.out.println(newaccount.balance);
}
}

