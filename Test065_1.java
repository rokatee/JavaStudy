/*
���� ���� �帧�� ��Ʈ��(���) ����
	- break �ǽ�
*/

/*
break Ű���尡 ���ϴ� �ǹ�
����� + �׸��� ����������

������ ���� ó���� �̷������ ���α׷��� �����Ѵ�
��, �Է¹޴� ������ 1 ~ 100 ���� �ȿ�����
�����ϵ��� �ۼ��Ѵ�

���� ��)

������ ���� �Է� : -10
������ ���� �Է� : 0
������ ���� �Է� : 2022
������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : y

������ ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�(Y/N)? : N
����Ϸ���...


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;			// ����� �Է°�
		int sum;		// ������
		int i;			// ���� ����
		char ch;		// ��� �Ұ��� ����� ���� ����

		while(true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());		
			}
			while (n < 1 || n > 100);
			
			sum = 0;	// ������ �ʱ�ȭ

			for (i = 0; i <= n; i++)
			{
				sum += i;
			}

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, sum);
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();
			System.in.skip(2);

			if (ch != 'y' && ch != 'Y')
			{
				break;
			}
		}
	}
}

/*
���� ���


*/