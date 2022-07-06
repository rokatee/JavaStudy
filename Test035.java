/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다


<<과제>>
사용자로부터 임의의 연도를 입력받아
입력받은 연도가 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다
단, 입력은 BufferedReader 를 활용하고,
if 조건문을 활용하여 연산을 수행할 수 있도록 한다


실행 예)
임의의 연도 입력 : 2000
2000 → 윤년

임의의 연도 입력 : 2012
2012 → 윤년

임의의 연도 입력 : 2022
2022 → 평년


<<윤년의 판별 조건>>
4의 배수 이면서 100의 배수가 아니면 윤년(29일)
400의 배수면 윤년(29)
나머지 평년(28)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;	// 사용자가 입력할 연도를 담을 변수

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		// 조건문 → 4의 배수이면서 100의 배수가 아님, 400의 배수
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.printf("%d → 윤년\n", year);
		}
		else	// 나머지는 평년
		{
			System.out.printf("%d → 평년\n", year);
		}

		// 다른 방법
		String result;	// 평년인지 윤년인지 결과를 담을 변수

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			result = "윤년\n";
		}
		else
		{
			result = "평년\n";
		}

		System.out.println(year2 + " → " + result);
	}
}