/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// 불가능
		//int a1 = 123456789123456789;
		//System.out.println(a1);

		// 불가능
		//long b1 = 123456789123456789;
		//System.out.println(b1);

		// 가능
		//long c1 = 123456789123456789L;
		//System.out.println(c1);
		
		// 불가능
		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		//BigInteger c = a + b;		// a와 b(객체와 객체) 를 더하는게 어떤 의미인지(주소값인지 데이터값인지) 자바는 모른다
		//System.out.println(c);
		
		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		// → 덧셈 결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		// → 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		// → 곱셈 결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		// → 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		// → 2의 3승 : 8


		

	}	
}

/*
실행 결과

덧셈 결과 : 246913578246913578
뺄셈 결과 : 0
곱셈 결과 : 15241578780673678515622620750190521
나눗셈 결과 : 1
2의 3승 : 8
계속하려면 아무 키나 누르십시오 . . .
*/