
/*
���� ���� �帧�� ��Ʈ��(���) ����
	- switch �� �ǽ�
*/

/*
����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
�Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�
��, �ΰ��� ������� ������ �� �ֵ��� �Ѵ�

1. switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�
2. switch ���� �⺻ ���� ����Ͽ� �����Ѵ�
	break�� �� �� ���� ����� �� �ֵ��� �����Ѵ�

���� ��)
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� ��������...

������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� ��������...

������ ���� �Է�(1~3) : 7
�Է� ����
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("������ ���� �Է�(1~3) : ");
		num = Integer.parseInt(br.readLine());
		
		//�Ϲ� ��
		//String result;
		/*
		switch (num)
		{
		case 1 : result = "��"; break;
		case 2 : result = "�ڡ�"; break;
		case 3 : result = "�ڡڡ�"; break;
		default : result = "�Է� ����"; break;

		}
		*/
		//System.out.println(result);

		//�⺻ ��
		//String result;

		switch (num)
		{
		case 1 : System.out.print("��");
		case 2 : System.out.print("��");
		case 3 : System.out.print("��\n");

		default : System.out.println("�Է¿���"); break;

		}

	}
}

/*
���� ���


*/