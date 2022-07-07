/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
1부터 100까지의 정수 중에서
짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다
그리고 결과값을 출력하는 프로그램을 구현한다
단, 반복문은 while 문을 사용할 수 있도록 하며,
조건 구문은 if 조건문을 사용하여 작성할 수 있도록 한다

실행 예)
1부터 100까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면....

*/

public class Test046
{
	public static void main(String[] args)
	{
		/*
		// 주요 변수 선언 및 초기화
		int a = 1;				// 1부터 100까지 1씩 증가할 변수
		int even = 0, odd = 0;	// 홀짝들의 누적합을 담을 변수
		
		// 연산 및 처리
		while (a <= 100)
		{
			if (a % 2 ==0)		// n이 짝수일 경우
				even += a;		
			else if(a % 2 !=0)	// n이 홀수일 경우
				odd += a;
			else
			{
				System.out.println("판별 불가 데이터");
				return;			// 메소드 → 종료 main() → 메소드 종료 → 프로그램 종료
			}	

			a++;
		}
		*/
		
		int a = 0;
		int even = 0, odd = 0;

		while (++a <= 100)
		{
			if (a % 2 ==0)
				even += a;
			else if(a % 2 !=0)
				odd += a;
			else
			{
				System.out.println("판별 불가 데이터");
				return;			// 메소드 → 종료 main() → 메소드 종료 → 프로그램 종료
			}
		}
		
		// 결과 출력
		System.out.println("1부터 100까지의 정수 중");
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
	}
}

/*
실행 결과

1부터 100까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/