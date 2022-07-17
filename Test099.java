/*
■■■ 클래스와 인스턴스 ■■■
   - 클래스 설계
   - 배열의 활용
   - 접근제어지시자와 정보은닉
*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
// 그래고 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스의 설계를 통해
// Test099 클래스의 main 메소드가 정상적으로 실행될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 7 15
// >> 2022년 7월 15일 → 금요일
// 계속하려면 아무 키나 누르세요...

// Hint
// - 1년 1월 1일 → "월요일"
// - 1년은 365일이 아니다
// - 2월의 마지막 날짜가 29일 → 윤년
//   2월의 마지막 날짜가 28일 → 평년
// - 윤년의 판별 조건
//      → 연도가 4의 배수이면서 100의 배수가 아니거나,
//         400의 배수이면 윤년

import java.util.Scanner;

class WeekDay
{
	
    // 변수 선언
	private int y, m, d, j;
	private int year=0, month=0, result;

	Scanner sc = new Scanner(System.in);

	// 배열 선언 및 초기화
	private char[] arr = {'월', '화', '수', '목', '금', '토', '일'};


	// 사용자 값
	void input()
	{
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// System.out.println(y);
	// System.out.println(m);
	// System.out.println(d);

	// 연산 메소드
	int cal()
	{
		// 연 → 일
		for (int i=1; i<=y-1; i++)
		{
			if (y%4==0 && y%100!=0 || y%400==0)                     // 윤년
			   year += 366;
			else                                          // 평년
			   year += 365;
		}

		// 테스트
		// System.out.println(year);


		// 월 → 일
		if (m>=1 && m<=7)
		{
		   if (y%4==0 && y%100!=0 || y%400==0)
			  month += 30*(m-1)+2;
		   else
			  month += 30*(m-1)+1;
		}
		else if (m>=8 && m<=12)
		{
		   if (y%4==0 && y%100!=0 || y%400==0)
			  month += 30*(m-1)+4;
		   else
			  month += 30*(m-1)+3;
		}
		else
		   month = 0;

		// 테스트
		// System.out.println(month);

		result = year + month + (d-1);

		j = result % 7;

		return j;
	}

	// 결과 출력 메소드
	void print(int j)
	{
	   System.out.printf(">> %d년 %d월 %d일 → %c요일%n", y, m, d, arr[j]);
	}
}

public class Test099
{
   public static void main(String[] args)
   {
		WeekDay wd = new WeekDay();

		wd.input();

		int j = wd.cal();

		wd.print(j);


		/*
		// 변수 선언
		int y, m, d, j;
		int year, month, result;
		year = month = 0;

		Scanner sc = new Scanner(System.in);

		// 배열 선언 및 초기화
		char[] arr = {'월', '화', '수', '목', '금', '토', '일'};


		// 사용자 값
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

		// System.out.println(y);
		// System.out.println(m);
		// System.out.println(d);

		// 연산 메소드
		// 연 → 일
		for (int i=1; i<=y-1; i++)
		{
			 if (y%4==0 && y%100!=0 || y%400==0)            // 윤년
				year += 366;
			 else                                          // 평년
				year += 365;
		}

		// System.out.println(year);


		// 월 → 일
		 if (m>=1 && m<=7)
		 {
			if (y%4==0 && y%100!=0 || y%400==0)
				month += 30*(m-1)+2;
			else
				month += 30*(m-1)+1;
		 }
		 else if (m>=8 && m<=12)
		 {
			if (y%4==0 && y%100!=0 || y%400==0)
			   month += 30*(m-1)+4;
			else
			   month += 30*(m-1)+3;
		 }
		 else
			month = 0;

		// System.out.println(month);

		result = year + month + (d-1);

		j = result % 7;

		// 결과 출력 메소드
		System.out.printf(">> %d년 %d월 %d일 → %c요일%n", y, m, d, arr[j]);
		*/
      
   }
}