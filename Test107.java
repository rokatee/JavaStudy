/*
���� ����(Sort) �˰��� ����
*/

/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
	  �� ���� ���Ϸ���

�� ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����.....



���� ����(Selection Sort)

���� ��)

Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ���...
*/

public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
			52 42 12 62 60
			== --
			��	
			42 52 12 62 60
			==    --
			��	
			12 52 42 62 60
			==    --
			��	
			12 52 42 62 60
			==       --
			��	
			12 52 42 62 60
			------------------------1ȸ�� (��~)
			12 52 42 62 60
			   == --
			   ��	
			12 42 52 62 60
			   ==    --
			   ��	
			12 42 52 62 60
			   ==       --
			   ��	
			12 42 52 62 60
			------------------------2ȸ�� (��~)
			12 42 52 62 60
			      == --
			      ��	
			12 42 52 62 60
			      ==    --
			------------------------3ȸ�� (��~)
			12 42 52 62 60
			         == --
			         ��	
			12 42 52 60 62
			------------------------4ȸ�� (��~)
		*/
		
		// �迭�� �ִ� ������ ����
		System.out.print("Source Data : ");		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// �� Source Data : 52 42 12 62 60


		// ���� for��(foreach ��)
		System.out.print("Source Data : ");		
		for (int n : a)							//for (�ڷᱸ��)
		{										//{
			System.out.print(n + " ");			//}
		}
		System.out.println();



		
		for (int i = 0; i < a.length; i++)			// ��~~~	�� �񱳱��� ������ (0	  1		2	  3)
		{
			for (int j = i+1; j < a.length; j++)	// ����~	�� �񱳱��� ������ (1234  234   34    4)
			{
				//if (a[i] < a[j])		// ��������
				if (a[i] > a[j])		// ��������
				{
					// �ڸ� �ٲٱ�
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}



		// �迭�� �ִ� ������ ���� ����
		System.out.print("Sorted Data : ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// �� Sorted Data : 12 42 52 60 62


		// ���� for��(foreach ��)
		System.out.print("Sorted Data : ");
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		


		/*
		// �迭�� �ִ� ������ ���� ����
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i] < a[j])
				{
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
				}
			}
		}
		
		// �迭�� �ִ� ������ ���� ����
		System.out.print("Sorted Data : ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/


		/*
		// �迭�� �ִ� ������ ���� ����
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}
		
		// �迭�� �ִ� ������ ���� ����
		System.out.print("Sorted Data : ");
		for (int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
	}
}