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

class RpsGame_1
{
	private int user;
	private int com;

	// ��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;					//0 1 2 �� (+1) �� 1 2 3
	}
	
	// ��ǻ���� ����������
	public void input()
	{
		// ������ ���������� �ϱ� ����...��ǻ�� ���� ����������
		runCom();
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}

	// �߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println(" - ����   : " + str[user-1]);
		System.out.println(" - ��ǻ�� : " + str[com -1]);
 	}
	
	// �ºο� ���� ���� ��� ����
	public String resultCalc()
	{
		String result = "���º� ��Ȳ�Դϴ�";

		// (���� == "����" && �� == "��") || (���� == "����" && �� == "����") || (���� == "��" && �� == "����")
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
		{
			result = "����� �¸��߽��ϴ�";
		}
		else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (com == 3 && user == 2))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�";
		}

		return result;
	}

	//���� ��� ���
	public void print(String str)
	{
		System.out.printf("\n>> �º� ���� ��� : %s\n", str);
	}
}

public class Test102_1
{
	public static void main(String[] args)
	{	
		RpsGame_1 rps = new RpsGame_1();
		rps.input();
		rps.middleCalc();
		String result = rps.resultCalc();
		rps.print(result);
	}
}