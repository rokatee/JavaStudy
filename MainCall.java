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

	// �� ó�� �����ڰ� ��й�ȣ�� �Է��� �� �ִ� ȭ�� (A,12)
	public void firstMenu() throws IOException
	{
		UserCall userCall = new UserCall();

		System.out.println();
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ===========================");
		System.out.println();
		System.out.println("�����Ϸ��� A �� �����ּ���.");
		System.out.println();
		System.out.println("������ ��й�ȣ�� �Է����ּ���");
		System.out.println();
		System.out.println("==============================================\n");
		
		System .out.print("==> ");
		String pw = sc.next();

		

		// ������ ��й�ȣ�� �Է��� ��й�ȣ�� ���� ���
		if (adminPassword.equals(pw))
		{
			// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
				//firstMenuRun();

			AdminCall ac = new AdminCall();
			ac.AmenuDisp();
		}
		else if (pw.equals("A") || pw.equals("a"))
		{
			// ��ϵ� ��ȭ�� ���� ��� �߰� �ʿ� (B,1)
			if (screen[0] == null && screen[1] == null && screen[2] == null)
				noMovie();	// line 176
			else 
				userCall.UmenuDisp();	//�󿵰��� ��ȭ�� ��ϵ� ���, �����ϱ� ȭ������
		}

		// �Է��� ��й�ȣ�� Ʋ�� ���, ���Է� ȭ�� ȣ�� ���� (B,12)
		else
		{
			firstMenu();	//��� Ʋ�� ��, ùȭ�� �����
		}
	} //end firstMenu method


	// ��ϵ� ��ȭ�� ���� ��, ��� ���� (B,1)
	public void noMovie() throws IOException
	{
		System.out.println();
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ===========================");
		System.out.println();
		System.out.println("�� ���� ��ȭ�� �����ϴ�.");
		System.out.println("��ø� ��ٷ��ֽø� �ݹ� ���� �غ��ϰڽ��ϴ�.");
		System.out.println();
		System.out.println("==============================================");	
		
		firstMenu();
	} //end noMovie method


	//// �������� ��Ʈ ���� (�ʱ�ȭ�� / ����ȭ������ ���ư���)
	//// ������ ���� ���� �������� ��Ʈ ��ȣ �ݿ�
	//public void startProcess() throws IOException
	//{
	//	User user = new User();

	//	p_id = UserMenu.FIRSTMENU;		//-- firstMenu()�� �����ϱ� ���� ����
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
	//			default : System.out.println("�������� �ʴ� ����Դϴ�."); 						   
	//					  break;
	//		}
	//	}

	//} //end startProcess method

}