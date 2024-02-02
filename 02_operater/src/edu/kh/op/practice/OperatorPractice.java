package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { //기능 제공
	
	public void practice1() {
		
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
		  1인당 동일하게 나눠가진 사탕 개수와 나눠주고
		   남은 사탕의 개수를 출력하세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("1인당 사탕 개수 : %d\n " , input2/input1);
		System.out.printf("남는 사탕 개수 : %d " , input2%input1);
		
		
		
	}




	public void practice2() {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print( "이름 : ");
	String input1 = sc.next(); //이름
	
	System.out.print( "학년 : ");
	int input2 = sc.nextInt(); //학년
	
	System.out.print( "반 : ");
	int input3 = sc.nextInt(); //반
	
	System.out.print( "번호 : ");
	int input4 = sc.nextInt(); //번호
	
	System.out.print( "성별(남학생/여학생) :  ");
	String input5 = sc.next(); //성별
	
	System.out.print( "성적 : ");
	float input6 = sc.nextFloat(); //성적
	
	
	System.out.printf("%d 학년 %d 반 %d번 %s %s의 성적은 %.2f이다.\n", input2, input3, input4, input1, input5, input6 );
	
	
	
}

	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		
		int sum = input1 + input2 + input3;
		double avg = sum/3.0;
				
		
		System.out.println();
		
		System.out.printf("합계 : %d\n" , (input1 + input2 + input3));
		System.out.printf("평균 : %.1f\n" ,(float) (input1 + input2 + input3)/3);
		
		boolean result = (input1 >=40) && (input2 >=40) && (input3 >= 40) && (avg >=60);
		
		System.out.println(result ? "합격" : "불합격");
		
		
		
		
	}
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ?");
		int age = sc.nextInt();
		
		boolean result1 = (age >= 20);
		System.out.println(result1 ? "저는 성인입니다" : "저는 미성년입니다");
		
		System.out.print("청소년입니까?");
		boolean result2 = (age >=13) && (age <=19);
		System.out.println(result2 ? "true" : "false");
		
		System.out.print("노인이거나 어린이 입니까?");
		boolean result3 = (age >=65) || (age <=12);
		System.out.println(result3 ? "true" : "false");
		
		
		
		
	}
	
	
	


  public void practice5() {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("기온별 옷차림 : ");
	  int temp = sc.nextInt();
	  
	  if (temp <=5) {
		  System.out.println("내복과 긴팔과 자켓을 입으세요");
	  }  else if (temp <=10) {
		  System.out.println("긴팔과 자켓을 입으세요");
	  } else if(temp <=15) {
		  System.out.println("긴팔을 입으세요");
	  } else {
		  System.out.println("반팔을 입으세요");
	  }
	  
	  
  }  

}





























