package edu.kh.control.condition;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ConditionExample { //기능 제공용 클래스
	
  Scanner sc = new Scanner(System.in);  //전역변수
  
  public void ex1() {
	  
	  //if문
	  //조건식이 true 일떄만 내부 코드 수행
	  
	  /*
	   * [작성법]
	   * if(조건식) {
	   * 	조건식이 true 일 떄 수행할 코드
	   * }
	   * */
	  
	  //입력받은 정수가 양수인지 검사
	 //양수라면 "양수입니다 "출력
	  System.out.print("정수 입력 : ");
	  int num = sc.nextInt();
	  
	  boolean result = (num > 0);
	  System.out.println(result ? "양수입니다" : "음수입니다" );
	  
	 
	
	  //if문 사용
//	  System.out.print("정수 입력 : ");
//	  int input = sc.nextInt();
//	  
//	  if(input >0) {
//		  System.out.println("양수입니다");
//	  }
//	 
//	  if(input <= 0) {
//		  System.out.println("음수입니다");
//	  }
	  
  }
  
  
 public void ex2() {
	 
	 // if- else 문
	 //조건식 결과가 true 면 if문,
	 //false면 else구문이 수행됨
	 
	 /*
	  * [작성법]
	  * 
	  * if(조건식){
	  * 	조건식이 true일떄 수행될 코드
	  * } else {
	  *     조건식이 false일 떄 수행될 코드
	  *     }
	  * 
	  * */
	 
	 //홀짝검사
	 //입력받은 정수값이 홀수이면 홀수입니다 출력
	 //0이면 "0입니다"
	 //짝수이면 "짝수입니다"출력
	 //else if사용 X , 중첩 if문 사용
	 
	 
	 System.out.print("정수 입력 : ");
	 int input = sc.nextInt();
	 
	 if(input % 2 != 0) {
		 System.out.println("홀수 입니다");
	 }else { //짝수 또는 0 입력 시 수행
		 
		 //중첩 if
		 if(input ==0) {
			 System.out.println("0입니다");
		 }else {
			 System.out.println("짝수입니다");
		 }
	 }
 } 
 
 
 
 public void ex3() {
	 
	 // 양수 , 음수, 0 판별
	 //if(조건식) - else if(조건식) - else
	 
	 System.out.print("정수 입력 : ");
	 int input = sc.nextInt();
	 
	 if(input > 0) {
		 System.out.println("양수입니다");
	 }else if(input < 0) {
		 System.out.println("음수입니다");
	 }else {
		 System.out.println("0입니다");
	 }
	 
 }
 
 
 
 
 public void ex4() {
	 
	 // 달(month)을 입력받아 해당 달에 맞는 계절 출력
	 //단, 겨울일때 온도가 -15도 이하 "한파경보", -12이하"한파 주의보"
	 // 여름일떄 온도가 35도 이상 "폭염경보" , 33도 이상 "폭염주의보"
	 //1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
	 //1,2,12 겨울
	 //3~5 봄
	 //6~8 여름
	 //9~11 가을
	 
	 System.out.print("계절 : ");
	 int season = sc.nextInt();
	 
	 System.out.print("온도 : ");
	 int temp = sc.nextInt();
	 
	 if(season <= 2 || season == 12 || temp <= -15) {
		 System.out.println("겨울");
		 System.out.println("한파경보");
	 } else if (season <= 2 || season == 12 || temp <= -12) {
		 System.out.println("겨울");
		 System.out.println("한파주의보");
	 }
	 
	 else if (season <= 5 || season == 3) {
		 System.out.println("봄");
	 }else if (season <= 8 || season == 6 || temp >= 35) {
		 System.out.println("여름");
		 System.out.println("폭염경보");
	 }else if (season <= 8 || season == 6 || temp >= 33) {
		 System.out.println("여름");
		 System.out.println("폭염주의보");
	 }
	 
	 
	 else if(season <= 11 || season ==9 ) {
		 System.out.println("가을");
	 }else {
		 System.out.println("해당하는 계절이 없습니다");
	 }
	 
	 
	 
	 
	 
	 
 }
 
 
 
  
 
 public void ex5() {
	 
	 System.out.print("나이 입력 : ");
	 int age = sc.nextInt();
	 
	 if(age <= 13) {
		 System.out.println("어린이 입니다");
	 }else if(age > 13 || age <= 19) {
		 System.out.println("청소년 입니다");
	 }else if (age > 19) {
		 System.out.println("성인입니다");
	 }
	 
	 
	 
	 
 }
  
 
 
 
 public void ex6() {
	 
	 System.out.print("점수 입력 : ");
	 int score = sc.nextInt();
	 
	 if(score >= 90 || score <=100) {
		 System.out.println("A");
		 
	 }else if(score >= 80 || score < 90) {
		 System.out.println("B");
		 
	 }else if(score >= 70 || score < 80) {
		 System.out.println("C");
		 
	 }else if(score >= 60 || score < 70) {
		 System.out.println("D");
		 
	 }else if(score < 60) {
		 System.out.println("F");
		 
	 }else {
		 System.out.println("잘못 입력하셨습니다");
	 }
	 
	 
	 
	 
 }

 
 
 public void ex7() {

	 
	 
	 
	 System.out.print("나이 : ");
	 int age = sc.nextInt();

	 System.out.print("키 : ");
	 double tall = sc.nextDouble();
	 
	 if(age >= 12 || tall >= 140) {
		 System.out.println("탑승 가능");
	 }else if(age < 12) {
		 System.out.println("적정 연령이 아닙니다");
	 }else if (tall < 140) {
		 System.out.println("적정 키가 아닙니다");
	 }else if(age < 0 || age > 100) {
		 System.out.println("잘못 입력 하셨습니다");
	 }
	 
	 
	 
	 
 }
  
  
  
 public void ex8() {
	 
	 
	 System.out.print("나이 : ");
	 int age = sc.nextInt();
	 
	 System.out.print("키 : ");
	 double tall = sc.nextDouble();
	
	 if(age >= 12 || tall >= 140 ) {
		 System.out.println("탑승 가능");
	 }else if (age >= 12 || tall < 140) {
		 System.out.println("나이는 적절하나, 키가 적절치 않음");
	 }else if (age < 12 || tall <= 140) {
		 System.out.println("키는 적절하나, 나이는 적절치 않음");
	 }else{
		 System.out.println("나이와 키 모두 적절치 않음");
	 }
	 
	 
//	 if (age >= 0 || age <= 100) {
//	 }else {
//		 System.out.println("나이를 잘못 입력 하셨습니다");
//	 }
//	 if (tall >= 0 || tall <= 250) {	 
//	 }else {
//		 System.out.println("키를 잘못 입력 하셨습니다");
//	 }
	 
	 
	 
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
