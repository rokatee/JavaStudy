/*
���� ���� �帧�� ��Ʈ��(���) ����
	- �ݺ���(while��) �ǽ�
*/

/*
����ڷκ��� ������ �� ������ �Է¹޾�
�Է¹��� �� ���� ��
���� �� ���� ū �� ������ ���� ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 200
>> 100 ~ 200 ������ �� : xxxx
>> 1 ~ 100 ������ �� : 5050
����Ϸ���....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int n;				// ���� ������ Ȱ���� ����
		int su1, su2;		// ����� �Է°��� ��Ƴ� ����
		int result = 0;		// �������� ��Ƴ� ����
		
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());
		
		//�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1 > su2)
		{
			//�ڸ� �ٲ�
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�
		// ������ ���� Ȯ���� �� ���� ������...)
		
		n = su1;

		while (n <= su2)
		{
			result += n;
			n++;
		}
		
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);
		*/


		
		int n1, n2;
		int sum = 0;
		int a;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
			
		if (n1 <= n2)
		{
			a = n1;

			while (a <= n2)
			{
				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d ������ �� : %d\n",n1, n2, sum);
		}
		else if(n2 < n1)
		{
			a = n2;
			while (a < n1)
			{
				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d ������ �� : %d\n",n2, n1, sum);
		}
			

			
			//int min, max;		//�� �� ������ ����
			//int n;				//��������
			//int a,b;			//����� �Է°� ����
			//int result = 0;		//������ ����

			//System.out.print("ù ��° ���� �Է� : ");
			//su1 = Integer.parseInt(br.readLine());
			//System.out.print("�� ��° ���� �Է� : ");
			//su2 = Integer.parseInt(br.readLine());

			//if (a > b)
			//{
			//	min = b;
			//	max = a;
			//}
			//while ()
			//{
			//	
			//}
			
	}
}

/*
���� ���

ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 1
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 101
>> 2 ~ 101 ������ �� : 5150
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/