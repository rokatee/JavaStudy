/*
■■■ 클래스와 인스턴스 ■■■ 
*/

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산을 수행하는 프로그램을 구현한다
단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다
Calculate 클래스 설계

실행 예)
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /) : +
>> 10 + 5 = 15
계속하려면....
*/

/*
문제 인식 및 요점
정수 공백 구분 → Scanner
연산자 → readLine
*/

import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate ob = new Calculate();

		ob.input();					// 생성한 인스턴스를 통한 입력 메소드 호출
		double result = ob.cal();	// 생성한 인스턴스를 통한 연산 메소드 호출
		ob.print(result);			// 생성한 인스턴스를 통한 출력 메소드 호출
	}
}

/*
실행 결과

임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /) : +
>> 10 + 5 = 15.00
계속하려면 아무 키나 누르십시오 . . .
*/