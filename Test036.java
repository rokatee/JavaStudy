/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�'

���� ��)
ù ��° ���� �Է�		: 10
ù ��° ���� �Է�		: 3
������ �Է� [ + - * / ] : +

10 + 3 = 13
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num1, num2;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [ + - * / ] : ");
		op = (char)System.in.read();


		if (op == '+')
		{
			System.out.printf("\n%d + %d = %d\n", num1, num2, (num1+num2));
		}
		else if (op == '-')
		{
			System.out.printf("\n%d - %d = %d\n", num1, num2, (num1-num2));
		}
		else if (op == '*')
		{
			System.out.printf("\n%d * %d = %d\n", num1, num2, (num1*num2));
		}
		else if (op == '/')
		{
			System.out.printf("\n%d / %d = %d\n", num1, num2, (num1/num2));
		}
		else
		{
			System.out.println("\n�Ǻ� �Ұ�");
		}
		*/


		/*
		//�ش� ���1
		int a, b;
		char op1;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [ + - * / ] : ");
		op1 = (char)System.in.read();

		//�׽�Ʈ Ȯ��
		//System.out.println("�Է��� ������ : " + op1);
		
		
		if (op1 == '+')		//����ڰ� �Է��� �����ڰ� '+'���
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op1 == '-')			//����ڰ� �Է��� �����ڰ� '-'���
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op1 == '*')			//����ڰ� �Է��� �����ڰ� '*'���
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op1 == '/')			//����ڰ� �Է��� �����ڰ� '/'���
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
			//a �� b �� ������ ���� �����Ͽ� ���
		}
		else
		{
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.");
		}
		*/


		/*
		//�ش� ���2
		int a2, b2, op2;			// 2���� ������ ������ ��� int��
		
		System.out.print("ù ��° ���� �Է� : ");
		a2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [ + - * / ] : ");
		op2 = System.in.read();

		//�׽�Ʈ Ȯ��
		//System.out.println("�Է��� ������ : " + op1);
		
		
		if (op2 == 43)		//����ڰ� �Է��� �����ڰ� '+'���
		{
			System.out.printf("\n>> %d + %d = %d\n", a2, b2, (a2+b2));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op2 == 45)			//����ڰ� �Է��� �����ڰ� '-'���
		{
			System.out.printf("\n>> %d - %d = %d\n", a2, b2, (a2-b2));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op2 == 42)			//����ڰ� �Է��� �����ڰ� '*'���
		{
			System.out.printf("\n>> %d * %d = %d\n", a2, b2, (a2*b2));
			//a �� b �� ���� ���� �����Ͽ� ���
		}
		else if (op2 == 47)			//����ڰ� �Է��� �����ڰ� '/'���
		{
			System.out.printf("\n>> %d / %d = %d\n", a2, b2, (a2/b2));
			//a �� b �� ������ ���� �����Ͽ� ���
		}
		else
		{
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.");
		}
		*/


		//�ش� ���3
		int a3, b3, result;
		char op3;

		System.out.print("ù ��° ���� �Է� : ");
		a3 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b3 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [+ - * /]: ");
		op3 = (char)System.in.read();

		if (op3 == '+')
		{
			result = a3 + b3;
		}
		else if (op3 == '-')
		{
			result = a3 - b3;
		}
		else if (op3 == '*')
		{
			result = a3 * b3;
		}
		else if (op3 == '/')
		{
			result = a3 / b3;
		}
		else
		{
			result = 0;
		}

		System.out.printf("\n>> %d %c %d = %d\n", a3, op3, b3, result);


		/*
		//�� ó�� �õ��ߴ� ���� (������ �Էº��� Ʋ��)
		String a								//������ String���� �� �� (equals()�� �ؾ��ϴµ� ���� �ȹ��)
		System.out.print("������ �Է� : ");
		a = br.readLine();						//�����ڸ� readLine()���� �ҷ��� �� ����

		int result;

		if (a == "+")
		{
			//result = num1 + num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "-")
		{
			//result = num1 - num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "*")
		{
			//result = num1 * num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else if (a == "/")
		{
			//result = num1 / num2;
			System.out.printf("%d %s %d = %d", num1, a, num2, result);
		}
		else
		{
			result = 0;
		}

		//System.out.println(num1 + a + num2 + " = " + result);
		*/
	}
}

/*
���� ���

ù ��° ���� �Է�		: 10
ù ��° ���� �Է�		: 3
������ �Է� [ + - * / ] : +

10 + 3 = 13

ù ��° ���� �Է�		: 10
ù ��° ���� �Է�		: 3
������ �Է� [ + - * / ] : -

10 - 3 = 7

ù ��° ���� �Է�		: 10
ù ��° ���� �Է�		: 3
������ �Է� [ + - * / ] : *

10 * 3 = 30

ù ��° ���� �Է�		: 10
ù ��° ���� �Է�		: 3
������ �Է� [ + - * / ] : /

10 / 3 = 3
����Ϸ��� �ƹ� Ű�� ��������...
*/