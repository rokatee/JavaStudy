/*
■■■ 지역 변수와 전역 변수 ■■■ 
	- 직사각형 클래스 설계 실습
*/

/*
직사각형의 넓이와 둘레 계산 클래스로 표현
클래스의 속성 → 가로 세로 넓이 부피 둘레 무게 재질 색깔....)
클래스의  지능성 → 넓이 계산,,가로 세로 넓이 부피 둘레 무게 재질 색깔....)
 
객체를 구성  -> 데이터(속성, 상태) + '기능(동작, 행위)
	
클래스를 설계 변수 메도,

class 직사형
{
	데이터(속성, 상태)
	int 가로 세로;

	기능(동작, 행위)

	가로세로입력()
	{
	}
	
	둘레계산()
	{
	}

	넓이계산()
	{
	}

	결과출력()
	{
	}
	

*/

import java.util.Scanner;

class Rect										// 직사각형 클래스 설계
{
	// 데이터(속성, 상태)						→ 변수 (순서 의미 없음)
	int w, h;									// 가로, 세로 (전역 변수)
	
	// 기능(동작, 행위)							→ 메소드 (순서 의미 없음)
	void input()								// 가로세로입력()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");		//출력하고 얻어온거 변수에담고 자기가 담기에 input메소드에 아무값도 안남는다 그러므로 void
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	int calLength()								// 둘레계산() → (가로 + 세로) * 2
	{
		//int result;

		//result = (w + h) * 2;

		//return result;

		return (w + h) * 2;						// 위의 3줄이 바람직하나 이렇게 한 줄로 줄여도 무관
	}

	int calArea()								// 넓이계산() → 가로  * 세로
	{
		// 주요 변수 선언
		int result;
		
		// 연산 및 처리  → 선언한 변수들에 값 담아내기
		result = w * h;

		// 최종 결과 반환
		return result;

		//return w * h;							// 위의 3줄이 바람직하나 이렇게 한 줄로 줄여도 무관
	}

	void print(int a, int l)					// 결과출력() → 가로 : xx / 세로 : xx / 넓이 : xx / 둘레 : xx
	{											// 가로 세로는 전역 변수이므로 가져오지 않아도 되고
		//가로 : 10								// 필요한 값은 넓이와 둘레 (위에서 연산은 알아서하고)
		//세로 : 20								// print() 는 출력만 해야하므로 넓이와 둘레가 몇인지만 알면 됨
		//넓이 : xxx
		//둘레 : xxx

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);		// 그러므로 리턴값은 void
	}
}


/*
 >> 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다
	하지만 public class는 이 파일 내에서 하나만 올 수 있다
	파일을 저장할 때의 이름은
	이 public class의 이름으로 지정해야 한다
	일반적으로(실무적으로) 하나의 파일에 하나의 클래스를 설계한다
	또한 여러 개의 클래스가 설계된 파일을 컴파일하게ㅡ 되면
	내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.
*/

public class Test070
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성
		Rect ob = new Rect();
		
		// 입력 메소드 호출
		ob.input();
		
		// 넓이 연산 메소드 호출
		int area = ob.calArea();

		// 둘레 연산 메소드 호출
		int length = ob.calLength();

		// 결과 출력 메소드 호출
		ob.print(area, length);			// 넓이는 a, 둘레는 l 이라 했었는데 여기서 area, length라 부르면 문제 없나?
										// 내가 피아노를 키티라 부른다 해도 피아노를 옮겨줄 작업자들이 다르게 불러도 문제 없다
	}
}

/*
실행 결과

가로 입력 : 10
세로 입력 : 20
가로 : 10
세로 : 20
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/

