/*
���� Ŭ������ �ν��Ͻ� ���� 
*/

/*
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �������� ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�

��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
Hap Ŭ���� ����
����, ������ �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�

���� ��)
������ ���� �Է�(1~1000) : 1060
������ ���� �Է�(1~1000) : -45
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100������ �� : 5050
����Ϸ���...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// ���� ���� ���� �� �ʱ�ȭ
	int num;	// ����� �Է°� 
	//int sum;	// ������ ������ �Ʒ� ���� ó�� �޼ҵ忡�� �������൵ �ȴ�
	

	// ����� �Է°��� �ҷ��� �ڵ� �ۼ�
	void input() throws IOException
	{
		// BufferedReader ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// do~while ������ 1~1000 ���� ���� �Է� �� ����ؼ� ���� �Է��ϵ��� ����
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num < 1 || num > 1000);
	}
	
	// ���� ó�� �޼ҵ� �� ����� �Է°������� ������
	int calSum()
	{
		int sum = 0;	// ������ ������ ���꿡���� �ʿ��ϱ⿡ �������� ���� �ʿ� ����

		for (int a = 1; a <= num; a++)
		{
			sum+=a;
		}
		return sum;
	}
	
	// ��� ��� �޼ҵ�
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", num, sum);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();
		
		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ----------------------
		//     �������� Ȱ��
		ob.input();			// �� new Hap().input();
		
		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calSum() 
		int sum = ob.calSum();
		
		// ������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		//ob.print(ob.calSum()); // �̷��� ����ص� ����
		ob.print(sum);

	}
}

/*
���� ���

������ ���� �Է�(1~1000) : 2000
������ ���� �Է�(1~1000) : -10
������ ���� �Է�(1~1000) : 200
>> 1 ~ 200 ������ �� : 20100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/