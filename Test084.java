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

>> ��   : 236
>> ��� : 78.67
>> ����
1�� �л��� ���� : 90 / ���� : -11.33
2�� �л��� ���� : 82 / ���� : -3.33
3�� �л��� ���� : 64 / ���� : 14.67

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
			System.out.printf("%d�� �л��� ���� : %d / ���� : %.2f\n", l+1, arr[l], arr1[l]);
		}
	}
}

/*
���� ���

�л� �� �Է� : 3
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64

>> ��   : 236
>> ��� : 78.67
>> ����
1�� �л��� ���� : 90 / ���� : -11.33
2�� �л��� ���� : 82 / ���� : -3.33
3�� �л��� ���� : 64 / ���� : 14.67

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/