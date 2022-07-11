/*
■■■ 지역 변수와 전역 변수 ■■■ 
	- 지역 변수의 초기화 테스트
*/

//Test068.java 와 비교할 것

public class Test069
{
	// 클래스 영역
	
	//전역 변수 a 선언
	int a;
	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		// 메소드의 영역

		System.out.println("a : " + a);
		// 컴파일 에러
		// static 변수가 아니라 생긴 에러

		//Test069 클래스를 기반으로 인스턴스 생성
		Test069 ob = new Test069();

		System.out.println("ob.a : " + ob.a);
		// → ob,a : 0
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		// ob.b = false
		// ob.c :
		// ob.d : 0.0
	}
}