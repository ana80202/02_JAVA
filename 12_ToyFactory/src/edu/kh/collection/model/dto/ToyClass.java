package edu.kh.collection.model.dto;

import java.util.Objects;
import java.util.Set;

public class ToyClass { //객체 

	private String name;
	private int price;
	private String color;
	private int age;
	private long made;
//	private String material;
	private Set<String> materials; //재료(중복되지 않는 값으로 저장)
	
	public ToyClass(String string, int i, int j, String string2, long made2, Set<String> set){}

	public ToyClass(String name, int price, String color, int age, long made,  Set<String> materials) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.made = made;
		this.materials = materials;
	}

	
	
	public ToyClass(String string, int i, int j, String string2, String string3, Set<String> materials2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColcor(String color) {
		this.color = color;
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


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<String> getMaterial() {
		return materials;
	}
	
	public void setMaterial( Set<String> materialsl, Set<String> materials) {
		this.materials = materials;
	}
	
	
	//material안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	private Object getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		
		for(String material : materials) {
			sb.append(material).append(", ");
		}
		
		//마지막 쉼표와 공백 제거하기
		if(sb.length() > 0) {
			sb.setLength(sb.length() -2);
		}
		
		return sb.toString();
	}
	
	
	
	
	@Override
	public String toString() {
//		return "이름:" + name + "/ 가격:" + price + "/ 색깔:" + colcor + "/ 사용가능연령:" + age + "/ 제조년월일:" + made
//				+ "/ 재료:" + materials + "";
//		
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %l / 재료 : %d",
				name, price, color,age,made,getMaterialsAsString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, made, materials, name, price);
	}

	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToyClass other = (ToyClass) obj;
		return age == other.age && Objects.equals(color, other.color) && made == other.made
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price;
	}

	
	
	


	
	
	

}
