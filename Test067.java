/*
���� ���� �帧�� ��Ʈ��(���) ����
	- return �ǽ�
*/

/*
return Ű���尡 ���ϴ� �� ���� �ǹ�
	1. ���� ��ȯ
	2. �޼ҵ� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s;
		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n = Integer.parseInt(br.readLine());

		if (n < 10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			// �޼ҵ� ���� �� return ���� �����ϰ� �ִ� �޼ҵ�
			// �� ����� main() �޼ҵ� �� ���α׷� ����
		}

		s = 0;
		for (int i = 1; i <= n; i++)
		{
			s += 1;
		}

		System.out.println("��� : " + s);
	}
}

/*
���� ���

������ ���� �Է�(10 �̻�) : 2
10 �̻��� ������ �Է��ؾ� �մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(10 �̻�) : 15
��� : 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/