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
 1  8   9  16  17
 2  7  10  15  18
 3  6  11  14  19
 4  5  12  13  20



��Ʈ)
		  i = ¦��			Ȧ��			¦��			Ȧ��			¦��
		 0  0  0  0		 1  1  1  1		 2  2  2  2		 3  3  3  3		 4  4  4  4
��~~	 i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i
		00 10 20 30		31 21 11 01		02 12 22 32		33 23 13 03		04 14 24 34
����~	j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j
		0  1  2  3		3  2  1  0		0  1  2  3		3  2  1  0		0  1  2  3
			��				��				��				��				��

 ����Ϸ���...
*/

public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		
		
		//����
		//for (int j = 0; j < arr.length; j++)
		//{
		//	if (j % 2 == 0)
		//	{
		//		for (int i = 0; i < arr[j].length-1; i++)
		//		{
		//			arr[j][i] = n;
		//			n++;
		//		}
		//	}
			//if (j % 3 == 0)
			//{
			//	for (int i = 4; i < arr[j].length; i--)
			//	{
			//		arr[i][j] = n;
			//		n--;
			//	}
			//}
		//}
		/*
		//���� 1
		int n = 1;

		//System.out.println(arr[0].length);
		
		for (int i = 0; i < arr[0].length; i++)	//i<5
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < arr.length; j++)	//j<4
				{
						arr[j][i] = n;
						n++;
				}
			}
			else if (i % 2 != 0)
			{
				for (int j = arr.length-1; j >= 0; j--)	//j = 3, j >= 0	j--
				{
					arr[j][i] = n;
					n++;
				}
			}
		}
		*/
		//���� 2
		/*
		for (int i = 0, n = 1; i < arr[0].length; i += 2)
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[j][i] = n;
				n++;
			}
			n+=4;
		}
		for (int i = 1, n = 5; i < arr[0].length; i += 2)
		{
			for (int j = arr.length-1; j >= 0; j--)
			{
				arr[j][i] = n;
				n++;
			}
			n+=4;
		}
		*/
		
		//�ش� �ڵ�
		int n = 0;
		for (int i = 0; i < 5; i++)					//outer �� i -> 0 1 2 3 4
		{
			for (int j = 0; j < 4; j++)				//inner �� j -> 0 1 2 3
			{
				//�׽�Ʈ
				//System.out.print(j + "" + i + " ");
				n++;

				if (i % 2 == 0)						//i�� ¦�� -> 0 2 4
				{
					arr[j][i] = n;					//j�� 0123 -> 00 10 20 30	02 12 22 32 42	04 14 24 34
				}
				else								//i�� Ȧ�� -> 1 3
				{
					arr[3-j][i] = n;				//j�� 0123�� 3210���� -> 31 21 11 01	33 23 13 03
				}
			}
			//System.out.println();	
		}


		// �迭 ��� ����
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

  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/