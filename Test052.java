/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
사용자로부터 임의의 두 정수를 입력받아
입력받은 두 정수 중
작은 수 부터 큰 수 까지의 합을 구하여
결과를 출력하는 프로그램을 구현한다

실행 예)
첫 번째 정수 입력 : 100
두 번째 정수 입력 : 200
>> 100 ~ 200 까지의 합 : xxxx
>> 1 ~ 100 까지의 합 : 5050
계속하려면....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int n;				// 루프 변수로 활용할 변수
		int su1, su2;		// 사용자 입력값을 담아낼 변수
		int result = 0;		// 누적합을 담아낼 변수
		
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		//입력받은 두 수의 크기 비교 및 자리 바꿈
		//즉, su1이 su2보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (su1 > su2)
		{
			//자리 바꿈
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 입력받은 작은 수가 필요한데...
		// 그 수를 반복 과정에서 사용하게 되면
		// 원래의 값을 확인할 수 없기 때문에...)
		
		n = su1;

		while (n <= su2)
		{
			result += n;
			n++;
		}
		
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2, result);
		*/


		
		int n1, n2;
		int sum = 0;
		int a;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		
			
		if (n1 <= n2)
		{
			a = n1;

			while (a <= n2)
			{
				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d 까지의 합 : %d\n",n1, n2, sum);
		}
		else if(n2 < n1)
		{
			a = n2;
			while (a < n1)
			{
				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d 까지의 합 : %d\n",n2, n1, sum);
		}
			

			
			//int min, max;		//두 수 비교해줄 변수
			//int n;				//루프변수
			//int a,b;			//사용자 입력값 변수
			//int result = 0;		//누적합 변수

			//System.out.print("첫 번째 정수 입력 : ");
			//su1 = Integer.parseInt(br.readLine());
			//System.out.print("두 번째 정수 입력 : ");
			//su2 = Integer.parseInt(br.readLine());

			//if (a > b)
			//{
			//	min = b;
			//	max = a;
			//}
			//while ()
			//{
			//	
			//}
			
	}
}

/*
실행 결과

첫 번째 정수 입력 : 100
두 번째 정수 입력 : 1
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 2
두 번째 정수 입력 : 101
>> 2 ~ 101 까지의 합 : 5150
계속하려면 아무 키나 누르십시오 . . .
*/