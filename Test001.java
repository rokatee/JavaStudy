// 자바의 개요 및 특징

/*
다중 주석문
*/

// 클래스의 이름 Test001
// 자바 프로그램의 클래스 이름의 첫 글자는 대문자로.
// 자바 프로그램 시작할 때 클래스(class)와 main() 메소드를 기본적으로 작성.
// 소스코드 저장 시 클래스 이름과 동일한 파일 이름으로 저장
// 단 이때 확장자는 .java
public class Test001
{
	// main() 이라는 이름을 가진 함수(메소드)
	// 자바 인터프리터가 처음 찾는 메소드
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java");
		System.out.println("First Java Program");

		// 이름() -> 메소드 라는 함수
		// 함수를 메소드라고 바꿔 말하는 이유? "클래스 안에 있는" 함수를 메소드 라고 부름
		// 이름() -> 메소드를 정의
		// 	 {
		//	   ....
		//	 }
		
		// 이름(); -> 메소드를 호출
		
		// 자바에서의 함수는 독립적으로 존재x
		// 클래스에 정의되는 형태로 만들어져야 함
		
		// System.out.println("welcome");
		// -> println();

		// system 이라는 도구상자 안의 
		// out 이라는 도구상자 안의
		// println() 이라는 도구 즉, 메소드
		// -> System 클래스의 out 객체의 println() 메소드

	}
	//실행결과
	/*
	welcome to java
	first java program
	계속하려면 아무 키나 누르십시오...
	*/
}
