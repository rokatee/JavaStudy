// �ڹ� �⺻ ���α׷���
// ������ �ڷ���



public class Test003
{
	// (Test005��� �̸��� ����) Ŭ���� ����

	public static void main(String[] args)
		{
			// (�����̶�� �̸��� ����) �޼ҵ� ����
			
			// ���� ����
			int a;

			// ���� a�� 10 ����(���� �ʱ�ȭ)
			a = 10;

			// ���� ���� �� �ʱ�ȭ(����� ������ �� ���� ó��)
			int b = 20;

			//int a = 30; (�̹� ������ �����߱⿡ ��� �Ұ�)

			// ���� ����
			int c;

			// �׽�Ʈ
			// System.out.println(c);
			//  --> c�� ���� ���� ���� (������ ���� �߻�)

			// ���� �� ó��
			c = a + b;
			//  --> c = 10 + 20;  
			//  --> c = 30;
			//  --> ���� c�� 30�� �����ض�.

			//��� ���
			System.out.println(c);
			//  --> 30
 			
			// ��� ���
			//System.out.println(a b c);
			//  --> ���߰��� �Ѿ�� ������ ���� ���� (������ ����)
			
			/*
			���� ������(+)
			�ǿ����� �� ��� �ϳ��� ���ڿ� ������ �����Ͱ� �����Ѵٸ�
			��������ڷμ��� ����� �����ϴ� ���� �ƴ϶�
			���ڿ� ���� �����ڷμ��� ����� �����ϰ� �ȴ�.
			*/

			// ��� ���
			System.out.println(a + " " + b + " " + c);
			//  --> 10 20 30

			// ��� ���
			System.out.println("a�� ���� " + a + "�Դϴ�.");
			System.out.println("b�� ���� " + b + "�Դϴ�.");
			System.out.println("c�� ���� " + c + "�Դϴ�.");
			/* 
			+ �����ڸ� ����ϴ� ��������
			�ǿ����� �� ���ڿ��� ���ԵǾ� ���� ���
			���ڿ� ���� �����ڷ� Ȱ��Ǹ�
			ó���� ���� ����� ���ڿ��� ���·� ��ȯ�ȴ�
			*/

			/*
			a�� ���� 10�Դϴ�.
			b�� ���� 20�Դϴ�.
			c�� ���� 30�Դϴ�.
			*/

			System.out.println(1 + 2);		// ��������� + �� ���
											// 3

			System.out.println("1" + 2);	// ���ڿ� ���� ������ + �� ���
			System.out.println(1 + "2");	// 12 (1�� 2)
			System.out.println("1" + "2");


		}
}

// ���� ���
/*
30
10 20 30
a�� ���� 10�Դϴ�.
b�� ���� 20�Դϴ�.
c�� ���� 30�Դϴ�.
3
12
12
12
*/