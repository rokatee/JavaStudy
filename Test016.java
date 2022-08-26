/*
■■■ 자바의 개요 및 특징 ■■■
	- 자바 기본 입출력 : System.out.printf()
*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");				// \n 개행

		System.out.println();					// println 내용 없으면 공백 출력(개행)
		//System.out.print();					// print   내용 없으면 컴파일 에러 발생
		
		System.out.print("\n");					// 공백 출력하려면 개행문자 입력
		//System.out.print(\n);					// 문자열이 아닌 개행문자 입력하면 컴파일 에러 발생
		System.out.printf("123456");
		System.out.printf("123456\n");			// \n 개행
		System.out.printf("123456%n");			// %n 개행
		//System.out.printf();					// 내용 없으면 컴파일 에러 발생

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		
		System.out.printf("%5d\n", 123);		// %5d = 숫자를 포함해 5만큼의 공간을 확보하고
		System.out.printf("%10d\n", 123);		// %10d = 숫자를 포함해 10만큼의 공간을 확보하고
		
		/*										// 우측 정렬하여 숫자가 출력 됨
												// (왼편에 공백 넣고 오른편에 숫자)
		   123									// ex) --123
		       123								// ex) -------123
		*/

		System.out.printf("%010d\n", 123);		// %010d = 숫자를 포함해 10만큼의 공간을 확보하고
												// 입력한 숫자 앞의 공간에 0을 채워 넣는다
												// 0000000123

		System.out.printf("%+d\n", 123);		// +123 → %+d 혹은 +%d 하면 +가 문자로 출력 됨
		System.out.printf("+%d\n", 123);		// +123 
		System.out.printf("%d\n", +123);		// 123 → 앞에 + 를 붙여도 양수이기에 그냥 365가 출력 됨

		//System.out.printf("%-d\n", 123);		// 런타임 에러
		System.out.printf("-%d\n", 123);		// 음수는 -%d 로 해야 에러가 안 나옴
		System.out.printf("%d\n", -123);		// 음수는 그냥 숫자에 - 를 붙여도 된다

		System.out.printf("%c\n", 'A');			// 문자 출력은 %c
		//System.out.printf("%c\n", "ABCD");	// %c 로 문자열 출력시 런타임 에러
		System.out.printf("%s\n", "ABCD");		// 문자열 출력은 %s
			
		System.out.printf("%h\n", 123);			// 16진수
		System.out.printf("%o\n", 123);

		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);		// boolean 은 %b
		
		System.out.printf("%f\n", 123.45);		// 실수			
		System.out.printf("%.2f\n", 123.456);	// 소수점 이하 두 번째 자리까지 반올림하여 표현		
		System.out.printf("%.2f\n", 123.451);	// 위와 결과 다름 (세 번째 자리에서 버려져서)
		
		System.out.printf("%8.2f\n", 123.456);	// 8개 자리 확보 후 소수점 버리지는 3번째는 제외하고 숫자 넣는다
												// → --123.46
		System.out.printf("%2.2f\n", 123.456);	// → 123.46
	}
}

/*
실행 결과


AAABBBCCC


123456123456
123456
10 + 20 = 30
  123
       123
0000000123
+123
+123
123
-123
-123
A
ABCD
7b
173
true
false
123.450000
123.46
123.45
  123.46
123.46
계속하려면 아무 키나 누르십시오 . . .

*/