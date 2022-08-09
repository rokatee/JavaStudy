import java.io.IOException;

public class UserCheck extends UserCall
{

	// [���ų��� Ȯ��]�ϴ� �޼��� (C,7)
	public void reservedCheck() throws IOException
	{
		System.out.println(); 
		System.out.println("[���ų��� Ȯ��] ==============================");
		System.out.println();
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		System.out.println();	
		System.out.println("==============================================");	
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���Ź�ȣ : ");

		bookNumber = sc.next();		// ����ڰ� �Է��� ���Ź�ȣ�� ����(�ӽ����庯�� bookNumber)
		//System.out.println();
		
		
		if (reservedNum == null)	// ������ ���Ź�ȣ���� ���� �����س��� reservedNum ���� ������ �ƹ��͵� ���� ���
		{
			unknownCheck();			// �������� �ʴ� ���Ź�ȣ��� ����ϴ� unknownCheck() �޼ҵ� ȭ������ ��ȯ
			return;					// ����� ��� �̾����� �ʵ��� ȭ�� ��ȯ �� return �� �߰��Ͽ� ���α׷� ����
		}
		
		if (bookNumber.equals("0"))	// ����ڰ� �Է��� ���� 0 �� ���
		{
			UmenuDisp();	//-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
		else if (reservedNum.contains(bookNumber)==true) //-- bookNumber ���ڰ�(���Ź�ȣ) �� ������ ���� reservedNum(����) �ȿ� �ִ� ���
		{
			reservedCheck2(); //-- ���� ȭ��(���ų��� Ȯ�� ȭ�� D��) ��ȯ
		}
		else
		{
			unknownCheck(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ(bookNumber ���ڰ�(���Ź�ȣ) �� ������ ���� reservedNum(����) �ȿ� ���� ���)
		}
		
	} //end reservedCheck method


	// [���Ź�ȣ �Է�] (D,7)
	public void reservedCheck2() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);	// ����ڰ� �Է��� ���Ź�ȣ(bookNumber)�� ������ ���� 
														// reservedNum ���ͱ����� �� ��°�� ��ġ�ϰ� �ִ��� ã�Ƽ� ��ġ���� ����
		ReservedData res_ud = ud.get(udIndex);			// ReservedData ���ͱ����� ����� ���� �������� ���� ����, (���ͱ�������) ������ ã�� ��ġ���� �����Ͷ�
		System.out.println(); 
		System.out.println("[���ų��� Ȯ��] ==============================");
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);				// ����ڰ� �Է��� ���Ź�ȣ
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());			// ������ ã�� ������ ��ġ���� ����� ��ȭ������ ������
		System.out.println("�ð�      : " + res_ud.getTime());			//									  �ð��� ������
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��"); //									  �󿵰��� ������
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");  //									  �ο��� ������
		System.out.println("�¼�      : " + res_ud.getSeatNumber());    //									  �¼������� ������
		System.out.println();
		System.out.println("==============================================");	
		System.out.print("0. ���� �޴��� ���ư��� : ");

		sel = sc.nextInt();			// ����ڰ� ���� ȭ�鿡�� �Է��� �� ����
		//System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); //-- �Է��� ���� 0�� ��� ��������� ó�� ȭ������ ��ȯ
		}
		
	} //end reservedcheck2 method


	// ���� ���Ź�ȣ �Է� �� (D,8)
	public void unknownCheck() throws IOException
	{
		System.out.println(); 
		System.out.println("[���ų��� Ȯ��] ==============================");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("==============================================");
		//System.out.println();

		reservedCheck();  // ���Է� �� �� �ֵ��� �޼ҵ� ȣ��� ȭ����ȯ
	}
}