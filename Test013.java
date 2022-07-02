/*
■■■ 자바의 개요 및 특징 ■■■
	●퀴즈
	삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	이 삼각형의 넓이를 구하는 프로그램을 구현한다

	실행 예)
		삼각형 넓이 구하는 프로그램
			삼각형의 밑변 입력 : x		-> 사용자에게 입력토록 안내
			삼각형의 높이 입력 : y
			
		>> 밑변 : 3, 높이 : 5 인 삼각형의 넓이 : zz

	계속하려면 아무 키나 누르세요...!

*/

/*
문제 인식 및 분석
	1. 삼각형의 넓이 공식 : 밑변 * 높이 / 2
	2. 사용자로부터 데이터를 입력받아 처리	→ BufferedReader 활용
	3. BufferedReader 를 여러 개 사용? 한 개 사용?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{

		// 주요 변수 선언
			// 키보드 장착 - BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int underLength, height;			// 밑변, 높이
		double area;			// 넓이(2로 나누기 때문에 실수 타입을 사용한다)

		

		// 연산 및 처리
			// 프로그램명
			System.out.println("■■■삼각형 넓이 구하는 프로그램■■■");
		
			// 밑변
			// 사용자에게 입력을 요구
			System.out.print("삼각형의 밑변 입력: ");
		
			// 입력 대기열에서 문자열 불러와 정수로 변환 후 변수에 담기
			underLength = Integer.parseInt(br.readLine());
			
			// 높이
			// 사용자에게 입력을 요구
			System.out.print("삼각형의 높이 입력: ");
		
			// 입력 대기열에서 문자열 불러와 정수로 변환 후 변수에 담기
			height = Integer.parseInt(br.readLine());
		
			// 불러온 데이터를 공식에 대입 및 연산
			//area = underLength * height / 2;
			//			정수형	  정수형  정수형 → 정수 기반 연산 (즉, 몫을 취하고 나머지는 버림)
			area = underLength * height / 2.0;
			//			정수형	  정수형  실수형 → 실수 기반 연산


			/*
				실수 자료형이 결과값으로 나오는 과정에서
				실수 기반의 연산이 필요한 상황이다
				정수형 2가 아닌, 실수형으로 2.0으로 나눗셈 연산을 수행하게 되면
				이 연산은 실수 기반으로 처리된다.
			*/
			
			// area = (double)(underLength * height / 2);	
			// → 기껏 정수형 기반 연산해놓고 마지막에 실수형으로 바꾸는 것 뿐
			// area = (double)underLength * height /2;
			// area = underLength * (double)height /2;
			// area = (double)(underLength * height)/2;


		// 결과 출력
		System.out.printf(">> 밑변 : %d, 높이 : %d 인 삼각형의 넓이 : %.2f%n", underLength, height, area);


	}
}

/*
실행 결과

■■■삼각형 넓이 구하는 프로그램■■■
삼각형의 밑변 입력: 3
삼각형의 높이 입력: 5
>> 밑변 : 3, 높이 : 5 인 삼각형의 넓이 : 7.50
*/