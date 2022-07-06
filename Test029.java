/*
■■■ 연산자(Operator) ■■■
	- 조건 연산자 == 삼항 연산자
*/

/*
사용자로부터 임의의 문자 하나 입력받아
대문자이면 소문자로, 소문자이면 대문자로
알파벳이 아닌 기타 문자라면 그 문자 그대로 출력하는
프로그램을 구현한다

실행 예)
한 문자 입력 : A
A → a

한 문자 입력 : b
b → B

한 문자 입력 : 1
1 → 1
계속하려면 아무 키나 누르세요...

*/

/*
문제 인식 및 파악
(알파벳 대문자 인가) ? 참(알파벳 소문자로 변환) : (거짓)[(알파벳 소문자인가) ? 참(알파벳 대문자로 변환) : 거짓(문자 그대로 출력)]
												  --------------------------	-----------------------	  -----------------------
																1							2							3
--------------------	-----------------------	  -------------------------------------------------------------------------------
		1							2														3

*/

import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		/*
		char temp;
		int b;
		String c;

		// 연산 및 처리
		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();
		System.in.skip(2);
		System.out.println("변화 전 : " + temp);
		


		// 122>=소문자 && 소문자>=97 
		// 90>=대문자 && 대문자>=65

		c = (a <= 90 && a >= 65) ? a += 32 : (a <= 122 && a >= 97) ? a -=32 : "문자";

		
		// 결과 출력
		System.out.printf("%c → %c\n",a, c);
		*/

		
		// 해답
		
				// 주요 변수 선언
				
				/*
				char temp;
				System.out.print("한 문자 입력 : ");
				temp = (char)System.in.read();

				//System.out.println("입력받은 값 확인 : " + temp);			//temp값 전달 되는 거 확인


				// 아스키 코드 값
				// 범위 → 대문자 >= 65 && 대문자 <= 90
				//	    → 소문자 >= 97 && 소문자 <= 122
				// 대문자인지 대문자 아닌지 파악
					//String result = (temp >= 65  && temp <=90) ? "대문자" : "대문자 아님";
					// → 비교 구문에서 char와 int 비교 시 char는 int로 변환해서 비교 됨
					// → 2개 이상의 조건이 등장하면 무조건 논리연산자
					String result = (temp >= 'A' && temp <='Z') ? "대문자" : "대문자 아님";
					// → 문자와 비교 했지만 char가 int로 변환되어 비교 됨
					System.out.println("결과 : " + result);
				*/
				
				// "대문자 → 소문자" or "소문자 → 대문자" 바꾸는 방법 고민
				// 'A'(65) → 'a'(97) ===> +32
				// 'a'(97) → 'A'(65) ===> -32

				char ch, result;	//ch 사용자 입력값
									//result 결과값 → 한 자리 문자값을 결과로 보여야 하므로 result도 char
				System.out.print("한 문자 입력 : ");
				ch = (char)System.in.read();

				//result = (입력값 대문자) ? (소문자로 변환) : ((입력값 소문자 ? 대문자로 변환 : 그대로 출력));
				result = (ch >= 'A' && ch <= 'Z') ? ((char)(ch + 32)) : (ch >= 'a' && ch <= 'z') ? ((char)(ch - 32)) : (char)ch;

				//System.out.printf("%c → %c\n", ch, result); 
				System.out.println(ch + " → " + result); 
	}
}

/*
실행 결과

한 문자 입력 : a
a → A

한 문자 입력 : A
A → a

한 문자 입력 : 1
1 → 1
계속하려면 아무 키나 누르십시오 . . .

*/