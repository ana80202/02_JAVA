package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.hw1.model.dto.Friend;

public class Run {

	 public static void main(String[] args) {
		 
		
		 
		 List<Friend> fd = new ArrayList<Friend>();
		 
		 //방법 1
		 fd.add(new Friend("짱구"));
		 fd.add(new Friend("맹구"));
		 fd.add(new Friend("훈이"));
		 fd.add(new Friend("철수"));
		 fd.add(new Friend("유리"));
		 
		 
		 // 방법 2 : collections.addAll();
		// Collections.addAll(fd,new friend("짱구"));
		 
		 // 방법 3 : List.of() : Java 9 이상의 버전에서 사용 가능
		// List<Friend> fd = List.of(new Friend("짱구"))
		 
		 //랜덤으로 골목대장 뽑기
		 //Random random = new Random(); ->한번 알아보고 써보기!
		 
		   int randomIndex = (int)(Math.random() * fd.size());
	
		    Friend leader = fd.get(randomIndex);
		 
		    leader.pickLeader();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}



}
