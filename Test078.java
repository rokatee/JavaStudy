/*
���� Ŭ������ �ν��Ͻ� ���� 
	- ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
*/

public class Test078
{
	// ���� �Ұ���
	/*
	int n;
	int m;
	
	n = 100;
	m = 200;
	*/

	// ���� ����
	/*
	int n = 100;
	int m = 200;
	*/
	
	
	int n;
	int m;
	
	// ������(Constructor)
	// �ʱ�ȭ ���� �ڵ带 ���� �����ߴ� �ϴ���
	// ���������� �ش� ������� �ʱ�ȭ ���� �����ϰ� �Ǵ� ����
	// ������!!!
	Test078()
	{
		n = 100;
		m = 200;
		System.out.println("������ ����...");
	}

	// �ʱ�ȭ ��(Initialized Block)
	{
		n = 10;
		m = 20;
		System.out.println("�ʱ�ȭ �� ����...");
	}

	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("�Ű����� �ִ� ������ ����...");
	}

	// ��� ��� �޼ҵ� ����
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}
	
	
	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		// ���ʱ�ȭ �� ����...
		//   ������ ����...

		Test078 ob2 = new Test078(1234, 4567);
		ob1.write();
		// ���ʱ�ȭ �� ����...
		//   �Ű����� �ִ� ������ ����...
		//	 n : 100, m : 200

	}
}