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

class Calculate_1
{
	int n1,n2;		// 임의의 두 정수
	char op;		// 연산자
	double result = 0;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.printf("임의의 두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /) : ");
		op = (char)System.in.read();
	}

	double calPlus()
	{
		result = n1 + n2;
		return result;
	}
	double calMinus()
	{
		result = n1 - n2;
		return result;
	}
	double calTimes()
	{
		result = n1 * n2;
		return result;
	}
	double calDivision()
	{
		result = (double)n1 / n2;
		return result;
	}

	void print(double p, double m, double t, double d)
	{
		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %.2f\n", n1, n2, p);
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %.2f\n", n1, n2, m);
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %.2f\n", n1, n2, t);
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %.2f\n", n1, n2, d);
		}
		else
		{
			System.out.println(">> 판별 불가 데이터");
		}
	}
}

public class Test073_1
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate_1 ob = new Calculate_1();

		ob.input();

		double p = ob.calPlus();
		double m = ob.calMinus();
		double t = ob.calTimes();
		double d = ob.calDivision();

		ob.print(p, m, t, d);
	}
}

/*
실행 결과

임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /) : +
>> 10 + 5 = 15.00
계속하려면 아무 키나 누르십시오 . . .
*/