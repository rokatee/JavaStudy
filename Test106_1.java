/*
���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
*/

/*
�� �ֹε�Ϲ�ȣ ���� ����
	��. ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�
		123456-1234567 (�ֹι�ȣ)
		****** *******	---------------------�� �ڸ����� ���ϱ�
		234567 892345  (�� �ڸ��� ������ ��)
	
	��. ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�
		
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		----------------------------
	�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
		= 217

	��. ������ ������� 11�� ������ '������'�� ���Ѵ�.
		�� 8
	
	��. 11���� ������ 8�� �� ������� ���Ѵ�
		�� 3

		�ب�-1. 
			��(21����)�� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
									   �������� 1�� ��� �� 11 - 1 �� 10

			�̸� �ٽ� 10���� ������ �������� ���Ѵ�			11 �� 1
															10 �� 0

	��. ��(24����)�� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�

		��ġ   �� ��ȿ�� �ֹι�ȣ
		����ġ �� �߸��� �ֹι�ȣ



���� ��)
�ֹι�ȣ �Է�(xxxxxx - xxxxxxx) : 123456 - 12345678 �� �Է� ���� �ʰ�
>> �Է� ����
����Ϸ���...

�ֹι�ȣ �Է�(xxxxxx - xxxxxxx) : 123456 - 123456 �� �Է� ���� �̴�
>> �Է� ����
����Ϸ���...

�ֹι�ȣ �Է�(xxxxxx - xxxxxxx) : 123456 - 12345667 �� ��ȿ�� �ֹι�ȣ
>> �߸��� �ֹι�ȣ
����Ϸ���...

�ֹι�ȣ �Է�(xxxxxx - xxxxxxx) : 123456 - 1234567 �� ��ȿ�� �ֹι�ȣ
>> ��Ȯ�� �ֹι�ȣ
����Ϸ���...


�� ���� �ذ��� ���� �߰� ��
	�迭.length				�� �迭�� ����(�迭���� ����) ��ȯ �� �Ӽ���
	���ڿ�.length()			�� ���ڿ��� ���� ��ȯ				�� �޼ҵ�
	���ڿ�.substring()		�� ���ڿ� ����
	���ڿ�.substring(m, n)	�� ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
	���ڿ�.substring(m)		�� ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106_1
{
	public static void main(String[] args) throws IOException
	{
		/*
		String strTemp = "���α�";
		System.out.println(strTemp.length());
		// �� 3
		
		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		// �� 9 (���� ����)

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		// �� 10 (���� ����)
		
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		// �� NOPQ
		//System.out.println(strTemp.substring(13, 57));
		// �� ��Ÿ�� ����(���� �ʰ�)
		//		StringIndexOutOfBoundsException:

		System.out.println(strTemp.substring(13));
		// �� NOPQRSTUVWXYZ
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;

		int[] temp = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		int sum = 0;

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-yyyyyy) : ");
		str = br.readLine();

		// �ֹι�ȣ ���̰� ����(13��)�� "-"(1��)�� ���� 14�ڸ����� Ȯ��
		if (str.length() != 14)
		{
			System.out.println(">> �Է¿���~!!!");
			return;
		}

		for (int i = 0; i < 13; i++)
		{
			if (i == 6)		// '-' �κ��� �н��ϱ� ���� ����
				continue;
			sum += temp[i] * Integer.parseInt(str.substring(i,(i+1)));
		}

		int total = 11 - sum % 11;
		if(total == 10) total = 0;
		if(total == 11) total = 1;

		if (total == Integer.parseInt(str.substring(13)))
			System.out.println("��Ȯ�� �ֹι�ȣ");
		else
			System.out.println("�߸��� �ֹι�ȣ");

		
	}
}