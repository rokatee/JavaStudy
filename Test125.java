/*=============================================
 	����Ŭ���� ��ޡ���
 	- ��ø Ŭ����
 =============================================*/	
/*
	- Exception�� �߰��� �Ұ����ϴ�
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���ܻ��׿�
	  ���ο� Exception�� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�
	(��������: �ڹٴ� ���������� �ϳ��� ��ü��.)
*/



/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)

	- AWT�� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ������ ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ� 
	  ���ŷο����� ���� ����ϰ� ��ü ������ �ʿ��� ���
	  �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�


��  ���� �� ����
	
	new ����Ŭ������ ������()
	{

		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}

	};		�� check~!!! �����ݷ�


//import java.lang.*; �츮���� �Ⱥ������� ���� lang�� �ִ� ���� ����Ʈ���� ���

��� Ŭ������ extends Object�ϰ� �ְ� ����������, import.java.lang�ȿ� ����


�ڡڡڡڡڡڡڡڡڡڡڡ�ObjectŬ������ ��� ��ü���� ����Ŭ�����ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�


*/	
class Test3 // extends Object
{
	/*
	Object�� �����~~!!!
	
	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xxx();
		ob.xxx();
		ob.xxxxx();
		
		return ob;
		*/

		//return new Object();
		//	    ------------- Object ��

		//return new Object(){	Ư�� �޼ҵ� �籸��	};

		return new Object()
		{
			//Ư�� �޼ҵ� �籸��	�� ������
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}

		};		//-- �����ݷ�(�� �ۼ� �� ���� �߻�)
	}

}


public class Test125	//extends Object
{
	/*
	Object�� ����� ���~!!!
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>�͸��� Ŭ����...

	}
}