/*
���� �÷���(Collection) ����
*/

/*
�� ť(Queue)
	
	ť(Queue) �� ���Լ����� FIFO(First Input, First Output) ������
	���� �Էµ� �ڷḦ ���� ����ϸ�
	Queue �������̽��� ������ Ŭ������ ť�� ������ �پ��� ����� �����Ѵ�

�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�

   ex) Queue ob = new LinkedList();


�� �ֿ� �޼ҵ�
	* head ��� ��? ť���� ���� �տ� �ִ�(����� �� ���� ���� ������) �༮�� ����
	
	- E element()
	  ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�

	- boolean offer(E o)
	  ������ ��Ҹ� ť�� �����Ѵ�
	
	- E peek()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�

	- E poll()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�

	- E remove()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test156
{
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		//Queue myQue = new Queue();	// Queue�� �������̽� �̹Ƿ� ��ü ���� �Ұ���
		Queue<Object> myQue = new LinkedList<Object>();

		// ������ �غ�
		String str1 = "���缮";
		String str2 = "�ڸ��";
		String str3 = "������";
		String str4 = "������";

		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4);			// �� ������ ������ ����

		System.out.println("test : " + test);		// �ٸ� boolean�� �־��ָ�
		// �� test : true							// ���� ����� ������ Ȯ���� �����ϴ�

		// �׽�Ʈ
		System.out.println(myQue);
		// �� [���缮, �ڸ��, ������, ������]		// ����

		// Queue �ڷᱸ�� myQue ����
		// ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		System.out.println("��3 : " + (String)myQue.element());
		// �� ��1 : ���缮
		//    ��2 : ���缮
		//    ��3 : ���缮

		System.out.println();	// ����

		String val;
		
		/*
		// ��
		//peek()
		// ť�� head ��� ��ȯ, ���� ����
		// ť�� empty �� ��� null �� ��ȯ
		while (myQue.peek() != null)
		{
			// poll()
			// ť�� head ��� ��ȯ, ������
			// ť�� empty �� ��� null �� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : ���缮
		//	  ��� : �ڸ��
		//	  ��� : ������
		//	  ��� : ������
		*/
		
		/*
		// �׽�Ʈ
		while (myQue.poll() != null)
		{
			// poll()
			// ť�� head ��� ��ȯ, ������
			// ť�� empty �� ��� null �� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		// �� ��� : �ڸ��
		//	  ��� : ������
		//	ó�� poll���� ���缮�� ������ ����� �ڸ����,
		//  ���� �ι�° ���� poll���� �����ϰ� ������ ����� ��������
		*/
		
		/*
		// ��
		while (true)	// while���� true ��? ���ѹݺ�
		{
			val = (String)myQue.poll();
		
			if (val == null)
				break;
			else
				System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : ���缮
		//	  ��� : �ڸ��
		//	  ��� : ������
		//	  ��� : ������
		*/

		/*
		// ��
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : ���缮
		//	  ��� : �ڸ��
		//	  ��� : ������
		//	  ��� : ������
		*/
	}
}