/*
���� ���� �帧�� ��Ʈ��(���) ����
	- �ݺ���(while��) �ǽ�
*/

/*
����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�

�Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
		������ �������� �ʴ� ��

���� ��)
������ ���� �Է� : 10
10 �� �Ҽ��ƴ�

������ ���� �Է� : 11
11 �� �Ҽ�

����Ϸ���....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;		// ����ڷκ��� �Է¹��� ������ ����
		
		int n = 2;		// �Է°��� ������� ������ ������ ������ ����
						// 2 ���� �����ؼ� 1�� ����
						// ex) �Է°� 27 -> n:2 3 4 5 6 7 ...26
		
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է� ���� �Ҽ��� �����Ѵ�
		//String result = "�Ҽ�";
		boolean flag = true;		//num(����� �Է°�)�� �Ҽ��� ���̴�
		
		while (n < num)
		{
			//�׽�Ʈ
			//System.out.println("�ݺ��� ����");

			// Ȯ�� ����
			// n���� num�� ������ ���������� Ȯ��
			if (num % n == 0)	//num�� n���� ������ ��������
			{
				flag = false;	//�Ҽ��� �ƴ�
				break;			//�����(+�׸��� ����������)
			}					// �� break �� ���δ� ���� ����� �ݺ���
			n++;
		}
		// ��� ���
		// ��� ��� �� �����ؾ� �� �߰� Ȯ�� �� 1 ���� �ƴ����� ���� �߰� ����
		if (flag && num != 1)
		{
			//���������� �Ҽ�
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		else
		{
			//���������� �Ҽ� �ƴ�
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}
		
		
		

		
		int a;		// ����ڷκ��� �Է¹��� ������ ����
		int n = 2;	// ���� ����
		String result = "�Ҽ�";

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		//���� �� ó��
		if (a == 1)
		{
				result = "�Ҽ� �ƴ�";
		}
		while (n < a)
		{
			if (a % n == 0)		// num�� �ڽź��� ���� ���� a�� �������ٸ� �Ҽ��� �ƴ�
			{					// �ֳ��� �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ����
				result = "�Ҽ� �ƴ�";
			}
			n++;
		}
		System.out.printf("%d �� %s\n", a, result);
		







		//���� �ڵ�

		// ���� �� ó��
		//2 3   5 7 11 13 17 19 23
		// 1 2   2 4  2  4  2  4	
		//String result;
		/*
		while ()	//a�� �̹� ������ ���̱� ������ ������ ���� �ʿ� ����
		{
			if (a % 1 == 0 || a % a == 0)
			{
				System.out.printf("%d �� �Ҽ�", a);
			}
			else if (a % 1 != 0 || a % a != 0)
			{
				System.out.printf("%d �� �Ҽ� �ƴ�", a);
			}
			else
			{
				System.out.printf("�Ǻ� �Ұ� ������");
			}
			
		}
		*/
	}
}

/*
���� ���

������ ���� �Է� : 10
10 �� �Ҽ��ƴ�

������ ���� �Է� : 11
11 �� �Ҽ�

������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/