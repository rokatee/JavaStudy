import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Iterator;
import java.util.Arrays;

class UserMenu
	{
		public static final int RESERV   = 1;	// 예매하기
		public static final int R_CHECK  = 2;	// 예매내역 확인
		public static final int R_CANCEL = 3;	// 예매 취소
		public static final int B_USER   = 0;	// 관람객 메뉴로 돌아가기
	}

class ReservMenu
{
	public static final int R_MPICK = 1;	// 영화 기준으로 예매
	public static final int R_TPICK  = 2;	// 시간 기준으로 예매
	public static final int B_MENU  = 0;	// 이전으로 돌아가기
}

//========================================================================(A)


public class User
{
	public static Vector<MovieData> mData = new Vector<MovieData>();

	private static Integer sel;						//-- 사용자 선택 값
	//public static int timeNum;					//-- timePick() 에서 사용할 변수, 사용자가 선택한 시간대 값
	public static String adminPassword="java002";	//-- 초기화면(A,12)의 관리자 비밀번호
	private static Vector<String> reservedNum;		//-- 예매번호(난수) 생성 시 사용할 벡터
	private static int adult;
	private static int teenager;
	private static int kid;
	private static int total;
	private static String bookNumber; // 예매취소 메뉴에서 사용자가 입력한 값 저장할 변수

	// 상영관에서 상영할 영화의 정보를 담는 배열
	static MovieData[] screen = new MovieData[3];

	// 상영관 회차별 좌석 정보
	boolean[][] seat11 = new boolean[5][5];
	// ~
	boolean[][] seat33 = new boolean[5][5];
	
	public static String reservNumber()  //-- 예매번호 생성 메소드
	{
		reservedNum = new Vector<String>();
		//Vector<String> reservedNum = new Vector<String>(); 
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

			for (int cnt=0; cnt< 10; cnt++)   // 0~9
			{
            n = rd.nextInt(10);      // 0 ~ 9
            num[cnt] = n;         
			}

			String str = "";
			str = Arrays.toString(num).replaceAll("[^0-9]","");	// num[10] 정수형 배열 값 문자열로 변환하여 str 변수에 저장		
			
			if (reservedNum == null)		// 백터의 첫번째 값이 있는지 없는지 
			{
				reservedNum.add(str);		// 없으면 일단 저장
			}
			else if (reservedNum.contains(str) == false)	// 있으면 그 값이 현재 저장되어 있는지 확인 후 저장
			{
				reservedNum.add(str);	// str 값 벡터에 추가
			}

		return str;

		// 위에서 생성한 10자리 숫자조합 출력 테스트
		
		//for (String nums : reservedNum)
		//{
		//	System.out.print(nums);
		//}
		//System.out.println();
		
	}

// ======================================================================================= 출력 구문 시작(구글 시트 참고)

	// 맨 처음 관리자가 비번 입력할 수 있는 화면(A,12)
	public static void firstMenu()
	{
			System.out.println("[영화 티켓 발권기] ==================");
			System.out.println();
			System.out.println("예매하려면 A 를 눌러주세요.");
			System.out.println();
			System.out.println("관리자 비밀번호를 입력해주세요");
			System.out.println();
			System.out.println("=====================================");
			
			Scanner sc = new Scanner(System.in);
			String pw = sc.next();

			System.out.println();

			if (adminPassword.equals(pw))
			{
				System.out.println("관리자 초기화면 메소드 호출");
			}
			else if (pw.equals("A") || pw.equals("a"))
			{
				// 등록된 영화 없을 경우 추가필요(B,1)
				userDisp1();
			}
			else
			{
				firstMenu(); // 틀린 번호 입력 시 재입력 화면 호출 구문(B,12)
			}	
	}

