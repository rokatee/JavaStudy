/*
���� �ڹ��� ���� �� Ư¡ ����
	������
	�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�

	���� ��)
		�ﰢ�� ���� ���ϴ� ���α׷�
			�ﰢ���� �غ� �Է� : x		-> ����ڿ��� �Է���� �ȳ�
			�ﰢ���� ���� �Է� : y
			
		>> �غ� : 3, ���� : 5 �� �ﰢ���� ���� : zz

	����Ϸ��� �ƹ� Ű�� ��������...!

*/

/*
���� �ν� �� �м�
	1. �ﰢ���� ���� ���� : �غ� * ���� / 2
	2. ����ڷκ��� �����͸� �Է¹޾� ó��	�� BufferedReader Ȱ��
	3. BufferedReader �� ���� �� ���? �� �� ���?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{

		// �ֿ� ���� ����
			// Ű���� ���� - BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int underLength, height;			// �غ�, ����
		double area;			// ����(2�� ������ ������ �Ǽ� Ÿ���� ����Ѵ�)

		

		// ���� �� ó��
			// ���α׷���
			System.out.println("����ﰢ�� ���� ���ϴ� ���α׷�����");
		
			// �غ�
			// ����ڿ��� �Է��� �䱸
			System.out.print("�ﰢ���� �غ� �Է�: ");
		
			// �Է� ��⿭���� ���ڿ� �ҷ��� ������ ��ȯ �� ������ ���
			underLength = Integer.parseInt(br.readLine());
			
			// ����
			// ����ڿ��� �Է��� �䱸
			System.out.print("�ﰢ���� ���� �Է�: ");
		
			// �Է� ��⿭���� ���ڿ� �ҷ��� ������ ��ȯ �� ������ ���
			height = Integer.parseInt(br.readLine());
		
			// �ҷ��� �����͸� ���Ŀ� ���� �� ����
			//area = underLength * height / 2;
			//			������	  ������  ������ �� ���� ��� ���� (��, ���� ���ϰ� �������� ����)
			area = underLength * height / 2.0;
			//			������	  ������  �Ǽ��� �� �Ǽ� ��� ����


			/*
				�Ǽ� �ڷ����� ��������� ������ ��������
				�Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�
				������ 2�� �ƴ�, �Ǽ������� 2.0���� ������ ������ �����ϰ� �Ǹ�
				�� ������ �Ǽ� ������� ó���ȴ�.
			*/
			
			// area = (double)(underLength * height / 2);	
			// �� �ⲯ ������ ��� �����س��� �������� �Ǽ������� �ٲٴ� �� ��
			// area = (double)underLength * height /2;
			// area = underLength * (double)height /2;
			// area = (double)(underLength * height)/2;


		// ��� ���
		System.out.printf(">> �غ� : %d, ���� : %d �� �ﰢ���� ���� : %.2f%n", underLength, height, area);


	}
}

/*
���� ���

����ﰢ�� ���� ���ϴ� ���α׷�����
�ﰢ���� �غ� �Է�: 3
�ﰢ���� ���� �Է�: 5
>> �غ� : 3, ���� : 5 �� �ﰢ���� ���� : 7.50
*/