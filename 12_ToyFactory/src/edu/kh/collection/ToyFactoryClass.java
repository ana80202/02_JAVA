package edu.kh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.model.dto.ToyClass;

public class ToyFactoryClass{

	private Scanner sc = new Scanner(System.in);
	
	
	
	
	
	private  List<ToyClass> toyList = new LinkedList<ToyClass>();
	
	public ToyFactoryClass() { //기본생성자
		
		toyList.add(new ToyClass("키시미시",15000,"분홍색",5,19940505,"면직물,플라스틱"));
		toyList.add(new ToyClass("캡냅",27000,"보라색",8,19960128,"면직물,플라스틱"));
		toyList.add(new ToyClass("파피",57000,"빨간색",12,19931225,"고무,면직물"));
		toyList.add(new ToyClass("허기워기",12000,"파란색",5,19940312,"면직물"));
		toyList.add(new ToyClass("마미롱래그",36000,"분홍색",8,19950805,"고무,면직물"));
		
	}
	
	
	public void displayMenu() {
		
		int menuNum =0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("번호 선택 : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : searchAll(); break;
			case 2 : System.out.println( newToy() );  break; //?
			case 3 : System.out.println(removeToy());  break;
			case 4 : ymdSearch(); break;
			case 5 : /*useAge();*/ break;
			case 6 : System.out.println(addm()); break;
			case 7 : /*removem();*/ break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("메뉴에 있는 번호만 입력해주세요");
			
			
			}
			
			
			
		}while(menuNum != 0 );
		
		
	}
	

	
	public void  searchAll() {
		
		System.out.println("<전체 장난감 목록>");
		
		if(toyList.isEmpty()) {
			System.out.println("장난감 정보가 없습니다");
			return;
		}
		int index = 0;
		for( ToyClass  toylist : toyList) {
			System.out.println(toylist);
			System.out.println();
		}
		
		
	}
	
	
	public String newToy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름:");
		String name = sc.next();
		
		System.out.print("사용 가능 연령:");
		int age = sc.nextInt();
		
		System.out.print("가격:");
		int price = sc.nextInt();
		
		System.out.print("색상:");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) :");
		long made = sc.nextLong();

		
		while(true) {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			String material = sc.next();
			char ch = sc.next().toLowerCase().charAt(0);
			
			if(ch == 'q') {
				toyList.add(new ToyClass(name,price,color,age,made,material)); 
				break;				
			}		
	}
		return "새로운 장난감이 추가 되었습니다";
	
	
	
	public String removeToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		if(toyList.isEmpty()) {
			return "입력된 장난감 정보가 없습니다";
		}//else if(toyList.contains(name)) {
			//return "입력된 장난감 정보가 없습니다";
		//}
		
			else{
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				boolean temp = toyList.remove(toyList.contains(name));
				return "장난감이 삭제되었습니다";
			}else {
				return "취소";
			}
		}
	}
	
	
	
	public String ymdSearch() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		
	}	
	
	
	public useAge() { //요소만 꺼내오는거??
		
		System.out.println("<연령별로 사용가능한 장난감>");
		
	
		
	}
	
	public String addm() {
		
		List<String> nameList = toyList.stream().map(material)
		
		
		
		System.out.println("재료추가");
		
	     
			
		
		
	}
	
	public removem() {
		System.out.println("재료삭제");
	}
	
}
