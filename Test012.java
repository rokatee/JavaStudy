/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 자바 기본 입출력 : BufferedReader 클래스
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		
		//int a = 10;					
		// 굳이 언급하지 않아도 자바가 스스로 알고 있음

		// 키보드 장착(생성)
		//BufferedReader br = new BufferedReader();			
		// → BufferedReader 클래스 기반의 인스턴스(객체) 생성 
		// 선언 당시엔 몰라도, 위에 import를 해줌으로서 자바에게 알려줌

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//문자 입력을 읽어들이는 장치			---------------------
		//										바이트 → 문자 번역기 -------------
		//															  바이트 입력값
		//자바 라는 선장이 있다
		//→ 승객 명단 중 2명 블락처리 되어있네?
		//→ 자바는 위협이 될 수 있기에 이들의 탑승을 허용 안 함
		//→ 자바에게 위협이라 판단되면 배 밖으로 던지라(IOException)고 전달 


		// 주요 변수 선언
		int r;						// 반지름
		final double PI = 3.14;		// 원주율 (변수의 상수화 final)
		double a, b;				// 원의 넓이, 둘레


		// 연산 및 처리
		// 1. 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름을 입력 : ");
		
		// 2. 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기
		//br.readLine();
		//out.println(); 와 동일한 방식의 문법
		//BufferedReader 의 readLine()
		// → 입력 대기열에 남아있는 문자열 반환 
		//(매개 변수를 입력하지 않아도 알아서 불러 옴 → 괄호 안에 코드 필요 없다)

		// r = br.readLine();  → r = "1234";
		// br.readLine(); 는 문자열 반환이기에 int 타입의 r(반지름)에 담을 수 없다
		// 해결책은? parseInt()
		// "2546"  → parseInt("2546")  → 2546
		// "80"	   → parseInt("80")    →   80

		//Integer.parseInt("80")		→   80
		// 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		// 단, 이때 넘겨받는 문자열 데이터는 숫자 형태여야 한다
		//									(NumberFormat)

		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("2546");
		// r = 2546;
		// 사용자가 입력한 값을 br 즉 BufferedReader 의 readLine()
		// 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 Integer.paseInt() 를 통해 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지름 변수 r 에 담아내기

		// 3. 넓이 및 둘레 계산(연산)
		//  → 각각 변수 a 와 b 에 담아내기
		a = r * r * PI;
		b = r * 2 * PI;
		

		// 결과 출력
		//  → 변수 a 와 b 에 담겨있는 값 출력
		//System.out.println(">> 넓이 : " + a);
		//System.out.println(">> 둘레 : " + b);
		/*
		원의 반지름을 입력 : 45
		>> 넓이 : 6358.5
		>> 둘레 : 282.6
		*/
		
		// >> 반지름이 45인 원의 넓이는 6358.5 이며
		// >> 반지름이 45인 원의 둘레는 282.6 이다.

		//System.out.println(">> 반지름이 " + r + " 인 원의 넓이는 " + a + " 이며");
		//System.out.println(">> 반지름이 " + r + " 인 원의 둘레는 " + b + " 이다.");

		System.out.printf(">> 반지름이 %d인 원의 넓이는 %.2f 이며,\n", r, a);
		System.out.printf(">> 반지름이 %d인 원의 둘레는 %.2f 이며,\n", r, b);

		
	}
}
