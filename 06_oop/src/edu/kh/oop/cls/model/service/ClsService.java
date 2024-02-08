package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

public class ClsService /*extends Student*/ {
	                   //부모 student를 상속받음

	 public void ex1() {
		 
		 //클래스 접근 제한자 확인하기
		 Student std = new Student();
		 // public class 인 student는 import 가능
		 
		 //TestVo test = new TestVo();
		 // (default) class인 TestVo는 import불가(다른패키지)

		    System.out.println(std.v1);
		    //다른 패키지에서도 접근 가능한 public만 에러 X
		    
//			System.out.println(std.v2);
//			System.out.println(std.v3);
//			System.out.println(std.v4);
		    
		    //상속 관계에서 직접 접근 가능 범위
//		    System.out.println(v1); //public
//		    System.out.println(v2); //protected
//		    System.out.println(v3);
//		    System.out.println(v4);
		    
		    
		    
	 }

	 
	 public void ex2() {
		 // static 필드 확인 예제
		 
		 //학생 객체 2개 생성
		 Student std1 = new Student();
		 Student std2 = new Student();
		 
		 //학생 객체에 name 세팅
		 std1.setName("홍길동");
		 std2.setName("김영희");
		 
		 System.out.println(std1.schoolName);
		 //schoolName에 노란줄이 뜨는 이유(경고) => 제대로 작성을 안해서
		 //** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 **
		 
		 Student.schoolName = "KH정보교육원";
		 
		 System.out.println(Student.schoolName);
		 System.out.println(std1.schoolName);
		 System.out.println(std2.schoolName);
		 
		 
		 
		 /* static
		  * 1) 공유 메모리 영역(또는 정적 메모리 영역) 이라고함
		  *  -> 프로그램 시작 시 static이 붙은 코em들이 모두
		  *  static 영역에 생성되고,
		  *  프로그램이 종료될 떄 까지 사라지지 않음(정적)
		  *  그리고, static 영여겡 생성된 변수는 어디서든지 공유 가능(공유)
		  *  
		  *  2) 사용 방법 :  클래스명 .변수명 (Student.schoolName)
		  */
	 }


}
