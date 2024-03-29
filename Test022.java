/*
■■■ 연산자(Operator) ■■■
	- 비트 단위 연산자
*/

public class Test022
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;

		System.out.printf("~a : %d%n", ~a);		//비트 not (부정) : ~
		System.out.printf("~b : %d%n", ~b);	
	}
}

/*
a = 10 → 00001010 앞의 (3바이트 생략)
		
		1	↓
		  11110101 → -11 → check → ok~
		+ 00001011 → 11
		----------
		1 00000000
*/


/*
실행 결과

~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .

*/