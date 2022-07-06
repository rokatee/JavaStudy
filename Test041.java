/*
���� ���� �帧�� ��Ʈ��(���) ����
	- switch �� �ǽ�
*/

/*
���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

[���� �� ����]
switch(����)
{
	case ���1 : ����1; [break;]
	case ���2 : ����2; [break;]
		  :
	[default : ����n+1; [break;]
}

switch ���� ���İ� case ���� �����
byte, short, int, long ���̾�� �Ѵ�
+ ���� Ÿ��(char)
+ ���ڿ�(String)

case �� �ڿ� break; �� ���� ������ ���
���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. ( �� �⺻ ��)

break; �� ������ ���
�ش� �������� ������ ���� �� switch ���� ����������. ( �� �Ϲ� ��)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;				// �̸�
		int kor, eng, mat, tot;		// ��,��,��,����
		//double avg;				// ���
		int avg;
		char grade;					// ���

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		//avg = tot / 3.0;
		avg = tot / 3;
		
		/*
		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		*/
		
		/*
		switch (avg/10)
		{
			case 10 : grade= 'A'; break;
			case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			case 5 : grade= 'F'; break;
			case 4 : grade= 'F'; break;
			case 3 : grade= 'F'; break;
			case 2 : grade= 'F'; break;
			case 1 : grade= 'F'; break;
			case 0 : grade= 'F'; break;
		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10 : grade= 'A'; break;
			case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			default : grade= 'F'; break;
		}
		*/

		switch (avg/10)
		{
			case 10 : case 9 : grade= 'A'; break;
			case 8 : grade= 'B'; break;
			case 7 : grade= 'C'; break;
			case 6 : grade= 'D'; break;
			default : grade= 'F'; break;
		}

		// ��� ���
		System.out.println();
		System.out.printf(">> ����� �̸��� %s �Դϴ�.\n", name);
		//System.out.printf(">> ������ %d ����� %.2f �Դϴ�.\n", tot, avg);
		System.out.printf(">> ������ %d ����� %d �Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);
		
	}
}

/*
���� ���

�̸� �Է� : ���α�
�������� �Է� : 90
�������� �Է� : 80
�������� �Է� : 70

>> ����� �̸��� ���α� �Դϴ�.
>> ������ 240 ����� 80 �Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/