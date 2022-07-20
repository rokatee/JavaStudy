/*
■■■ 클래스 고급 ■■■
	- 상속(Inheritance)
*/

/*
다음과 같은 프로그램을 구현한다
단, 상속의 개념을 적용하여 작성할 수 있도록 한다

실행 예)
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+, -, *, /) : -
>> 20 - 15 = 5
계속하려면...
*/

import java.util.Scanner;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Aclass 를 상속받는 클래스로 설계
class Bclass extends Aclass
{
	/*
	// Aclass에서 상속받아올 수 있음
	// 단 생성자는 상속 제외
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
	/*
	// 작성 안해도 자동 생성 됨
	Bclass()
	{
		// 부모 클래스 생성자도 자동 생성
		//super();
	}
	*/

	boolean input() throws IOException
	{
		//선생님 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 두 정수 입력(공백 구분) : ");		// 20 15 → 이런식으로 입력하기에
		String temp = br.readLine();								// 임시공간에 통째로 가져온다
		/*
		 ※ 문자열.split("구분자");
			  문자열.split("\\s*");			// 구분자 → 공백
		
			  ex) "10 20 30 40 50".split("\\s");
			      → 반환 → {"10", "20", "30", "40", "50"}
		
			  ex) "010-1234-4567".split("-");
			      → 반환 → {"010", "1234", "4567"}
		*/

		String[] strArr = temp.split("\\s");
		
		if (strArr.length != 2)		// 2개를 입력하지 않았을 경우
		{
			return false;
			// false를 반환하며 input() 메소드 종료
			// 이 조건을 만족하여 if문을 수행하게 될 경우
			// 아래 수행해야 할 코드가 남아있더라도
			// 결과값(false)을 반환하며 메소드는 종료된다
		}
		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+, -, *, /) : ");
		op = (char)System.in.read();
		
		if (op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		
		return true;
	}

	double calc()
	{
		double result = 0;
		
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y;		// 마지막은 break 없어도 된다
		}
		
		return result;
	}

	/*
	void input() throws IOException
	{
		// 내 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		double result = 0;

		if (op == '+')
			result = x + y;
		else if (op == '-')
			result = x - y;
		else if (op == '*')
			result = x * y;
		else if (op == '/')
			result = (double)x / y;

		return result;
	}
	*/
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// 선생님 풀이
		if (!ob.input())		// Bclass에서 boolean으로 입력값을 받았었으니 여기서도 똑같이!!
		{
			System.out.println("Error...");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);

		
		/*
		// 내 풀이
		ob.input();
		double result = ob.cal();
		ob.write(result);
		*/
	}
}