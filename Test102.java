/*
���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
*/

/*
1~3 ������ ������ �߻����Ѽ�
���� ���� �� ���� ���α׷��� �����Ѵ�
��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�

���� ������ �� 1:����, 2:����, 3:��

���� ��)
1:����, 2:����, 3:�� �� �Է�(1~3) : 4
1:����, 2:����, 3:�� �� �Է�(1~3) : -2
1:����, 2:����, 3:�� �� �Է�(1~3) : 2

- ����	 : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰徹�ϴ�~!!
����Ϸ���...

*/

import java.util.Scanner;
import java.util.Random;

//class RpsGame
//{
//}

public class Test102
{
	public static void main(String[] args)
	{	

		//main()�� ������� �� ���
		Scanner sc = new Scanner(System.in);
		String[] rps = {"����", "����", "��"};	// ���� ���� ��

		Random rd = new Random();
		int com = rd.nextInt(3)+1;

		int user;		// ����� �Է°�
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
		
		
		System.out.println("����   : " + rps[user-1]);
		System.out.println("��ǻ�� : " + rps[com -1]);
		
		String result = "���º� �Դϴ�";;

		if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
		{
			result = "��ǻ�Ͱ� �¸��Ͽ����ϴ�";
		}
		else if ((user == 2 && com == 1) || (user == 3 && com == 2) || (user == 1 && com == 3))
		{
			result = "������ �¸��Ͽ����ϴ�";
		}

		System.out.println(">> �º� ���� ��� : " + result);
	}
}