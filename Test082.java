/*
���� �迭 ���� 
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
*/

/*
����ڷκ��� �ο����� �Է¹ް�
�Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
�̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
����� ����� �� �ִ� ���α׷��� �����Ѵ�

���� ��)
�Է� ó���� �л� �� �Է�(��, 1~10) : 27
�Է� ó���� �л� �� �Է�(��, 1~10) : -5
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ȫ�浿 010-1234-1234
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �ֵ��� 010-5678-5678
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ��ֿ� 010-1111-2222

------------------------
��ü �л� �� : 3
------------------------
 �̸�	  ��ȭ��ȣ
ȫ�浿	010-1234-1234
�ֵ���  010-5678-5678
��ֿ�  010-1111-2222
------------------------

����Ϸ���...
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stuNum;
		String name, phone;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			stuNum = Integer.parseInt(br.readLine());
		}
		while (stuNum < 1 || stuNum > 10);


		Scanner sc = new Scanner(System.in);
		String[] arr = new String[stuNum];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			name = sc.next();
			phone = sc.next();
			arr[i] = name + "	   " + phone;
		}
		System.out.println("------------------------");
		System.out.printf("��ü �л� �� : %d\n", stuNum);
		System.out.println("------------------------");
		System.out.println("�̸�	��ȭ��ȣ");
		
		//�׽�Ʈ
		//System.out.println(arr[0]);
		

		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("------------------------");
		*/

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount < 1 || memberCount > 10);

		// �׽�Ʈ
		//System.out.println("����ڰ� �Է��� �ο� �� : " + memberCount);
		// do~while ���� �׽�Ʈ �Ϸ�

		// ����ڰ� �Է��� �ο� ���� ����
		// �̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�
		
		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		//String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		//for (int i = 0; i < names.length; i++)
		//for (int i = 0; i < tels.length; i++)
		for (int i = 0; i < memberCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			// ȫ�浿 010-1234-1234
			// ------
			names[i] = sc.next();

			// ȫ�浿 010-1234-1234
			//		  -------------
			tels[i] = sc.next();
		}
		
		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("------------------------");
		System.out.printf("��ü �л� �� : %d��\n", memberCount);
		System.out.println("------------------------");
		// memberCount == names.length == tels.length

		System.out.println("�̸�    ��ȭ��ȣ");
		
		// �л� ����Ʈ
		for (int i = 0; i < memberCount; i++)
			System.out.printf("%3s %14s\n", names[i], tels[i]);


		System.out.println("------------------------");

	}
}

/*
���� ���

�Է� ó���� �л� �� �Է�(��, 1~10) : 2
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ȫ�浿 010-1111-2222
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �ְ��� 010-2222-3333

------------------------
��ü �л� �� : 2��
------------------------
�̸�    ��ȭ��ȣ
ȫ�浿  010-1111-2222
�ְ���  010-2222-3333
------------------------
*/
