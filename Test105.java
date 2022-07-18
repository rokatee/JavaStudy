/*
■■■ 만년 달력 ■■■

다음과 같은 기능의 프로그램을 구현한다

실행 예)

연도를 입력하시오 : 2022
월을   입력하시오 : 7

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

계속하려면...
*/

/*
문제 분석
- 서기 1년 1월 1일 : 월요일
- 연도가 4의 배수이면서 100의 배수가 아니거나,
  400의 배수이면 2월은 29일(윤년),
  나머지 2월은 28일(평년)
- 만약 2022년 7월 달력을 그린다고 가정하면
  1년 1월 1일 ~ 2022년 6월 31일 까지의 날 수를 구한
  ----------------------------------
  → (1년 1월 1일 ~ 2021년 12월 31일) + (2022년 1월 1일 ~ 2022 6월 30일)
  그 날 수에 +1 연산을 수행하면...(2022년 7월 1일의 요일 확인 가능)
  
  =============================여기까지 수행하면 달력 그릴 준비 끝.

- 요일 = 전체 날 수 % 7
  요일 = 0 → 일요일
  	   = 1 → 월요일
  	   = 2 → 화요일
  				:
				:
  	   = 7 → 토요일

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test105 
{
	public static void main(String[] args) throws IOException 
	{
			//BufferedReader 클래스 인스턴스 생성 		 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// 배열 선언 및 초기화 		 // 각 달이 담고있는 마지막 날짜 (매 월의 최대 날짜) 		 
			int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
			//System.out.println(days.length);
			//12 출력됨. 		 
			
			//주요 변수 선언 		 
			int nalsu,y,m,w;		//날수,년,월,요일 		 		 
			do 	
			{
				System.out.print("『연도』 를 입력하세요:");
				y = Integer.parseInt(br.readLine());
			}
			while (y < 1);
			
			do 		 
			{
				System.out.print("『월』 을 입력하세요:");
				m = Integer.parseInt(br.readLine());
			}
			while (m<1 || m>12);
			

			// 입력받은 년도에 해당하는 2월의 마지막 날 계산 		 
			if ((y%4==0) && (y%100!=0) || (y%400)==0) //윤년이라면 		 
				days[1] = 29;
			else 		 
				days[1] = 28;
			
			//날 수 계산 		 
			// 입력받은 년 월의 이전 월까지의 날 수 누적 연산 		 
			nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

			for (int i=0; i<m-1;i++) 		 
			{
				nalsu+= days[i];
			}
			// 확인 		 
			// System.out.println(nalsu);

			//입력받은 월의 1일 		 
			nalsu+=1;
			//++nalsu;
			// System.out.println(nalsu);

			// 요일 산출 		 
			//	:입력 받은 월의 1일이 무슨 요일인지 확인하기 위한 연산 		 
			w = nalsu % 7;
			// 0:일요일 1:월요일 2:화요일 3:수요일 .... 6:월요일 		 
			//System.out.println(w);

			// 출력 (달력그리기) 		 
			System.out.println();
			System.out.printf("	[%5d년 %2d월 ]\n",y,m);
			System.out.println();
			System.out.println("  일  월  화  수  목  금  토");
			System.out.println("=============================");

			// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정) 		 			 		 
			for (int i=1; i<=w; i++) 			 
				System.out.print("    ");

			for (int i=1; i<=days[m-1]; i++) 		 
			{
				System.out.printf("%4d",i);
				w++;
				if (w%7==0)
				{
					 System.out.println();		//개행
				}
			}

			//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우 이미 일요일 개행이 		 
			//이뤄졌기 때문에 이 경우에는 추가 개행을 하지 않도록 처리 		 
			if(w%7!=0) System.out.println();
			System.out.println("=============================");
	}
}