/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Object 클래스
*/

class NewCar // extends Object
{
	private int velocity;		// 자동차 속도
	private int wheelNum;		// 자동차 바퀴 개수
	private String carName;		// 자동차 이름

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}

public class Test129
{
	public static void main(String[] args)
	{
		//NewCar nCar1 = new NewCar();	// NewCar 클래스의 NewCar() 메소드에 인자가 있으므로 디폴트 인스턴스 생성 불가
		NewCar nCar1 = new NewCar(250, "람보르기니", 4);
		NewCar nCar2 = new NewCar(150, "K5", 4);
		
		// equals()	-- Object가 제공하는 메소드
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		// → 1-1 : false
		//    1-2 : false	// equals()도 "==" 비교 연산자와 동일하게 주소값을 비교하는 메소드다

		NewCar nCar3 = nCar1;	// 객체 복사 → 얕은 복사(참조형)
								// → 주소값 복사 (Test096,097.java 참고)
		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		// → 2-1 : true
		//    2-2 : true
		// 35번 줄의 얕은 복사를 통해 nCar1의 주소값을 nCar3에 담았으므로
		// 둘이 같은 주소값을 가리키고 있어서 동일한 값이 나온다

		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		// → 3-1 : NewCar@15db9742
		//	  3-2 : NewCar@6d06d69c
		//	  3-3 : NewCar@15db9742
		// 35번 줄에 의해 nCar1 과 nCar3 의 객체가 같다보니 3-1과 3-3이 같은 값임

		// hashcode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		// → 4-1 : 366712642
		//	  4-2 : 1829164700
		//	  4-3 : 366712642
		// → 결과값을 16진수 형태로 바꾸게 되면 toString() 메소드가 반환한 결과값 확인 가능
		
		// getClass()
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		// → 5-1 : class NewCar
		//    5-2 : class NewCar
		//	  5-3 : class NewCar
		// → 생성된 객체를 통해 해당 객체의 기반 설계도를 확인할 있는 기능을 가진 메소드

		// clone()		// 객체 복사

		// finalize()	// 객체 직렬화
		
		// 기타 나머지 메소드는 스레드 처리와 관련이 있다
		
		
		
	}
}