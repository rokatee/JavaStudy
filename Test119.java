/*===========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
===========================*/

// �������̽�
interface Demo
{
	public void write();
	public void print();
}


// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImp1 implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	//public void print();
}


// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
//abstract class DemoImp1Sub extends DemoImp1
class DemoImp1Sub extends DemoImp1
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	*/

	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- �ν��Ͻ� ���� �Ұ� �� �������̽�

		//DemoImp1 ob2 = new DemoImp1();
		//-- �ν��Ͻ� ���� �Ұ� �� �߻� Ŭ����

		DemoImp1Sub ob3 = new DemoImp1Sub();

		ob3.write();
		ob3.print();
		//--==>> write() �޼ҵ� ������...
		//--==>> print() �޼ҵ� ������...

	}
}

// ���� ���

/*
write() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/