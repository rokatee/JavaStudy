/*
■■■ 자바의 개요 및 특징 ■■■
	- 산술 연산자
	- BufferedReader
	- printf()
*/

/*
사용자로부터 임의의 정수를 두 번 입력받아
사칙연산 및 나머지 연산을 수행하여
그 결과를 출력하는 프로그램을 구현한다.

단, 입력받는 과정은 BufferedReader 를 활용할 수 있도록 학
출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.
또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.

실행 예)
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

====결과====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
============
계속하려면 아무 키나 누르세요....

*/

//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		
		// 주요 변수 선언
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//Scanner sc = new Scanner(System.in);


		int num1, num2;							// 사용자 입력값을 담을 변수
		int res1, res2, res3, res4, res5;		// 각각의 연산 결과를 담을 변수
		

		// 연산 및 처리
		System.out.println("<<두 가지 정수 입력 프로그램>>");
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		//num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		//num2 = sc.nextInt();
		
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// 결과 출력
		System.out.printf("\n====결과====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);

		System.out.printf("%d %% %d = %d\n", num1, num2, res5);
		//printf() 에서는 % 는 뒤에 어떤 타입의 문자가 올 지에 대한 옵션이다
		//그러므로 %를 퍼센트 수식으로 사용하려면 2번(%%) 작성 해야 한다.

		System.out.printf("============\n");



	}

}


/*
실행 결과

<<두 가지 정수 입력 프로그램>>
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

====결과====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
============
계속하려면 아무 키나 누르십시오 . . .

*/