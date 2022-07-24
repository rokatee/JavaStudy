/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가 소수인지 아닌지를 판별하여
결과를 출력하는 프로그램을 구현한다

소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
		나누어 떨어지지 않는 수

실행 예)
임의의 정수 입력 : 10
10 → 소수아님

임의의 정수 입력 : 11
11 → 소수

계속하려면....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;		// 사용자로부터 입력받을 임의의 정수
		
		int n = 2;		// 입력값을 대상으로 나눗셈 연산을 수행할 변수
						// 2 부터 시작해서 1씩 증가
						// ex) 입력값 27 -> n:2 3 4 5 6 7 ...26
		
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		// 어떤 값을 입력받은 상태인지 알 수 없지만
		// 이 입력 값을 소수로 간주한다
		//String result = "소수";
		boolean flag = true;		//num(사용자 입력값)은 소수일 것이다
		
		while (n < num)
		{
			//테스트
			//System.out.println("반복문 수행");

			// 확인 연산
			// n으로 num이 나누어 떨어지는지 확인
			if (num % n == 0)	//num이 n으로 나누어 떨어지면
			{
				flag = false;	//소수가 아님
				break;			//멈춘다(+그리고 빠져나간다)
			}					// → break 를 감싸는 가장 가까운 반복문
			n++;
		}
		// 결과 출력
		// 결과 출력 전 수행해야 할 추가 확인 → 1 인지 아닌지에 대한 추가 검토
		if (flag && num != 1)
		{
			//최종적으로 소수
			System.out.printf("%d → 소수\n", num);
		}
		else
		{
			//최종적으로 소수 아님
			System.out.printf("%d → 소수 아님\n", num);
		}
		
		
		

		
		int a;		// 사용자로부터 입력받을 임의의 정수
		int n = 2;	// 루프 숫자
		String result = "소수";

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		//연산 및 처리
		if (a == 1)
		{
				result = "소수 아님";
		}
		while (n < a)
		{
			if (a % n == 0)		// num가 자신보다 작은 수인 a로 나눠진다면 소수가 아님
			{					// 왜나면 소수는 1과 자기 자신으로만 나누어지기 때문
				result = "소수 아님";
			}
			n++;
		}
		System.out.printf("%d → %s\n", a, result);
		







		//오답 코드

		// 연산 및 처리
		//2 3   5 7 11 13 17 19 23
		// 1 2   2 4  2  4  2  4	
		//String result;
		/*
		while ()	//a는 이미 정해진 수이기 때문에 범위를 정할 필요 없다
		{
			if (a % 1 == 0 || a % a == 0)
			{
				System.out.printf("%d → 소수", a);
			}
			else if (a % 1 != 0 || a % a != 0)
			{
				System.out.printf("%d → 소수 아님", a);
			}
			else
			{
				System.out.printf("판별 불가 데이터");
			}
			
		}
		*/
	}
}

/*
실행 결과

임의의 정수 입력 : 10
10 → 소수아님

임의의 정수 입력 : 11
11 → 소수

임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/