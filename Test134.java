/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		long l = 1233455756568L;
		//String m = "��";			// string�� �޴� �� ���� �Ф�
		short s = 123;
		double d = 123.124;
		float f = 123.456f;
		
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Long l2 = new Long(l);
		//String m2 = new String(m);
		Short s2 = new Short(s);
		Double d2 = new Double(d);
		Float f2 = new Float(f);

		//System.out.println(b2);
		//System.out.println(i2);
		// �� 3
		//	  256
		
		print(b2);
		print(i2);
		print(l2);
		//print(m2);
		print(s2);
		print(d2);
		print(f2);
	}


	/*
	static void print(Object ob)
	{
		System.out.println(ob);
	}
	
	static void print(Byte ob1)
	{
		System.out.println(ob1);
	}

	static void print(Integer ob2)
	{
		System.out.println(ob2);
	}
	*/

	// java.lang.Number Ŭ����(�߻� Ŭ����)�� 
	// ��� ������ Wrapper Ŭ������ �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭
	// "�� ĳ����"�� �Ͼ�� �ȴ�

	static void print(Number n)
	{
		System.out.println(n);

		//if (n instanceof Integer)
		//{
		//	System.out.println(n.intValue());
		//}
		//else if (n instanceof Double)
		//{
		//	....
		//}
		//....
	}
}
