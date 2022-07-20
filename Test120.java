/*
■■■ 클래스 고급 ■■■
	- 인터페이스(Interface)
*/


/*
○ [extends] vs [implements]
	
	클래스 extends 클래스
	클래스 extends 추상클래스
	
	인터페이스 extends 인터페이스
	인터페이스 extends 인터페이스, 인터페이스
	
	추상클래스 implements 인터페이스
	추상클래스 implements 인터페이스, 인터페이스

	클래스 implements 인터페이스
	클래스 implements 인터페이스, 인터페이스

※ 인터페이스는 클래스와는 달리 다중 상속이 가능하며,
	인터페이스 자체도 상속된다

※ 인터페이스의 멤버 변수인 데이터는 접근 제어 지시자를 별도로 명시하지 않더라도
	기본 상수(primitive constant)인 public static final 의 변경자로 설정된다
	클래스에서 인터페이스를 추가하여(implements) 사용할 경우
	인터페이스 안에서 선언된 모든 메소드를 구현해 주어야 하며
	인터페이스를 구현하는 클래스는 
	인터페이스의 상위 인터페이스가 제공하는 추상 메소드를 포함한
	모든 메소드를 구현하지 않을 경우
	추상(abstract) 클래스로 선언해야 한다


※ 형식
	- 인터페이스는 메소드를 선언만 하고 정의는 없다
	- 인터페이스를 implements 할 경우 반드시 하위 클래스는
	  인터페이스의 모든 메소드를 오버라이딩(Overriding) 해야 한다
	- 인터페이스는 자동적으로 다음과 같이 처리된다
	    멤버 변수 : public static final
		메소드	  : public abstract
	- 다중 상속은 콤마(,) 로 구분되며
	  여러 개의 인터페이스를 상속할 수 있다
	- 인터페이스끼리 상속할 경우는 extends 키워드를 사용한다


	
	
*/

public class Test120
{
	public static void main(String[] args)
	{
	}
}