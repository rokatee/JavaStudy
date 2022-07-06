/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

����ڷκ��� ������ ������ �Է¹޾�
������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�

2�� ��� / 3�� ��� / 2�� 3�� ��� / 2�� 3�� ��� �ƴ�

���� ��)
������ ���� �Է� : 4
4 �� 2�� ���

������ ���� �Է� : 9
9 �� 3�� ���

������ ���� �Է� : 12
12 �� 2�� 3�� ���

������ ���� �Է� : 17
17 �� 2�� 3�� ��� �ƴ�

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num;

			System.out.print("������ ���� �Է� : ");
			num = Integer.parseInt(br.readLine());

			if (num == 0)
			{
				System.out.printf("%d �� 0\n", num);
			}
			else if (num % 2 == 0 && num % 3 == 0)
			{
				System.out.printf("%d �� 2�� 3�� ���\n", num);
			}
			else if (num % 3 == 0)
			{
				System.out.printf("%d �� 3�� ���\n", num);
			}
			else if (num % 2 == 0)
			{
				System.out.printf("%d �� 2�� ���\n", num);
			}
			else if (num % 2 != 0 && num % 3 != 0)						// ����� �Ÿ��� �� �� �������� ���ұ⿡
			{															// ���Ǻθ� �� �ٿ��� ������
				System.out.printf("%d �� 2�� 3�� ��� �ƴ�\n", num);	// ���� �ȿ��� �����ϴ� �κ���
			}															// �ǵ����̸� else if �ȿ� ���Ǻη� �ް�
																		// else�� "�Ǻ� �Ұ�" �� ���� ���Ǻη� ����
			
			
			// �ٸ� �ش�
			String result = "�Ǻ� �Ұ�";
			if (num == 0)
			{
				result = "0";
			}
			else if (num % 2 != 0 && num % 3 != 0)
			{
				result = "2�� 3�� ��� �ƴ�";
			}
			else if (num % 2 == 0 && num % 3 == 0)
			{
				result = "2�� 3�� ���";
			}
			else if (num % 3 == 0)
			{
				result = "3�� ���";
			}
			else if (num % 2 == 0)
			{
				result = "2�� ���";
			}
			//else
			//{
			//	result = "�Ǻ� �Ұ�";
			//}

			System.out.println(num + " �� " + result);

		}
}

/*
���� ���

������ ���� �Է� : 4
4 �� 2�� ���
4 �� 2�� ���


������ ���� �Է� : 9
9 �� 3�� ���
9 �� 3�� ���


������ ���� �Է� : 12
12 �� 2�� 3�� ���
12 �� 2�� 3�� ���


������ ���� �Է� : 17
17 �� 2�� 3�� ��� �ƴ�
17 �� 2�� 3�� ��� �ƴ�

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/