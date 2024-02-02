package edu.kh.variable.ex2;

import java.util.Scanner; //중요**

public class ScannerExample2 {
	
	public static void main(String[] args) {
	
		//사칙연산 계산기
		//-> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		//-> 단 , 출력된 결괏값은 소수점 이하 2쨰짜리까지만 표현
		
		//정수 : sc.nextInt();
		//실수 : sc.nextDouble();
		
		Scanner sc = new Scanner(System.in);  //중요**		
		System.out.print("실수 1 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.println("실수 2 입력 : ");
		double input2 = sc.nextDouble();
		
		System.out.printf("더하기 %f + %f = %.2f\n" , input1 , input2, input1+input2);
		System.out.printf("빼기 %f - %f = %.2f\n" , input1 , input2, input1-input2);
		System.out.printf("나누기 %f / %f = %.2f\n" , input1 , input2, input1/input2);
		System.out.printf("곱하기 %f * %f = %.2f\n" , input1 , input2, input1*input2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
