/*
���� �迭 ���� 
	- �迭�� �迭(2���� �迭)
*/

/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)

 n (ù��° ���ڴ� n�� �����Ѵ�) �� ��Ģ ã��!!
��
 1  2  3  4  5		i=0	 �� n�� i���� 1��ŭ ũ�ٺ��� ����
 2  3  4  5  6		i=1
 3  4  5  6  7		i=2
 4  5  6  7  8		i=3
 5  6  7  8  9		i=4

 ����Ϸ���...
*/

public class Test087
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		
		int n = 1;

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n+i+j;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		// �ش�
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		
		// �ֿ� ���� ����
		int n;

		for (int i = 0; i < arr.length; i++)		// ��~~
		{
			n=1+i;
			for (int j = 0; j < arr.length; j++)	// ����~
			{
				// �׽�Ʈ(Ȯ��)
				//System.out.print(" i:" + i + ", j:" + j + "-");
				//System.out.print("[" + n + "]");
				//n++;

				arr[i][j] = n;
				n++;
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
���� ���

  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/