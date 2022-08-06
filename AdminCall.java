import java.io.IOException;

class AdminMenu
{
	public static final int M_MANAGE  = 1;	// �󿵿�ȭ����
	public static final int S_MANAGE  = 2;	// �󿵰� ����
	public static final int B_FIRST  = 0;	// �ʱ� �޴��� ���ư���
}

public class AdminCall extends NameData
{

	// ������ �޴� ��� �޼ҵ�
	public static void AmenuDisp() throws IOException
	{
		System.out.println("\n[������ ���]==================\n");
		System.out.println("1. �� ��ȭ ����");
		System.out.println("2. �󿵰� ����");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("===============================");
	
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<0 || sel>2);
		
		System.out.println();

		AmenuRun();

	}

	// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void AmenuRun() throws IOException
	{
		ScreenManagement sm = new ScreenManagement();
		MovieManagement mm = new MovieManagement();
		//FirstCall fc = new FirstCall();
		User fc = new User();	// UserŬ���� ������ ������ �̷���

		switch (sel)
		{
			case AdminMenu.M_MANAGE : mm.movieManage(); break;
			case AdminMenu.S_MANAGE : sm.screenManage(); break;
			case AdminMenu.B_FIRST	: fc.firstMenu(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}
}