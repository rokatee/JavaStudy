/*
���� Ŭ������ �ν��Ͻ� ���� 
	- ������(Constructor)
*/

/*
<< ������(Constructor)�� ���� >>
	1. �ν��Ͻ� ���� �� �޸� �Ҵ�ް� �ϴ� ��
	2. �ʱ�ȭ

<< ������(Constructor)�� Ư¡ >>
	1. �����ڴ� �޼ҵ�������, �Ϲ� �޼ҵ�ó�� ȣ��� �� ������,
	   ��ȯ �ڷ����� ���� �� ����.
	   (void ���� ���� �� ������, ���� ��ȯ�� ���� ����)
	2. �����ڴ� Ŭ������ ������ �̸��� ������ �Ѵ�.
	   (��ҹ��� ��Ȯ�� ����)
	3. �����ڴ� ��ü�� �����ϴ� �������� "new ������();" �� ���·� ȣ��ȴ�
	   (�ν��Ͻ� ���� �� �� �� ���� ȣ��)
	   �� final ����(���ȭ�� ����) �ʱ�ȭ ����
	

*/

class NumberTest
{
	int num;		

	//Check Point!!
	//Ŭ������ ����� ���� �����ڸ� �������� �ʾҴٸ�
	//������ �������� ����Ʈ(default) �����ڰ� �ڵ����� ���Եȴ�
	// �� ����� ���� �����ڰ� �ִٸ� ����Ʈ �����ڴ� �ڵ� ���� �� ��.

	//����Ʈ(default) ������
	//NumberTest()
	//{
		// �� �������
	//}

	
	// ����� ���� ������
	NumberTest()
	{
		num = 10;
		System.out.println("����� ���� ������ ȣ��~!!!");
	}
	
	int getNum()
	{
		return num;
	}
}

public class Test074
{
	public static void main(String[] args)
	{
		// NumberTest Ŭ���� ����� �ν��Ͻ� ����
		NumberTest nt1 = new NumberTest();
		// �� ����� ���� ������ ȣ��~!!! �̶�� ���� ���
		// �ν��Ͻ��� �����Ǵ� ��������
		// �̿� ���ÿ� ������ ���� ���� ������ ȣ���� �̷������
		//								-----------
		//								NumberTest();
		//
		/*
		NumberTest nt1 = new NumberTest();
					   ��
		NumberTest nt1 = new NumberTest;
									+
							 NumberTest();
		*/

		//nt1.action();
		//�� ������ ����
		//cannot find symbol

		//nt1.NumberTest();
		//�� ������ ����
		//cannot find symbol

		//int num = nt1.getNum();
		//System.out.println(num1);
		//			�� �� �ٷ� ���̸�
		System.out.println(nt1.getNum());
		// �� 10

		nt1.num = 200;
		System.out.println(nt1.getNum());
		// �� 200

		System.out.println(nt1.num);
		// �� 200


		// nt1 �� nt2 �� �ٸ� ��ü�̴�.(���� ���赵 ������)
		NumberTest nt2 = new NumberTest();
		// �� ����� ���� ������ ȣ��~!!! �̶�� ���� ���

		System.out.println(nt2.num);
		// �� 10

		int testResult = nt2.getNum();
		System.out.println(testResult);
		// �� 10

		
	}
}