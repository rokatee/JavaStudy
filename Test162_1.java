/*===================================
�����÷��� �����ӿ�ũ���� �ſ�ſ� �߿��� �κ��̶���Ͻ�
================================*/

//�ڷᱸ�� ��ü ���� �� ���� ��
//����� ���� Ŭ���� Ȱ��
//-> �ڷ���
//���� ���־��� ���� Collection�� �츮�� ���� class�� ��ü�μ� ��°��� ���� ���� ����.

//Ŭ���� -> ����� ���� �ڷ������� Ȱ��
/*
1.�Ӽ��� �����ϴ� Ŭ����
        |
2.����� ���� �ڷ��� Ȱ��
        |
3.Data Transfer Object (DTO)
        |
4.Bean 

�̵��� ��������� 1�̴�.
*/
import java.util.Vector;
class MyData_1
{
	//�ֿ� �Ӽ� ���� = �ֿ� ���� ����(��� ����)
	private String name;
	private int age; //�⺻������ Ŭ�����ȿ����� �� ������ private�� �ڵ����� ����Ѵ�.
	
	//getxxx() = getter
	//setxxx() = setter

	//getter / setter ���� ���� public

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
	
	public MyData_1(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	//����� ���� �����ڰ� ������ ��� ����Ʈ �����ڴ� �ڵ����� ���� �ȵȴٴ°� �������.
	//default ������ ������ �����ڸ� ����� ���� �����ڷ� 
	//�߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//(�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����)

	//������(�Ű����� ���� ������) -> ����� ���� ������

	public MyData_1()
	{
		this("",0); //MyData_1("",0); 
		//name = "";
		//age = 0;
	}

	


	

}

public class Test162_1
{
	public static void main(String[] args)
	{
		
		Vector<MyData_1> v = new Vector<MyData_1>(); //MyData�ڷ����� Vector�� ���� ���̴�.
		
		MyData_1[] arr = new MyData_1[3];

		arr[0] = new MyData_1("������",13);
		arr[1] = new MyData_1("���̰�",7);
		arr[2] = new MyData_1("������",3);
		
		
		for(int i=0;i<arr.length;i++)
		v.add(arr[i]);
		

		for(int i=0;i<3;i++)
		{
			String name = v.get(i).getName();
			int age = v.get(i).getAge();
			System.out.println(name+"  "+age+"��");

		}
/*1
		MyData_1 st1 = new MyData_1();
		st1.setName("������");
		st1.setAge(13);
		v.add(st1);

		MyData_1 st2 = new MyData_1();
		st2.setName("���̰�");
		st2.setAge(7);
		v.add(st2);

		MyData_1 st3 = new MyData_1();
		st2.setName("������");
		st2.setAge(3);
		v.add(st3);
*/
/*2
		MyData_1 st1 = new MyData_1("������",13);
		v.add(st1);
		MyData_1 st2 = new MyData_1("���̰�",7);
		v.add(st2);
		MyData_1 st3 = new MyData_1("������",3);
		v.add(st3);

*/
/*
		v.add(new MyData_1("������",13));
		v.add(new MyData_1("���̰�",7));
		v.add(new MyData_1("������",3));
*/


			


	}
}