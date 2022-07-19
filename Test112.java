/*
���� Ŭ���� ���� ����
	- ���(Inheritance)
*/

/*
�� super
	static ���� ������� ���� �޼ҵ忡�� ���Ǹ�
	���� Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� ����Ų��
	super �� ���� Ŭ������ �����ڸ� ȣ���ϰų�
	���� Ŭ������ ��� ���� �Ǵ� �޼ҵ带 ȣ���� �� ����� �� �ִ�

	���� Ŭ������ �����ڿ��� ���� Ŭ������ �����ڸ� ȣ���� ������
	���� Ŭ������ ������ ���� �������� �� ó������ ��ġ�� �� �ִ�


�� �����ڿ� Ŭ���� ��Ӱ��� ����
	���� Ŭ������ ���� Ŭ������ ����� ��ӹ�����,
	�����ڴ� ��� ��󿡼� ���ܵȴ�
	�׸��� ���� Ŭ������ �����ڰ� ȣ��� ��
	�ڵ����� ���� Ŭ������ �����ڸ� ȣ���ϰ� �ȴ�
	�� �� ���� Ŭ������ �����ڴ�
	�μ��� ���� ������(default ������ ����)�� ȣ��ȴ�

	���� Ŭ���� �� ���� Ŭ����(��, ��Ӱ��迡 �ִ� Ŭ����)�� �����ϴ� ��������
	���� Ŭ������ �����ڸ� ��������(�ۼ�����) �ʰų�
	�μ��� ���� �����ڸ��� ������(�ۼ���) ���
	���������� ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ������ �ʾƵ�
	�ƹ��� ������ �߻����� ������,
	���� Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϴ� ���
	�����ؾ� �Ѵ�

	�������...��������...
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super();
		}
	}

	���� Ŭ������ B_class �� �����ڿ���
	���������� A_class �� �����ڸ� ȣ������ ������
	�ڵ����� ���ھ��� �����ڸ� ȣ���Ѵ�
	������, A_class ���� ���ڰ� �ִ� �����ڸ� �����ϰ�
	���ڰ� ���� �����ڴ� �������� �ʱ� ������ ���� �߻��Ѵ�
	����, B_class �������� ���ο�
	����ó�� ���������� ���� Ŭ������ ������ ȣ�� ������ �ۼ��ؾ��Ѵ�.

	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10);
		}
	}

	�� ��� �� ������ ����
		���� Ŭ�������� ����� ��� ������ �̸��� 
		���� Ŭ�������� ����� ��� ������ �̸��� ������
		���� Ŭ������ ��� ������ ���õȴ�
		�� ��, ���� Ŭ������ ��� ������ ����ϱ� ���ؼ���
		super Ű���带 �̿��Ѵ�

		������ �̸��� ��� ������ ������ �̸��� �޼ҵ尡
		�� Ŭ���� �ȿ� ����ǰų� ���ǵǴ� ��� �⺻������ ���� �߻��Ѵ�
		��, �޼ҵ��� ��쿡�� �Ű������� ������ Ÿ���� �ٸ� ���
		���� �߻����� �ʰ� �̵��� ���� �ٸ� �޼ҵ�� ����ϰ� �ȴ�

*/


// Rect112 �� Circle112 �� �θ� Ŭ����
class SuperTest112
{
	protected double area;
	private String title;

	public SuperTest112()
	{
		System.out.println("SuperTest112... ���� ���� ������");
	}

	public SuperTest112(String title)
	{
		this.title = title;
		System.out.println("SuperTest112... ���ڿ��� ���ڷ� �޴� ������");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
}

// SuperTest112 Ŭ������ ��ӹ޴� �ڽ� Ŭ����(���� ���)
class Rect112 extends SuperTest112
{
	private int w, h;

	// �ڽ� Ŭ������ ����� ���� ������
	public Rect112()
	{
		//super();
		// �� �ڵ����� ����
	}

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w + this.h;
		write();
	}


	@Override			// ������̼�(annotation) - metadata
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("�簢�� - " + area);
	}

	/*
		�� �޼ҵ� �������̵�(Method Overriding)

		���� Ŭ������ ��ӹ��� ���� Ŭ��������
		���� Ŭ������ ���ǵ� �޼ҵ带 �ٽ� �����ϴ� ������(������)
		��ü ���� ���α׷����� Ư¡�� "������" �� ��Ÿ����
		������(Overriding)�� �ݵ�� ��� ���迡 �־�� �ϸ�,
		�޼ҵ� �̸�, ���� Ÿ��, �Ű������� ������ Ÿ����
		��� ������ ��ġ�ؾ� �Ѵ�.
	*/
}

// SuperTest112 Ŭ������ ��ӹ޴� �ڽ� Ŭ����(���� ���)
class Circle112 extends SuperTest112
{
	//�ڽ� Ŭ������ ����� ���� ������
	public Circle112(String title)
	{
		//super();
		super(title);
	}

	public void calc(int r)
	{
		area = r * r * 3.14;
		write();
	}
}

//---------------------------------------------------------------

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test112
{
	public static void main(String[] args)
	{
		// Rect112 Ŭ����(�ڽ� Ŭ����) ��� �ν��Ͻ� ����
		Rect112 ob1 = new Rect112();
		// �� SuperTest112... ���� ���� ������

		// Circle112 Ŭ����(�ڽ� Ŭ����) ��� �ν��Ͻ� ����
		//Circle112 ob2 = new Circle112();
		/*
		 �� ������ ���� �߻�
		 �� ���� Circle Ŭ��������
		�Ű������� �ʿ�� �ϴ� ����� ���� �����ڰ� ������� ������,
		�̷� ���� default �����ڰ� �ڵ����� ���Ե��� �ʴ� ��Ȳ
		*/

		ob1.calc(10,5);
		// �� 
	}
}

/*
===================================================================================================
���� Ŭ����		| ���� Ŭ����			| ���
---------------------------------------------------------------------------------------------------
�����ڸ�		| ������ ���� ����		| �� �����ϴ�
��������		| �μ��� ���� ������	| �� �����ϴ�
����			| �μ��� �ִ� ������	| �� �����ϴ�
---------------------------------------------------------------------------------------------------
�μ���			| ������ ���� ����		| �� �����ϴ�
����			| �μ��� ���� ������	| �� �����ϴ�
�����ڸ� ����	| �μ��� �ִ� ������	| �� �����ϴ�
---------------------------------------------------------------------------------------------------
�μ���			| ������ ���� ����		| �� ���� �߻�
�ִ�			| �μ��� ���� ������	| �� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻�
�����ڸ� ����	| �μ��� �ִ� ������	| �� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻�
===================================================================================================
*/