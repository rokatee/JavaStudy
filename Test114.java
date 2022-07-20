/*
���� Ŭ���� ��� ����
	- ���(Inheritance)
*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡
	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�

	- �ݵ�� ��� ���谡 �־�� �Ѵ�

	- �����ǵ� ���� Ŭ������ �޼ҵ� ���� ���� �����ڴ�
	  ���� Ŭ������ �޼ҵ� ���� ���� �����ں��� ������ ũ�ų� ���ƾ� �Ѵ�
	  ���� ���, ���� Ŭ���� �޼ҵ��� ���� ���� �����ڰ� protected �� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding) �ϴ� ���
	  ���� ���� �����ڴ� public �Ǵ� protected �̾�� �Ѵ�

	- static, final, private �޼ҵ�� �������̵�(Overriding) �� �� ����

	- Exception�� �߰��� �Ұ����ϴ�
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�
*/

// �θ� Ŭ����(���� Ŭ����, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest114 extends SuperTest114
{

	/*
	private int a = 5;		// ��� ���� �� private�̶� ���� �Ұ����Ͽ� ��� �Ұ���
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
		// a ���� ���� ���� ������ ���� ���(39�� ���� �ּ� ��������)
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		// ���� �߻�
		// ���� Ŭ�������� ����� ���� a���� ������ �� ����
		// private �����̱� ������

		System.out.println("Sub print() �޼ҵ� : " + b);
		System.out.println("Sub print() �޼ҵ� : " + this.b);	//SubTest114.b
		System.out.println("Sub print() �޼ҵ� : " + super.b);	//SuperTest114.b
		/*
			Sub print() �޼ҵ� : 100
			Sub print() �޼ҵ� : 100
			Sub print() �޼ҵ� : 10
		*/
		// �� ���⼭ ����Ŭ������ b�� ������ ���� �ʴٸ�
		//	  b Ȥ�� this.b Ȥ�� super.b ��� ��ӹ��� ���� Ŭ������ b�� ����ϰ� �ȴ�

		// �޼ҵ�� ���°� ���� ��� ����� ������,
		// ������ �ٸ� ������ ����Ǿ� ���������� ����� �����ϴ�


		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);	//SubTest114.c
		System.out.println("Sub print() �޼ҵ� : " + super.c);	//SuperTest114.c
		// 3�� ��� 20 �� ��� ��
		// ���� c�� �����ϴµ� �ƹ��� ����� ������ ����
		// ����Ŭ�������� ����� c
		
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b +  " : " + c);
		// �� ������ ����
		// ����Ŭ�������� ����� ���� a���� ���� �Ұ��� [print() �޼ҵ�� ��������]
		// private �����̱� ����

		System.out.println("Sub write() �޼ҵ� : " + b +  " : " + c);

	}	
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest114) �ν��Ͻ� ����
		SubTest114 ob = new SubTest114();

		ob.print();
		// �� Sub print() �޼ҵ� : 100 : 20
		// b�� 10���� 100���� ��ȯ�� 
		// �������� ������ ������ �ȶ�. ��?
		// �� ������ �ٸ� ������ ����Ǿ� ���������� ����� �����ϴ�

		ob.write();
		// ��	Super write() �޼ҵ� : 5 : 10 : 20
		//		Sub write() �޼ҵ� : 100 : 20

		System.out.println("-------------------------------------���м�");
		System.out.println(ob.b);
		// �� 100
		System.out.println(((SuperTest114)ob).b);
		// �� 10
		// �� ���� �θ� (���� Ŭ������ b�� �θ��� ���� ���)

		ob.write();
		// �� Sub write() �޼ҵ� : 100 : 20

		((SuperTest114)ob).write(); 
		// �� Sub write() �޼ҵ� : 100 : 20
	
		// �޼ҵ�� ������ ��!! ������ ��
		// �޼ҵ�� �θ�Ŭ������ �ڽ�Ŭ������ ���´�
		// ������ �θ�Ŭ������ �ڽ�Ŭ���� ���ε��� ����ȴ�



	}
}