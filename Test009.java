/*
���� �ڹ��� ���� �� Ư¡ ����
	- ������ �ڷ���
	- ������ �ڷ��� �ǽ� �� �׽�Ʈ : double
	- ������ ���� �ǽ�
*/

public class Test009
{
	public static void main(String[] args)
	{
		// ������ ������ ������
		double a = 1 / 2;
		// 8����Ʈ �Ǽ��� ���ϴ� ������ Ÿ���� ���� ������ 
		// ������ ������ �������� ��� ���� ���� ���Ѵ�.
		// �� double a = 0;

		System.out.println("double a : " + a);
		// �� double a : 0.0

		double b = (double)1 / 2;
		//�켱���� �������� ���� (double)1 �� ���� ó�� �ȴ�
		//double b = 1.0 / 2;	// �Ǽ��� ������ �������̹Ƿ� �Ǽ��� ǥ�� ��


		//double b = (double)0;
		System.out.println("double b : " +b);
		// �� double b : 0.5


		double c = 1/2 + 1/2;
		//double c = 0 + 1/2;
		//double c = 0 + 0;
		//double c = 0;
		System.out.println("double c : " + c);
		// �� double c = 0.0

		
	
		//�� �����ڷ� �Ǽ��� ���ԵǾ� �ִ� ������ ����
		double d = 1 / 2.0;
		System.out.println("double d : " + d);
		// �� double d = 0.5
		/*
		������ ����� �����Ͽ� 
		�� ������ �� �Ǽ��� �ϳ��� ���ԵǾ� �ִٸ� 
		������ �Ǽ� ����� ������ ����Ǹ� 
		����� ���� �Ǽ� ���·� ��ȯ�ȴ�
		*/


		double e = 3/2 + 1/2;
		//double e = 1 + 1/2;
		//double e = 1 + 0;
		//double e = 1;
		System.out.println("double e : " + e);
		// �� double e = 1.0


		double f = 3/2 + 1/2.0;
		//double f = 1 + 1/2.0;
		//double f = 1 + 0.5;
		//double f = 1.5;
		System.out.println("double f : " + f);
		// �� double f = 1.5

	}
}