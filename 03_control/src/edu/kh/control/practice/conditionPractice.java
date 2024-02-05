package edu.kh.control.practice;

import java.util.Scanner;

public class conditionPractice { // 기능 작성 클래스

   Scanner sc = new Scanner(System.in);
   
   public void practice1() {

	   
	   
	   System.out.print("숫자를 한 개 입력하세요 : ");
	   int num = sc.nextInt();
	   
	   if(num %2 != 0) {
	    System.out.println("홀수입니다");
	   } else {
		   
		   if(num < 0) {
			   System.out.println("양수만 입력해주세요");
		   } else {
			   System.out.println("짝수입니다");
		   }
	   }
		   
		   
		   
	   
	   
	  
	   
   }
	
   
   public void practice2() {
	   
	   System.out.print("국어점수 : ");
	   int kor = sc.nextInt();	   
	   
	   System.out.print("수학점수 : ");
	   int math = sc.nextInt();	   
	  
	   System.out.print("영어점수 : ");
	   int eng = sc.nextInt();	
	   
	   int sum = (int)(kor + math + eng);
	   double avg = (double)(kor + math + eng)/3;
	   
	   if ( kor>= 40 || math >= 40 || eng >= 40 || avg >= 60) {
		   System.out.printf("국어점수 : %d\n" , kor);
		   System.out.printf("수학점수 : %d\n", math);
		   System.out.printf("영어점수 : %d\n", eng);
		   System.out.printf("합계 : %d\n ", sum);
		   System.out.printf("평균 : %.1f\n" , avg);
		   System.out.printf("축하합니다, 합격입니다!");
	   } else {
		   System.out.printf("국어점수 : %d\n" , kor);
		   System.out.printf("수학점수 : %d\n", math);
		   System.out.printf("영어점수 : %d\n", eng);
		   System.out.printf("불합격입니다");
		   
		   
	   }
	   
	   
	   
   }
   
   
   public void practice3() {
	   
	   System.out.print("1~12 사이의 정수 입력 : ");
	   int month = sc.nextInt();
	   
	   switch(month) {
	   
	   case 1: 
		   System.out.println("1월은 31일까지 있습니다"); break;
	   case 2: 
		   System.out.println("2월은 29일까지 있습니다"); break;
	   case 3: 
		   System.out.println("3월은 31일까지 있습니다"); break;
	   case 4: 
		   System.out.println("4월은 30일까지 있습니다"); break;
	   case 5: 
		   System.out.println("5월은 31일까지 있습니다"); break;
	   case 6: 
		   System.out.println("6월은 30일까지 있습니다"); break;
	   case 7: 
		   System.out.println("7월은 31일까지 있습니다"); break;
	   case 8: 
		   System.out.println("8월은 31일까지 있습니다"); break;
	   case 9: 
		   System.out.println("9월은 30일까지 있습니다"); break;
	   case 10: 
		   System.out.println("10월은 31일까지 있습니다"); break;
	   case 11: 
		   System.out.println("11월은 31일까지 있습니다"); break;
	   case 12: 
		   System.out.println("12월은 31일까지 있습니다"); break;
	   default :
		   System.out.printf("%d월은 잘못 입력된 달입니다", month); break;
	   
	   }
	   
	   
	   
   }
   
   
   public void practice4() {
	   
	     System.out.print("키(m)를 입력해 주세요 : ");
	     double tall = sc.nextDouble();
	    
	     System.out.print("몸무게(kg)를 입력해 주세요 : ");
	     double kg = sc.nextDouble();
	     
	     double BMI = (kg/(tall*tall));
	     
	     if(BMI < 18.5) {
	    	 System.out.printf("BMI 지수 : %d\n" , BMI);
	    	 System.out.println("저체중");
	     }else {
			   
			   if(BMI >= 18.5 || BMI < 23) {

				   System.out.printf("BMI 지수 : %d\n" , BMI);
			    	 System.out.println("정상체중");
			   } else if (BMI >= 23 || BMI < 25) {
				   System.out.printf("BMI 지수 : %d\n" , BMI);
			    	 System.out.println("과체중");
			   }else if (BMI >= 25 || BMI < 30) {
				   System.out.printf("BMI 지수 : %d\n" , BMI);
			    	 System.out.println("비만");
			   }else if (BMI > 30) {
				   System.out.printf("BMI 지수 : %d\n" , BMI);
			    	 System.out.println("고도비만");
			   }
	   
	   
	   
   }
   
   
   
   }   
   
}

