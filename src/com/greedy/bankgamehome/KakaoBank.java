package com.greedy.bankgamehome;

public class KakaoBank implements Bank{
	

    int balance;
    
    @Override
	public int getBalance() {
		
		AccountDTO acount = new AccountDTO();
		balance = acount.getBalance();
		
		return balance;	
		
	}
    
    
    
	@Override
	public int withDraw(int amount)  {
		// TODO Auto-generated method stub
		
		AccountDTO acount = new AccountDTO();
		
		balance = acount.getBalance();
		
		balance = balance - amount;		
		return balance;		
	}

	@Override
	public int deposit(int amount) {
		
		AccountDTO acount = new AccountDTO();
		balance = acount.getBalance();
		balance = balance + amount;	
		
		return balance;

	}


}
