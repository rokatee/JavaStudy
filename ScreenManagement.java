import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

// 상영관 관리 메뉴 메뉴판
class SConMenu
{
	public static final int UP_SCREEN = 1;	// 상영 영화 등록
	//public static final int UP_ROUND = 2;	// 상영관 회차 관리 (▶ 상영관 당 스크린 타임이 고정되면서 삭제)
	public static final int S_DISP  = 2;	// 상영관 이용 내역
}

//▼AdminCall로 이동
//class AdminMenu
//{
//	public static final int M_MANAGE  = 1;	// 상영 영화 관리
//	public static final int S_MANAGE  = 2;	// 상영관 관리
//	public static final int B_ADMIN  = 0;	// 관리자 메뉴로 돌아가기
//}

// Vector 생성용 데이터 클래스
public class ScreenManagement extends AdminCall
{
	//▼변수 클래스로 이동
	//주요 속성 구성
	//public static String tempTitle;
	//public static int tempIndex = -1;

	//private static Integer sel;
	//private static BufferedReader br;

	//private static Vector<MovieData> vt;
	////private static Vector<MovieData> screen;		// 각 관에서 상영할 영화 정보를 담을 배열
	//static MovieData[] screen = new MovieData[3];	
	//static int[] sTime = new int[3];				// 각 관의 스크린 타임

	//int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

	//// static 초기화 블럭
	//static
	//{
	//	// Vector 자료 구조 생성
	//	vt = new Vector<MovieData>();
	//	//screen = new Vector<MovieData>();

	//	// BufferedReader 인스턴스 생성
	//	br = new BufferedReader(new InputStreamReader(System.in));

	//	// 사용자 입력값 초기화
	//	sel = 1;
	//}

// ------------------------------------------------------------------------------------------------

// ▼AdminCall로 이동
// 관리자 메뉴 출력 메소드
//	public static void AmenuDisp() throws IOException
//	{
//		System.out.println("\n[관리자 모드]==================\n");
//		System.out.println("1. 상영 영화 관리");
//		System.out.println("2. 상영관 관리");
//		System.out.println();
//		System.out.println("0. 이전 메뉴로 돌아가기");
//		System.out.println("===============================");
//	
//		do
//		{
//			System.out.print("\n메뉴 선택 : ");
//			sel = Integer.parseInt(br.readLine());
//		}
//		while (sel<1 || sel>2);
//		
//		System.out.println();

//		AmenuRun();
//	}

//	// 관리자 메뉴 선택에 따라 기능 호출 메소드
//	public static void AmenuRun() throws IOException
//	{
//		switch (sel)
//		{
//			//case AdminMenu.M_MANAGE : movieManage(); break;
//			case AdminMenu.S_MANAGE : screenManage(); break;
//			default : System.out.println(">> 잘못된 메뉴 선택입니다."); break;
//		}

//		System.out.println();
//	}
// ------------------------------------------------------------------------------------------------

	// 2. 상영관 관리 메뉴 출력 
	public void screenManage() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println("\n[상영관 관리]=================================\n");
		System.out.println("1. 상영할 영화 등록");
		//▼상영관 당 스크린 타임이 고정되면서 삭제
		//System.out.println("2. 회차 관리");
		System.out.println("2. 상영 중인 영화 내역");
		System.out.println();
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println  ("==============================================");
		
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2 && sel!=99);
		
		System.out.println();

		screenManageRun();
	}

// ------------------------------------------------------------------------------------------------

	// 2. 상영관 관리 메뉴 출력에서 선택한 기능 호출
	public void screenManageRun() throws IOException
	{
		switch (sel)
		{
			//▼상영관 당 스크린 타임이 고정되면서 삭제
			//case SConMenu.UP_ROUND  : updateRound_S(); break;
			case SConMenu.UP_SCREEN :
				updateScreen_M();
				break;
			case SConMenu.S_DISP	:
				dispScreen();
				break;
			case 99					:
				AmenuDisp();
				break;
			default					:
				System.out.println("\n>> 잘못된 메뉴 선택입니다.");
				break;
		}

		System.out.println();
	}

