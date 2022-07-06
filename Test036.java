/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if 문
	- if ~ else 문 실습
*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라 분기 방향을 정하기 위해 사용하는 제어문에는
	if 문, if ~ else 문, 조건 연산자, 복합 if 문(if문 중첩), switch 문이 있다

2. if 문은 if 다음의 조건이 참일 경우 특정 문장을 수행하고자 할 때 사용되는 구문이다

사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다
단, if 조건문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다'

실행 예)
첫 번째 정수 입력		: 10
첫 번째 정수 입력		: 3
연산자 입력 [ + - * / ] : +

10 + 3 = 13
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num1, num2;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [ + - * / ] : ");
		op = (char)System.in.read();


		if (op == '+')
		{
			System.out.printf("\n%d + %d = %d\n", num1, num2, (num1+num2));
		}
		else if (op == '-')
		{
			System.out.printf("\n%d - %d = %d\n", num1, num2, (num1-num2));
		}
		else if (op == '*')
		{
			System.out.printf("\n%d * %d = %d\n", num1, num2, (num1*num2));
		}
		else if (op == '/')
		{
			System.out.printf("\n%d / %d = %d\n", num1, num2, (num1/num2));
		}
		else
		{
			System.out.println("\n판별 불가");
		}
		*/


		/*
		//해답 방법1
		int a, b;
		char op1;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [ + - * / ] : ");
		op1 = (char)System.in.read();

		//테스트 확인
		//System.out.println("입력한 연산자 : " + op1);
		
		
		if (op1 == '+')		//사용자가 입력한 연산자가 '+'라면
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
			//a 와 b 의 덧셈 연산 수행하여 출력
		}
		else if (op1 == '-')			//사용자가 입력한 연산자가 '-'라면
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
			//a 와 b 의 뺄셈 연산 수행하여 출력
		}
		else if (op1 == '*')			//사용자가 입력한 연산자가 '*'라면
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
			//a 와 b 의 곱셈 연산 수행하여 출력
		}
		else if (op1 == '/')			//사용자가 입력한 연산자가 '/'라면
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
			//a 와 b 의 나눗셈 연산 수행하여 출력
		}
		else
		{
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.");
		}
		*/


		/*
		//해답 방법2
		int a2, b2, op2;			// 2개의 정수와 연산자 모두 int로
		
		System.out.print("첫 번째 정수 입력 : ");
		a2 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [ + - * / ] : ");
		op2 = System.in.read();

		//테스트 확인
		//System.out.println("입력한 연산자 : " + op1);
		
		
		if (op2 == 43)		//사용자가 입력한 연산자가 '+'라면
		{
			System.out.printf("\n>> %d + %d = %d\n", a2, b2, (a2+b2));
			//a 와 b 의 덧셈 연산 수행하여 출력
		}
		else if (op2 == 45)			//사용자가 입력한 연산자가 '-'라면
		{
			System.out.printf("\n>> %d - %d = %d\n", a2, b2, (a2-b2));
			//a 와 b 의 뺄셈 연산 수행하여 출력
		}
		else if (op2 == 42)			//사용자가 입력한 연산자가 '*'라면
		{
			System.out.printf("\n>> %d * %d = %d\n", a2, b2, (a2*b2));
			//a 와 b 의 곱셈 연산 수행하여 출력
		}
		else if (op2 == 47)			//사용자가 입력한 연산자가 '/'라면
		{
			System.out.printf("\n>> %d / %d = %d\n", a2, b2, (a2/b2));
			//a 와 b 의 나눗셈 연산 수행하여 출력
		}
		else
		{
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.");
		}
		*/


		//해답 방법3
		int a3, b3, result;
		char op3;

		System.out.print("첫 번째 정수 입력 : ");
		a3 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b3 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [+ - * /]: ");
		op3 = (char)System.in.read();

		if (op3 == '+')
		{
			result = a3 + b3;
		}
		else if (op3 == '-')
		{
			result = a3 - b3;
		}
		else if (op3 == '*')
		{
			result = a3 * b3;
		}
		else if (op3 == '/')
		{
			result = a3 / b3;
		}
		else
		{
			result = 0;
		}

		System.out.printf("\n>> %d %c %d = %d\n", a3, op3, b3, result);


		/*
		//맨 처음 시도했던 오답 (연산자 입력부터 틀림)
		String a								//연산자 String으로 안 됨 (equals()로 해야하는데 아직 안배움)
		System.out.print("연산자 입력 : ");
		a = br.readLine();						//연산자를 readLine()으로 불러올 수 없음

		int result;

		if (a == "+")
		{
			//result = num1 + num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "-")
		{
			//result = num1 - num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "*")
		{
			//result = num1 * num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "/")
		{
			//result = num1 / num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else
		{
			result = 0;
		}

		//System.out.println(num1 + a + num2 + " = " + result);
		*/
	}
}

/*
실행 결과

첫 번째 정수 입력		: 10
첫 번째 정수 입력		: 3
연산자 입력 [ + - * / ] : +

10 + 3 = 13

첫 번째 정수 입력		: 10
첫 번째 정수 입력		: 3
연산자 입력 [ + - * / ] : -

10 - 3 = 7

첫 번째 정수 입력		: 10
첫 번째 정수 입력		: 3
연산자 입력 [ + - * / ] : *

10 * 3 = 30

첫 번째 정수 입력		: 10
첫 번째 정수 입력		: 3
연산자 입력 [ + - * / ] : /

10 / 3 = 3
계속하려면 아무 키나 누르세요...
*/