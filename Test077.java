/*
■■■ 클래스와 인스턴스 ■■■ 
	- 생성자(Constructor)
*/

public class Test077
{
	int val1;
	double val2;
	
	Test077()
	{
		val1 = 0;
		val2 = 0;
		System.out.println("매개변수 없는 생성자...");
	}

	Test077(int x)
	{
		val1 = x;
		val2 = 0;

		System.out.println("int형 데이터를 매개변수로 받는 생성자...");
	}

	Test077(double y)
	{
		val1 = 0;
		val2 = y;

		System.out.println("double형 데이터를 매개변수로 받는 생성자...");
	}

	Test077(int x, double y)
	{
		val1 = x;
		val2 = y;
		System.out.println("int형 변수와 double형 변수를 매개변수로 받는 생성자...");
	}

	public static void main(String[] args)
	{
		Test077 ob1 = new Test077();
		// → 매개변수 없는 생성자...

		System.out.println(ob1.val1 + ", " + ob1.val2); 
		// → 0, 0.0

		Test077 ob2 = new Test077(4);
		// → int형 데이터를 매개변수로 받는 생성자...
		
		System.out.println(ob2.val1 + ", " + ob2.val2);
		// → 4, 0.0

		Test077 ob3 = new Test077(7.0);
		// → double형 데이터를 매개변수로 받는 생성자...

		System.out.println(ob3.val1 + ", " + ob3.val2);
		// → 0, 7.0

		Test077 ob4 = new Test077(4, 7.0);
		// → int형 변수와 double형 변수를 매개변수로 받는 생성자...

		System.out.println(ob4.val1 + ", " + ob4.val2);
		// → 4, 7.0



	}
}