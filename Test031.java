/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다

사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
다음과 같은 형태로 출력하는 프로그램을 작성한다
등급은 평균 점수를 기준으로 처리한다.

90 점 이상			 : A
80 점 이상 90점 미만 : B
70 점 이상 80점 미만 : C
60 점 이상 70점 미만 : D
60 점 미만			 : F

단, BufferedReader 를 활용해 데이터를 입력받을 수 있도록 하며,
printf() 메소드를 통해 출력할 수 있도록 한다.

실행 예)
이름 입력 : 김인교
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 김인교 입니다.
>> 국어 점수는 90
>> 영어 점수는 80
>> 수학 점수는 70
>> 총점은 240 이고, 평균은 80 입니다.
>> 등급은 B 입니다.
계속 하려면 아무 키나 누르세요.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{

		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;

		// 연산 및 처리
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 입력 : ");
		mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		double fAvg = tot / 3.0;

		char grade;

		if (fAvg >= 90)				// if 문은 혼자 사용 가능
		{							// else 문은 혼자 사용 불가능
			grade = 'A';			// if와 여러 else if 는 하나의 문장
		}							// if와 else if 사이에 또 다른 코드를 작성 할 수 없기에
		else if (fAvg >= 80)
		{
			grade = 'B';
		}
		else if (fAvg >= 70)		// (fAvg >= 80 && fAvg >= 70) 와 동일한 의미
		{							// 이미 위에서 fAvg >= 80 는 걸러졌기 때문에
			grade = 'C';			// 생략해도 된다
		}
		else if (fAvg >= 60)
		{
			grade = 'D';
		}
		else						// 없으면 컴파일 에러 뜸, 왜?
		{							// 혹시 모를 범위 밖이 있을 수 있기에
			grade = 'F';			// 자바는 다음 단계로 넘어가지 않음
		}							// 마지막 else 구문 대신 변수 grade에 마지막 값을 미리 담으면 에러 안 뜸
									//						 (char grade = 'F';)
 
		System.out.printf("\n>> 당신의 이름은 %s 입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d\n", kor);
		System.out.printf(">> 영어 점수는 %d\n", eng);
		System.out.printf(">> 수학 점수는 %d\n", mat);
		System.out.printf(">> 총점은 %d 이고, 평균은 %.2f 입니다.\n", tot, fAvg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);

	}
}

/*
실행 결과

이름 입력 : 김인교
국어 입력 : 90
영어 입력 : 80
수학 입력 : 70

>> 당신의 이름은 김인교 입니다.
>> 국어 점수는 90
>> 영어 점수는 80
>> 수학 점수는 70
>> 총점은 240 이고, 평균은 80.00 입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/