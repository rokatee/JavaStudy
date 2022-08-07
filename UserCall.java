import java.io.IOException;

class UserMenu
{
	public static final int RESERVE  = 1;	// �����ϱ�
	public static final int R_CHECK  = 2;	// ���ų��� Ȯ��
	public static final int R_CANCLE = 3;	// ���� ���
	public static final int B_FIRST  = 0;	// �ʱ� �޴��� ���ư���
}

public class UserCall extends MainCall
{
	// ��� ��ȭ ���� ��, ��� ���� (B,6)
	public void UmenuDisp() throws IOException
	{
		System.out.println("[������ ���]==========");
		System.out.println();
		System.out.println("1. �����ϱ�");
		System.out.println("2. ���ų��� Ȯ��");
		System.out.println("3. ���� ���");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=======================");
		System.out.println();
		
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<0 || sel>3);

		System.out.println();
		
		UmenuRun();

	} //end userDisp1 method

	// ����� �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void UmenuRun() throws IOException
	{
		UserReserv userReserv = new UserReserv();	// ��ȭ ���� �޼ҵ�
		UserCheck userCheck = new UserCheck();		// ���� ��� �޼ҵ�
		UserCancel userCancel = new UserCancel();	// ���� ��� �޼ҵ�
		MainCall mc = new MainCall();				// �ֻ�� �޴� �޼ҵ�
		
		switch(sel)
		{
			case UserMenu.RESERVE  : userReserv.moviePick(); break;	// �����ϱ� ȭ�� ���
			case UserMenu.R_CHECK  : userCheck.reservedCheck(); break; // ���ų��� Ȯ�� ȭ�� ���
			case UserMenu.R_CANCLE : userCancel.reservCancel(); break; // ������� ȭ�� ���
			case UserMenu.B_FIRST  : mc.firstMenu(); break;	// �����޴�(�ʱ�ȭ��) ���
		}

		System.out.println();
	}
}