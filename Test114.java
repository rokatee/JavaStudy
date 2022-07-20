/*
■■■ 클래스 고급 ■■■
	- 상속(Inheritance)
*/

/*
※ 메소드 오버라이딩(Method Overriding)의 특징
	- 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다

	- 반드시 상속 관계가 있어야 한다

	- 재정의된 하위 클래스의 메소드 접근 제어 지시자는
	  상위 클래스의 메소드 접근 제어 지시자보다 범위가 크거나 같아야 한다
	  예를 들어, 상위 클래스 메소드의 접근 제어 지시자가 protected 인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding) 하는 경우
	  접근 제어 지시자는 public 또는 protected 이어야 한다

	- static, final, private 메소드는 오버라이딩(Overriding) 할 수 없다

	- Exception의 추가가 불가능하다
	  즉, 상위 메소드가 가지고 있는 기존 예외 사항에
	  새로운 Exception 을 추가하는 것은 불가능 하다는 것이다
*/

// 부모 클래스(상위 클래스, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest114 extends SuperTest114
{

	/*
	private int a = 5;		// 상속 받을 때 private이라 접근 불가능하여 상속 불가능
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
		// a 값을 받지 못해 컴파일 에러 뜬다(39번 줄의 주석 설명참고)
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// 에러 발생
		// 슈퍼 클래스에서 선언된 변수 a에는 접근할 수 없다
		// private 변수이기 때문에

		System.out.println("Sub print() 메소드 : " + b);
		System.out.println("Sub print() 메소드 : " + this.b);	//SubTest114.b
		System.out.println("Sub print() 메소드 : " + super.b);	//SuperTest114.b
		/*
			Sub print() 메소드 : 100
			Sub print() 메소드 : 100
			Sub print() 메소드 : 10
		*/
		// → 여기서 하위클래스가 b를 가지고 있지 않다면
		//	  b 혹은 this.b 혹은 super.b 모두 상속받은 상위 클래스의 b를 사용하게 된다

		// 메소드는 형태가 같을 경우 덮어씌워 지지만,
		// 변수는 다른 공간에 저장되어 독립적으로 사용이 가능하다


		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);	//SubTest114.c
		System.out.println("Sub print() 메소드 : " + super.c);	//SuperTest114.c
		// 3개 모두 20 이 출력 됨
		// 변수 c는 접근하는데 아무런 제약과 제한이 없다
		// 슈퍼클래스에서 선언된 c
		
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b +  " : " + c);
		// → 컴파일 에러
		// 슈퍼클래스에서 선언된 변수 a에는 접근 불가능 [print() 메소드와 마찬가지]
		// private 변수이기 때문

		System.out.println("Sub write() 메소드 : " + b +  " : " + c);

	}	
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest114) 인스턴스 생성
		SubTest114 ob = new SubTest114();

		ob.print();
		// → Sub print() 메소드 : 100 : 20
		// b가 10에서 100으로 변환됨 
		// 변수명이 같은데 에러가 안뜸. 왜?
		// → 변수는 다른 공간에 저장되어 독립적으로 사용이 가능하다

		ob.write();
		// →	Super write() 메소드 : 5 : 10 : 20
		//		Sub write() 메소드 : 100 : 20

		System.out.println("-------------------------------------구분선");
		System.out.println(ob.b);
		// → 100
		System.out.println(((SuperTest114)ob).b);
		// → 10
		// ※ 슈퍼 부름 (상위 클래스의 b를 부르기 위한 방법)

		ob.write();
		// → Sub write() 메소드 : 100 : 20

		((SuperTest114)ob).write(); 
		// → Sub write() 메소드 : 100 : 20
	
		// 메소드와 변수를 꼭!! 구분할 것
		// 메소드는 부모클래스를 자식클래스가 덮는다
		// 변수는 부모클래스와 자식클래스 따로따로 저장된다



	}
}