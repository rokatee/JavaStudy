/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Object 클래스
*/


class Test	// extends Object
{
	/*
	...
	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test128
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("10 == 9 : " + (10 == 9));
		// → 10 == 9 : false
		
		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		// → a == b : true

		// ※ "==" 비교 연산자는 피연산자의 크기를 비교함을 확인(관찰)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		// → ob1 == ob2 : false
		
		// ※ 객체(Object)들을 비교하는 과정에서 사용하는 "==" 연산자는
		//	  크기를 비교하는 것이 아니라 객체의 주소를 비교.
		
		
		
		










		
		
	}
}