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

>> [2022년 7월]
일  월  화  수  목  금  토
==========================
                     1   2
 3   4   5   6   7   8   9
10  11  12  13  14  15  16
17  18  19  20  21  22  23
24  25  26  27  28  29  30
31
==========================
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test143_1
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 기반 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar 클래스 기반 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		// 주요 변수 선언
		int y,m;			// 사용자가 입력할 연, 월
		int w;				// 요일
		int i;				// 루프 변수

		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y < 1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m < 1 || m > 12);

		// 사용자로부터 입력받은 연(y), 월(m)을 이용하여
		// 달력의 날짜 세팅
		//cal.set(연, 월, 일);
		cal.set(y, m-1, 1);
		// 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		// 입력값에서 1을 뺀 값으로 월을 설정해야 한다
		// 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다
		// 1일의 요일 확인 필요

		// 세팅된 달력의 날짜로부터 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// 테스트
		//System.out.println(w);
		// → 연도 입력 : 2022
		//	  월 입력 : 7
		//	  6	→ 2022년 7월 기준 → 금요일 → 2022년 7월 1일은 금요일

		// 결과 출력 → 달력 그리기
		System.out.println();
		System.out.println("\t\t[" + y + "년" + m + "월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		for (i = 1; i < w; i++)
		{
			System.out.print("    ");		// 공백 4칸 발생
		}
		
		// 테스트
		//System.out.printf("%4d\n", 1);	// 1일이 맞는 위치에 찍히는지 체크
	
		// Calendar 클래스 getActualMaximum() 메소드 체크!!
		for (i = 1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;						// 반복문을 수행하며 날짜가 증가할 때 마다
										// 요일도 함께 증가할 수 있도록 처리

			if (w % 7 == 1)				// 증가한 요일이 일요일이 될 때마다
				System.out.println();	// 개행 후 출력될 수 있도록 처리
		}
		if (w%7!=1)						// 일요일 개행이 적용되지 않았을 경우만
			System.out.println();		// 개행 처리
		
		System.out.println("=============================");
		
		
	}
}