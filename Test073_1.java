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

class Calculate_1
{
	int n1,n2;		// ������ �� ����
	char op;		// ������
	double result = 0;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.printf("������ �� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("������ ������(+ - * /) : ");
		op = (char)System.in.read();
	}

	double calPlus()
	{
		result = n1 + n2;
		return result;
	}
	double calMinus()
	{
		result = n1 - n2;
		return result;
	}
	double calTimes()
	{
		result = n1 * n2;
		return result;
	}
	double calDivision()
	{
		result = (double)n1 / n2;
		return result;
	}

	void print(double p, double m, double t, double d)
	{
		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %.2f\n", n1, n2, p);
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %.2f\n", n1, n2, m);
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %.2f\n", n1, n2, t);
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %.2f\n", n1, n2, d);
		}
		else
		{
			System.out.println(">> �Ǻ� �Ұ� ������");
		}
	}
}

public class Test073_1
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����
		Calculate_1 ob = new Calculate_1();

		ob.input();

		double p = ob.calPlus();
		double m = ob.calMinus();
		double t = ob.calTimes();
		double d = ob.calDivision();

		ob.print(p, m, t, d);
	}
}

/*
���� ���

������ �� ���� �Է�(���� ����) : 10 5
������ ������(+ - * /) : +
>> 10 + 5 = 15.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/