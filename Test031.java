/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�
����� ��� ������ �������� ó���Ѵ�.

90 �� �̻�			 : A
80 �� �̻� 90�� �̸� : B
70 �� �̻� 80�� �̸� : C
60 �� �̻� 70�� �̸� : D
60 �� �̸�			 : F

��, BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

���� ��)
�̸� �Է� : ���α�
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ���α� �Դϴ�.
>> ���� ������ 90
>> ���� ������ 80
>> ���� ������ 70
>> ������ 240 �̰�, ����� 80 �Դϴ�.
>> ����� B �Դϴ�.
��� �Ϸ��� �ƹ� Ű�� ��������.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{

		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;

		// ���� �� ó��
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		double fAvg = tot / 3.0;

		char grade;

		if (fAvg >= 90)				// if ���� ȥ�� ��� ����
		{							// else ���� ȥ�� ��� �Ұ���
			grade = 'A';			// if�� ���� else if �� �ϳ��� ����
		}							// if�� else if ���̿� �� �ٸ� �ڵ带 �ۼ� �� �� ���⿡
		else if (fAvg >= 80)
		{
			grade = 'B';
		}
		else if (fAvg >= 70)		// (fAvg >= 80 && fAvg >= 70) �� ������ �ǹ�
		{							// �̹� ������ fAvg >= 80 �� �ɷ����� ������
			grade = 'C';			// �����ص� �ȴ�
		}
		else if (fAvg >= 60)
		{
			grade = 'D';
		}
		else						// ������ ������ ���� ��, ��?
		{							// Ȥ�� �� ���� ���� ���� �� �ֱ⿡
			grade = 'F';			// �ڹٴ� ���� �ܰ�� �Ѿ�� ����
		}							// ������ else ���� ��� ���� grade�� ������ ���� �̸� ������ ���� �� ��
									//						 (char grade = 'F';)
 
		System.out.printf("\n>> ����� �̸��� %s �Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d\n", kor);
		System.out.printf(">> ���� ������ %d\n", eng);
		System.out.printf(">> ���� ������ %d\n", mat);
		System.out.printf(">> ������ %d �̰�, ����� %.2f �Դϴ�.\n", tot, fAvg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);

	}
}

/*
���� ���

�̸� �Է� : ���α�
���� �Է� : 90
���� �Է� : 80
���� �Է� : 70

>> ����� �̸��� ���α� �Դϴ�.
>> ���� ������ 90
>> ���� ������ 80
>> ���� ������ 70
>> ������ 240 �̰�, ����� 80.00 �Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/