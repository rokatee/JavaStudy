/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

����ڷκ��� ������ ���� 3���� �Է¹޾�
���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�

���� ��)
ù ��° ���� �Է� : 753
�� ��° ���� �Է� : 42
�� ��° ���� �Է� : 127

>> ���� ��� :  42 127 753
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;		//����ڰ� �Է��� ������ ������ ��Ƶ� ����
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());		
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		/*
		//�� ������ ��
		if (a > b && b > c)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", c, b, a);
		}
		else if (a > c && c > b)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", b, c, a);
		}
		else if (b > a && a > c)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", c, a, b);
		}
		else if (b > c && c > a)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", a, c, b);
		}
		else if (c > a && a > b)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", b, a, c);
		}
		else if (c > b && b > a)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
		}
		*/
		/*
		//��°��� �� �ٷ� �޴� ���
		String result;		//3���� ������ ũ�� �񱳸� ���� ����

		if (a > b && b > c)
		{
			result = c + " " + b + " " + a;
		}
		else if (a > c && c > b)
		{
			result = b + " " + c + " " + a;
		}
		else if (b > a && a > c)
		{
			result = c + " " + a + " " + b;
		}
		else if (b > c && c > a)
		{
			result = a + " " + c + " " + b;
		}
		else if (c > a && a > b)
		{
			result = b + " " + a + " " + c;
		}
		else if (c > b && b > a)
		{
			result = a + " " + b + " " + c;
		}
		else
		{
			result = "�Ǻ� �Ұ�";
		}
			System.out.println(">> ���� ��� : " + result);
		*/
		

		/*
		//��Ģ������ ������ ���ϱ�
		String result;

		if (a - b > 0 && a - c < 0)
		{
			result = b + " " + a + " " + c;
		}
		else if (a - b < 0 && a - c > 0)
		{
			result = c + " " + a + " " + b;
		}
		else if (a - b < 0 && a - c < 0 && b - c < 0)
		{
			result = a + " " + b + " " + c;
		}
		else if (a - b < 0 && a - c < 0 && b - c > 0)
		{
			result = a + " " + c + " " + b;
		}
		else if (a - b > 0 && a - c > 0 && b - c < 0)
		{
			result = b + " " + c + " " + a;
		}
		else if (a - b > 0 && a - c > 0 && b - c > 0)
		{
			result = c + " " + b + " " + a;
		}
		else
		{
			result = "�Ǻ� �Ұ�";
		}
			System.out.println(">> ���� ��� : " + result);
		*/
		
		
		/*
		//2���� �� �� max�� min�� �ֱ�
		int max, mid, min;
		String result;

		if (a > b)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		if (c > max)		// ���⼭ �߰��� ��Ÿ���� �� ����غ���
		{
			max = c;
		}
		if (c < min)
		{
			min = c;
		}
		//if (a > b)
		//{
		//	mid = a;
		//}
		//if (b > a)
		//{
		//	mid = b;
		//}
			System.out.println(">> ���� ��� : " + max + "mid" + min);
		*/


		//�ش�
		if (a > b)	//ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			//�ڸ� �ٲ�(a �� b)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		//else if (a > c)
		if (a > c)	//ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			//�ڸ� �ٲ�(a �� c)
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)	//�� ��° ������ �� ��° �������� ũ�ٸ�
		{
			//�ڸ� �ٲ�(b �� c)
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);

		
		
	}
}

/*
���� ���

ù ��° ���� �Է� : 42
�� ��° ���� �Է� : 127
�� ��° ���� �Է� : 753

>> ���� ��� :  42 127 753
����Ϸ��� �ƹ� Ű�� ��������...

ù ��° ���� �Է� : 753
�� ��° ���� �Է� : 42
�� ��° ���� �Է� : 127

>> ���� ��� :  42 127 753
����Ϸ��� �ƹ� Ű�� ��������...

ù ��° ���� �Է� : 127
�� ��° ���� �Է� : 753
�� ��° ���� �Է� : 42

>> ���� ��� :  42 127 753
����Ϸ��� �ƹ� Ű�� ��������...

*/