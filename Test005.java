// 자바의 개요 및 특징
//  - 변수와 자료형
//  - 키워드 및 식별자
//  - printf()



public class Test005
{
	public static void main(String[] args)
	{

		// 변수 선언(메모리 확보) 및 초기화(메모리에 값 할당)
		int a = 10, b = 5;

		//변수 선언
		int c, d;
		
		// 연산 및 처리
		c = a + b;		// a + b 의 결과값을 변수 c에 대입하라.
		d = a - b;		// a - b 의 결과값을 변수 d에 대입하라.


		// 결과 출력 --> 10 + 5 = 15 의 형태로 출력 해보시오.
		System.out.println(a + " + " + b + " = " + c);
		/*
		자바에서는 서로 다른 자료형의 데이터들끼리도
		+ 연산이 가능하며
		다른 어떤 자료형과 문자열 데이터의 + 연산 결과는 문자열
		즉, 문자열 결합 연산자로서 +
		*/

		// print() / println() / printf() / format()
		// printf() / format() --> JDK 1.5 부터 지원되는 메소드

		// System.out.printf("O + O + O", 10, 20, 30);
		System.out.printf("%d + %d = %d%n", a, b, c);
		
		System.out.printf("%d + %d = %d%n", 1, 2, 3);
		System.out.printf("%d + %d = %d\n", 2, 3, 5);
		// %d 는 10진수 정수형(서식 지정 옵션)
		// 여기서 d 라 함은 decimal(10진수)를 말함
		// %n(\n) 는 개행

		//System.out.printf("ㅇ 와 ㅁ/n", 10, 3.14); 
		//System.out.printf("%d 와 %d/n", 10, 3.14); 
		// --> 런타임 에러(ctrl 2에서 발생하는 에러)
		
		System.out.printf("%d 와 %f\n", 10, 3.14);
		// --> 10와 3.1400000
		// %f 는 실수형 서식 지정 옵션
		
		System.out.printf("%d 와 %.2f\n", 10, 3.14);
		// --> 10와 3.14
		// %.2f 는 소수점 이하 2 번째 자리까지 표현
		
		System.out.printf("%f%n", 3.141592);
		// --> 3.141592

		System.out.printf("%.4f%n", 3.141592);
		// --> 3.1416 
		// --> 반올림 발생

		

	}
}


//실행 결과

/*
10 + 5 = 15
10 + 5 = 15
1 + 2 = 3
2 + 3 = 5
10 와 3.140000
10 와 3.14
3.141592
3.1416
*/