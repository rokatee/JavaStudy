/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�


<<����>>
����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ �������� ������� �Ǻ��Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, �Է��� BufferedReader �� Ȱ���ϰ�,
if ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�


���� ��)
������ ���� �Է� : 2000
2000 �� ����

������ ���� �Է� : 2012
2012 �� ����

������ ���� �Է� : 2022
2022 �� ���


<<������ �Ǻ� ����>>
4�� ��� �̸鼭 100�� ����� �ƴϸ� ����(29��)
400�� ����� ����(29)
������ ���(28)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;	// ����ڰ� �Է��� ������ ���� ����

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		// ���ǹ� �� 4�� ����̸鼭 100�� ����� �ƴ�, 400�� ���
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.printf("%d �� ����\n", year);
		}
		else	// �������� ���
		{
			System.out.printf("%d �� ���\n", year);
		}

		// �ٸ� ���
		String result;	// ������� �������� ����� ���� ����

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			result = "����\n";
		}
		else
		{
			result = "���\n";
		}

		System.out.println(year2 + " �� " + result);
	}
}