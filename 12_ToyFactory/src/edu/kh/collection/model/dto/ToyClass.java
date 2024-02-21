package edu.kh.collection.model.dto;

public class ToyClass { //객체 

	private String name;
	private int price;
	private String colcor;
	private int age;
	private long made;
	private String material;
	
	ToyClass(){}

	public ToyClass(String name, int price, String colcor, int age, long made, String material) {
		super();
		this.name = name;
		this.price = price;
		this.colcor = colcor;
		this.age = age;
		this.made = made;
		this.material = material;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColcor() {
		return colcor;
	}

	public void setColcor(String colcor) {
		this.colcor = colcor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMade() {
		return made;
	}

	public void setMade(long made) {
		this.made = made;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름:" + name + "/ 가격:" + price + "/ 색깔:" + colcor + "/ 사용가능연령:" + age + "/ 제조년월일:" + made
				+ "/ 재료:" + material + "";
	}
	
	


	
	
	

}
