import java.io.IOException;

class UserMenu
{
	public static final int RESERVE  = 1;	// 예매하기
	public static final int R_CHECK  = 2;	// 예매내역 확인
	public static final int R_CANCLE = 3;	// 예매 취소
	public static final int B_FIRST  = 0;	// 초기 메뉴로 돌아가기
}

public class UserCall extends MainCall
{
	// 등록 영화 있을 시, 출력 구문 (B,6)
	public void UmenuDisp() throws IOException
	{
		System.out.println();
		System.out.println("[관람객 모드]=================================");
		System.out.println();
		System.out.println("1. 예매하기");
		System.out.println("2. 예매내역 확인");
		System.out.println("3. 예매 취소");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==============================================\n");
		//System.out.println();
		
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<0 || sel>3);

		System.out.println();
		
		UmenuRun();

	} //end userDisp1 method

	// 사용자 메뉴 선택에 따라 기능 호출 메소드
	public static void UmenuRun() throws IOException
	{
		//User user = new User();	// 영화 예매 메소드
		UserReserv userReserv = new UserReserv();	// 영화 예매 메소드
		UserCheck userCheck = new UserCheck();		// 예매 목록 메소드
		UserCancel userCancel = new UserCancel();	// 예매 취소 메소드
		MainCall mc = new MainCall();				// 최상단 메뉴 메소드
		
		switch(sel)
		{
			//case UserMenu.RESERVE  : user.moviePick(); break;	// 예매하기 화면 출력
			//case UserMenu.R_CHECK  : user.reservedCheck(); break; // 예매내역 확인 화면 출력
			//case UserMenu.R_CANCLE : user.reservCancel(); break; // 예매취소 화면 출력
			case UserMenu.RESERVE  : userReserv.moviePick(); break;	// 예매하기 화면 출력
			case UserMenu.R_CHECK  : userCheck.reservedCheck(); break; // 예매내역 확인 화면 출력
			case UserMenu.R_CANCLE : userCancel.reservCancel(); break; // 예매취소 화면 출력
			case UserMenu.B_FIRST  : mc.firstMenu(); break;	// 이전메뉴(초기화면) 출력
		}

		System.out.println();
	}
}