	// 관람객 모드로 전환 시 등록 영화 없을 시, 출력 구문(B,1)
	public static void userDisp2()
	{
		// mData 벡터가 null 값일 때 출력할 화면
		System.out.println("[영화 티켓 발권기] ==================");
		System.out.println();
		System.out.println("상영 중인 영화가 없습니다.");
		System.out.println("잠시만 기다려주시면 금방 영업 준비하겠습니다.");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

	// 관람객 모드로 전환 시 등록 영화 있을 시, 출력 구문
	public static void userDisp1()
	{
		System.out.println("[관람객 모드]======");
		System.out.println();
		System.out.println("1. 예매하기");
		System.out.println("2. 예매내역 확인");
		System.out.println("3. 예매 취소");
		System.out.println("===================");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print(">> 메뉴 선택 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: reserv(); break;// 예매하기 화면 출력
			case 2: reservedcheck(); break; // 예매내역 확인 화면 출력
			case 3: reservCancel(); break; // 예매취소 화면 출력
			case 0: firstMenu(); break; // 이전메뉴(초기화면) 출력
		}
	}

//========================================================================(C)

	// 1. [예매하기] 선택 후 메뉴(C,3)
	public static void reserv()
	{
		System.out.println("[예매하기] ============");
		System.out.println();
		System.out.println("분류 기준");
		System.out.println("1. 영화");
		System.out.println("2. 시간대");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: moviePick(); break;// moviePick 화면 출력
			case 2: timePick();  break; // timePick 확인 화면 출력
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

	// 1. [영화] 선택 후 메뉴 (D,2)
	public static void moviePick()
	{
		
	  /*
      for (MovieData obj : mData)  // String title, int grade, int playTime
      {
         System.out.printf("영화 제목: %s, 등급: %d, 러닝타임: %d \n", obj.getTitle(), obj.getGrade(), obj.getPlayTime());
      }
	  */
		
		//for (int i=0; i<screen.length; i++)
		//{
		//	System.out.printf("영화 제목 : %s", screen[i].title);
		//}

		for (MovieData obj : mData)  // String title, int grade, int playTime
		{
			 System.out.printf("영화 제목: %s\n", obj.getTitle());
		}

		System.out.println("[예매하기] ====================");
		System.out.println();

		System.out.println("(이름 기준 오름차순)");
		System.out.println();

		System.out.println("관리자가 등록한 영화 목록 출력");

		System.out.println();
		
		System.out.println("==============================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		if (sel>0)
		{
			moviePick2();
		}

		switch(sel)
		{
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

	// [영화선택] (E,2) 후 회차 고르기
	public static void moviePick2()
	{
		System.out.println("[예매하기] ==========");
		System.out.println();
		/*
		범죄도시2 (19) screen[sel-1].title();
		상영관 : 1관

		1회차 : 9 ~ 11
		2회차 : 11 ~ 13
		3화차 : 13 ~ 15
		*/
		
		screen[0].title = 

		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.print("회차 선택 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

//=====================================================================↑ 영화선택(moviePick)

	// 2. [시간대] 선택 (D,5)
	public static void timePick()
	{
		System.out.println("[예매하기] ============");
		System.out.println();
		System.out.println("1. 오전(9~12)");
		System.out.println("2. 오후(13~18)");
		System.out.println("3. 저녁(19~23)");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		//timeNum = sel;
		
		// 오전, 오후, 저녁(1~3) 선택하는 부분 아직 하다 맘...
		if (sel == 1)
		{
			timePick2();
		}
		if (sel == 2)
		{
			timePick2();
		}
		if (sel == 3)
		{
			timePick2();
		}

		switch(sel)
		{
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

	// [시간선택] (E, 5) 후 회차 고르기
	public static void timePick2()
	{
		System.out.println("[예매하기] ============");
		
		// 선택한 시간대에 있는 영화 데이터 불러와서 출력
		/*
		1. 9:00~11:00 범죄도시2 (19)
		2. 9:00~12:00 탑건2 (15)
		3. 9:00~13:00 미니언즈2 (전체)
		*/

		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		//timeNum = sel;
		
		// 원하는 영화 번호 선택
		// 관별로 그 시간대 회차가 다 나오는 화면이기 때문에
		// 영화리스트가 몇 개인지 알 수 없어서 일단 공백

		switch(sel)
		{
			case 0: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
		}
	}

//=====================================================================↑ 시간선택(timePick)

	// [회차 또는 영화 선택] (F,3)
	public static void movieRound()
	{
   
	   //int[] i = new int[3];	// 상영관 생성(1~3관)

	   System.out.println("[예매하기]===============");
	   System.out.println();
	   // 범죄도시2(19)
	   //09:00 ~ 11:00
	   System.out.println();
	   System.out.println("관람인원을 입력해주세요.");
	   System.out.println("잔여 좌석 : ");
	   System.out.println();   
	   System.out.println("=========================");
	   System.out.println("-1. 이전 메뉴로 돌아가기");	// 성인이 0명인 경우로 인해 일단 5로 변경
	   System.out.println();

	   Scanner sc = new Scanner(System.in);

	   System.out.print("성인 : ");
	   adult = sc.nextInt();
	   System.out.print("청소년 (~18) : ");
	   teenager = sc.nextInt();
	   System.out.print("어린이 (~14) : ");
	   kid = sc.nextInt();

	   total = adult + teenager + kid;
	   
	   // [상영관보다 많은 인원 입력 시] (G,6)
	   if (total > 25)
	   {
		    System.out.println("[예매하기] ==========================");
			System.out.println();
			System.out.println("해당 상영관의 좌석수가 부족합니다.");
			System.out.println("다시 선택해주세요.");
			System.out.println();
			System.out.println("=====================================");
			System.out.println();

			movieRound();
	   }
	
	   sel = sc.nextInt();

	   System.out.println();

	   switch(sel)
	   {
	    	case -1: userDisp1(); break; // 이전화면 출력(관람객모드 처음 화면)
	   }

   }

   // [상영 불가 연령대 기입 시] (G,2) > 관리자 메뉴에서 기능 끌어오면 조건문 써서 movieRound() 안에 넣기
	public static void adultMovie()
	{
		System.out.println("[예매하기] ==========================");
		System.out.println();
		System.out.println("(영화제목)은 ()세 미만 관람불가 영화입니다.");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		System.out.println();
		timePick();
	
	}


	// [인원 입력] (G,3)
	public static void seatPick()
	{
		int row;
		int col;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("[예매하기] ==========");
		System.out.println();
		System.out.println("원하는 좌석을 선택해주세요.");
		System.out.println("총인원은 3명입니다");
		System.out.println();
		System.out.println("  1  2  3  4  5 ");
		System.out.println("E ㅁ ㅁ ㅁ ㅁ ㅁ");
		System.out.println("D ㅁ ㅁ ㅁ ㅁ ㅁ");
		System.out.println("C ㅁ ㅁ ㅁ ㅁ ㅁ");
		System.out.println("B ㅁ ㅁ ㅁ ㅁ ㅁ");
		System.out.println("A ㅁ ㅁ ㅁ ㅁ ㅁ");
		System.out.println("------------------");
		System.out.println();
		System.out.println("===================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		

		int[][] arr = new int[5][5]; // 상영관 좌석 배열 5*5
		int n=1; // 반복문에 넣을 값 저장 변수

		/* 구상하다가 말음.. 일단 다른 부분 끝나면 다시 생각해보기로;;
		for (int i=0; i<arr.length; i++)
		{
			n++;
			for (int j=0; j<i.length; j++)
			{

			}
		} >> total 변수 값 만큼 좌석 수 선택 반복하고 다음화면
		*/ 
		
	}

	// [좌석 중복] (H,3)  >> 좌석 선택 화면 기능 완료되면 그쪽 메서드 내 조건문으로 넣어도 될 듯함
	public static void redun()
	{
		System.out.println("[예매하기] ==========================");
		System.out.println();
		System.out.println("이미 선택된 좌석입니다");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		seatPick();	// 좌석 선택하는 화면으로 전환(G,3)
	}

	// [좌석 선택 가능] (H,4)  >> 예매번호 부분은 완성, 그외 다른 값들은 가져와야 함;;
	public static void seatPick2() 
	{
		reservNumber();		// 난수 생성
		String str="";		// 문자열 변수 선언
		str = reservedNum.lastElement();	// 생성된 예매번호를 str 문자형 변수에 저장(밑에 결제취소할 경우 삭제처리 하기 위해)

		System.out.println("[예매하기] ==========");
		
		System.out.print("예매번호 : " + str); // 예매번호 불러와서 적용해야 함
		System.out.println();
		System.out.println("영화 : ");
		System.out.println("시간 : ");
		System.out.println("상영관 :  관");
		System.out.println("좌석 : ");
		
		System.out.println("결제하시겠습니까? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{		
				seatPick3(); // 예매가 완료되었다는 문구 출력하는 화면
			}
			
			// 관람객 메뉴로 돌아가기 (I,5)
			else if (sel2.equals("n") || sel2.equals("N"))
			{	
				reservedNum.remove(str);
				userDisp1();
				//reservCancel(); // 테스트(영화 예매번호 조회해서 취소하는 화면) > 취소 하겠다고 했을 때 저장된 값 삭제되는것 확인완료
				
			}

			else if (sel2.equals("0"))	// 관람객 초기 화면으로 돌아간다고 할 경우
			{
				reservedNum.remove(str); // 생성한 난수값 삭제
				userDisp1();
			}

			else
			{
				reservedNum.remove(str);
				System.out.println("존재하지 않는 기능입니다.");
				System.out.println("관리자를 호출해주세요.");
				System.out.println();
			}
		}

	
	// 좌석 선택 기능에서 Y 누른 후 화면(I,4)
	public static void seatPick3()
	{
		String tempNumber = reservNumber();

		System.out.println("[예매하기] ==============");
		
		System.out.println(); 
		System.out.printf("예매번호 %s", tempNumber);
		System.out.println("예매가 완료되었습니다.");
		System.out.println();
		System.out.println("0. 관람객 메뉴로 돌아가기");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); // 이전화면 출력(관람객모드 처음 화면)
		}
	}

// ============================================================ ↑ 예매하기

	// [예매내역 확인]하는 메서드 (C,7)
	public static void reservedcheck()
	{
		System.out.println("[예매내역 확인] ==========");
		System.out.println();
		System.out.println("예매번호를 입력해주세요.");
		System.out.println();	
		System.out.println("==========================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매번호 : ");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();

		System.out.println();
			
			if (bookNumber.equals("0"))
			{
				userDisp1(); // 이전화면 출력(관람객모드 처음 화면)
			}

			if (reservedNum.contains(bookNumber)==true)	// str 문자값(예매번호)이 reservedNum(벡터) 값에 없는 경우 
			{
				reservedcheck2();// 다음 화면(예매내역 확인 화면 D열) 전환
			}

			if (reservedNum == null)
			{
				reservedcheck3();
			}

			else
			{
				reservedcheck3();// 없는 예매번호 입력 시 화면 전환
			}
	}

	// [예매번호 입력] (D,7)
	public static void reservedcheck2()
	{
		System.out.println("[예매내역 확인] ==============");
		
		System.out.println(); 
		System.out.print(  "예매번호 : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : ");
		System.out.println("시간 : ");
		System.out.println("상영관 : ");
		System.out.println("인원 : ");
		System.out.println("좌석 : ");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==============================");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); // 이전화면 출력(관람객모드 처음 화면)
		}
		
	}

	// 없는 예매번호 입력 시 (D,8)
	public static void reservedcheck3()
	{
		System.out.println("[예매내역 확인] ==============");
		
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		reservedcheck(); 
	}


	

// ======================================================== ↑ 예매내역 확인	
	

	// 예매 취소 첫 화면(예매 번호 입력하는 문구포함) (C,10)
	public static void reservCancel()
	{
		System.out.println("[예매취소] ==============");
		System.out.println();
		System.out.println("예매 번호 입력(10자리) : "); 
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();

		System.out.println();
			
			if (bookNumber.equals("0"))
			{
				userDisp1(); // 이전화면 출력(관람객모드 처음 화면)
			}

			if (reservedNum.contains(bookNumber)==true)	// str 문자값(예매번호)이 reservedNum(벡터) 값에 없는 경우 
			{
				reservCancel2();// 다음 화면(예매번호 입력화면 D열) 전환
			}

			if (reservedNum == null)
			{
				reservCancel3();
			}

			else
			{
				reservCancel3();// 없는 예매번호 입력 시 화면 전환
			}

	}


	// [예매번호 입력] (D,9)
	public static void reservCancel2()
	{
		System.out.println("[예매취소] ==============");
		
		System.out.println(); 
		System.out.print("예매번호 : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : ");
		System.out.println("시간 : ");
		System.out.println("상영관 : ");
		System.out.println("인원 : ");
		System.out.println("좌석 : ");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=========================");

		System.out.println("정말 취소하시겠습니까? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{		
				reservCancelY(); // 예매가 취소되었다는 문구 출력하는 화면
			}

			else if (sel2.equals("n") || sel2.equals("N"))
			{		
				reservCancel(); // 이전메뉴(예매번호 입력하는 화면)로 돌아가는 화면
			}

			else if (sel2.equals("0"))
			{
				userDisp1();
			}

			else
			{
				System.out.println("존재하지 않는 기능입니다.");
				System.out.println("관리자를 호출해주세요.");
				System.out.println();
			}
	}

	// 없는 예매번호 입력 시 (D,8), (D,11)
	public static void reservCancel3()
	{
		System.out.println("[예매취소] ==============");
		
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();

		System.out.println("=========================");
		System.out.println();

		reservCancel(); 
	}

	// [예매 취소] (E,9)
	public static void reservCancelY()
	{
		System.out.println("[예매취소] ==============");
		
		System.out.println(); 
		System.out.println("예매를 취소했습니다.");

		System.out.println("0. 관람객 메뉴로 돌아가기");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); // 이전화면 출력(관람객모드 처음 화면)
		}
	}

// ============================================================ ↑ 예매취소
	
	public static void main(String[] args) 
	{
		reservNumber();

		//mData.add(new MovieData("미니언즈2", 0,60));
		mData.add(new MovieData("미니언즈2"));
		// screen[0].title = "미니언즈2";
		// screen[0].grade = "0";
		// screen[0].palyTime = "60";

		// 테스트(확인)
		firstMenu();
		//userDisp1();
		//reservNumber();
		//timePick();
		//seatPick2();
		//reservCancel();
		//menuSelect();
		
		
		//int n = sc.nextInt();

		//User us = new User();
		//User.toString();
	}
}
