/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
1/2 + 2/3 + 3/4 + 4/5 + ... + 9/10
의 연산 처리 결과를 출력하는 프로그램을 구현한다

실행 예)
연산 결과 : xxx
*/

/*
문제 파악 및 분석
a1/a2 + a2/a3 + a3/a4 + ... + a9/a10
a1/a1+1 + a2/a2+1 + a3/a3+1 + ... + a9/a9+1

a1/b1 + a2/b2 + a3/b3 + ... + a9/b9
연산 결과 : xxx ( ← 실수 형태 기반 연산)
*/

public class Test049
{
	public static void main(String[] args)
	{
		/*
		// 주요 변수 선언 및 초기화
		int a = 1, b = 2;
		double c = 0;
		double result = 0;
		
		// 연산 및 처리
		while (a <= 9 && b <= 10)
		{
			c = (double)a / b;
			result += c;
			a++;
			b++;
		}
		
		// 결과 출력
		System.out.printf("연산 결과 : %f\n", result);
		System.out.printf("연산 결과 : %.2f\n", result);
		System.out.println("연산 결과 : " + result);
		*/


		/*
		int a = 1;
		double b = 0;
		double result = 0;

		while (a <= 9)
		{
			b = (double)a / (a+1);
			result += b;
			a++;
		}

		System.out.printf("연산 결과 : %.2f\n", result);
		*/

		int n = 0;			// 1부터 1씩 증가하게 될 변수
		double sum = 0;		// 누적합으 담아낼 변수(실수 형태로 처리)

		while (n <= 8)
		{
			// 증감식 구성
			// 최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠가 되는 구문
			n++;
			sum +=(double)n / (n + 1);
			// 1.0/2  2.0/3   3.0/4.....9.0/10
			// 정수 기반 나눗셈 연산은 몫을 반환하기 때문에
			// 실수 기반 연산을 수행하도록 처리하기 위해서
			// 나눗셈 연산자를 중심으로 피연산자 중 하나를
			// 실수 형태로 만들어주는 것이 중요하다.
		}
		// 결과 출력
		System.out.println("연산 결과 : " + sum);
	}
}

/*
실행 결과

연산 결과 : 7.071031746031746
계속하려면 아무 키나 누르십시오 . . .
*/