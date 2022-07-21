/*
���� Ŭ���� ��� ����
	- ��ø Ŭ����
*/

// outer
class Test2
{
	static int a = 10;
	int b = 20;

	void write()
	{					   // ù ��° write() �޼ҵ�
		System.out.println("write()...��");
		final int c = 20;
		int d = 40;
		
		// inner
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, local class, ���� Ŭ����)
		class LocalTest
		{
			void write()		  // �� ��° write() �޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);		// �� ������ ���� �߻�(��? 32�� �ٷ� ����)
			}
		}

		//d += 10;
		//d += 20;
		//d += 30;
		//d += 40;		// ���⼭ d���� ������ �Ͼ�Ƿ� 
						// ���÷� ���ϴ� ���� 
						// �� ��° write() �޼ҵ忡�� �Ժη� ����� ���� ����
						// (39�� �ٿ��� �߰� ����)

		LocalTest lt = new LocalTest();
		lt.write();				// �� �� ��° write() �޼ҵ�

		// �� ���� c �� ���� d �� �� �� ��������������...
		//	  (ù ��° write() �޼ҵ� �ȿ��� ����� �����̹Ƿ�...)
		//	  c �� final �����̱� ������
		//	  �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//	  ������ �� 20 ���� ������� �� �ִ�
		//	  �ݸ鿡 d �� �� ���� ���÷� ���� �� �ִ� ��Ȳ�̹Ƿ�
		//	  LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//	  ������ ���� �� �� ���� ������
		//	  �̷����� �ν��Ͻ� ���� ������ d �� � ���� ��� �ִ���
		//	  ���� ���� �� ���� ������
		//	  ���� d �� �����ϴ� ���� ���� �� �ֵ��� ���������� ó���� ���̴�
		
		
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args)
	{
		// Test2(outer) Ŭ���� ��� �ν��Ͻ� ����
		Test2 ob = new Test2();
		ob.write();				// �� ù ��° write() �޼ҵ�
	}
}

/*
���� ���

write()...��
write()...��
a : 10
b : 20
c : 20
d : 40
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/