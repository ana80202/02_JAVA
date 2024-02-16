package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
		Book[] arr = new Book[3];
		
		//업캐스팅이 적용되어 있는 상태
		arr[0] = new Novel("해리포터", "J.k롤링","판타지");
		arr[1] = new Textbook("자바 프로그래밍","james Gosling","컴퓨터 과학");
		arr[2] = new Poetry("우리들의 사랑시","김소월",30);
		
		//도서 정보 출력
		for(Book book : arr) { //향상된 for문 이용
			 book.displayInfo(); //정적 바인딩
			 //void com.hw1.model.dto.Book.displayInfo()
			 System.out.println(); //개행	
			 }
		
	}

}
