/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

Ȧ��, ¦�� �� ���� if ����
Ȧ��, ¦��, 0 �� if �� ��ø
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if (num == 0)		// 0���� �Ǻ��ϴ� ���� �� 0 % 2 == 0 �̱� ������
		{					// ¦������ �ɷ����Ƿ� (num % 2 == 0) ���� ���� �Ǻ��ؾ� �Ѵ�
			System.out.printf(">> %d��(��) 0 �Դϴ�.\n", num);
		}
		else if (num % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦�� �Դϴ�.\n", num);
		}
		else //if (num % 2 != 0)
		{
			System.out.printf(">> %d��(��) Ȧ�� �Դϴ�.\n", num);
		}



		// �ٸ� �ش�
		String result = "���� �Ұ�";

		if (num == 0)
		{
			result = "0";
		}
		else if (num % 2 == 0)
		{
			result = "¦��";
		}
		else if (num % 2 != 0)
		{
			result = "Ȧ��";
		}
		//else
		//{
		//	result = "���� �Ұ�";	//���⼭ ���ְų� ���� ��� ������ ���� ����ְų�
		//}

		System.out.println(num + " �� " + result);
	}
}

/*
���� ���

���� �Է� : 0
>> 0��(��) 0 �Դϴ�.


���� �Է� : 1
>> 1��(��) Ȧ�� �Դϴ�.


���� �Է� : 2
>> 2��(��) ¦�� �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/