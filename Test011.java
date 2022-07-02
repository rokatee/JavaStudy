/*
■■■ 자바의 개요 및 특징 ■■■
	●퀴즈
	직사각형의 넓이와 둘레를 구하는 프로그램을 작성하라.
	가로 10, 세로 20

	실행 예)
	넓이 : xxx
	둘레 : xxx
	계속하려면 아무 키나 누르세요...!

*/

//문제 인식 및 분석
//	직사각형의 넓이와 둘레를 구하는 공식
//	넓이 = 가로 * 세로
//	둘레 = (가로 + 세로) * 2


public class Test011
{
	public static void main(String[] args)
	{
		//내가 풀이한 코드 내용
		int w = 10;
		int h = 20;

		int area = w * h;
		int length = (w + h) * 2;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);



		//해답 코드 내용
		// 주요 변수 선언 및 초기화
		int a = 10, b = 20;			// 가로, 세로
		int x, y;					// 넓이, 둘레

		// 연산 및 처리
		x = a * b;					//	넓이 = 가로 * 세로
		y = (a + b) * 2;			//	둘레 = (가로 + 세로) * 2
		
		// 결과 출력
		System.out.printf("넓이 : %d\n", x);
		System.out.printf("둘레 : %d\n", y);
	}
}