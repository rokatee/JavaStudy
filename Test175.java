/*
���� �ڹ��� �⺻ �����(I/O) ����
*/

public class Test175
{
	public static void main(String[] args)
	{
		// System.out : �ڹ��� �⺻ ��� ��Ʈ��
		
		System.out.write(65);	// 'A' 
		System.out.write(66);	// 'B'

		System.out.write(180);	
		System.out.write(235);	// 180 + 235 �� '��'

		//--������� �����ϸ� �ƹ��͵� ��µ��� �ʴ´�

		System.out.flush();
		// �� ��� ���۰� ä������ ������
		//	  ����� ������(�ڷ�)�� ��� ����̽�(��ġ)�� ������ �ʱ� ������
		//	  flush() �޼ҵ带 ���� ���� �� ä������ ���� ��� ������ ������
		//	  ��� ��ġ�� �о�� ���� �� �ֵ��� ó���ؾ� �Ѵ�

		//	  ��, ���� ���������� System.out.flush() ������ ������ �� ����
		// �� AB��
		System.out.println();	// ����
	}
}