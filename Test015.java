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
		int a;				// ���� ù° �ڸ�
		int b;				// ���� ��° �ڸ�
		int c;				// �� �ڸ� ���� 
					
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
		System.in.read();									//���Է� ��⿭�� �����ִ� \r�� \n��
		System.in.read();									//  System.in.read(); 2�� �Է��Ͽ� ��ŵ�� �ǳʶٱ�

		//���� (1�� �ڸ�)
		//����ڿ��� �Է� �䱸
		System.out.print("1�� �ڸ� ���� �ϳ� �Է��ϼ��� : ");
		//���� ����
		a = System.in.read() - 48;							//���⼭ \r �� ������, �׷��� �ڵ����� �Ѿ
		System.in.read();									//���Է� ��⿭�� �����ִ� \r�� \n��
		System.in.read();									//  System.in.read(); 2�� �Է��Ͽ� ��ŵ�� �ǳʶٱ�

		//���� (10�� �ڸ�)
		//����ڿ��� �Է� �䱸
		System.out.print("10�� �ڸ� ���� �ϳ� �Է��ϼ��� : ");
		//���� ����
		b = System.in.read() - 48;							//���⼭ 48�� ���� ��, ���ڸ� �Է��ص� ���ڷ� �ν��� '0'
															//���� '0'�� �ƽ�Ű�ڵ� ���� 48�� ���־��
															//�Է��� ���� �״�� ��� ��

		//��� ���
		//System.out.printf("\n>> �Է��� ���� : %s\n", ch);
		//System.out.printf(">> �Է��� ���� : %d\n", a);

		c = b*10+a;

		System.out.println("\n>> �Է��� ���� : " + ch);
		System.out.println(">> �Է��� ���� : " + a);
		System.out.println(">> �Է��� ���� : " + b);
		System.out.println(">> �Է��� ���� : " + c);
	}
}