// ------------------------------------------------------------------------------------------------
	// 상영할 영화 등록 메소드
	
	// 상영할 영화 선택화면
	public void updateScreen_M() throws IOException
	{
		//▼관리자 메뉴로 돌아갈 방법 연구
		//BackAMenu bAM = new BackAMenu();

		int i = 0;		    
		System.out.println("\n[상영할 영화 등록] ===========================\n");

		for (Object temp : vt)
		{
			System.out.printf( "%d. %s\n", (i+1), ( (MovieData)temp ).getTitle() );

			i++;
		}

		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("==============================================");

		System.out.print("\n영화 선택(제목 입력) : ");
		tempTitle = br.readLine();
		
		int x = 0;

		for (int n=0; n<vt.size(); n++)
		{
			boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);

			if (flag)
				x = 1;
		}

		switch (tempTitle)
		{
			case "0"  :
				screenManage();
				break;
			case "99" :
				AmenuDisp();
				break;
			default   :
				if (x == 1)
				{
					updateScreen_S();
					break;
				}
				else
				{
					System.out.println("\n등록되지 않은 영화입니다.");
					updateScreen_M();
				}

		}
	}
// ------------------------------------------------------------------------------------------------

	// 선택한 영화 상영관 배정
	public void updateScreen_S() throws IOException
	{
		//▼관리자 메뉴로 돌아갈 방법 연구
		//BackAMenu bAM = new BackAMenu();

		// updateScreen_M()에서 선택한 영화가 담겨있는 vt의 인덱스값 구하기
		for (int n=0; n<vt.size(); n++)
		{
			boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);

			if (flag)
				tempIndex = n;
		}

		// 현재 상영관 이용 내역 표시				   
		System.out.println("\n[상영할 영화 등록] ==============================\n");
		System.out.println();
		
		System.out.printf("선택한 영화는 %s(%d분)입니다.\n", tempTitle, vt.get(tempIndex).getPlayTime() );
		
		System.out.println();

		System.out.println("현재 상영관 이용내역은 다음과 같습니다.");

		System.out.println();

		System.out.println("1관");
		System.out.println(sTime[0] + "분");

		System.out.println();

		System.out.println("2관");
		System.out.println(sTime[1] + "분");

		System.out.println();

		System.out.println("3관");
		System.out.println(sTime[2] + "분");

		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println ("=================================================");

		do
		{
			System.out.println("\n이미 사용 중인 상영관을 선택할 시 상영 영화가 변경됩니다.");
			System.out.print("상영관 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<0 || sel>3 && sel!=99);

		switch (sel)
		{
			case 0  :
				updateScreen_M();
				break;
			case 99 :
				AmenuDisp();
				break;
		}

		// 영화의 러닝 타임과 상영관에 할당된 스크린 타임을 비교하여 상영 가능한가 여부 판단
		if (sTime[sel-1] >= vt.get(tempIndex).getPlayTime())
		{
			// 입력받은 상영관에 해당하는 배열에 벡터 자료구조에 저장된 데이터 전달
			screen[sel-1] = new MovieData();
			screen[sel-1].title = vt.get(tempIndex).getTitle();
			screen[sel-1].grade = vt.get(tempIndex).getGrade();
			screen[sel-1].playTime = vt.get(tempIndex).getPlayTime();
			//MovieData md(sel) = new MovieData();
			//md(sel).setName( vt.get(tempIndex).getTitle() );
			//md(sel).setGrade( vt.get(tempIndex).getGrade() );
			//md(sel).setPlayTime( vt.get(tempIndex).getPlayTime() );
			
			updateScreen_C();

		}
		else
		{					    
			System.out.println("\n[상영할 영화 등록] ==============================\n");
			
			System.out.println();

			System.out.println("해당 상영관에서 상영이 불가능한 영화입니다.");
			
			System.out.println();

			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("99. 관리자 메뉴로 돌아가기");
			System.out.println ("=================================================");

			sel = Integer.parseInt(br.readLine());
		}

		switch (sel)
		{
			case 0  :
				updateScreen_M();
				break;
			case 99 :
				AmenuDisp();
				break;
		}
	}

// ------------------------------------------------------------------------------------------------
	
	// 등록 완료 메소드
	public void updateScreen_C() throws IOException
	{
		//▼관리자 메뉴로 돌아갈 방법 연구
		//BackAMenu bAM = new BackAMenu();
						    
		System.out.println("\n[상영할 영화 등록] ==============================\n");

			System.out.printf("%d관에서 %s이(가) %d회차까지 상영됩니다.\n", sel, vt.get(tempIndex).getTitle(), 900/sTime[sel-1]);

			System.out.println();
			
			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("99. 관리자 메뉴로 돌아가기");
			System.out.println("=================================================");

			sel = Integer.parseInt(br.readLine());

			switch (sel)
			{
				case 0  :
					updateScreen_M();
					break;
				case 99 :
					AmenuDisp();
					break;
			}
	}

// ------------------------------------------------------------------------------------------------
	//▼상영관 당 스크린 타임이 고정되면서 삭제
	// 회차 관리 메소드
	/*
	// 회차 관리할 상영관 선택 메뉴
	public static void updateRound_S() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println("\n[회차 관리] ==============");
		
		System.out.println();

		System.out.println("1관");
		System.out.println("2관");
		System.out.println("3관");
		
		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("==========================");

		System.out.println();

		do
		{
			System.out.print("상영관 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<0 || sel>3 && sel!=99);

		switch (sel)
		{
			case 0  : screenManage(); break;
			case 99 : AmenuDisp(); break;
		}

		updateRound_T();
	}

	// 선택한 상영관의 스크린 타임 설정 메뉴
	public static void updateRound_T() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println("\n[회차 관리] =====================");

		System.out.println();

		System.out.printf("선택한 상영관은 %d관입니다.\n", sel);
		System.out.print("회차 당 할당할 시간을 설정해주세요.\n");

		System.out.println();

		System.out.println("=====================================");

		System.out.println();
		
		System.out.print("회차 당 시간 : ");
		sTime[sel-1] = Integer.parseInt(br.readLine());


		// 입력 완료 화면 출력
		System.out.println("\n[회차 관리] ==============");

		System.out.println();

		System.out.println("회차 등록이 완료되었습니다.");

		System.out.println();
		
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("==========================");
		
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 0  : updateRound_S(); break;
			case 99 : AmenuDisp(); break;
		}
	}
	*/
// ------------------------------------------------------------------------------------------------
// 상영 중인 영화 목록 출력

	public void dispScreen() throws IOException
	{
		//int i = 0;
		//BackAMenu bAM = new BackAMenu();
							
		System.out.println("\n[상영 중인 영화 내역] ===========================\n");
		
		// ▼NullPointerException 처리가 필요해지면서 수정
		//for (Object temp : vt)
		//{
		//	System.out.println("\n" + (i+1) + "관");
		//	System.out.println( ( (MovieData)temp ).getTitle() );
		//	System.out.println();

		//	i++;
		//}

		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("%d관\n", i+1);

			try
			{
				System.out.println(screen[i].title);
				System.out.println();
			}
			catch (NullPointerException e)
			{
				System.out.println("상영 중인 영화가 없습니다.");
				System.out.println();
			}
		}

		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("=================================================");

		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 99 :
				AmenuDisp();
				break;
		}
	}
	
	// 파일 통합 이전 테스트용 더미 데이터
	//public static void main(String[] args) throws IOException
	//{
	//	vt.add(new MovieData("범죄도시2", 19, 80));
	//	vt.add(new MovieData("탑건2", 15, 70));
	//	vt.add(new MovieData("미니언즈2", 0, 60));

	//	//AmenuDisp();
	//}
}
