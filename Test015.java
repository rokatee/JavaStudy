/*
���� �ڹ��� ���� �� Ư¡ ����
	- ������ �ڷ���
	- �ڹ� �⺻ ����� : System.in.read()
*/

/*
	System.in.read() �޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� �����´�
	��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
	ASCII Code ������ ��ȯ�Ѵ�
*/

/*
���� ��)
	�� ���� �Է�		: A
	�� �ڸ� ���� �Է�	: 5

	>> �Է��� ���� : A
	>> �Է��� ���� : 5
	����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char ch;			// ����
		int a;
					
					// ���� �� ó��
					//System.out.print("���� �ϳ� �Է��ϼ��� : ");
					/*
					ch = System.in.read();		//�ϳ��� ���ڸ� ASCII Code ������ ��ȯ�Ѵ�
					// A�� �Է��Ѵٸ�,
					ch = 65;
					ch = int
					char = int					//�� ��ȯ ��Ģ�� ����
					*/

					//ch = (char)System.in.read();

					// ��� ���
					//System.out.println(ch);
					

		//���� �� ó��

		//����
		//����ڿ����Է� �䱸
		System.out.print("���� �ϳ� �Է��ϼ��� : ");		//A�� �Է� �� ���͸� ����
		//���� ����											//A�� ���Ͱ��� \r �� �Է� ��⿭�� ��
		ch = (char)System.in.read();						//A�� ������

		//����
		//����ڿ��� �Է� �䱸
		System.out.print("���� �ϳ� �Է��ϼ��� : \n");
		//���� ����
		a = System.in.read();								//���⼭ \r �� ������, �׷��� �ڵ����� �Ѿ

		//��� ���
		//System.out.printf("\n>> �Է��� ���� : %s\n", ch);
		//System.out.printf(">> �Է��� ���� : %d\n", a);
		System.out.println("\n>> �Է��� ���� : " + ch);
		System.out.println(">> �Է��� ���� : " + a);
	}
}