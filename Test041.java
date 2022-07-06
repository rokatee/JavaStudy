/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- switch 문 실습
*/

/*
다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

[형식 및 구조]
switch(수식)
{
	case 상수1 : 문장1; [break;]
	case 상수2 : 문장2; [break;]
		  :
	[default : 문장n+1; [break;]
}

switch 문의 수식과 case 문의 상수는
byte, short, int, long 형이어야 한다
+ 문자 타입(char)
+ 문자열(String)

case 문 뒤에 break; 가 없는 형태인 경우
다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. ( → 기본 모델)

break; 가 존재할 경우
해당 지점에서 수행을 멈춘 후 switch 문을 빠져나간다. ( → 일반 모델)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;				// 이름
		int kor, eng, mat, tot;		// 국,영,수,총점
		//double avg;				// 평균
		int avg;
		char grade;					// 등급

		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		//avg = tot / 3.0;
		avg = tot / 3;
		
		/*
		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		*/
		
		/*
		switch (avg/10)
		{
			case 10 : grade= 'A'; break;
			case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			case 5 : grade= 'F'; break;
			case 4 : grade= 'F'; break;
			case 3 : grade= 'F'; break;
			case 2 : grade= 'F'; break;
			case 1 : grade= 'F'; break;
			case 0 : grade= 'F'; break;
		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10 : grade= 'A'; break;
			case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			default : grade= 'F'; break;
		}
		*/

		switch (avg/10)
		{
			case 10 : case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			default : grade= 'F'; break;
		}

		// 결과 출력
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s 입니다.\n", name);
		//System.out.printf(">> 총점은 %d 평균은 %.2f 입니다.\n", tot, avg);
		System.out.printf(">> 총점은 %d 평균은 %d 입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);
		
	}
}

/*
실행 결과

이름 입력 : 김인교
국어점수 입력 : 90
영어점수 입력 : 80
수학점수 입력 : 70

>> 당신의 이름은 김인교 입니다.
>> 총점은 240 평균은 80 입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/