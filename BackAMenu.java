import java.io.IOException;

class AdminMenu
{
	public static final int M_MANAGE  = 1;	// 상영영화관리
	public static final int S_MANAGE  = 2;	// 상영관 관리
	public static final int B_ADMIN  = 0;	// 관리자 메뉴로 돌아가기
}

public class BackAMenu extends NameData
{

	// 관리자 메뉴 출력 메소드
	public static void AmenuDisp() throws IOException
	{
		System.out.println("\n[관리자 모드]==================");
		System.out.println("1. 상영 영화 관리");
		System.out.println("2. 상영관 관리");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("===============================");
	
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		
		System.out.println();

		AmenuRun();

	}

	// 관리자 메뉴 선택에 따라 기능 호출 메소드
	public static void AmenuRun() throws IOException
	{
		ScreenManagement sm = new ScreenManagement();
		MovieManagement mm = new MovieManagement();

		switch (sel)
		{
			case AdminMenu.M_MANAGE : mm.movieManage(); break;
			case AdminMenu.S_MANAGE : sm.screenManage(); break;
			default : System.out.println(">> 잘못된 메뉴 선택입니다."); break;
		}

		System.out.println();
	}
}