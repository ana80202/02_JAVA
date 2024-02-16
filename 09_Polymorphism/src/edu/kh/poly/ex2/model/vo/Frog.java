package edu.kh.poly.ex2.model.vo;

public class Frog extends Animal {

	public Frog() {}
	
	public Frog(String type, String foodHabit) {
		super(type,foodHabit);
	}

	@Override
	public void eat() {
		System.out.println("잡식");
		
	}

	@Override
	public void breath() {
		System.out.println("폐로 호흡");
		
	}

	@Override
	public void move() {
	  System.out.println("다리로 점프");
		
	}
	
	@Override
	public String toString() {
		return "Frog : " + super.toString();
	}
	

}
