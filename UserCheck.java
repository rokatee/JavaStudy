import java.io.IOException;

public class UserCheck extends UserCall
{

	// [���ų��� Ȯ��]�ϴ� �޼��� (C,7)
	public void reservedCheck() throws IOException
	{
		System.out.println("[���ų��� Ȯ��] ========");
		System.out.println();
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		System.out.println();	
		System.out.println("========================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���Ź�ȣ : ");

		bookNumber = sc.next();
		System.out.println();

		if (reservedNum == null)
		{
			unknownCheck();
			return;
		}
		
		if (bookNumber.equals("0"))
		{
			UmenuDisp();	//-- ����ȭ�� ���(��������� ó�� ȭ��)
		}

		else if (reservedNum.contains(bookNumber)==true) //-- str ���ڰ�(���Ź�ȣ) �� reservedNum(����) ���� ���� ��� 
		{
			reservedCheck2(); //-- ���� ȭ��(���ų��� Ȯ�� ȭ�� D��) ��ȯ
		}
		else
		{
			unknownCheck(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
		}
		
	} //end reservedCheck method


	// [���Ź�ȣ �Է�] (D,7)
	public void reservedCheck2() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		ReservedData res_ud = ud.get(udIndex);
		System.out.println("[���ų��� Ȯ��] ============");
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());
		System.out.println("�ð�      : " + res_ud.getTime());
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��");
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");
		System.out.println("�¼�      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.print("0. ���� �޴��� ���ư��� : ");

		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); //-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
		
	} //end reservedcheck2 method


	// ���� ���Ź�ȣ �Է� �� (D,8)
	public void unknownCheck() throws IOException
	{
		System.out.println("[���ų��� Ȯ��] =============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		reservedCheck(); 
	}
}