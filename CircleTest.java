/*
■■■ 지역 변수와 전역 변수 ■■■
*/

// Test071.java 파일과 세트

/*
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다
클래스명 : CircleTest → CircleTest.java
BufferedReader 의 readLine()

원의 넓이 = 반지름 * 반지름 * 3.14
원의 둘레 = 반지름 * 2 * 3.14

실행 예)
반지름 입력 : xxx

>> 반지름이 xxx인 원의
>> 넓이 :  / 둘레 : 
계속하려면.....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// 주요 속성(데이터) → 멤버 변수
	int r;						// 반지름
	final double PI = 3.14;		// 원주율 (변수의 상수화)
	int area, length;

	// 주요 기능(동작, 행위) → 멤버 메소드

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException		// input() 밖으로 던지면 main()이 있는 Test071.java에 넘겨짐.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// 넓이 계산 기능 → 메소드 정의
	double calArea()
	{
		return r*r*PI;
	}

	// 둘레 계산 기능 → 메소드 정의
	double calLength()
	{
		// 이렇게 3줄로도 가능
		double result;
		result = r * 2 * PI;
		return result;
	}

	// 결과 출력 기능 → 메소드 정의
	void print(double a, double l)
	{
		System.out.printf(">> 반지름이 %d인 원의\n", r);
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + l);
	}
}