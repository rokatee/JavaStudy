/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다

사용자로부터 임의의 정수 3개를 입력받아
작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다

실행 예)
첫 번째 정수 입력 : 753
두 번째 정수 입력 : 42
세 번째 정수 입력 : 127

>> 정렬 결과 :  42 127 753
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;		//사용자가 입력할 임의의 정수를 담아둘 변수
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());		
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		/*
		//논리 연산자 비교
		if (a > b && b > c)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", c, b, a);
		}
		else if (a > c && c > b)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", b, c, a);
		}
		else if (b > a && a > c)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", c, a, b);
		}
		else if (b > c && c > a)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, c, b);
		}
		else if (c > a && a > b)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", b, a, c);
		}
		else if (c > b && b > a)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
		}
		*/
		/*
		//출력값을 한 줄로 받는 방법
		String result;		//3가지 정수의 크기 비교를 담을 변수

		if (a > b && b > c)
		{
			result = c + " " + b + " " + a;
		}
		else if (a > c && c > b)
		{
			result = b + " " + c + " " + a;
		}
		else if (b > a && a > c)
		{
			result = c + " " + a + " " + b;
		}
		else if (b > c && c > a)
		{
			result = a + " " + c + " " + b;
		}
		else if (c > a && a > b)
		{
			result = b + " " + a + " " + c;
		}
		else if (c > b && b > a)
		{
			result = a + " " + b + " " + c;
		}
		else
		{
			result = "판별 불가";
		}
			System.out.println(">> 정렬 결과 : " + result);
		*/
		

		/*
		//사칙연산을 결합해 비교하기
		String result;

		if (a - b > 0 && a - c < 0)
		{
			result = b + " " + a + " " + c;
		}
		else if (a - b < 0 && a - c > 0)
		{
			result = c + " " + a + " " + b;
		}
		else if (a - b < 0 && a - c < 0 && b - c < 0)
		{
			result = a + " " + b + " " + c;
		}
		else if (a - b < 0 && a - c < 0 && b - c > 0)
		{
			result = a + " " + c + " " + b;
		}
		else if (a - b > 0 && a - c > 0 && b - c < 0)
		{
			result = b + " " + c + " " + a;
		}
		else if (a - b > 0 && a - c > 0 && b - c > 0)
		{
			result = c + " " + b + " " + a;
		}
		else
		{
			result = "판별 불가";
		}
			System.out.println(">> 정렬 결과 : " + result);
		*/
		
		
		/*
		//2개를 비교 후 max와 min에 넣기
		int max, mid, min;
		String result;

		if (a > b)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		if (c > max)		// 여기서 중간값 나타내는 법 고민해보기
		{
			max = c;
		}
		if (c < min)
		{
			min = c;
		}
		//if (a > b)
		//{
		//	mid = a;
		//}
		//if (b > a)
		//{
		//	mid = b;
		//}
			System.out.println(">> 정렬 결과 : " + max + "mid" + min);
		*/


		//해답
		if (a > b)	//첫 번째 정수가 두 번째 정수보다 크다면
		{
			//자리 바꿈(a 와 b)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		//else if (a > c)
		if (a > c)	//첫 번째 정수가 세 번째 정수보다 크다면
		{
			//자리 바꿈(a 와 c)
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)	//두 번째 정수가 세 번째 정수보다 크다면
		{
			//자리 바꿈(b 와 c)
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);

		
		
	}
}

/*
실행 결과

첫 번째 정수 입력 : 42
두 번째 정수 입력 : 127
세 번째 정수 입력 : 753

>> 정렬 결과 :  42 127 753
계속하려면 아무 키나 누르세요...

첫 번째 정수 입력 : 753
두 번째 정수 입력 : 42
세 번째 정수 입력 : 127

>> 정렬 결과 :  42 127 753
계속하려면 아무 키나 누르세요...

첫 번째 정수 입력 : 127
두 번째 정수 입력 : 753
세 번째 정수 입력 : 42

>> 정렬 결과 :  42 127 753
계속하려면 아무 키나 누르세요...

*/