/*
■■■ 연산자(Operator) ■■■
	- 조건 연산자 == 삼항 연산자
*/

/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가 양수인지 음수인지 0인지 구분하여
이 결과를 출력하는 프로그램을 구현한다
단, 입력 데이터는 BufferedReader 를 활용하고
조건 연산자(삼항 연산자)를 활용하여 기능을 구현할 수 있도록 한다

실행 예)
임의의 정수 입력 : -12
-12 → 음수

임의의 정수 입력 : 257
257 → 양수

임의의 정수 입력 : 0
0 → 0
계속하려면 아무 키를 누르세요....

힌트 : 조건 연산자 중첩
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n;				//사용자가 입력할 임의의 정수
		String strResult;	//사용자로부터 입력받은 임의의 정수의 판별을 위한 변수(음수,양수,0)


		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		//strResult = (n > 0) ? "양수" : "음수";				// 삼항 연산자는 맨 아래 삼항 연산자만 읽음
		//strResult = (n == 0) ? "0" : "0이 아닌 수";			// 결과값이 3가지가 나오게 하려면
		strResult = (n == 0) ? "0" : (n > 0) ? "양수" : "음수";	// 삼항 연산자 중첩을 해야 함
		//			________ ?_____: ___________________________
		//			  수식1	  수식2				수식3
		//							  _______? _______: _______
		//							   수식1	수식2	 수식3

				// 이렇게도 가능
				//strResult = (n > 0) ? "양수" : (n < 0) ? "음수" : "0";
				
				// 양수일 경우
				// strResult = n = 5
				// strResult = (5 > 0) ? "양수" : (n < 0) ? "음수" : "0";
				// strResult = (5 > 0) ? "양수"
				// strResult = "양수"
				
				// 음수일 경우
				// strResult = n = -5
				// strResult = (-5 > 0) ? "양수" : (n < 0) ? "음수" : "0";
				// strResult =					   (-5 < 0) ? "음수" : "0";
				// strResult =					   (-5 < 0) ? "음수"
				// strResult = "음수"

				// 0 일경우
				//strResult = n = 0
				//strResult = (0 > 0) ? "양수" : (n < 0) ? "음수" : "0";		
				//strResult =					 (0 < 0) ? "음수" : "0";		
				//strResult =					 (0 < 0) ?		  : "0";		
				//strResult = "0";		



		// 결과 출력

		System.out.println();
		System.out.println("===[판별결과]===");
		System.out.printf("%d → %s\n", n, strResult);
		System.out.println("================");

	}
}


/*
실행 결과

임의의 정수 입력 : 10

===[판별결과]===
10 → 양수
================


임의의 정수 입력 : -23

===[판별결과]===
-23 → 음수
================


임의의 정수 입력 : 0

===[판별결과]===
0 → 0
================
계속하려면 아무 키나 누르십시오 . . .
*/