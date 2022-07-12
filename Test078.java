/*
■■■ 클래스와 인스턴스 ■■■ 
	- 생성자(Constructor)와 초기화 블럭(Initialized Block)
*/

public class Test078
{
	// 수행 불가능
	/*
	int n;
	int m;
	
	n = 100;
	m = 200;
	*/

	// 수행 가능
	/*
	int n = 100;
	int m = 200;
	*/
	
	
	int n;
	int m;
	
	// 생성자(Constructor)
	// 초기화 블럭이 코드를 먼저 수행했다 하더라도
	// 최종적으로 해당 멤버들의 초기화 값을 결정하게 되는 것은
	// 생성자!!!
	Test078()
	{
		n = 100;
		m = 200;
		System.out.println("생성자 실행...");
	}

	// 초기화 블럭(Initialized Block)
	{
		n = 10;
		m = 20;
		System.out.println("초기화 블럭 실행...");
	}

	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}

	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}
	
	
	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		// →초기화 블럭 실행...
		//   생성자 실행...

		Test078 ob2 = new Test078(1234, 4567);
		ob1.write();
		// →초기화 블럭 실행...
		//   매개변수 있는 생성자 실행...
		//	 n : 100, m : 200

	}
}