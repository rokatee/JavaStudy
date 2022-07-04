/*
■■■ 연산자(Operator) ■■■
	- 비트 단위 연산자
*/

public class Test023
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b;
		d = a | b;
		e = a ^ b;
		
		System.out.printf("a & b : %d%n", c);
		System.out.printf("a | b : %d%n", d);
		System.out.printf("a ^ b : %d%n", e);
	}
}

/*
실행 결과

a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .

*/