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

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
	/*
	// Aclass���� ��ӹ޾ƿ� �� ����
	// �� �����ڴ� ��� ����
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
	/*
	// �ۼ� ���ص� �ڵ� ���� ��
	Bclass()
	{
		// �θ� Ŭ���� �����ڵ� �ڵ� ����
		//super();
	}
	*/

	boolean input() throws IOException
	{
		//������ Ǯ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �� ���� �Է�(���� ����) : ");		// 20 15 �� �̷������� �Է��ϱ⿡
		String temp = br.readLine();								// �ӽð����� ��°�� �����´�
		/*
		 �� ���ڿ�.split("������");
			  ���ڿ�.split("\\s*");			// ������ �� ����
		
			  ex) "10 20 30 40 50".split("\\s");
			      �� ��ȯ �� {"10", "20", "30", "40", "50"}
		
			  ex) "010-1234-4567".split("-");
			      �� ��ȯ �� {"010", "1234", "4567"}
		*/

		String[] strArr = temp.split("\\s");
		
		if (strArr.length != 2)		// 2���� �Է����� �ʾ��� ���
		{
			return false;
			// false�� ��ȯ�ϸ� input() �޼ҵ� ����
			// �� ������ �����Ͽ� if���� �����ϰ� �� ���
			// �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
			// �����(false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�
		}
		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+, -, *, /) : ");
		op = (char)System.in.read();
		
		if (op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		
		return true;
	}

	double calc()
	{
		double result = 0;
		
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y;		// �������� break ��� �ȴ�
		}
		
		return result;
	}

	/*
	void input() throws IOException
	{
		// �� Ǯ��
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
	*/
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// ������ Ǯ��
		if (!ob.input())		// Bclass���� boolean���� �Է°��� �޾Ҿ����� ���⼭�� �Ȱ���!!
		{
			System.out.println("Error...");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);

		
		/*
		// �� Ǯ��
		ob.input();
		double result = ob.cal();
		ob.write(result);
		*/
	}
}