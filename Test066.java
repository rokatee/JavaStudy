/*
���� ���� �帧�� ��Ʈ��(���) ����
	- continue �ǽ�
*/

/*
continue Ű���尡 ���ϴ� �ǹ�
(�޺κ� �����ϰ�) + ����ض�

continue �� Ȱ���Ͽ�
������ ���� ��µ� �� �ֵ��� ���α׷��� �����Ѵ�

���� ��)

1~100 �߿� Ȧ���� ���꿡 �����ϰ� ��µ� Ȧ���鸸 �Ѵ�

1	: 1
3	: 4
5	: 9
7	: 16
  :
  :
99	: 2500
*/

public class Test066
{
	public static void main(String[] args)
	{
		int a;			//����� �Է°�
		int i;			//��������
		int sum = 0;	//������
		
		
		//for ������ 
		for (i = 1; i <= 100; i+=2)
		{
			if (i % 2 == 0)		// i�� 2�� �������� �� �������� 0�� �ƴϸ� Ȧ��
				continue;		// �Ʒ� �ڵ带 �������� �ʰ� �ǳʶ�
			sum+=i;
			System.out.printf("%d : %d\n", i, sum);
		}
		
		//while ������ 
		/*
		i = 0;
		while (i < 100)			// i�� 100���� �۰ų� ���� �� �ݺ�, 1���� 100���� �����ϸ鼭 100�� �ݺ�
		{
			i++;				// i�� 1�� ������Ŵ
			if (i % 2 == 0)		// i�� 2�� �������� �� �������� 0�� �ƴϸ� Ȧ��
				continue;		// �Ʒ� �ڵ带 �������� �ʰ� �ǳʶ�
			sum+=i;
			System.out.printf("%d : %d\n", i, sum);
		}
		return;
		*/
	}
}

/*
���� ���


*/