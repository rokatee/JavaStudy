/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 변수와 자료형 실습 및 테스트 : char
*/

public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3, ch4;		// 변수명 뒤쪽엔 숫자 가능
		int a;

		// 연산 및 처리 (대입 연산)
		ch1 = 'A';

		ch2 = '\n';		
		// 개행 문자라 결과에 공백으로 나옴
		// 문자열의 경우 한 글자만 가능하나, \n 의 경우 하나의 문자열로 봄

		ch3 = '\\';
		// '\'를 출력하고자 할 땐 \\(역슬래쉬 2개) 를 사용하라

		ch4 = '대';

		//a = ch1;		
		// 컴파일 에러 안나는 이유?
		// 1. 우리 눈엔 문자('A')로 보이지만, 아스키코드로 넘어감('A' = 65)
		// 2. 자동 형 변환 (char → int)

		a = (int)ch1;
		// 명시적 형 변환(강제 형 변환)

		//System.out.printf("%c, %c, %c, %c, %d%n", ch1, ch2, ch3, ch4, a);


		// 결과 출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
		System.out.println("a : " + a);
	} 
}


/*
A,
, \, 대, 65
ch1 : A
ch2 :

ch3 : \
ch4 : 대
a : 65
*/