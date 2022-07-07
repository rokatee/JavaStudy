/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
실행 예)
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면....

*/

public class Test047
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int a = 1;							// 1부터 100까지 1씩 증가할 정수를 담을 변수
		
		//int sum, odd, even;				// 각각 초기화 하든, 한 번에 초기화 하든 같은 구문이다.
		//sum = odd = even = 0;				// 0을 even에 담고, 그 후 odd에 담고, 그 후 sum에 담는다
		int sum = 0, even = 0, odd = 0;		// 1부터 100까지 정수, 짝수, 홀수 각각의 합을 담을 변수

		//연산 및 처리
		while (a <= 100)
		{
			sum += a;						// 홀짝으로 걸러지기 전에 a의 누적값을 먼저 더해준다

			if (a % 2 == 0)					// a 가 짝수일 경우
				even += a;
			else if (a % 2 != 0)			// a 가 짝수일 경우
				odd += a;
			else
			{
				System.out.println("판별 불가 데이터");
				return;					// 메소드 → 종료 main() → 메소드 종료 → 프로그램 종료
			}
			
			a++;
		}
		
		// 결과 출력
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);

	}
}

/*
실행 결과

1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/