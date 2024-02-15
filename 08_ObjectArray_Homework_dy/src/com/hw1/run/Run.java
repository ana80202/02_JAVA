package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		//3명의 학생 정보를 기록할 수 있는 객체배열 할당
		Student[] std = new Student[3];
		
		//사용데이터 참고하여 3명의 학생데이터 초기화
		std[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		std[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		std[2] = new Student("강계순",23,167.2,45.0,4,"정보통신공학과");
		
		//학생정보 모두 출력
		//향상된 for문
		for( Student sd : std ) {
			System.out.println(sd.information());
		}
		
		
		System.out.println("====================================");
	
		//10명의 사원 정보를 기록할 수 있는 객체배열 할당
		Employee[] emps = new Employee[10];
		
		//사원들의 정보 키보드로 입력받고, 추가할것인지 물어보고
		//대소문자 상관없이 y이면 계속 객체 추가
		//한명씩 추가될떄 마다 카운트해라
		
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emps[count] = new Employee(name, age, height,weight, salary,dept); //?
			count++;
			
			System.out.print("계속 추가하시겠습니까? (y/n)");
			String str = sc.next().toUpperCase();
			
			if(str.equals("N")) break;
			
			
		}

		//현재까지 기록된 사원들의 정보를 모두 출력
		
		for(Employee emp : emps) {
			
			//NullpointException -> 10칸 배열에 정보가 다 들어있지 않으면 에러가 생김
			if(emp == null) break; //해결방법
			
			System.out.println(emp.information());
		}
		
		
		
		
		
		}
	}


