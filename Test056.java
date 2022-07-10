/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(do~while문) 실습
*/

/*
사용자로부터 여러 개의 양의 정수를 입력받고,
그 합을 계산하여 출력하는 프로그램을 작성한다
단, -1 이 입력되는 순간 입력 행위를 중지하고
그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다
즉, -1 을 입력 중지 커맨드로 활용한다
do~while 문을 활용하여 문제를 해결할 수 있도록 한다

실행 예)
1 번째 정수 입력(-1 종료) : 0
2 번째 정수 입력(-1 종료) : 10
3 번째 정수 입력(-1 종료) : 10
4 번째 정수 입력(-1 종료) : 10
5 번째 정수 입력(-1 종료) : -1
현재까지 입력된 정수의 합 : 30

현재까지 입력된 정수의 합 : 11
계속하려면...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;				// 사용자 입력값을 담을 변수
		int sum = 0;		// -1이 입력되기 전까지 입력된 정수의 합
		int n = 1;
		
		// 연산 및 처리
		// do~while 문
		do
		{
			System.out.print(n + " 번째 정수 입력(-1 종료) : ");
			a = Integer.parseInt(br.readLine());
			sum += a;		// 입력된 정수의 합을 담는다
			n++;
		}
		while (a != -1);	// -1이 아닌 숫자가 오면 계속 반복

		// 확인(테스트)
		//System.out.println("-1 입력 시 종료되는 것 확인 : ");
			   
		// 결과 출력
		System.out.println("현재까지 입력된 정수의 합 : " + (sum+1));
		// 마지막 입력된 -1을 연산에 포함시키지 않기 위해 1을 더함
	}
}

/*
실행 결과

1 번째 정수 입력(-1 종료) : 0
2 번째 정수 입력(-1 종료) : 10
3 번째 정수 입력(-1 종료) : 10
4 번째 정수 입력(-1 종료) : 10
5 번째 정수 입력(-1 종료) : -1
현재까지 입력된 정수의 합 : 30
계속하려면 아무 키나 누르십시오 . . .
*/