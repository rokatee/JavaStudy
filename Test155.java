/*
���� �÷���(Collection) ����
*/

import java.util.Stack;

public class Test155
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	
	// ������
	public Test155()
	{
		// st ��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� String
		Stack<String> st = new Stack<String>();

		// st ��� Stack �ڷᱸ���� ������(colors) ���
		//st = colors;	// �̷��� ó�� �Ұ�

		/* ��� 1
		st.push(colors[0]);
		st.push(colors[1]);
		st.push(colors[2]);
		st.push(colors[3]);
		st.push(colors[4]);
		st.push(colors[5]);
		*/

		/* ��� 2
		for (int i = 0; i < colors.length; i++)
			st.push(colors[i]);
		*/
		
		// ��� 3
		for(String color : colors)
		{
			st.push(color);		// st.add(color);
		}

		st.push("����");	// ������ �߰� ���� �� ���� �������� ���� �����Ƿ� ����� ���� ���� ��
		
		//st.push(10);
		//st.push(10.0);
		// �� ���׸� ǥ������ ���� �����ϰ� �ִ�
		//    String �� �ƴ� �ٸ� �ڷ���(int �� double)��
		//    ���� �ڷᱸ�� st �� push() �Ϸ��� �߱� ������
		//    (Stack ��ҷ� String �� ���� �߱⿡ int �� double �� ������ ������ ����)
		
		// ��� �޼ҵ� ȣ��
		popStack(st);

	}
	
	private void popStack(Stack<String> st)	
	{		
		System.out.print("pop : ");

		while (!st.empty())		// isEmpty()
		{
			System.out.print(st.pop() + " ");	
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Test155 ob = new Test155();
	}
}

/*
���� ���

pop : ���� ���� �Ķ� �ʷ� ��� ����			// ���� ���� ������ ���� ���߿� ���� �� Ȯ��!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ������ �߰� ��
pop : ���� ���� ���� �Ķ� �ʷ� ��� ����			// ���� ���� ������ ���� ���߿� ���� �� Ȯ��!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/