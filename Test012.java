/*
���� �ڹ��� ���� �� Ư¡ ����
	- ������ �ڷ���
	- �ڹ� �⺻ ����� : BufferedReader Ŭ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		
		//int a = 10;					
		// ���� ������� �ʾƵ� �ڹٰ� ������ �˰� ����

		// Ű���� ����(����)
		//BufferedReader br = new BufferedReader();			
		// �� BufferedReader Ŭ���� ����� �ν��Ͻ�(��ü) ���� 
		// ���� ��ÿ� ����, ���� import�� �������μ� �ڹٿ��� �˷���

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//���� �Է��� �о���̴� ��ġ			---------------------
		//										����Ʈ �� ���� ������ -------------
		//															  ����Ʈ �Է°�
		//�ڹ� ��� ������ �ִ�
		//�� �°� ��� �� 2�� ���ó�� �Ǿ��ֳ�?
		//�� �ڹٴ� ������ �� �� �ֱ⿡ �̵��� ž���� ��� �� ��
		//�� �ڹٿ��� �����̶� �ǴܵǸ� �� ������ ������(IOException)�� ���� 


		// �ֿ� ���� ����
		int r;						// ������
		final double PI = 3.14;		// ������ (������ ���ȭ final)
		double a, b;				// ���� ����, �ѷ�


		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �������� �Է� : ");
		
		// 2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r �� ��Ƴ���
		//br.readLine();
		//out.println(); �� ������ ����� ����
		//BufferedReader �� readLine()
		// �� �Է� ��⿭�� �����ִ� ���ڿ� ��ȯ 
		//(�Ű� ������ �Է����� �ʾƵ� �˾Ƽ� �ҷ� �� �� ��ȣ �ȿ� �ڵ� �ʿ� ����)

		// r = br.readLine();  �� r = "1234";
		// br.readLine(); �� ���ڿ� ��ȯ�̱⿡ int Ÿ���� r(������)�� ���� �� ����
		// �ذ�å��? parseInt()
		// "2546"  �� parseInt("2546")  �� 2546
		// "80"	   �� parseInt("80")    ��   80

		//Integer.parseInt("80")		��   80
		// �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		// ��, �̶� �Ѱܹ޴� ���ڿ� �����ʹ� ���� ���¿��� �Ѵ�
		//									(NumberFormat)

		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("2546");
		// r = 2546;
		// ����ڰ� �Է��� ���� br �� BufferedReader �� readLine()
		// �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		// �� ���� Integer.paseInt() �� ���� ������(������)���� ��ȯ�� ��
		// ���� ������ ������ ���� r �� ��Ƴ���

		// 3. ���� �� �ѷ� ���(����)
		//  �� ���� ���� a �� b �� ��Ƴ���
		a = r * r * PI;
		b = r * 2 * PI;
		

		// ��� ���
		//  �� ���� a �� b �� ����ִ� �� ���
		//System.out.println(">> ���� : " + a);
		//System.out.println(">> �ѷ� : " + b);
		/*
		���� �������� �Է� : 45
		>> ���� : 6358.5
		>> �ѷ� : 282.6
		*/
		
		// >> �������� 45�� ���� ���̴� 6358.5 �̸�
		// >> �������� 45�� ���� �ѷ��� 282.6 �̴�.

		//System.out.println(">> �������� " + r + " �� ���� ���̴� " + a + " �̸�");
		//System.out.println(">> �������� " + r + " �� ���� �ѷ��� " + b + " �̴�.");

		System.out.printf(">> �������� %d�� ���� ���̴� %.2f �̸�,\n", r, a);
		System.out.printf(">> �������� %d�� ���� �ѷ��� %.2f �̸�,\n", r, b);

		
	}
}
