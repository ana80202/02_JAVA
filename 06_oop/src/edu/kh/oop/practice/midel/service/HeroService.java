package edu.kh.oop.practice.midel.service;

import edu.kh.oop.practice.model.vo.Hero;

import java.util.Scanner;

public class HeroService { //기능제공용 클래스

	public void hero1() {
		
		
	   Scanner sc = new Scanner(System.in);
	   
	   Hero warrior = new Hero();
	   Hero wizard = new Hero();
	   
	   
	   System.out.print("이름 : ");   
	   String uname = sc.next();
	   warrior.setNickName(uname);
	   
	
	   warrior.setJob("전사");
	   

	   warrior.setHp(200);

	   warrior.setMp(20);
	   
	
	   warrior.setLevel(1);
	   
	
	   warrior.setExp(100);
		
	   
	   

	   System.out.printf(" %s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
			             warrior.getJob(), uname, warrior.getLevel()
			   
			   );
	 
		
	   System.out.print("이름 : ");   
	   String wname = sc.next();
	   wizard.setNickName(wname);
	   
	
	   wizard.setJob("마법사");
	   

	   wizard.setHp(200);

	   wizard.setMp(20);
	   
	
	   wizard.setLevel(1);
	   
	
	   wizard.setExp(100);
	   
	   
	   

	   System.out.printf(" %s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
			   wizard.getJob(), wname,wizard.getLevel()
			   
			   );
	   
	   System.out.println("=============================");
	   
	   
	   
	   warrior.attack(100);
	   warrior.attack(100);
	   warrior.attack(100);
	   warrior.attack(100);
	   warrior.attack(100);
	   warrior.attack(100);
	   
	   warrior.magicJump(20);

	   
	   
	   
		
		
	}
	
	
	
	
}
