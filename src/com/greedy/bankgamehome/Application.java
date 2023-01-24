package com.greedy.bankgamehome;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
        boolean run =true;
        while(run) {
        	System.out.println("====  은행선택  ==");
        	System.out.println("1.카카오 뱅크");
        	System.out.println("2.토스 뱅크 Bank");
        	System.out.println("3.K 뱅크");
        	System.out.print("Choose a Bank>");
          
          int BankNo = sc.nextInt();
        
          switch(BankNo) {
          case 1:
        	     System.out.println("카카오 뱅크");
        	     break;
          case 2: 
        	     System.out.println("토스 뱅크 Bank"); 
        	     break;
          case 3: 
        	     System.out.println("K 뱅크"); 
        	     break;
          case 4: System.out.println("다시선택하세요"); 
                 break;
          case 5: run=false; break;
          }
          
          // 메뉴선택
          System.out.println("업무 선택>");
          System.out.println("1.잔액조회");
          System.out.println("2.출금");
          System.out.println("3.입금");
          System.out.println("4.종료");
          
  	      Scanner scMenu = new Scanner(System.in);	
          int selectMenu = scMenu.nextInt();
	      Bank bank = new Kbank();
	      int balance;
	      
	      CreditDTO credit= new CreditDTO();
	      
	      int creditLevel = credit.getCreditLevel();
	      
	      
          switch(selectMenu) {
          case 1: 
        	  System.out.println("잔액조회");
        	  balance = bank.getBalance();
        	  System.out.println("잔액 : "+balance);
        	  break;
          case 2: // 인출 케이스
        	  System.out.println("출금메뉴");
        	  System.out.println("출금하실 금액을 입력하세요");
        	  Scanner scWidrawAmount = new Scanner(System.in);	
        	  int widrawAmount = scWidrawAmount.nextInt();                  
        	  balance = bank.withDraw(widrawAmount);
        	  System.out.println("계좌에서 "+ widrawAmount + "원이 출금되었습니다");
        	  System.out.println("출금후 잔액 : "+balance+" 원");
        	  break;
          case 3: 
        	  System.out.println("입금");
        	  System.out.println("입금하실 금액을 입력하세요 : ");
        	  Scanner scDepositAmount = new Scanner(System.in);	
        	  int depositAmount = scDepositAmount.nextInt();                  
        	  balance = bank.deposit(depositAmount);
        	  System.out.println("계좌에서 " +depositAmount+" 원이 입금 되었습니다");
        	  System.out.println("입금후 잔액 :"+balance);
        	  creditLevel = creditLevel -1;
        	  break;
          case 4: 
        	  run=false; break;
          default:
			  System.out.println("다시 선택하세요");
			  break;	  
          }
          
    	  System.out.println("신용등급  : "+creditLevel+" 등급");                 

      }
        
        
      System.out.println("프로그램이 종료 되었습니다");
      

	}

}
