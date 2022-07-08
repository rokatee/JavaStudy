/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- continue 실습
*/

/*
continue 키워드가 지니는 의미
(뒷부분 무시하고) + 계속해라

continue 를 활용하여
다음과 같이 출력될 수 있도록 프로그램을 구현한다

실행 예)

1~100 중에 홀수만 연산에 가담하고 출력도 홀수들만 한다

1	: 1
3	: 4
5	: 9
7	: 16
  :
  :
99	: 2500
*/

public class Test066
{
	public static void main(String[] args)
	{
		int a;			//사용자 입력값
		int i;			//루프변수
		int sum = 0;	//누적값
		
		
		//for 문으로 
		for (i = 1; i <= 100; i+=2)
		{
			if (i % 2 == 0)		// i를 2로 나누었을 때 나머지가 0이 아니면 홀수
				continue;		// 아래 코드를 실행하지 않고 건너뜀
			sum+=i;
			System.out.printf("%d : %d\n", i, sum);
		}
		
		//while 문으로 
		/*
		i = 0;
		while (i < 100)			// i가 100보다 작거나 같을 때 반복, 1부터 100까지 증가하면서 100번 반복
		{
			i++;				// i를 1씩 증가시킴
			if (i % 2 == 0)		// i를 2로 나누었을 때 나머지가 0이 아니면 홀수
				continue;		// 아래 코드를 실행하지 않고 건너뜀
			sum+=i;
			System.out.printf("%d : %d\n", i, sum);
		}
		return;
		*/
	}
}

/*
실행 결과


*/