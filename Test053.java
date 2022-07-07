/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
<<과제>>
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 그 정수까지의 (1 ~ num)
전체 합과 짝수의 합과 홀수의 합을
각각 결과값으로 출력하는 프로그램을 구현한다

실행 예)
임의의 정수 입력 : 284
>> 1 ~ 284 까지 정수의 합 : xxxx
>> 1 ~ 284 까지 짝수의 합 : xxxx
>> 1 ~ 284 까지 홀수의 합 : xxxx
계속하려면...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;					//사용자 입력값 담을 변수
		int result = 0;			//정수의 합을  담을 변수
		int even = 0, odd = 0;	//홀짝의 합을  담을 변수
		int a = 0;				//루프 변수
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		while (a <= n)				// 루프 변수를 입력값만큼 증가 시키며 반복문 수행
		{
			result += a;			// 먼저 정수값(1~입력값 모두) 정수합 변수에 담아 더하기
			
			if (a % 2 == 0)			// 입력값이 2로 나누어 떨어지면
			{
				even += a;			// 짝수의 합을 담을 변수에 넣어 더하기
			}
			else if (a % 2 != 0)	// 입력값이 2로 나누어 떨어지지 않는다면
			{
				odd += a;			// 홀수의 합을 담을 변수에 넣어 더하기
			}
			else
			{
				System.out.printf("판별 불가 데이터\n");
				return;				// 판별 불가능할 때, 프로그램 종료할 return
			}
			a++;					// 반복문 진행을 위한 증가 연산자
		}
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n",n, even);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n",n, odd);
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n",n, result);
	}
}

/*
실행 결과

임의의 정수 입력 : 10
>> 1 ~ 10 까지 짝수의 합 : 30
>> 1 ~ 10 까지 홀수의 합 : 25
>> 1 ~ 10 까지 정수의 합 : 55
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 284
>> 1 ~ 284 까지 짝수의 합 : 20306
>> 1 ~ 284 까지 홀수의 합 : 20164
>> 1 ~ 284 까지 정수의 합 : 40470
계속하려면 아무 키나 누르십시오 . . .
*/