/*
■■■ 클래스와 인스턴스 ■■■
	- 클래스 설계
	- 배열의 활용
	- 접근 제어 지시자와 정보은닉
*/

/*
	사용자로부터 년, 월, 일을 입력받아
	해당 날짜의 요일을 출력하는 프로그램을 구현
	단, 달력 클래스(Calendar)는 사용하지 않는다
	또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다 (→ WeekDay 클래스 설계)
	그리고 배열의 개념도 적용시켜 작성할 수 있도록 한다
	접근 제어 지시자의 개념도 확인하여 작성할 수 있도록 한다
	최종적으로 WeekDay 클래스의 설계를 통해
	Practice099 클래스의 main() 메소드가 정상적으로 실행될 수 있도록 한다

	실행 예)
	년 월 일 입력(공백 구분) : 2022 7 15
	>> 2022년 7월 15일 → 금요일
	계속하려면...

	Hint
	- 1년 1월 1일 → "월요일"
	- 1년은 365일이 아니다
	- 2월의 마지막 날짜가 29일 → 윤년
	  2월의 마지막 날짜가 28일 → 평년
	- 윤년의 판별 조건
		→ 연도가 4의 배수이면서 100의 배수가 아니거나,
		   400의 배수이면 윤년
*/

import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언
	Scanner sc = new Scanner(System.in);
	int y,m,d;
	int year=0, month=0;
	int yoil, ilsoo;

	// 배열 선언 및 초기화
	char[] result = {'일', '월', '화', '수', '목', '금', '토'};

	// 사용자 값
	void input()
	{
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}
	// 테스트
	//System.out.println(y);
	//System.out.println(m);
	//System.out.println(d);
	

	// 일수 연산 메소드
	int ilsoo()
	{
		// 연 → 일
		for (int i = 1; i < y; i++)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				year += 366;			// 윤년
			else
				year += 365;			// 평년
		}
		// 테스트
		//System.out.println(year);
			
		// 월 → 일
		if (m >=1 && m <= 7)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				month = (m-1)*30+2;		// 윤년
			else
				month = (m-1)*30+1;		// 평년
		}
		
		if (m >=8 && m <= 12)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				month = (m-1)*30+4;		// 윤년
			else
				month = (m-1)*30+3;		// 평년
		}
		// 테스트
		//System.out.println(month);

		//
		ilsoo = d + month + year;
		yoil = ilsoo % 7;

		return yoil;
	}
	
	// 결과 출력 메소드
	void print(int yoil)
	{
		System.out.printf(">> %d년 %d월 %d일 → %c요일\n",y,m,d,result[yoil]);
	}
		
}

public class Test099
{
	public static void main(String[] args)
	{
		WeekDay_P wd= new WeekDay_P();
		wd.input();
		int yoil = wd.ilsoo();
		wd.print(yoil);
	}
}