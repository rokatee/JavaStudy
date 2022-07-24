/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
*/

/*
○ Wrapper 클래스
	
	1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
		나머지는 클래스로 설계하여 객체 단위로 처리한다
		따라서 자바에서는 이러한 기본형 데이터를
		객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
		이러한 클래스들을 가리켜 Wrapper 클래스라 한다

	2. 기본 자료형인
		byte, short, int,	  long, float, double, char,	  boolean 형에 대응하는
		Byte, Short, Integer, Long, Float, Double, Character, Boolean 의
		java.math.BigInteger 와 java.math.BigDecimal 클래스를 제공한다

		Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
		별도의 import 과정 없이 바로 사용하는 것이 가능하며
		기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
		형 변환이 가능하고, 동등 비교와 같은 연산도 가능하다

		ex) java.lang.Integer 클래스
			int 기본 자료형의 Wrapper 클래스로
			정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
			메소드 등을 포함하고 있다

			static int parseInt(String s)
			문자열 형식으로 저장된 숫자를 정수 형태로 변환하여 반환한다
			
			static Integer valueOf(int i)
			int 형을 Integer 형으로 변환한다

			byte byteValue(), short shortValue(),
			int intValue(), long longValue(),
			float floatValue(), double doubleValue()
			해당 기본 자료형으로 형 변환한 값을 반환한다



※ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing)

	일반적으로 레퍼런스 형과 기본 자료형은 호환되지 않으며
	이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다
	하지만, JDK 1.5 부터 레퍼런스 형과 기본 자료형이
	다음과 같이 형 변환이 가능하게 되었다

	int a = 10.b;
	Integer ob;
	ob = a;
	 → 기본 자료형(int)이 Integer 형으로 자동 변환(오토 박싱)
		실제로는 ... "ob = new Integer(a);

	b = ob;
	 → Integer(객체)가 기본 자료형 int 형으로 자동 변환(오토 언박싱)
	 	실제로는 ... "b = ob.intValue();

	이는 JDK 1.5 이후 추가된 오토 박싱 / 오토 언박싱 이라는 
	기능으로 인해 가능해진 것이다



*/

public class Test130
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;						// int 형 데이터(자료) → int 형 변수

		c = new Integer(0);			// 객체 생성 구문
		// → Scanner sc = new Scanner(System.in); 와 동일한 구조
		
		// ※ 레퍼런스 형(참조 타입) 기본 자료형(기본 타입)은 호환되지 않는다

		b = c;						// Integer 형 데이터(객체) → int 형 변수(오토 언박싱)
		b = c.intValue();			// 객체의 메소드 호출을 통해 결과값 반환(언박싱)

		d = new Object();			// 객체 생성
		System.out.println("d.toString() : " + d.toString());
		// → d.toString() : java.lang.Object@15db9742
		
		d = new Integer(10);		// 업캐스팅
		System.out.println("d.toString() : " + d.toString());
		// → d.toString() : 10
		//		오버라이드를 통해 재정의를 해서 결과값이 달라짐

		d = new Double(12.345);		// 업캐스팅
		System.out.println("d.toString() : " + d.toString());
		// → d.toString() : 12.345
		
		d = 10;						// 오토 박싱
		System.out.println("d.toString() : " + d.toString());
		// → d.toString() : 10
	}
}