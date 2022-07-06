/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다

사용자로부터 임의의 정수를 입력받아
다음과 같은 판별 결과를 출력하는 프로그램을 구현한다

2의 배수 / 3의 배수 / 2와 3의 배수 / 2와 3의 배수 아님

실행 예)
임의의 정수 입력 : 4
4 → 2의 배수

임의의 정수 입력 : 9
9 → 3의 배수

임의의 정수 입력 : 12
12 → 2와 3의 배수

임의의 정수 입력 : 17
17 → 2와 3의 배수 아님

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num;

			System.out.print("임의의 정수 입력 : ");
			num = Integer.parseInt(br.readLine());

			if (num == 0)
			{
				System.out.printf("%d → 0\n", num);
			}
			else if (num % 2 == 0 && num % 3 == 0)
			{
				System.out.printf("%d → 2와 3의 배수\n", num);
			}
			else if (num % 3 == 0)
			{
				System.out.printf("%d → 3의 배수\n", num);
			}
			else if (num % 2 == 0)
			{
				System.out.printf("%d → 2의 배수\n", num);
			}
			else if (num % 2 != 0 && num % 3 != 0)						// 여기는 거르고 난 뒤 나머지만 남았기에
			{															// 조건부를 안 붙여도 되지만
				System.out.printf("%d → 2와 3의 배수 아님\n", num);	// 문제 안에서 제시하는 부분은
			}															// 되도록이면 else if 안에 조건부로 달고
																		// else는 "판별 불가" 와 같은 조건부로 넣자
			
			
			// 다른 해답
			String result = "판별 불가";
			if (num == 0)
			{
				result = "0";
			}
			else if (num % 2 != 0 && num % 3 != 0)
			{
				result = "2와 3의 배수 아님";
			}
			else if (num % 2 == 0 && num % 3 == 0)
			{
				result = "2와 3의 배수";
			}
			else if (num % 3 == 0)
			{
				result = "3의 배수";
			}
			else if (num % 2 == 0)
			{
				result = "2와 배수";
			}
			//else
			//{
			//	result = "판별 불가";
			//}

			System.out.println(num + " → " + result);

		}
}

/*
실행 결과

임의의 정수 입력 : 4
4 → 2의 배수
4 → 2와 배수


임의의 정수 입력 : 9
9 → 3의 배수
9 → 3의 배수


임의의 정수 입력 : 12
12 → 2와 3의 배수
12 → 2와 3의 배수


임의의 정수 입력 : 17
17 → 2와 3의 배수 아님
17 → 2와 3의 배수 아님

계속하려면 아무 키나 누르십시오 . . .
*/