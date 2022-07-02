/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 자바 기본 입출력 : System.in.read()
*/

/*
	System.in.read() 메소드는 (입력 대기열로부터) 한 문자만 가져온다
	단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
	ASCII Code 값으로 반환한다
*/

/*
실행 예)
	한 문자 입력		: A
	한 자리 정수 입력	: 5

	>> 입력한 문자 : A
	>> 입력한 정수 : 5
	계속하려면 아무 키나 누르세요...
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char ch;			// 문자
		int a;
					
					// 연산 및 처리
					//System.out.print("문자 하나 입력하세요 : ");
					/*
					ch = System.in.read();		//하나의 문자를 ASCII Code 값으로 반환한다
					// A를 입력한다면,
					ch = 65;
					ch = int
					char = int					//형 변환 규칙에 위반
					*/

					//ch = (char)System.in.read();

					// 결과 출력
					//System.out.println(ch);
					

		//연산 및 처리

		//문자
		//사용자에게입력 요구
		System.out.print("문자 하나 입력하세요 : ");		//A를 입력 후 엔터를 누름
		//문자 도출											//A와 엔터값인 \r 을 입력 대기열에 감
		ch = (char)System.in.read();						//A를 가져옴

		//정수
		//사용자에게 입력 요구
		System.out.print("정수 하나 입력하세요 : \n");
		//정수 도출
		a = System.in.read();								//여기서 \r 을 가져옴, 그래서 자동으로 넘어감

		//결과 출력
		//System.out.printf("\n>> 입력한 문자 : %s\n", ch);
		//System.out.printf(">> 입력한 정수 : %d\n", a);
		System.out.println("\n>> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 정수 : " + a);
	}
}