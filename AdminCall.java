import java.io.IOException;

class AdminMenu
{
	public static final int M_MANAGE  = 1;	// �󿵿�ȭ����
	public static final int S_MANAGE  = 2;	// �󿵰� ����
	public static final int B_ADMIN  = 0;	// ������ �޴��� ���ư���
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
		while (sel<1 || sel>2);
		
		System.out.println();

		AmenuRun();

	}

	// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void AmenuRun() throws IOException
	{
		ScreenManagement sm = new ScreenManagement();
		MovieManagement mm = new MovieManagement();

		switch (sel)
		{
			case AdminMenu.M_MANAGE : mm.movieManage(); break;
			case AdminMenu.S_MANAGE : sm.screenManage(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}
}