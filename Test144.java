/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
*/

/*
○ 실습 문제
	
	오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
	확인하여 결과를 출력하는 프로그램을 구현한다

	실행 예)
	오늘 날짜 : 2022-07-26 화요일
	몇 일 후의 날짜를 확인하고자 하십니까? : 200

	========[확인 결과]========
	200일 후 : xxxx-xx-xx x요일
	===========================
	계속하려면...

※ Calendar 와 관련한 API Document 참조
	- add() 메소드 확인~!!
		: 현재 날짜를 기준으로 날 수 더하는 연산 메소드
		  객체.add(Calendar.DATE, 날수);
*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		Calendar cal = new GregorianCalendar();

		int y,m,d,w;		// 연,월,일,요일
		int addDate;		// 사용자 입력할 추가 일수
		

		// 오늘 날짜 받아오고(→ get() 메소드 활용)
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;	// 월을 받아올 땐 +1
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// 요일 배열(방법 1) - 이 방법은 추가 날짜 결과 출력할 때 요일의 초기화가 필요없음
		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, week[w-1]);
		
		// 요일 반복문(방법 2)
		//String week = " ";
		//switch (w)
		//{
		//	case 1 : week = "일요일"; break;
		//	case 2 : week = "월요일"; break;
		//	case 3 : week = "화요일"; break;
		//	case 4 : week = "수요일"; break;
		//	case 5 : week = "목요일"; break;
		//	case 6 : week = "금요일"; break;
		//	case 7 : week = "토요일"; break;
		//}

		//System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y,m,d,week);

		
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			addDate = sc.nextInt();
		}
		while (addDate < 1);	// 추가 날짜는 1일 이상

		System.out.println();	// 개행
		
		// add(int field, int amount) - 주어진 Calendar Field에 특정 일수만큼 날짜에 더해주는 메소드 
		// 객체.add(Calendar Field Detail, 날수);
		// ex) add(Calendar.DAY_OF_MONTH, -5)
		cal.add(Calendar.DATE,addDate);
		


		// 날짜 초기화(결과 출력 방법 1)
		// 날짜를 추가 후 추가된 날짜를 다시 불러와야 하므로 날짜 초기화를 해주어야 한다
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// 요일 반복문(방법 2) - 날짜 초기화
		//switch (w)
		//{
		//	case 1 : week = "일요일"; break;
		//	case 2 : week = "월요일"; break;
		//	case 3 : week = "화요일"; break;
		//	case 4 : week = "수요일"; break;
		//	case 5 : week = "목요일"; break;
		//	case 6 : week = "금요일"; break;
		//	case 7 : week = "토요일"; break;
		//}

		System.out.println("========[확인 결과]========");
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, week[w-1]);
		//System.out.printf("%d일 후 : %d-%d-%d %s\n",addDate, y, m, d, week);		// 요일 반복문(방법 2)를 위한 출력문
		System.out.println("===========================");
		
		
		// 날짜 초기화 없이(결과 출력 방법 2)
		/*
		System.out.println("========[확인 결과]========");
		System.out.printf("%d일 후 : %tF %tA\n",addDate, cal,cal);
		System.out.println("===========================");
		*/
		// 만년타입은 숫자타입으로 계산한거고, 이건 날짜를 불러오는 거임
		// %tF 는 날짜, %tA 는 요일 불러오는 것임
		
		// String.format("%tF", 달력 객체);
		// → 년-월-일 형태의 문자열 반환

		// String.format("%tA", 달력 객체);
		// → 요일 형태의 문자열 반환
	}
}

/*
실행 결과

오늘 날짜 : 2022-7-26 화요일
몇 일 후의 날짜를 확인하고자 하십니까? : 1

========[확인 결과]========
오늘 날짜 : 2022-7-27 수요일
===========================
계속하려면 아무 키나 누르십시오 . . .


오늘 날짜 : 2022-7-26 화요일
몇 일 후의 날짜를 확인하고자 하십니까? : 174

========[확인 결과]========
오늘 날짜 : 2023-1-16 월요일
===========================
계속하려면 아무 키나 누르십시오 . . .

*/