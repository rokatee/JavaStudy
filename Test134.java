/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		long l = 1233455756568L;
		//String m = "뿅";			// string도 받는 건 없음 ㅠㅠ
		short s = 123;
		double d = 123.124;
		float f = 123.456f;
		
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Long l2 = new Long(l);
		//String m2 = new String(m);
		Short s2 = new Short(s);
		Double d2 = new Double(d);
		Float f2 = new Float(f);

		//System.out.println(b2);
		//System.out.println(i2);
		// → 3
		//	  256
		
		print(b2);
		print(i2);
		print(l2);
		//print(m2);
		print(s2);
		print(d2);
		print(f2);
	}


	/*
	static void print(Object ob)
	{
		System.out.println(ob);
	}
	
	static void print(Byte ob1)
	{
		System.out.println(ob1);
	}

	static void print(Integer ob2)
	{
		System.out.println(ob2);
	}
	*/

	// java.lang.Number 클래스(추상 클래스)는 
	// 모든 숫자형 Wrapper 클래스의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다
	// b2, i2 자료형이 Number 에 넘어오면서
	// "업 캐스팅"이 일어나게 된다

	static void print(Number n)
	{
		System.out.println(n);

		//if (n instanceof Integer)
		//{
		//	System.out.println(n.intValue());
		//}
		//else if (n instanceof Double)
		//{
		//	....
		//}
		//....
	}
}
