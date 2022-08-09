import java.io.IOException;

//class UserMenu
//{
//	public static final String FIRSTMENU = "firstMenu";
//	public final static String USERDISP1 = "userDisp1";
//	public final static String RESERVEDCHECK = "reservedcheck";
//	public final static String RESERVCANCEL = "reservCancel";
//	public final static String MOVIEPICK = "moviePick";
//	public final static String RESERVEDCHECK2 = "reservedcheck2";
//	public final static String RESERVCANCLE2 = "reservCancel2";
//	public final static String MOVIEPICK2 = "moviePick2";
//	public final static String MOVIEROUND = "movieRound";
//	public final static String SEATPICK = "seatPick";
//}

public class MainCall extends NameData
{

	// 맨 처음 관리자가 비밀번호를 입력할 수 있는 화면 (A,12)
	public void firstMenu() throws IOException
	{
		UserCall userCall = new UserCall();

		System.out.println();
		System.out.println("[영화 티켓 발권기] ===========================");
		System.out.println();
		System.out.println("예매하려면 A 를 눌러주세요.");
		System.out.println();
		System.out.println("관리자 비밀번호를 입력해주세요");
		System.out.println();
		System.out.println("==============================================\n");
		
		System .out.print("==> ");
		String pw = sc.next();

		

		// 관리자 비밀번호와 입력한 비밀번호가 같을 경우
		if (adminPassword.equals(pw))
		{
			// 관리자 메뉴 선택에 따라 기능 호출 메소드
				//firstMenuRun();

			AdminCall ac = new AdminCall();
			ac.AmenuDisp();
		}
		else if (pw.equals("A") || pw.equals("a"))
		{
			// 등록된 영화가 없을 경우 추가 필요 (B,1)
			if (screen[0] == null && screen[1] == null && screen[2] == null)
				noMovie();	// line 176
			else 
				userCall.UmenuDisp();	//상영관에 영화가 등록된 경우, 예매하기 화면으로
		}

		// 입력한 비밀번호가 틀린 경우, 재입력 화면 호출 구문 (B,12)
		else
		{
			firstMenu();	//비번 틀릴 때, 첫화면 재출력
		}
	} //end firstMenu method


	// 등록된 영화가 없을 시, 출력 구문 (B,1)
	public void noMovie() throws IOException
	{
		System.out.println();
		System.out.println("[영화 티켓 발권기] ===========================");
		System.out.println();
		System.out.println("상영 중인 영화가 없습니다.");
		System.out.println("잠시만 기다려주시면 금방 영업 준비하겠습니다.");
		System.out.println();
		System.out.println("==============================================");	
		
		firstMenu();
	} //end noMovie method


	//// 스프레드 시트 기준 (초기화면 / 이전화면으로 돌아가기)
	//// 가독성 위해 구글 스프레드 시트 번호 반영
	//public void startProcess() throws IOException
	//{
	//	User user = new User();

	//	p_id = UserMenu.FIRSTMENU;		//-- firstMenu()로 시작하기 위해 지정
	//	while(true)
	//	{
	//		switch(p_id)
	//		{
	//			case UserMenu.FIRSTMENU		:	firstMenu(); break;
	//			case UserMenu.USERDISP1		:	user.userDisp1(); break;
	//			case UserMenu.RESERVEDCHECK	:	user.reservedcheck(); break;
	//			case UserMenu.RESERVCANCEL	:	user.reservCancel(); break;
	//			case UserMenu.MOVIEPICK		:	user.moviePick(); break;
	//			case UserMenu.RESERVEDCHECK2:	user.reservedcheck2(); break;
	//			case UserMenu.RESERVCANCLE2	:	user.reservCancel2(); break;
	//			case UserMenu.MOVIEPICK2	:	user.moviePick2(); break;
	//			case UserMenu.MOVIEROUND	:	user.movieRound(); break;
	//			case UserMenu.SEATPICK		:	user.seatPick(); break;
	//			//case "end":	break;
	//			default : System.out.println("지원되지 않는 기능입니다."); 						   
	//					  break;
	//		}
	//	}

	//} //end startProcess method

}