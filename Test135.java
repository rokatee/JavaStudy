/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
*/


public class Test135
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// 2147483647
		// -2147483648
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		// 127
		// -128
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		// 1.7976931348623157E308
		// 4.9E-324	→ e 표기법(숫자가 이상하게 찍힌게 아님)
		
		System.out.println();		// 개행
		
		// 실수 기반의 나눗셈 연산
		System.out.println("1 : " + 3.0/0);
		System.out.println("2 : " + -3.0/0);
		// → 1 : Infinity
		// → 2 : -Infinity
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		// → 3 : true
		// → 4 : false
		
		// Double.isInfinite()
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		// → 5 : true
		// → 6 : true
		
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + 0.0/0);
		// → 7 : NaN (Not a Number)
		// → 8 : NaN
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10: " + (0.0/0 != 0.0/0));
		// → 9 : false
		// → 10: true

		// ※ NaN(Not A Number) 값과 임의의 수를
		//	  크기 비교를 수행하는 "==" 연산자를 통해 비교 연산을 수행하게 되면
		//	  결과는 언제나 false 를 반환한다

		// Double.isNaN()
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		// → 11 : true
		//    12 : false

		
	}
}