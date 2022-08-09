import java.io.IOException;

public class UserCancel extends UserCall
{
	
	// ���� ��� ù ȭ��(���� ��ȣ �Է��ϴ� ��������) (C,10)
	public void reservCancel() throws IOException
	{					  
		System.out.println();
		System.out.println("[�������] ===================================");
		System.out.println();
		System.out.println("���� ��ȣ�� �Է����ּ���. (10�ڸ�)"); 
		System.out.println();
		System.out.println("==============================================\n");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���� ��ȣ �Է�: ");
		
		bookNumber = sc.next();		// ����ڰ� �Է��� ���Ź�ȣ�� ���� (bookNumber - ������ ���� �ӽú���)
		//System.out.println();
			
		if (bookNumber.equals("0"))	// ����ڰ� �Է��� ���� 0 �̶�� 
			UmenuDisp();		 //-- ����ȭ�� ���(��������� ó�� ȭ��)
		else if (reservedNum.contains(bookNumber) == true)		//-- bookNumber ���ڰ�(���Ź�ȣ)�� reservedNum(����) �� ������ ���� ����Ǿ� ������
		{
			checkCancel();	 //-- ����ڰ� �Է��� ���Ź�ȣ�� �ش��ϴ� ���ų��� ����ϴ� ȭ������ ��ȯ
		}
		else
			unknownCancel(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ(�������� �ʴ� ���Ź�ȣ�Դϴ� ���� ȭ������)

		if (reservedNum == null)	// reserwvedNum (���Ź�ȣ�� �����ϴ� ���ͱ���) �� ����� ���� ���� ���	
			unknownCancel();		// �������� �ʴ� ���Ź�ȣ ��� ������ ���Ե� ��¹� �޼ҵ� ȣ��

	} //end reservCancel method


	// [���Ź�ȣ �Է�] (D,9)
	public void checkCancel() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);	// ����ڰ� �Է��� ���Ź�ȣ(bookNumber)�� ������ ���� 
														// reservedNum ���ͱ����� �� ��°�� ��ġ�ϰ� �ִ��� ã�Ƽ� ��ġ���� ����
		ReservedData res_ud = ud.get(udIndex);			// ReservedData ���ͱ����� ����� ���� �������� ���� ����, (���ͱ�������) ������ ã�� ��ġ�� ������ �����Ͷ�

		System.out.println();
		System.out.println("[�������] ===================================");
		
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);					// ����ڰ� �Է��� ���Ź�ȣ ���
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());				// ������ ã�� ������ ��ġ���� ����� ��ȭ������ ������
		System.out.println("�ð�      : " + res_ud.getTime());				//									  �ð� ���� ������
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��");		//									  �󿵰� ���� ������
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");		//									  �ο� ���� ������
		System.out.println("�¼�      : " + res_ud.getSeatNumber());		//									  �¼� ������ ������
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==============================================\n");
		System.out.println();

		System.out.print("���� ����Ͻðڽ��ϱ�? (Y/N) :");	

		String sel2 = sc.next();		// ����ڰ� ���� ȭ�鿡�� �Է��� ���� ����

		//System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))		//-- ����ڰ� �Է��� ���� y �Ǵ� Y �� ���
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- ����ȭ�鿡�� ����ڰ� �Է��ߴ� ���Ź�ȣ�� reservedNum ���Ϳ��� �� ��°�� ��ġ�ϴ��� ã�Ƽ� i �� ����
			reservedNum.remove(i);						//-- reservedNum ���� �������� ������ ã�� ��ġ���� ����� ������ ���� 
			reservCancelY();						    //-- ���Ű� ��ҵǾ��ٴ� ���� ����ϴ� ȭ��
		}
		else if (sel2.equals("n") || sel2.equals("N"))	//-- ����ڰ� �Է��� ���� n �Ǵ� N �� ���
			reservCancel();							    //-- �����޴�(���Ź�ȣ ��Ҹ޴��� ���Ź�ȣ �Է��ϴ� ȭ��)�� ��ȯ
		else if (sel2.equals("0"))						//-- ����ڰ� �Է��� ���� 0 �� ���
			UmenuDisp();								//-- ������ ��� ù ȭ������ ��ȯ
		else											//-- �� ���� ���� ����ڰ� �Է��� ���
		{
			System.out.println();
			System.out.println("�������� �ʴ� ����Դϴ�.");	
			checkCancel();										//-- �����޴�(���Ź�ȣ ��Ҹ޴��� ���Ź�ȣ �Է��ϴ� ȭ��)�� ��ȯ 
		}

	} //end checkCancel method


	// ���� ���Ź�ȣ �Է� �� (D,8), (D,11)
	public void unknownCancel() throws IOException
	{					  
		System.out.println();
		System.out.println("[�������] ===================================");
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();
		System.out.println("==============================================\n");
		//System.out.println();

		reservCancel(); 
	}


	// [���� ���] (E,9)
	public void reservCancelY() throws IOException
	{
		System.out.println();
		System.out.println("[�������] ===================================");
		System.out.println(); 
		System.out.println("���Ÿ� ����߽��ϴ�.");
		System.out.println();
		System.out.print("0. ������ �޴��� ���ư��� : ");
		System.out.println("==============================================\n");

		sel = sc.nextInt();
		//System.out.println();

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