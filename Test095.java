/*
���� �迭 ���� 
	- �迭�� ���� ó��(�� Random Ŭ���� Ȱ��)
*/

/*
����ڷκ��� ������ ������ �Է¹޾�
�� ������ ������ŭ ����(1~100)�� �߻����� �迭�� �ְ�
�迭�� ����ִ� �����͵� ��
���� ū ���� ���� ���� ���� �����Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
�߻���ų ������ ���� �Է� : 10
(50 7 24 81 72 45 61 38 1 99 �� �������� �߻��� ������...)
int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} �� �迭�� ��Ƴ���(�迭 ����))
���� ū �� : 99, ���� ���� �� : 1

����Ϸ���...

*/

import java.util.Scanner;
import java.util.Random;

public class Test095
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ֿ� ���� ����
		int size;			// ������� �Է°��� ���� ����

		// �ȳ� �޼��� ���
		System.out.print("�߻���ų ������ ���� �Է� : ");
		size = sc.nextInt();

		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����(�迭 ����)
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� java.util.Random
		Random rd = new Random();
		//--Random Ŭ���� �ν��Ͻ� ����
		
		// �� Random Ŭ������ nextInt() �޼ҵ�
		//	  0 ~ �Ű������� �Ѱܹ��� ���� n-1 ������ �� ��
		//	  ������ ����(����) 1���� �߻���Ų��.
		
		//rd.nextInt(10);	// 0 ~ 9 �� ���� 1�� �߻�
		// �׽�Ʈ
		//System.out.println("�߻��� ���� : " + rd.nextInt(10));
		// 0 ~ 9 ������ ���� ������ ������ ���� �� �� �߻�

		// �迭 ����
		//for (int i = 0; i < arr.length; i++)
		for (int i = 0; i < size; i++)
		{
			//rd.nextInt(101);
			// �� 0 ~ 100 �� 1��
			//rd.nextInt(100);
			// �� 0 ~ 99 �� 1��
			
			arr[i] = rd.nextInt(100) + 1;
			//		 ---------------
			//		 0 ~ 99
			//		 --------------------
			//		 1 ~ 100

			//rd.nextInt(100);			 �� 0 ~  99 ������ ������ ���� �� �� �߻�
			//rd.nextInt(100) + 1;		 �� 1 ~ 100 ������ ������ ���� �� �� �߻�


			
		}

		// �׽�Ʈ �� ������ �迭�� ��ü ��� ���
		int max;
		int mim;

		max = arr[0];
		mim = arr[0];

		for (int i = 0; i < arr.length; i++)		//int i = 1�� ����? �� ������ arr[0]�� max�� mim�� �����״�
		{											//						arr[1]���� �����ϸ� �ȴ�
			System.out.printf("%4d\n", arr[i]);
			/*
			�߻���ų ������ ���� �Է� : 10
				15  50  91  70  64  91   2  16  69  29
			�߻���ų ������ ���� �Է� : 10
				68  68  90   7  96  82  22  58  62  32
			�߻���ų ������ ���� �Է� : 10
				67  32  65  61  69  84  20  95  70  10
			*/
			//------------------------------------------������� �����ϸ� �迭 ���� �Ϸ�

			if (max < arr[i])
			{
				//max = max^arr[i];
				//arr[i] = arr[i]^max;
				//max = max^arr[i];
				max = arr[i];
			}

			if (mim > arr[i])
			{
				//mim = mim^arr[i];
				//arr[i] = arr[i]^mim;
				//mim = mim^arr[i];
				mim = arr[i];
			}

		}
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d\n",max, mim);

	}
}