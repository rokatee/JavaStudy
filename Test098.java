/*
■■■ 클래스와 인스턴스 ■■■ 
	- 정보 은닉과 접근 제어 지시자(접근 지시자, 접근 제어자, 접근 지정자, 접근 제한자)
*/

import java.util.Scanner;

class CircleTest2
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
	//int num;	// class에선 이렇게 선언하면 안 됨
	// ↓
	// 정보 은닉(Information Hiding)
	// private 이라는 접근 제어 지시자의 선언은
	// int 형 전역 변수 → 자동 0으로 초기화 지원
	private int num;

	// getter / setter 구성
	/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
		//CircleTest2.num = num;
	}
	*/
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}
	
	double calArea()
	{
		return num * num * 3.14;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
	}





}

public class Test098
{
	public static void main(String[] args)
	{
		// CircleTest2 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		//		↓
		//ob1.setNum(10);

		//System.out.println("원의 반지름 : " + ob1.num);
		//				↓
		//System.out.println("원의 반지름 : " + ob1.getNum());

		// 현재로서는 유일하게 
		// CircleTest2 의 num 에 데이터를 전달할 수 있는 방법
		ob1.input();

		double result = ob1.calArea();

		ob1.write(result);
	}
}

/*
실행 결과

반지름 입력 : 500
반지름 : 500
넓이 : 785000.0
계속하려면 아무 키나 누르십시오 . . .
*/