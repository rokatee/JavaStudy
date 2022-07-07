/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(while문) 실습
*/

/*
사용자로부터 원하는 단(구구단)을 입력받아
해당하는 구구단을 출력하는 프로그램을 구현한다
단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.

실행 예)
원하는 단(구구단) 입력 : 5
5 * 1 = 5
5 * 2 = 10
  :
5 * 9 = 45
계속하려면...


원하는 단(구구단) 입력 : 11
1 ~ 9 사이의 숫자만 입력 가능합니다
계속하려면...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dan;	//사용자가 입력할 구구단 값 변수 (단)
		//int result;	//각 단의 곱셈 결과 변수
		int n = 0;	//루프 변수

		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());
		
		// 구구단을 벗어나는 숫자 입력시 처리를 우선한다
		if (dan < 1 || dan > 9)
		{
			System.out.println("1 ~ 9 사이의 숫자만 입력 가능합니다");
			return;
		}
		
		//결과 출력(반복 출력)
		while (n < 9)
		{
			if (n < 9)
			{
				//result = dan * n;
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
		}
	}
}

/*
실행 결과

원하는 단(구구단) 입력 : 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
계속하려면 아무 키나 누르십시오 . . .


원하는 단(구구단) 입력 : 11
1 ~ 9 사이의 숫자만 입력 가능합니다
계속하려면 아무 키나 누르십시오 . . .
*/