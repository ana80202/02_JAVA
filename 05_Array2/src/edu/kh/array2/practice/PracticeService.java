package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
	int[] arr = new int[9]; //길이 9인 배열 
	
	int dsum = 0;  //짝수 합계
	
	for(int i = 0; i < arr.length; i++) {
		
		arr[i] = i+1;
		
		System.out.print(arr[i]);
	
	   if(i % 2 == 0) {
		   
		   dsum += arr[i];
	   }
			
			
		
		}
	System.out.println();	
	System.out.printf("짝수 번째 인덱스 합 :  %d " , dsum);
	
	}

	
	
	public void practice2() {
		
		int[] arr = new int[9];  // 길이 9 배열
		
		int isum = 0;  //홀수 합계
		
		for(int i = 0;  i < arr.length; i++) {
			
			System.out.print(arr.length - i);
			
			if(i % 2 != 0) {
				
				isum += arr.length - i ;
			}
			
		
		}
		
        System.out.println();
		System.out.printf("홀수 번째 인덱스 합 :  %d " , isum);
		
		
	}
	
	
	
	
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
				
		     arr[i] = i +1;
			
			System.out.print(arr[i]);
		}
		
		
	}
	
	
	
	
	
	
	public void practice4() {

		int input =sc.nextInt();
		
		int num = sc.nextInt();
		
		
		for(int i=0; i <= 4; i++ ) {
			
			System.out.printf("입력 %d : %d ", i , num) ;
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
		   
}		

        
		


		
		
		
		
	