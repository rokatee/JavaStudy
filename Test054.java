/*
���� ���� �帧�� ��Ʈ��(���) ����
	- �ݺ���(while��) �ǽ�
*/

/*
����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
�ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�
��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
�̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

���� ��)
���ϴ� ��(������) �Է� : 5
5 * 1 = 5
5 * 2 = 10
  :
5 * 9 = 45
����Ϸ���...


���ϴ� ��(������) �Է� : 11
1 ~ 9 ������ ���ڸ� �Է� �����մϴ�
����Ϸ���...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dan;	//����ڰ� �Է��� ������ �� ���� (��)
		//int result;	//�� ���� ���� ��� ����
		int n = 0;	//���� ����

		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());
		
		// �������� ����� ���� �Է½� ó���� �켱�Ѵ�
		if (dan < 1 || dan > 9)
		{
			System.out.println("1 ~ 9 ������ ���ڸ� �Է� �����մϴ�");
			return;
		}
		
		//��� ���(�ݺ� ���)
		while (n < 9)
		{
			if (n < 9)
			{
				//result = dan * n;
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
		}
	}
}

/*
���� ���

���ϴ� ��(������) �Է� : 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


���ϴ� ��(������) �Է� : 11
1 ~ 9 ������ ���ڸ� �Է� �����մϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/