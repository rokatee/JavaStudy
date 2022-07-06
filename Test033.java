/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다

홀수, 짝수 → 단일 if 구문
홀수, 짝수, 0 → if 문 중첩
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num == 0)		// 0부터 판별하는 이유 → 0 % 2 == 0 이기 때문에
		{					// 짝수에도 걸러지므로 (num % 2 == 0) 보다 먼저 판별해야 한다
			System.out.printf(">> %d은(는) 0 입니다.\n", num);
		}
		else if (num % 2 == 0)
		{
			System.out.printf(">> %d은(는) 짝수 입니다.\n", num);
		}
		else //if (num % 2 != 0)
		{
			System.out.printf(">> %d은(는) 홀수 입니다.\n", num);
		}



		// 다른 해답
		String result = "판정 불가";

		if (num == 0)
		{
			result = "0";
		}
		else if (num % 2 == 0)
		{
			result = "짝수";
		}
		else if (num % 2 != 0)
		{
			result = "홀수";
		}
		//else
		//{
		//	result = "판정 불가";	//여기서 써주거나 위의 결과 변수에 먼저 담아주거나
		//}

		System.out.println(num + " → " + result);
	}
}

/*
실행 결과

정수 입력 : 0
>> 0은(는) 0 입니다.


정수 입력 : 1
>> 1은(는) 홀수 입니다.


정수 입력 : 2
>> 2은(는) 짝수 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/