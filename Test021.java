/*
���� �ڹ��� ���� �� Ư¡ ����
	- ��� ������
	- BufferedReader
	- printf()
*/

/*
����ڷκ��� ������ ������ �� �� �Է¹޾�
��Ģ���� �� ������ ������ �����Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� ��
����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

���� ��)
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====���====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
============
����Ϸ��� �ƹ� Ű�� ��������....

*/

//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		
		// �ֿ� ���� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//Scanner sc = new Scanner(System.in);


		int num1, num2;							// ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5;		// ������ ���� ����� ���� ����
		

		// ���� �� ó��
		System.out.println("<<�� ���� ���� �Է� ���α׷�>>");
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		//num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		//num2 = sc.nextInt();
		
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// ��� ���
		System.out.printf("\n====���====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);

		System.out.printf("%d %% %d = %d\n", num1, num2, res5);
		//printf() ������ % �� �ڿ� � Ÿ���� ���ڰ� �� ���� ���� �ɼ��̴�
		//�׷��Ƿ� %�� �ۼ�Ʈ �������� ����Ϸ��� 2��(%%) �ۼ� �ؾ� �Ѵ�.

		System.out.printf("============\n");



	}

}


/*
���� ���

<<�� ���� ���� �Է� ���α׷�>>
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====���====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/