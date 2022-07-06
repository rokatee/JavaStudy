/*
���� ������(Operator) ����
	- ���� ������ == ���� ������
*/

/*
����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������... �������� ������� �Ǻ��Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, �Է��� BufferedReader �� Ȱ���ϰ�
���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.
*/

/*
���� ��)
������ ���� �Է� : 2000
2000 �� ����

������ ���� �Է� : 2012
2012 �� ����

������ ���� �Է� : 2022
2022 �� ���
*/

/*
<<������ �Ǻ� ����>>
4�� ��� �̸鼭 100�� ����� �ƴϸ� ����(29��)
400�� ����� ����(29)
������ ���(28)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;			// ����ڰ� �Է��� �⵵�� ���� ����
		String strResult;	// (�������� �������) �Ǻ� ����� ���� ����

		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());
		
		//			������ 4�� ���	  ������ 100�� ����� �ƴ�		������ 400�� ���
		//strResult = year % 4 == 0 && year % 100 != 0 ? "����" : year % 400 == 0 ? "����" : "���";
		strResult = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "����" : "���";
		// ���� ������ ��ø �ʿ� ����!!

		System.out.println(year + " �� " + strResult);
	}
}

/*
���� ���

������ ���� �Է� : 2000
2000 �� ����

������ ���� �Է� : 2012
2012 �� ����

������ ���� �Է� : 2022
2022 �� ���
����Ϸ��� �ƹ� Ű�� ��������...
*/