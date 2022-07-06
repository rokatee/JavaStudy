/*
■■■ 연산자(Operator) ■■■
	- 조건 연산자 == 삼항 연산자
*/

/*
사용자로부터 임의의 연도를 입력받아
입력받은 연도가... 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다
단, 입력은 BufferedReader 를 활용하고
조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.
*/

/*
실행 예)
임의의 연도 입력 : 2000
2000 → 윤년

임의의 연도 입력 : 2012
2012 → 윤년

임의의 연도 입력 : 2022
2022 → 평년
*/

/*
<<윤년의 판별 조건>>
4의 배수 이면서 100의 배수가 아니면 윤년(29일)
400의 배수면 윤년(29)
나머지 평년(28)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;			// 사용자가 입력할 년도를 담을 변수
		String strResult;	// (윤년인지 평년인지) 판별 결과를 담을 변수

		//연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		//			연도가 4의 배수	  연도가 100의 배수가 아님		연도가 400의 배수
		//strResult = year % 4 == 0 && year % 100 != 0 ? "윤년" : year % 400 == 0 ? "윤년" : "평년";
		strResult = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		// 삼항 연산자 중첩 필요 없다!!

		System.out.println(year + " → " + strResult);
	}
}

/*
실행 결과

임의의 연도 입력 : 2000
2000 → 윤년

임의의 연도 입력 : 2012
2012 → 윤년

임의의 연도 입력 : 2022
2022 → 평년
계속하려면 아무 키나 누르세요...
*/