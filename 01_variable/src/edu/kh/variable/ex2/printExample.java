package edu.kh.variable.ex2;

public class printExample {
	
	//main 작성 ctrl + space + enter
	public static void main(String[] args) {
		
	
		//system.out.print() :  단순 출력 (출력 후 줄바꿈X)
		//system.out.pruntln() : 한 줄 출력(출력 후 줄바꿈 수행)
		//줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 출력된다는것은 똑같음
		
//		System.out.println();  :  자동완성 syso ctrl+space
		System.out.println("테스트1");
		System.out.println("테스트2"); //ln은 그 다음줄 까지 커서를 내려줌
		
		System.out.print("테스트3");
		
		System.out.println(); //출력을 수행한 다음에 줄바꿈을 해줌
		                      //출력할게 x -> 줄만 바꿈
		                      //내용없는 println : 단순 줄바꿈
		
		System.out.print("테스트4");
		
		//테스트3
		//테스트4
		
//		System.out.printf(); :  출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		System.out.println(); //위에 print 구문써서 줄바꿈해줌
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		//10 + 5 = 15
		
		System.out.println(iNum1 + "+" + iNum2 + "=" + (iNum1 + iNum2));
		//중간 오타날 일 많음
		
		
		
		/*printf 사용하는 패턴
		 * 
		 * %d : 정수형, %o : 8진수, %x : 16진수
           %c : 문자, %s : 문자열
		   %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		   %A : 16진수 실수
		   %b : 논리형
		   
		 * */
		
		//system.out.printf("패턴"만들기, 패턴에 들어갈 값 순서대로 나열 )
		
		//10+5=15
		System.out.printf("%d + %d = %d\n", iNum1, iNum2,iNum1+iNum2);
		
		//원화 표시 -> 백슬래시
		// new line : \n :  개행을 뜻하는 문자
		// \\ :  백슬래시 써야하면 두번 작성

		System.out.println("다른거");
		
		//10 + 10 * 5 / 2 = 35
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2 ,iNum1 + iNum1 * iNum2 /2);
		
		//패턴연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3); //3
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		
        //소수점 자리 제어(반올림처리)
		System.out.printf("%f\n", 10/4.0); //2.500000
		System.out.printf("%.2f\n", 10/4.0); //소수점 둘쨰자리까지만 나타내고 싶다
		System.out.printf("%.0f\n", 10/4.0 ); //소수점 아래를 표현하지 않겠다
		
		//문자 , 문자열,boolean
		boolean isTrue = false;
		char ch = '조';  //홑따옴표
		String str = "안녕하세요";  //String은 참조형/ 앞에 대문자로 시작!
		
		// false / 조 / 안녕하세요
		System.out.printf("%b/%c/%s\n", isTrue, ch, str);
		
		//escape(이스케이프 = 탈출) 문자 : 일반 문자가 아닌 특수문자 표현
		
		// \
		System.out.println("\\"); // 백슬래시(역슬래시) 출력하려면 2개 작성
		// \o/
		System.out.println("\\o/");
		
		System.out.println("a\tb\tc\td");  // \t : 띄어쓰기 / 한공간씩 표현 X, 한번에 공간차지
		
		//유니코드 이스케이프
		System.out.println("\u0041"); // A
		//유니코드(16진수)
		//65를 16진수로 표현
		//65 나누기 16 하면 몫 4, 나머지 1  --> 그래서 0041
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
