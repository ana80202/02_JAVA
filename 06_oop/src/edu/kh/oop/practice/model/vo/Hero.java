package edu.kh.oop.practice.model.vo;

import java.util.Scanner;

public class Hero {
	
	
	//속성
	//필드 == 멤버변수
	
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;

	
	
	
	
	
	//기능

	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	
	
	
	
	
	public void attack(int exp) {
					
			System.out.printf("%s 은/는 공격을 했다! \n" ,  nickName);
			
			//전달받은 경험치를 현재 경험치에 누적
			  this.exp  += exp;   //this : 필드에 있는 매개 변수 불러옴
			
				if(this.exp > 500) {
				
				    level += 1;
				    System.out.println("레벨이 올랐습니다 현재 레벨 : " + level);
						}
				
		}
		
		
		

	
	
	public void magicJump(int mp){
		
	
		
		if(mp <= 0) {
			
			System.out.println("더 이상 매직점프할 수 없어요!"); 
		} else {
			
			mp -= 10;
			System.out.printf("%s 의 점프 \n" , nickName);
		}
		
		
		

			
			
			
			
		}
		
		
		
	}
	
	


