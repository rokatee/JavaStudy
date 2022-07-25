/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
*/

/*
�� java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �ʱ�����
	�ð��� ��¥�� ���õ� ������ �����Ѵ�
	�׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� �����ִ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�

	getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�


�� �ǽ� ����
	����ڷκ��� ��, ���� �Է¹޾�
	�޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�
	��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
	�� API Document �����Ͽ� getActualMaximum() �޼ҵ��� Ȱ�� ��� ������ ��

���� ��)
���� �Է� : 0
���� �Է� : 2022
�� �Է� : -20
�� �Է� : 16
�� �Է� : 7

>> [2022�� 7��]
��  ��  ȭ  ��  ��  ��  ��
==========================
                     1   2
 3   4   5   6   7   8   9
10  11  12  13  14  15  16
17  18  19  20  21  22  23
24  25  26  27  28  29  30
31
==========================
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test143_1
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y,m;			// ����ڰ� �Է��� ��, ��
		int w;				// ����
		int i;				// ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y < 1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m < 1 || m > 12);

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		//cal.set(��, ��, ��);
		cal.set(y, m-1, 1);
		// �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		// �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�
		// �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�
		// 1���� ���� Ȯ�� �ʿ�

		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// �׽�Ʈ
		//System.out.println(w);
		// �� ���� �Է� : 2022
		//	  �� �Է� : 7
		//	  6	�� 2022�� 7�� ���� �� �ݿ��� �� 2022�� 7�� 1���� �ݿ���

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t\t[" + y + "��" + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");

		for (i = 1; i < w; i++)
		{
			System.out.print("    ");		// ���� 4ĭ �߻�
		}
		
		// �׽�Ʈ
		//System.out.printf("%4d\n", 1);	// 1���� �´� ��ġ�� �������� üũ
	
		// Calendar Ŭ���� getActualMaximum() �޼ҵ� üũ!!
		for (i = 1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;						// �ݺ����� �����ϸ� ��¥�� ������ �� ����
										// ���ϵ� �Բ� ������ �� �ֵ��� ó��

			if (w % 7 == 1)				// ������ ������ �Ͽ����� �� ������
				System.out.println();	// ���� �� ��µ� �� �ֵ��� ó��
		}
		if (w%7!=1)						// �Ͽ��� ������ ������� �ʾ��� ��츸
			System.out.println();		// ���� ó��
		
		System.out.println("=============================");
		
		
	}
}