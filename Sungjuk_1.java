import java.util.Scanner;

public class Sungjuk_1
{
	// �ֿ� �Ӽ� ����
	int inwon;			// �ο� ��
	Record_1[] rec;		// Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
						// Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
	
	// �ֿ� �޼ҵ� ����(��� ����)
	// 1. �ο� �� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 100);

		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ���� ��,
		// Record Ŭ������ �ν��Ͻ��� ������ �� �ƴ�.
		// (��ü���� ����ִ� �� �ƴ϶� ��׸���)
		rec = new Record_1[inwon];
	}
	
	// 2. �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
		
		
		// �ο� �� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for (int i = 0; i < inwon; i++)		// �� for (int i = 0; i < rec.length; i++)
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����
			// 27������ ���� ��׸��� ���⼭ ����ϸ� ��
			// �ο� �� ��ŭ ���鼭 Record ��ü�� ������ �̸�, ������ ���� ��.
			rec[i] = new Record_1();
			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);
			rec[i].name = sc.next();
			
			/*
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
			*/
			// �� ���� 3���� ������ �����̹Ƿ� �ϳ��� ����!!
			for (int j = 0; j < title.length; j++)
			{
				// �ȳ� �޼��� ���
				System.out.print(title[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();		// score[0] �� ��������
													// score[1] �� ��������
													// score[2] �� ��������

				// ��, ��, �� ���� �����͸� �ݺ������� �Է¹޴� ����
				// ������ ���� ���� ����
				rec[i].tot += rec[i].score[j];
				// tot�� ���������̹Ƿ� 0���� �ʱ�ȭ �Ǿ� �ִ�
			}

			// ��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;

		} // end outer for

	} // end input()
	
	// 3. ��� ���
	public void print()
	{
		// ���� ���� ���� �޼ҵ� ȣ��
		ranking();
		// ����
		System.out.println();
		
		// �л� �� �� �� �ݺ� ��� ���� ����
		for (int i = 0; i < inwon; i++)		// �� for (int i = 0; i < rec.length; i++)
		{
			// �̸� ���
			System.out.printf("%5s", rec[i].name);

			// ����(�� �� ��) �ݺ� ���
			for (int j = 0; j < 3; j++)
				System.out.printf("%4d", rec[i].score[j]);

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			// ���� ��� ���� �߰�
			System.out.printf("%5d", rec[i].rank);

			// ����
			System.out.println();
 		}
	}
	
	// 4. ���� ���� �޼ҵ� �߰�
	//	  - ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ �� �Ű����� (�Ѱ��� �ʿ�) ����
	//	  - Record �迭�� rank �Ӽ� �ʱ�ȭ ��� ���� �� ��ȯ �ڷ��� �� void
	//	  - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� ���� ���� ������ private
	private void ranking()
	{
		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (int i = 0; i < inwon; i++)
		{
			rec[i].rank = 1;
		}

		// ��� ���� �� 5���� ���� ���...
		for (int i = 0; i < inwon - 1; i++)			// �� �� �񱳱��� �� 0			1		2		3
		{											// ������ ����� �� ������ ���� �ʱ⿡..
			for (int j = i+1; j < inwon; j++)		// �� �� �񱳴�� �� 1 2 3 4	2 3 4	3 4		4
			{
				// �񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�
				if (rec[i].avg > rec[j].avg)
				{
					// �񱳴���� rank�� 1��ŭ ����
					rec[j].rank++;
				}
				// �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�
				else if (rec[i].avg < rec[j].avg)
				{
					// �񱳱����� rank�� 1��ŭ ����
					rec[i].rank++;
				}
			}
		} // ������� ���� ���� ����� �������� print()���� ��¹� �߰������ �� 102�� ��
	}
}
