/*
���� ���� ������ ���� ���� ���� 
	- ���� ������ �ʱ�ȭ �׽�Ʈ
*/

//Test068.java �� ���� ��

public class Test069
{
	// Ŭ���� ����
	
	//���� ���� a ����
	int a;
	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		// �޼ҵ��� ����

		System.out.println("a : " + a);
		// ������ ����
		// static ������ �ƴ϶� ���� ����

		//Test069 Ŭ������ ������� �ν��Ͻ� ����
		Test069 ob = new Test069();

		System.out.println("ob.a : " + ob.a);
		// �� ob,a : 0
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		// ob.b = false
		// ob.c :
		// ob.d : 0.0
	}
}