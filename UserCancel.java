import java.io.IOException;

public class UserCancel extends UserCall
{
	
	// ���� ��� ù ȭ��(���� ��ȣ �Է��ϴ� ��������) (C,10)
	public void reservCancel() throws IOException
	{
		System.out.println("[�������] =======================");
		System.out.println();
		System.out.println("���� ��ȣ�� �Է����ּ���. (10�ڸ�)"); 
		System.out.println();
		System.out.println("==================================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���� ��ȣ �Է�: ");
		
		bookNumber = sc.next();
		System.out.println();
			
		if (bookNumber.equals("0"))
			UmenuDisp();		 //-- ����ȭ�� ���(��������� ó�� ȭ��)
		else if (reservedNum.contains(bookNumber) == true)		//-- str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
		{
			checkCancel();	 //-- ���� ȭ��(���Ź�ȣ �Է�ȭ�� D��) ��ȯ
		}
		else
			unknownCancel(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ

		if (reservedNum == null)
			unknownCancel();

	} //end reservCancel method


	// [���Ź�ȣ �Է�] (D,9)
	public void checkCancel() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		ReservedData res_ud = ud.get(udIndex);

		System.out.println("[�������] =================");
		
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());
		System.out.println("�ð�      : " + res_ud.getTime());
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��");
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");
		System.out.println("�¼�      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("============================");
		System.out.println();

		System.out.print("���� ����Ͻðڽ��ϱ�? (Y/N) :");	

		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- ���Ź�ȣ�� ���Ϳ� �� ��°�� ��ġ�ϴ��� ã�Ƽ� i �� ����
			reservedNum.remove(i);
			reservCancelY(); //-- ���Ű� ��ҵǾ��ٴ� ���� ����ϴ� ȭ��
		}
		else if (sel2.equals("n") || sel2.equals("N"))
			reservCancel(); //-- �����޴�(���Ź�ȣ �Է��ϴ� ȭ��)�� ���ư��� ȭ��
		else if (sel2.equals("0"))
			UmenuDisp();
		else
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			checkCancel();
		}

	} //end checkCancel method


	// ���� ���Ź�ȣ �Է� �� (D,8), (D,11)
	public void unknownCancel() throws IOException
	{
		System.out.println("[�������] ==================");
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();

		reservCancel(); 
	}


	// [���� ���] (E,9)
	public void reservCancelY() throws IOException
	{
		System.out.println("[�������] ==============");
		System.out.println(); 
		System.out.println("���Ÿ� ����߽��ϴ�.");
		System.out.println();
		System.out.print("0. ������ �޴��� ���ư��� : ");
		System.out.println("=========================");

		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}


	//// ���� �󿵰��� ��ϵ� ��ȭ ���� ����ϴ� �޼ҵ�
	//public void movieList()
	//{
	//	//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
	//	for (int i=0; i<screen.length; i++)
	//	{
	//		System.out.printf("��ȭ ���� : %s, �󿵰�: %d��\n", screen[i].title, (i+1));
	//	}
	//}
}