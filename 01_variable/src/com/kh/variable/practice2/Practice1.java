package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice1 {
	

	// 메서드
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char result = sc.next().charAt(0);
		
		System.out.printf("%c unicode : %d " , result, (int)result);
		                                      // 문자열 , (int)숫자로 변환
	}
	
	
	

	
}
