package com.greedy.bankgamehome;

public class AccountDTO {
	
	private String name;
	private int balance = 100000;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
