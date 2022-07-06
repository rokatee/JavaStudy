/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다


<<과제>>
사용자로부터 임의의 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음일 경우만
결과를 출력하는 프로그램을 구현한다.
단, 대소문자를 모두 적용할 수 있도록 처리한다
또한 알파벳 이외의 문자가 입력되었을 경우
입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다

실행 예)
임의의 알파벳 한 문자 입력 : a
>> a → 모음
계속하려면 아무 키나 누르세요....

임의의 알파벳 한 문자 입력 : E
>> E → 모음
계속하려면 아무 키나 누르세요....

임의의 알파벳 한 문자 입력 : f		//자음일 땐 아예 아무것도 출력 안되도록
계속하려면 아무 키나 누르세요....

임의의 알파벳 한 문자 입력 : T
계속하려면 아무 키나 누르세요....

임의의 알파벳 한 문자 입력 : 1
>> 입력오류
계속하려면 아무 키나 누르세요....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char x;

		System.out.print("임의의 알파벳 한 문자 입력 : ");
		x = (char)System.in.read();
		
		//모음		'A' 'E' 'I' 'O' 'U'
		//대문자	65	69	73	79	85
		//모음		'a'	'e'	'i'	'o'	'u' 
		//소문자	97	101	105	111	117
		if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
		{
			System.out.println(">> " + x + " → 모음");
		}
		else if (x >= 65 && x <= 90 || x >= 97 && x <= 122)
		{
			System.out.print("");
		}
		else
		{
			System.out.println(">> 입력 오류");
		}
	}
}

/*
실행 결과
임의의 알파벳 한 문자 입력 : F

임의의 알파벳 한 문자 입력 : R

임의의 알파벳 한 문자 입력 : I
>> I → 모음

임의의 알파벳 한 문자 입력 : D

임의의 알파벳 한 문자 입력 : A
>> A → 모음

임의의 알파벳 한 문자 입력 : Y

임의의 알파벳 한 문자 입력 : ♡
>> 입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/