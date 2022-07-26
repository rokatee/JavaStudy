/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
*/

/*
�� �ǽ� ����
	
	������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
	Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�

	���� ��)
	���� ��¥ : 2022-07-26 ȭ����
	�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

	========[Ȯ�� ���]========
	200�� �� : xxxx-xx-xx x����
	===========================
	����Ϸ���...

�� Calendar �� ������ API Document ����
	- add() �޼ҵ� Ȯ��~!!
		: ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ�
		  ��ü.add(Calendar.DATE, ����);
*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		Calendar cal = new GregorianCalendar();

		int y,m,d,w;		// ��,��,��,����
		int addDate;		// ����� �Է��� �߰� �ϼ�
		

		// ���� ��¥ �޾ƿ���(�� get() �޼ҵ� Ȱ��)
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;	// ���� �޾ƿ� �� +1
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// ���� �迭(��� 1) - �� ����� �߰� ��¥ ��� ����� �� ������ �ʱ�ȭ�� �ʿ����
		String[] week = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week[w-1]);
		
		// ���� �ݺ���(��� 2)
		//String week = " ";
		//switch (w)
		//{
		//	case 1 : week = "�Ͽ���"; break;
		//	case 2 : week = "������"; break;
		//	case 3 : week = "ȭ����"; break;
		//	case 4 : week = "������"; break;
		//	case 5 : week = "�����"; break;
		//	case 6 : week = "�ݿ���"; break;
		//	case 7 : week = "�����"; break;
		//}

		//System.out.printf("���� ��¥ : %d-%d-%d %s\n", y,m,d,week);

		
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			addDate = sc.nextInt();
		}
		while (addDate < 1);	// �߰� ��¥�� 1�� �̻�

		System.out.println();	// ����
		
		// add(int field, int amount) - �־��� Calendar Field�� Ư�� �ϼ���ŭ ��¥�� �����ִ� �޼ҵ� 
		// ��ü.add(Calendar Field Detail, ����);
		// ex) add(Calendar.DAY_OF_MONTH, -5)
		cal.add(Calendar.DATE,addDate);
		


		// ��¥ �ʱ�ȭ(��� ��� ��� 1)
		// ��¥�� �߰� �� �߰��� ��¥�� �ٽ� �ҷ��;� �ϹǷ� ��¥ �ʱ�ȭ�� ���־�� �Ѵ�
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// ���� �ݺ���(��� 2) - ��¥ �ʱ�ȭ
		//switch (w)
		//{
		//	case 1 : week = "�Ͽ���"; break;
		//	case 2 : week = "������"; break;
		//	case 3 : week = "ȭ����"; break;
		//	case 4 : week = "������"; break;
		//	case 5 : week = "�����"; break;
		//	case 6 : week = "�ݿ���"; break;
		//	case 7 : week = "�����"; break;
		//}

		System.out.println("========[Ȯ�� ���]========");
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week[w-1]);
		//System.out.printf("%d�� �� : %d-%d-%d %s\n",addDate, y, m, d, week);		// ���� �ݺ���(��� 2)�� ���� ��¹�
		System.out.println("===========================");
		
		
		// ��¥ �ʱ�ȭ ����(��� ��� ��� 2)
		/*
		System.out.println("========[Ȯ�� ���]========");
		System.out.printf("%d�� �� : %tF %tA\n",addDate, cal,cal);
		System.out.println("===========================");
		*/
		// ����Ÿ���� ����Ÿ������ ����ѰŰ�, �̰� ��¥�� �ҷ����� ����
		// %tF �� ��¥, %tA �� ���� �ҷ����� ����
		
		// String.format("%tF", �޷� ��ü);
		// �� ��-��-�� ������ ���ڿ� ��ȯ

		// String.format("%tA", �޷� ��ü);
		// �� ���� ������ ���ڿ� ��ȯ
	}
}

/*
���� ���

���� ��¥ : 2022-7-26 ȭ����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 1

========[Ȯ�� ���]========
���� ��¥ : 2022-7-27 ������
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


���� ��¥ : 2022-7-26 ȭ����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 174

========[Ȯ�� ���]========
���� ��¥ : 2023-1-16 ������
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/