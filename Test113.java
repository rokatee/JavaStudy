/*
���� Ŭ���� ��� ����
	- ���(Inheritance)
*/

/*
������ ���� ���α׷��� �����Ѵ�
��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�

���� ��)
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+, -, *, /) : -
>> 20 - 15 = 5
����Ϸ���...
*/

import java.util.Scanner;
import java.io.IOException;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ �Է�(+, -, *, /) : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		double result = 0;

		if (op == '+')
			result = x + y;
		else if (op == '-')
			result = x - y;
		else if (op == '*')
			result = x * y;
		else if (op == '/')
			result = (double)x / y;

		return result;
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		ob.input();
		double result = ob.cal();
		ob.write(result);
	}
}