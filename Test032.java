/*
���� ���� �帧�� ��Ʈ��(���) ����
	- if ��
	- if ~ else �� �ǽ�
*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
	if ��, if ~ else ��, ���� ������, ���� if ��(if�� ��ø), switch ���� �ִ�

2. if ���� if ������ ������ ���� ��� Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�

����ڷκ��� ������ ������ �Է¹޾�
Ȧ�� / ¦���� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
��, ���� if ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

���� ��)
���� �Է� : 20
>> 20��(��) ¦�� �Դϴ�.

���� �Է� : 47
>> 47��(��) Ȧ�� �Դϴ�.
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;		//����ڷκ��� �Է¹޾� ���� ����

		System.out.print("���� �Է� : ");
		num = Integer.parseInt(br.readLine());


		if (num % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦�� �Դϴ�.\n", num);
		}

		if (num % 2 != 0)
		{
			System.out.printf(">> %d��(��) Ȧ�� �Դϴ�.\n", num);
		}


	}
}


/*
���� ���

���� �Է� : 20
>> 20��(��) ¦�� �Դϴ�.

���� �Է� : 47
>> 47��(��) Ȧ�� �Դϴ�.
����Ϸ��� �ƹ� Ű�� ��������...

*/