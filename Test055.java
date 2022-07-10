/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(do~while문) 실습
*/

/*
<<개요>>
do~while 문은 while 문과 마찬가지로
특정한 영역을 반복 수행하는 반복문이다
다만, while 문과 다른 점은
조건식에 대한 검사를 반복문을 수행한 이후에 한다는 것이다
이와 같은 성격으로 인해 반드시 한 번은 수행하게 되는 특징을 갖는다

<<형식 및 구조>>
	do
	{
		실행문;
	}
	while(조건식);
*/

public class Test055
{
	public static void main(String[] args)
	{
		//while 반복문을 통해 구현했던 내용들을
		//do~while 문을 통해서도 구현할 수 있다
		
		/*
		int n = 1;

		do
		{
			System.out.println("n = " + n);
			n++;
		}
		while (n <= 10);
		

		
		int n = 1;

		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n <= 10);
		
		
		
		int n = 1;

		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n < 10);
		

		
		int n = 0;

		do
		{
			n++;
			System.out.println("n = " + ++n);
		}
		while (n <= 10);
		*/

		// do~while 문의 활용 모델
		// 예를 들어...사용자로부터 특정 범위의 정수가 입력될 때까지
		// 입력받는 행위 자체를 반복해서 수행해야 하는 상황이라 가정한다

		// 즉, 최소 한 번은 사용자의 입력값을 받아오는 처리를 수행해야
		// 원하는 범위의 값을 제대로 입력했는지 확인할 수 있고
		// 이로 인해 반복을 추가로 수행할지 말지의 여부를 결정할 수 있는 상황이다

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int num;

		do
		{
			System.out.print("100이상의 정수를 입력하라 : ");
			num = sc.nextInt();
		}
		while (num<100);

		System.out.println(num + " → 100이상의 정수 입력 완료");
	}
}

/*
실행 결과

100이상의 정수를 입력하라 : 1
100이상의 정수를 입력하라 : 2
100이상의 정수를 입력하라 : 3
100이상의 정수를 입력하라 : 10
100이상의 정수를 입력하라 : 100
100 → 100이상의 정수 입력 완료
계속하려면 아무 키나 누르십시오 . . .
*/