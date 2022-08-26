/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 실수형 데이터 타입의 정밀도 테스트 실습
*/


public class Test020
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		float a = 0;
		double b = 0;
		

		//연산 및 처리 → 반복문 구성 10만 번 반복
		for (int i = 1; i <= 100000; i++)
		{
			//System.out.println("반복출력");		//10번 출력
			a += 100000;	//a를 10만 만큼 증가시켜라
			b += 100000;	//b를 10만 만큼 증가시켜라
		}


		//결과 출력
		System.out.println("float  a : " + (a/100000));
		System.out.println("double b : " + (b/100000));
		
		


	}
}


/*
실행 결과

float  a : 99996.055
double b : 100000.0
계속하려면 아무 키나 누르십시오 . . .

*/