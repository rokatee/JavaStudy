/*
���� Ŭ���� ��� ����
	- �������̽�(Interface)
*/

/*
�� �ǽ� ����

���� ó�� ���α׷��� �����Ѵ�
��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�

���� ��)

�ο� �� �Է�(1 ~ 10) : 11
�ο� �� �Է�(1 ~ 10) : 0
�ο� �� �Է�(1 ~ 10) : 2

1��° �л��� �й� �̸� �Է�(���� ����) : 2207123 ���缮
���� ���� ���� ���� �Է�   (���� ����) : 90 100 85

2��° �л��� �й� �̸� �Է�(���� ����) : 2208456 �ڸ��
���� ���� ���� ���� �Է�   (���� ����) : 85 70 65


2207123 ���缮   90  100  85   ����xxx  ���xxx
				 ��   ��  ��	
2208456 �ڸ��   85   70  65	xxx		xxx
				 ��	  ��  ��

����Ϸ���...

�Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

*/

import java.util.Scanner;

class Record_inter
{
	String hak, name;		// �й�, �̸�
	int kor, eng, mat;		// �� �� �� ����
	int tot;				// ����
	double avg;				// ���
	//int[] jumsu = new int[3];
}

//�������̽�
interface Sungjuk_inter
{
	public void set();		// �ο� ����
	public void input();	// ������ �Է�
	public void print();	// ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk_inter
{
	private int inwon;
	private Record_inter[] rec;
	

	@Override
	public void set()
	{

		// �׽�Ʈ
		//System.out.println("set()...");
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1 ~ 10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record_inter[inwon];
	}

	@Override
	public void input()
	{
		// �׽�Ʈ
		//System.out.println("input()...");
		
		Scanner sc = new Scanner(System.in);

		//String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};

		for (int i = 0; i < inwon; i++)
		{
			rec[i] = new Record_inter();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.printf("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
			
			/*
			for (int j = 0; j < title.length; j++)
			{
				System.out.print(title[j]);

				rec[i].jumsu[j] = sc.nextInt();

				rec[i].tot += rec[i].jumsu[j];
			}

			rec[i].avg = rec[i].tot / 3.0;
			*/
		}
	}

	@Override
	public void print()
	{
		// �׽�Ʈ
		//System.out.println("print()...");

		for (int i = 0; i < inwon; i++)
		{
			System.out.printf("%2s %2s %3d %3d %3d %4d  %4.2f\n"
					, rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("\t %10s %2s %2s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));

			/*
			System.out.printf("%2s %2s", rec[i].hak, rec[i].name);

			for (int j = 0; j < 3; j++)
			{
				System.out.printf("%3d", rec[i].jumsu[j]);
			}
			
			System.out.printf("%4d %4.2f", rec[i].tot, rec[i].avg);
			*/
		}
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String grade;

		if (score >= 90)
			grade = "��";
		else if (score >= 80)
			grade = "��";
		else if (score >= 70)
			grade = "��";
		else if (score >= 60)
			grade = "��";
		else
			grade = "��";
		return grade;
	}
}

// main() �޼ҵ� �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		//SungjukImpl ob1 = new SungjukImpl();
		//Sungjuk_inter ob;
		//ob = ob1;		// �� ob = (Sungjuk_inter)ob1; �� �տ� ��ȣ�� ��� �Ǵ� ������ �������� ������ ���� ���̱� ����
		//	�� ���ٷ� �ٲٸ�?
		Sungjuk_inter ob = new SungjukImpl();


		// ���� �ذ� �������� �ۼ��ؾ��� ob ���� �� ��ü ����
		ob.set();
		ob.input();
		ob.print();
	}
}