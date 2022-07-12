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

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 주요 변수 선언
	int n1,n2;		// 임의의 두 정수
	char ch;		// 연산자
	//int result;	// 연산자에 대한 연산
	

	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("임의의 연산자(+ - * /) : ");
		ch = (char)System.in.read();
	}
	
	// 메소드 정의(기능 : 연산)
	double cal()
	{
		double result = 0;
		
		// 방법1
		/*
		if (ch == '+')
		{
			result = n1 + n2;
		}
		else if (ch == '-')
		{
			result = n1 - n2;
		}
		else if (ch == '*')
		{
			result = n1 * n2;
		}
		else if (ch == '/')
		{
			result = (double)n1 / n2;
		}
		*/

		// 방법2
		switch (ch)
		{
			case '+' : result = n1 + n2; break;
			case '-' : result = n1 - n2; break;
			case '*' : result = n1 * n2; break;
			case '/' : result = n1 / n2; break;
		}
		return result;
	}
	
	// 메소드 정의(기능 : 출력)
	void print(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", n1, ch, n2, result);
	}
}