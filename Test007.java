/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 변수와 자료형 실습 및 테스트 : boolean
*/

public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		boolean a = true;	//boolean a = "true";
		boolean b;

		int c = 10, d = 5;


		// 연산 및 처리 (관계 연산 및 대입 연산)
		b = 200 > c;	// true
		//b = c < d;	// false
		//b = 10 < 5;	// false
		//b = false;	// false


		// 결과 출력
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}
}