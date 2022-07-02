/*
■■■ 자바의 개요 및 특징 ■■■
	●퀴즈
	사전에 부여된 반지름 정보를 통해
	원의 넓이와 둘레를 구하는 프로그램을 구현한다
	 → 반지름 : 10

	※  원의 넓이 = 반지름 * 반지름 * 3.14
		원의 둘레 = 반지름 * 2 * 3.14
	
	실행 예)
	넓이 : xxxx
	둘레 : xxxx
	계속하려면 아무 키나 누르세요....
*/

public class Test010
{
	public static void main(String[] args)
	{
		//내가 풀이한 코드 내용
		int r = 10;				// 반지름(r)
		double pi = 3.14;		// 원주율(π)
		
		double a = pi * r * r;	// 원의 넓이(area)
		double p = pi * 2 * r;	// 원의 둘레(perimeter)

		System.out.println("원의 넓이 : " + a);
		System.out.printf("원의 둘레 : %.2f%n", p);
		// %f 는 실수형 서식 지정 옵션
		// %.2f 는 소수점 이하 2 번째 자리까지 표현
		// %n 는 개행



		//다른 사람이 풀이한 코드 내용
		System.out.println("넓이 : " + 10 * 10 * 3.14);		// 짧다고 좋은 코드는 아님
		System.out.println("둘레 : " + 10 * 2 * 3.14);


		//해답 코드 내용

		// 주요 변수 선언
		int r2 = 10;						// 반지름

		//double pi = 3.141592;			// 원주율
		final double PI2 = 3.141592;		// 원주율은 값이 변경되면 안되는 값이기에, 
										// final 이라는 변수의 상수화 키워드를 사용해라.
										// 상수화된 변수의 이름은 대문자로 써라.
										// 두 단어를 사용할 경우, _ 사용 (USER_NAME)

		double area, length;


		// 연산 및 처리
		// 1. 넓이 연산
		//	  원의 넓이 = 반지름 * 반지름 * 3.141592
		area = r2 * r2 * PI2;


		// 2. 둘레 연산
		//	  원의 둘레 = 반지름 * 2 * 3.141592
		length = r2 * 2 * PI2;


		// 결과 출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		System.out.printf("넓이 : %.3f%n", area);
		System.out.printf("둘레 : %.3f%n", length);


		

	}
}


/*
풀이 과정을 한글로 작성하고
그 후 코드로 변환해라
*/