/*
■■■ 클래스 고급 ■■■
	- 상속 관계에 있는 클래스들 간의 캐스팅
		(업 캐스팅, 다운 캐스팅)
*/

// super class, 부모 클래스, 상위 클래스
class SuperTest116
{
	public int a = 10, b = 20;
	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, 자식 클래스, 하위 클래스
class SubTest116 extends SuperTest116
{
	public int b = 100, c = 200;

	@Override
	public int hap()
	{
		return a + b + c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드...");
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		//sub class(하위 클래스) 기반 인스턴스 생성
		SubTest116 ob1 = new SubTest116();

		System.out.println("ob1.b : " + ob1.b);
		// → ob1.b : 100
		

		//○ 업 캐스팅(하위 객체를 상위 객체 형식으로 형 변환)
		//SuperTest116 ob2;		// 가능하다
		SuperTest116 ob2 = ob1;
		// → SuperTest116 ob2 = (SuperTest116)ob1; 과 동일한 코드
		
		
		/*
		학생 소연이 = new 학생();

		포유류 사람 = 소연이;
		포유류 사람 = (사람)소연이;

		※ 학생도 포유류

		※ class 포유류				class 학생 extends 포유류
		   {						{
	       }						}

		 비교)
		 byte a = 10;

		 int b = a;			// int b = (int)a; 와 동일한 코드

		*/


		System.out.println("ob2.b : " + ob2.b);
		// → ob2.b : 20
		// → 변수는 객체별로 따로 할당되기 때문에
		//	  변수 b는 ob2의 변수이다.

		System.out.println("합   : " + ob2.hap());
		// → 합   : 310
		// hap() 메소드는 오버라이딩(Overriding) 되어 있고
		// ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
		// SuperTest116 의 hap() 메소드를 호출하는 것이 아니라
		// SubTest116 에서 재정의한 hap() 메소드를 호출하게 된다
		// 즉, 메소드는 업캐스팅이 되더라도
		// 재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다
		
		ob2.write();
		// → 슈퍼 클래스 write() 메소드...

		//ob2.print();
		// → 컴파일 에러
		// → error: cannot find symbol
		//	  부모는 자식이 가지고 있는 메소드를 건드릴 수 없다
		//	  (있는지 조차 모른다)

		((SubTest116)ob2).print();
		// → 서브 클래스 print() 메소드...
		
		// ※ 추가 관찰
		//		다운 캐스팅 가능 여부

		// super class(상위 클래스) 기반 인스턴스 생성
		SuperTest116 ob3 = new SuperTest116();
		SubTest116 ob4;
		
		//System.out.println(ob3.c);
		// → 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다
		//	  (상위 객체 입장에서는 어떤 하위 객체가 존재하는지도 알 수 없음)

		//ob4 = ob3;
		// 자식 = 부모 → 에러
		
		// 부모 ob1 = new 부모(); → 부모 정보만 메모리에 저장 됨
		// 자식 ob2 = new 자식(); → 부모와 자식 정보 둘 다 메모리에 저장 됨
		
		ob4 = (SubTest116)ob3;
		// → 런타임 에러 발생
		// → java.lang.ClassCastException: (캐스팅하는데 문제가 생겼다는 뜻)
		// 작성된 구문의 문법적인 구조만 봤을 때
		// 다운 캐스팅이 이루어지는 상황이다
		// 하지만, 정상적인 캐스팅이 이루어지지 않는다
		// 현재 SubTest116 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		// 다운 캐스팅은 불가능한 것이다

	}
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우----------------------------------

	1. 하위 객체 생성 (중요!! - 생성된 객체가 하위라는 것)
	2. 상위 = 하위;				→  업 캐스팅
	3. 하위 = 상위;				→  에러 발생
	4. 하위 = (하위)상위;		→  다운 캐스팅

○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우-----------------------------------------
	
	1. 상위 객체 생성
	2. 하위 = 상위;				→  에러 발생
	3. 하위 = (하위)상위;		→  다운 캐스팅이지만 런타임 에러

※ 업 캐스팅은 항상 가능
   다운 캐스팅은 경우에 따라 가능
   (키 포인트 : 생성된 객체가 상위이냐 하위이냐 - 하위일 땐 문제 없음)
*/