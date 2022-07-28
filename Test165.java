/*
���� �÷���(Collection) ����
*/

/*
List �� Vector, ArrayList, LinkedList, .....
 ������ ����
 ���迭�� ����
 ���ߺ� ���

�� ArrayList Ŭ����
	
	- ArrayList �� Vector Ŭ������
	  List �� ũ�� ������ ������ �迭�� ������ ������
	  �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ ������
	  ArrayList �� �׷��� �ʴٴ� ���̴�
	  
	- �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
	  ��������� �÷����� �������� �ʴ� ���α׷�������
	  �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�
	  ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������μ�
	  ������ ����ȭ�� ������ �δ��� ������ �ʱ� ������
	  Vector ���� �� ������ ����ȴ�

	- null �� ������ ��� ��Ҹ� ����ϸ�
	  List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
	  ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�
	  
*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;


public class Test165
{
	public static void main(String[] args)
	{
		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();		// ��ĳ����
		List<String> list1 = new ArrayList<String>();

		// list1 �ڷᱸ���� ��� �߰� �� add()
		list1.add("���˵���2");
		list1.add("ž��2");
		list1.add("����2");

		List<String> list2 = new ArrayList<String>(list1);

		// list2 �� ��� �߰� �� add()
		list2.add("�μ���");

		List<String> list3 = new ArrayList<String>();

		// list3 �� list2 �� ��ü ��� �߰� �� addAll()
		list3.addAll(list2);

		
		
		// ��� �� ���̵����� Ȯ��
		System.out.println("==========================================");
		System.out.println(list1);
		// �� [���˵���2, ž��2, ����2]
		System.out.println(list2);
		// �� [���˵���2, ž��2, ����2, �μ���]
		System.out.println(list3);
		// �� [���˵���2, ž��2, ����2, �μ���]
		System.out.println("==========================================");

		// ž��2 �տ� ��������� �߰�
		// �� [���˵���2, ���������, ž��2, ����2, �μ���]
		int i = list3.indexOf("ž��2");
		// �׽�Ʈ
		//System.out.println("n : " + n);
		// �� n : 1

		list3.add(1, "���������");
		System.out.println(list3);
		System.out.println("==========================================");
		
		// ��� �� listIterator() �޼ҵ带 Ȱ���Ͽ� ���
		ListIterator<String> li = list3.listIterator();
		
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		// �� ���˵���2 ��������� ž��2 ����2 �μ���

		// ��� �� �������� ����
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		// �� �μ��� ����2 ž��2 ��������� ���˵���2
		
	}
}