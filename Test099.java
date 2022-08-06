/*
���� Ŭ������ �ν��Ͻ� ����
	- Ŭ���� ����
	- �迭�� Ȱ��
	- ���� ���� �����ڿ� ��������
*/

/*
	����ڷκ��� ��, ��, ���� �Է¹޾�
	�ش� ��¥�� ������ ����ϴ� ���α׷��� ����
	��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�
	����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ� (�� WeekDay Ŭ���� ����)
	�׸��� �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�
	���� ���� �������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
	���������� WeekDay Ŭ������ ���踦 ����
	Practice099 Ŭ������ main() �޼ҵ尡 ���������� ����� �� �ֵ��� �Ѵ�

	���� ��)
	�� �� �� �Է�(���� ����) : 2022 7 15
	>> 2022�� 7�� 15�� �� �ݿ���
	����Ϸ���...

	Hint
	- 1�� 1�� 1�� �� "������"
	- 1���� 365���� �ƴϴ�
	- 2���� ������ ��¥�� 29�� �� ����
	  2���� ������ ��¥�� 28�� �� ���
	- ������ �Ǻ� ����
		�� ������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
		   400�� ����̸� ����
*/

import java.util.Scanner;

class WeekDay
{
	// �ֿ� ���� ����
	Scanner sc = new Scanner(System.in);
	int y,m,d;
	int year=0, month=0;
	int yoil, ilsoo;

	// �迭 ���� �� �ʱ�ȭ
	char[] result = {'��', '��', 'ȭ', '��', '��', '��', '��'};

	// ����� ��
	void input()
	{
		System.out.print("�� �� �� �Է�(���� ����) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}
	// �׽�Ʈ
	//System.out.println(y);
	//System.out.println(m);
	//System.out.println(d);
	

	// �ϼ� ���� �޼ҵ�
	int ilsoo()
	{
		// �� �� ��
		for (int i = 1; i < y; i++)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				year += 366;			// ����
			else
				year += 365;			// ���
		}
		// �׽�Ʈ
		//System.out.println(year);
			
		// �� �� ��
		if (m >=1 && m <= 7)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				month = (m-1)*30+2;		// ����
			else
				month = (m-1)*30+1;		// ���
		}
		
		if (m >=8 && m <= 12)
		{
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				month = (m-1)*30+4;		// ����
			else
				month = (m-1)*30+3;		// ���
		}
		// �׽�Ʈ
		//System.out.println(month);

		//
		ilsoo = d + month + year;
		yoil = ilsoo % 7;

		return yoil;
	}
	
	// ��� ��� �޼ҵ�
	void print(int yoil)
	{
		System.out.printf(">> %d�� %d�� %d�� �� %c����\n",y,m,d,result[yoil]);
	}
		
}

public class Test099
{
	public static void main(String[] args)
	{
		WeekDay_P wd= new WeekDay_P();
		wd.input();
		int yoil = wd.ilsoo();
		wd.print(yoil);
	}
}