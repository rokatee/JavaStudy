/*
���� Ŭ������ �ν��Ͻ� ���� 
*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� ������ �����ϴ� ���α׷��� �����Ѵ�
��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
Calculate Ŭ���� ����

���� ��)
������ �� ���� �Է�(���� ����) : 10 5
������ ������(+ - * /) : +
>> 10 + 5 = 15
����Ϸ���....
*/

/*
���� �ν� �� ����
���� ���� ���� �� Scanner
������ �� readLine
*/

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �ֿ� ���� ����
	int n1,n2;		// ������ �� ����
	char ch;		// ������
	//int result;	// �����ڿ� ���� ����
	

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("������ ������(+ - * /) : ");
		ch = (char)System.in.read();
	}
	
	// �޼ҵ� ����(��� : ����)
	double cal()
	{
		double result = 0;
		
		// ���1
		/*
		if (ch == '+')
		{
			result = n1 + n2;
		}
		else if (ch == '-')
		{
			result = n1 - n2;
		}
		else if (ch == '*')
		{
			result = n1 * n2;
		}
		else if (ch == '/')
		{
			result = (double)n1 / n2;
		}
		*/

		// ���2
		switch (ch)
		{
			case '+' : result = n1 + n2; break;
			case '-' : result = n1 - n2; break;
			case '*' : result = n1 * n2; break;
			case '/' : result = n1 / n2; break;
		}
		return result;
	}
	
	// �޼ҵ� ����(��� : ���)
	void print(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", n1, ch, n2, result);
	}
}