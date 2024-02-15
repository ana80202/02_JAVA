package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {

	private  boolean hasPhysicalKeyboard;
	
	//기본 생성자
	public BasicPhone() {} 
	
	//매개변수생성자
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price); //super이용해서 값 전달
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	
	public void checkKeyboard() {
		
		if(hasPhysicalKeyboard) {
			System.out.println("물리적 키보드가 있습니다");
		}else {
			System.out.println("물리적 키보드가 없습니다");
		}
		
	}

	
	//getter/setter
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}


	

}
