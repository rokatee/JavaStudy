/*
���� �迭 ���� 
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
*/

/*
<<����>>
����ڷκ��� ������ �л� ���� �Է¹ް�
�׸�ŭ�� ����(���� ����)�� �Է¹޾�
��ü �л� ������ ��, ���, ������ ���ؼ�
����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
�л� �� �Է� : 3
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64

>> ��	: 136
>> ���	: 45.3
>> ����
90 : -16.0
82 : -8.0
64 : 10.0

����Ϸ���...
*/

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int stuNum;								// �Էµ� �л� ���� ���� ����

		System.out.print("�л� �� �Է� : ");
		stuNum = sc.nextInt();
		
		int[] arr = new int[stuNum];			// �Էµ� �л� ���� ��� �迭

		for (int i = 0; i < arr.length; i++)	// �迭�� ��� �л� ����ŭ ������ �Է��� �ݺ���
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);
			arr[i] = sc.nextInt();
		}
		// �׽�Ʈ
		//System.out.println(arr[0]);

		int sum = 0;							// �������� ���� ����
		
		for (int j = 0; j < arr.length; j++)	// ������ �ݺ���
		{
			sum += arr[j];
			// �׽�Ʈ
			//System.out.println(arr[j]);
		}
		System.out.printf(">> ��	: %d\n", sum);

		double avg;								// ����� ���� ����
		avg = (double)sum / stuNum;				// ��� �����
		//avg = (double)sum / arr.length;
		System.out.printf(">> ���	: %.2f\n", avg);

		System.out.println(">> ����");

		double[] arr1 = new double[stuNum];		// ������ ���� �迭�� ����
		
		double deviation;						// ������ ���� ����
		for (int k = 0; k < arr1.length; k++)	
		{
			//���� = ��� - �л� ����	
			arr1[k] = avg - arr[k];
		}
		for (int l = 0; l < arr.length; l++)	// �Էµ� �л����� ��հ� ���� �ݺ���
		{
			System.out.printf("��� : %d / ���� : %.2f\n",arr[l], arr1[l]);
		}
	}
}

/*
���� ���

�л� �� �Է� : 3
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 60
3�� �л��� ���� �Է� : 70
>> ��   : 220
>> ��� : 73.33
>> ����
��� : 90 / ���� : -16.67
��� : 60 / ���� : 13.33
��� : 70 / ���� : 3.33
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/