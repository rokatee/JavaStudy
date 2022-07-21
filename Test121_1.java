/*==============================
  ���� Ŭ���� ��� ����
   - �������̽�(Interface)
===============================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.


// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է�(���� ����) : 2207123 ������
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2208225 �ڹڹ�
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2207123 ������    90 100 85    xxx xx.xx
//                   ��  �� ��
// 2208225 �ڹڹ�    85 70 65     xxx xx.xx
//                   �� �� ��

// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;
import java.io.IOException;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record_inter_1
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ����
	int tot;				//-- ����
	double avg;				//-- ���
}


interface Sungjuk_inter_1
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl_1 implements Sungjuk_inter_1
{
	private int inwon;
	private Record_inter_1[] rec;
	
	int score[][];
	char strRank[][];


	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record_inter_1[inwon];
		score = new int[inwon][3];
		strRank = new char[inwon][3];

	}



	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i< inwon; i++)
		{
			rec[i] = new Record_inter_1();
				
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.printf("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			score[i][0] = rec[i].kor;
			score[i][1] = rec[i].eng;
            score[i][2] = rec[i].mat;

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0; 
		}

		System.out.println(); // ����

		for(int i=0; i < inwon; i++)
		{
			for(int j=0; j < 3; j++)
			{
				if(score[i][j] == 100 || score[i][j] >= 90)
					strRank[i][j] = '��';
				else if(score[i][j] >= 80)
					strRank[i][j] = '��';
                else if(score[i][j] >= 70)
					strRank[i][j] = '��';
                else if(score[i][j] >= 60)
					strRank[i][j] = '��';
                else
					strRank[i][j] = '��';
                
			}
		}
	} // end input()




	@Override
	public void print()
	{
		for(int i=0; i< inwon; i++)
		{
			System.out.printf("%s %4s %4d %3d %3d \t %d %4.2f\n", 
				rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("\t\t  %2c %2c %2c\n",strRank[i][0], strRank[i][1], strRank[i][2]);
		}
	} // end print()

}



// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121_1
{
	public static void main(String[] args) throws IOException
	{

		Sungjuk_inter_1 ob;

		// ���� �ذ�������� �ۼ��ؾ� �� ob ���� �� ��ü ����
		ob = new SungjukImpl_1();

		ob.set();
		ob.input();
		ob.print();

	}
}