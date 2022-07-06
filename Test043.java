/*
���� ���� �帧�� ��Ʈ��(���) ����
	- switch �� �ǽ�
*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�

���� ��)
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 17
������ �Է�[+ - * /] : -

>> 3 - 17 = -14
����Ϸ��� �ƹ� Ű�� ��������....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		// �ش� 1
		int num1, num2;
		int op;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		int result = 0;
		// + �� op:43, - �� op:45, * �� op:42, / �� op:47,
		switch (op)
		{
		case 43 : result = num1 + num2; break;
		case 45 : result = num1 - num2; break;
		case 42 : result = num1 * num2; break;
		case 47 : result = num1 / num2; break;
		default : return;		// 1. ���� ��ȯ
								// 2. �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}
		System.out.printf("\n>> %d %c %d = %d\n", num1, op, num2, result);
		
		
		
		// �ش� 2
		int num3, num4;
		char op1;

		System.out.print("ù ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num4 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op1 = (char)System.in.read();

		//�Ϲ� ��
		int result1 = 0;
		
		
		switch (op1)
		{
		case '+' : result1 = num3 + num4; break;
		case '-' : result1 = num3 - num4; break;
		case '*' : result1 = num3 * num4; break;
		case '/' : result1 = num3 / num4; break;
		default : return;

		}

		System.out.printf("\n>> %d %c %d = %d\n", num3, op1, num4, result1);
		

	}
}

/*
���� ���

ù ��° ���� �Է� : 14
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : +

>> 14 + 5 = 19
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/