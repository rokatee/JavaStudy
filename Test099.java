/*
���� Ŭ������ �ν��Ͻ� ����
   - Ŭ���� ����
   - �迭�� Ȱ��
   - �������������ڿ� ��������
*/

// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� ����
// ��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (�� WeekDay Ŭ���� ����)
// �׷��� �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDay Ŭ������ ���踦 ����
// Test099 Ŭ������ main �޼ҵ尡 ���������� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� �� �� �Է�(���� ����) : 2022 7 15
// >> 2022�� 7�� 15�� �� �ݿ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// Hint
// - 1�� 1�� 1�� �� "������"
// - 1���� 365���� �ƴϴ�
// - 2���� ������ ��¥�� 29�� �� ����
//   2���� ������ ��¥�� 28�� �� ���
// - ������ �Ǻ� ����
//      �� ������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
//         400�� ����̸� ����

import java.util.Scanner;

class WeekDay
{
	
    // ���� ����
	private int y, m, d, j;
	private int year=0, month=0, result;

	Scanner sc = new Scanner(System.in);

	// �迭 ���� �� �ʱ�ȭ
	private char[] arr = {'��', 'ȭ', '��', '��', '��', '��', '��'};


	// ����� ��
	void input()
	{
		System.out.print("�� �� �� �Է�(���� ����) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// System.out.println(y);
	// System.out.println(m);
	// System.out.println(d);

	// ���� �޼ҵ�
	int cal()
	{
		// �� �� ��
		for (int i=1; i<=y-1; i++)
		{
			if (y%4==0 && y%100!=0 || y%400==0)                     // ����
			   year += 366;
			else                                          // ���
			   year += 365;
		}

		// �׽�Ʈ
		// System.out.println(year);


		// �� �� ��
		if (m>=1 && m<=7)
		{
		   if (y%4==0 && y%100!=0 || y%400==0)
			  month += 30*(m-1)+2;
		   else
			  month += 30*(m-1)+1;
		}
		else if (m>=8 && m<=12)
		{
		   if (y%4==0 && y%100!=0 || y%400==0)
			  month += 30*(m-1)+4;
		   else
			  month += 30*(m-1)+3;
		}
		else
		   month = 0;

		// �׽�Ʈ
		// System.out.println(month);

		result = year + month + (d-1);

		j = result % 7;

		return j;
	}

	// ��� ��� �޼ҵ�
	void print(int j)
	{
	   System.out.printf(">> %d�� %d�� %d�� �� %c����%n", y, m, d, arr[j]);
	}
}

public class Test099
{
   public static void main(String[] args)
   {
		WeekDay wd = new WeekDay();

		wd.input();

		int j = wd.cal();

		wd.print(j);


		/*
		// ���� ����
		int y, m, d, j;
		int year, month, result;
		year = month = 0;

		Scanner sc = new Scanner(System.in);

		// �迭 ���� �� �ʱ�ȭ
		char[] arr = {'��', 'ȭ', '��', '��', '��', '��', '��'};


		// ����� ��
		System.out.print("�� �� �� �Է�(���� ����) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

		// System.out.println(y);
		// System.out.println(m);
		// System.out.println(d);

		// ���� �޼ҵ�
		// �� �� ��
		for (int i=1; i<=y-1; i++)
		{
			 if (y%4==0 && y%100!=0 || y%400==0)            // ����
				year += 366;
			 else                                          // ���
				year += 365;
		}

		// System.out.println(year);


		// �� �� ��
		 if (m>=1 && m<=7)
		 {
			if (y%4==0 && y%100!=0 || y%400==0)
				month += 30*(m-1)+2;
			else
				month += 30*(m-1)+1;
		 }
		 else if (m>=8 && m<=12)
		 {
			if (y%4==0 && y%100!=0 || y%400==0)
			   month += 30*(m-1)+4;
			else
			   month += 30*(m-1)+3;
		 }
		 else
			month = 0;

		// System.out.println(month);

		result = year + month + (d-1);

		j = result % 7;

		// ��� ��� �޼ҵ�
		System.out.printf(">> %d�� %d�� %d�� �� %c����%n", y, m, d, arr[j]);
		*/
      
   }
}