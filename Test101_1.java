/*
���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
*/

/*
�л����� ��������, ��������, ���������� �Է¹޾�
���� ����� ����ϴ� ���α׷��� �����Ѵ�
��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�
���Ҿ�, ���� ���� �����ڴ� �����Ѵ�
Ŭ���� ����� ������ ���̵� ���ο� ���� ������ �� �ֵ��� �Ѵ�

[���̵����]
���α׷��� �����ϴ� Ŭ����

1. Record Ŭ����
	- �Ӽ��� �����ϴ� Ŭ������ ������ �� (������ �ִ� Ŭ����)

2. Sungjuk Ŭ����
	- �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
	  �̸�, ��������, ��������, ���������� �Է¹ް�
	  ������ ����� �����ϴ� Ŭ������ ������ ��
	  - �Ӽ� : �ο���, Record Ÿ���� �迭 ( Record[] rc; )
	  - ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

3. Test101 Ŭ����
	- main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��

���� ��)
�ο��� �Է�(1~100) : 102
�ο��� �Է�(1~100) : -10
�ο��� �Է�(1~100) : 3

1��° �л��� �̸� �Է� : ȫ�浿
���� ���� : 90
���� ���� : 80
���� ���� : 70

2��° �л��� �̸� �Է� : �ֻ��
���� ���� : 92
���� ���� : 82
���� ���� : 72

3��° �л��� �̸� �Է� : ������
���� ���� : 94
���� ���� : 84
���� ���� : 74

ȫ�浿 90 80 70 240 xx.xx
�ֻ�� 92 82 72 246 xx.xx
������ 94 84 74 252 xx.xx

����Ϸ���....

*/
import java.util.Scanner;

public class Test101_1
{
	public static void main(String[] args)
	{
		//mainŬ������ ����� ���
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int stuNum;
		double avg = 0;
		String name;

		int rank;

		do
		{
			System.out.print("�ο� �� �Է� : ");
			stuNum = sc.nextInt();
		}
		while (stuNum < 0 || stuNum > 100);

		int[][] score = new int[stuNum][3];

		String[] nameArr = new String[stuNum];

		for(int i = 0; i < stuNum; i++)
		{
			//rc[i] = new Record();
			System.out.printf("%d��° �л� �̸� �Է� : ", i+1);
			name = sc.next();
			System.out.print("���� ����  : ");
			score[i][0] = sc.nextInt();
			System.out.print("���� ����  : ");
			score[i][1] = sc.nextInt();
			System.out.print("���� ����  : ");
			score[i][2] = sc.nextInt();

			nameArr[i] = name;
		}

		int[] totArr = new int[stuNum];
		double[] avgArr = new double[stuNum];

		for(int i = 0; i < stuNum; i++)
		{
			total = score[i][0] + score[i][1] + score[i][2];
			avg = total/3.0;

			totArr[i] = total;
			avgArr[i] = avg;
		}

		for(int i = 0; i < stuNum; i++)
			System.out.printf("�̸�: %s | ��: %d | ��: %d | ��: %d | ��: %d | ��: %.2f%n", nameArr[i], score[i][0], 
													score[i][1], score[i][2], totArr[i], avgArr[i]);
	}
}