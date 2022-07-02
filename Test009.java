/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 변수와 자료형 실습 및 테스트 : double
	- 나눗셈 연산 실습
*/

public class Test009
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1 / 2;
		// 8바이트 실수를 취하는 데이터 타입을 가진 더블은 
		// 정수와 정수의 나눗셈의 경우 몫의 값만 취한다.
		// → double a = 0;

		System.out.println("double a : " + a);
		// → double a : 0.0

		double b = (double)1 / 2;
		//우선순위 연산으로 인해 (double)1 이 먼저 처리 된다
		//double b = 1.0 / 2;	// 실수와 정수의 나눗셈이므로 실수로 표현 됨


		//double b = (double)0;
		System.out.println("double b : " +b);
		// → double b : 0.5


		double c = 1/2 + 1/2;
		//double c = 0 + 1/2;
		//double c = 0 + 0;
		//double c = 0;
		System.out.println("double c : " + c);
		// → double c = 0.0

		
	
		//피 연산자로 실수가 포함되어 있는 나눗셈 연산
		double d = 1 / 2.0;
		System.out.println("double d : " + d);
		// → double d = 0.5
		/*
		나눗셈 연산과 관련하여 
		피 연산자 중 실수가 하나라도 포함되어 있다면 
		연산은 실수 기반의 연산이 수행되며 
		결과값 또한 실수 형태로 반환된다
		*/


		double e = 3/2 + 1/2;
		//double e = 1 + 1/2;
		//double e = 1 + 0;
		//double e = 1;
		System.out.println("double e : " + e);
		// → double e = 1.0


		double f = 3/2 + 1/2.0;
		//double f = 1 + 1/2.0;
		//double f = 1 + 0.5;
		//double f = 1.5;
		System.out.println("double f : " + f);
		// → double f = 1.5

	}
}