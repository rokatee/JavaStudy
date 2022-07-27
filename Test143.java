/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
*/

/*
○ java.util.Calendar 클래스는
	날짜와 시간을 객체 모델링화 한 클래스로
	연, 월, 일, 요일, 시, 분, 초까지의
	시간과 날짜와 관련된 정보를 제공한다
	그리고, Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
	실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
	GregorianCalendar 클래스에 정의되어 있다

	시스템으로부터 현재 시스템 시간 정보를 얻어올 때
	getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다
	생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
	이 객체가 생성되면 갖고있는 시간 정보들은
	get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다

	getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
	돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
	구할 수도 있다


○ 실습 문제
	사용자로부터 연, 월을 입력받아
	달력을 그려주는(출력하는) 프로그램을 구현한다
	단, Calendar 클래스를 활용하여 작성할 수 있도록 한다
	※ API Document 참조하여 getActualMaximum() 메소드의 활용 방법 검토할 것

실행 예)
연도 입력 : 0
연도 입력 : 2022
월 입력 : -20
월 입력 : 16
월 입력 : 7

        [ 2022년  7월 ]

  일  월  화  수  목  금  토
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
=============================
*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test143
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();
		int y,m;			//-- 사용자로부터 입력받은 년, 월을 담을 변수

		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y < 1);

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m < 1 || m > 12);
		
		// 날짜 세팅하기
		ob.set(y, m-1, 1);

		int w = ob.get(Calendar.DAY_OF_WEEK)-1;					//-- 요일 시작점을 받아와 변수 w에 담는다.

		int days = ob.getActualMaximum(Calendar.DAY_OF_MONTH);	//-- 해당 월의 마지막 일을 받아와 변수 monthDays에 담는다.

		// 출력 (달력그리기) 		 
		System.out.println();
		System.out.printf("	[%5d년 %2d월 ]\n",y,m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		//-- 해당 날짜의 첫 시작점(요일)이 w 이므로, 『i=1』로 시작해주고 시작점 전까지 공백 처리 시켜준다.
		for (int i=1; i <= w; i++) 			 
			System.out.print("    ");	// 아래 숫자 영역이 %4d 이므로 공백또한 4칸으로 처리해준다.
		
		for (int i=1; i <= days; i++) 		 //-- 해당 월의 1일 부터 마지막 날짜까지 숫자를 기입한다.
		{
			System.out.printf("%4d",i);
			w++;
			if (w%7==0)						//-- 7로 나누어 떨어지면 개행을 하되 마지막 일수가 있는 날은 바로 개행을 시켜버린다.
			{
				 System.out.println();		//개행
			}
		}

		//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우 이미 일요일 개행이 		 
		//이뤄졌기 때문에 이 경우에는 추가 개행을 하지 않도록 처리 		 
		if(w%7!=0) 
			System.out.println();
		System.out.println("=============================");
	}
}

/*
실행 결과

        [ 2022년  7월 ]

  일  월  화  수  목  금  토
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
=============================
계속하려면 아무 키나 누르십시오 . . .
*/