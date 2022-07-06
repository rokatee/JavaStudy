/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다


<<과제>>
사용자로부터 임의의 문자를 하나 입력받아
대문자이면 소문자로, 소문자이면 대문자로
알파벳이 아닌 기타 문자이면 입력오류 처리하는
프로그램을 구현한다

실행 예)
한 문자 입력 : A
>> A → a

한 문자 입력 : b
>> b → B

한 문자 입력 : 3
>> 입력 오류
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char x;

		System.out.print("한 문자 입력 : ");
		x = (char)System.in.read();


		//소문자 x >= 97 && x <= 122
		//대문자 x >= 65 && x <= 90
		if (x >= 65 && x <= 90)
		{
			System.out.println(">> " + x + " → " + (char)(x + 32));
		}
		else if (x >= 97 && x <= 122)
		{
			System.out.println(">> " + x + " → " + (char)(x - 32));
		}
		else
		{
			System.out.print(">> 입력 오류\n");
		}
	}
}

/*
실행 결과

한 문자 입력 : L
>> L → l

한 문자 입력 : o
>> o → O

한 문자 입력 : v
>> v → V

한 문자 입력 : E
>> E → e

한 문자 입력 : ♡
>> 입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/