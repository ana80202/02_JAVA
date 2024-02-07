package edu.kh.oop.basic;

import java.util.Scanner;

public class AccountRun {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		//Account 객체 생성
		Account a1 = new Account();
		
		a1.setName("최다연");
		a1.setAccountNumber("1234-56-6789");
		a1.setBalance(100000);
		a1.setPassword("7890");
		
		System.out.println(a1.getName());
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getBalance());
		System.out.println(a1.getPassword());
	
	    
		a1.deposit(50000);
		a1.withdraw("1234", 2000); // 비밀번호 불일치
		a1.withdraw("7890", 20000000); // 잔액 부족
		a1.withdraw("7890", 2000); 
		
		
		System.out.println("=====================================");
		Account a2 = new Account();
		
		
		
	
	   }
		
		
		
	}


