/*
■■■ 클래스와 인스턴스 ■■■ 
	- 생성자(Constructor)
*/


class NumberTest2
{
	int num;
	
	// 디폴트 생성자
	//NumberTest2()
	//{
		// 텅 비어있음
	//}

	// 사용자 정의 생성자
	// → 사용자 정의 생성자가 정의되어 있으므로
	//	  default 생성자가 자동으로 삽입되지 않음
	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성자 호출 시 매개변수 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}
}


public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 인스턴스 생성
		//NumberTest2 ob1 = new NumberTest2();
		// → 컴파일 에러
		
		// -- NumberTest2 클래스에는
		//	  사용자 정의 생성자가 존재하므로
		//	  default 생성자가 자동으로 삽입되지 않으며
		//    사용자가 정의한 생성자는 매개변수를 갖는 형태이기 때문에
		//    위와 같이 매개변수 없는 생성자를 호출하는 형태의 구문은
		//    문제를 발생시키게 된다

		NumberTest2 ob1 = new NumberTest2(10);
		// → 생성자 호출 시 매개변수 전달 : 10

		System.out.println("메소드 반환 값 : " + ob1.getNum());
		// → 메소드 반환 값 : 10
		System.out.println("ob1.num : " + ob1.num);
		// → ob1.num : 10

		NumberTest2 ob2 = new NumberTest2(3654);
		// → 생성자 호출 시 매개변수 전달 : 3654
		System.out.println("메소드 반환 값 : " + ob2.getNum());
		// → 메소드 반환 값 : 3654
		System.out.println("ob2.num : " + ob2.num);
		// → ob1.num : 3654
	}
}