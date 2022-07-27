/*
���� �÷���(Collection) ����
*/

// �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

import java.util.Vector;

// Ŭ���� �� ����� ���� �ڷ������� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;	// �̸�
	private int age;		// ����

	// get~~() �� getter
	// set~~() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//	  default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//	  default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//	  �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//	  (�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����)
	
	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		//MyData("", 0);
		this("", 0);
		//�� name = "";
		//	 age = 0;
	}
}

public class Test162
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v ��
		// ���缮 13�� / �ڸ�� 7�� / ������ 3��
		// ��Ƴ���
		
		/*
		// ��
		MyData st1 = new MyData();
		st1.setName("���缮");
		st1.setAge(13);
		v.add(st1);
		
		MyData st2 = new MyData();
		st2.setName("�ڸ��");
		st2.setAge(7);
		v.add(st2);
		
		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(3);
		v.add(st3);
		*/

		/*
		// ��
		MyData st1 = new MyData("���缮", 13);
		v.add(st1);
		MyData st2 = new MyData("�ڸ��", 7);
		v.add(st2);
		MyData st3 = new MyData("������", 3);
		v.add(st3);
		*/

		// ��
		v.add(new MyData("���缮", 13));
		v.add(new MyData("�ڸ��", 7));
		v.add(new MyData("������", 3));

		

	}	
}