/*
���� Ŭ���� ��� ����
	- �߻� Ŭ����(abstract)
*/

/*
�� �߻� Ŭ����(abstract) ��

	���� �ְ� ���Ǵ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	���� Ŭ����(�ڽ� Ŭ����)���� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����


�� ���� �� ����

	[���� ���� ������] abstract class Ŭ������
	{
		[���� ���� ������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}


�� Ư¡

	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �տ� abstract Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ� �ϸ�
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ���� ������
	��ü�� ������ �� ���� ���̴�

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ������ ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ� �Ѵ�


�� abstract Ű�����

	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ����� �� ����


*/

// �߻� Ŭ����
abstract class SortInt115
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	

	// �߻� �޼ҵ�
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	// final Ű����� ����
	// �� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x > y)
			return 1;
		else
			return -1;
	}

	// final Ű����� ����
	// �� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}


} // end SortInt115



// SortInt115(�߻�Ŭ����)�� ��ӹ��� Ŭ���� �� �ϴ��� �߻� Ŭ����
//public abstract class Test115 extends SortInt115

// �߻� �޼ҵ�(sorting())�� Override �� �Ϲ� ���� Ŭ����
public class Test115 extends SortInt115
{
	int i, j;

	static int[] data = {7, 10, 3, 28, 7};

	@Override
	protected void sorting()
	{
		// selection sort
		for (int i = 0; i < dataLength()-1; i++)
		{
			for (int j = i+1; j < dataLength(); j++)
			{
				if (compare(i,j) > 0)
				{
					swap(i,j);
				}
			}
		}

		//for (int i = 0; i < data.length; i++)			// ��~~~	�� �񱳱��� ������ (0	  1		2	  3)
		//{
		//	for (int j = i+1; j < data.length; j++)		// ����~	�� �񱳱��� ������ (1234  234   34    4)
		//	{
		//		//if (a[i] < a[j])		// ��������
		//		if (data[i] > data[j])		// ��������
		//		{
		//			// �ڸ� �ٲٱ�
		//			data[i] = data[i] ^ data[j];
		//			data[j] = data[j] ^ data[i];
		//			data[i] = data[i] ^ data[j];
		//		}
		//	}
		//}

	}
	
	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test115 ob = new Test115();
		ob.sort(data);
		//ob.sorting();

		System.out.print("Sorted Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}