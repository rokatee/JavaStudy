/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�


<<����>>
����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
�빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
���ĺ��� �ƴ� ��Ÿ �����̸� �Է¿��� ó���ϴ�
���α׷��� �����Ѵ�

���� ��)
�� ���� �Է� : A
>> A �� a

�� ���� �Է� : b
>> b �� B

�� ���� �Է� : 3
>> �Է� ����
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char x;

		System.out.print("�� ���� �Է� : ");
		x = (char)System.in.read();


		//�ҹ��� x >= 97 && x <= 122
		//�빮�� x >= 65 && x <= 90
		if (x >= 65 && x <= 90)
		{
			System.out.println(">> " + x + " �� " + (char)(x + 32));
		}
		else if (x >= 97 && x <= 122)
		{
			System.out.println(">> " + x + " �� " + (char)(x - 32));
		}
		else
		{
			System.out.print(">> �Է� ����\n");
		}
	}
}

/*
���� ���

�� ���� �Է� : L
>> L �� l

�� ���� �Է� : o
>> o �� O

�� ���� �Է� : v
>> v �� V

�� ���� �Է� : E
>> E �� e

�� ���� �Է� : ��
>> �Է� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/