/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- break 실습
*/

/*
break 키워드가 지니는 의미
멈춘다 + 그리고 빠져나간다

다음과 같은 처리가 이루어지는 프로그램을 구현한다
단, 입력받는 정수는 1 ~ 100 범위 안에서만
가능하도록 작성한다

실행 예)

임의의 정수 입력 : -10
임의의 정수 입력 : 0
임의의 정수 입력 : 2022
임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까(Y/N)? : N
계속하려면...


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;			// 사용자 입력값
		int sum;		// 누적합
		int i;			// 루프 변수
		char ch;		// 계속 할건지 물어보기 위한 변수

		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());		
			}
			while (n < 1 || n > 100);
			
			sum = 0;	// 누적합 초기화

			for (i = 0; i <= n; i++)
			{
				sum += i;
			}

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			System.in.skip(2);

			if (ch != 'y' && ch != 'Y')
			{
				break;
			}
		}
	}
}

/*
실행 결과


*/