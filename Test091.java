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
    1    2    3    4   10
    5    6    7    8   26
    9   10   11   12   42
   13   14   15   16   58
   28   32   36   40  136
 

 ����Ϸ���...
*/

/*
�ݺ��� ó�� �ʿ��� ������ �ƴ� ������ ������
    1    2    3    4  ��  10
    5    6    7    8  ��  26
    9   10   11   12  ��  42
   13   14   15   16  ��  58
  ����������������������������
   28   32   36   40  �� 136

*/
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n = 0;

		//�׽�Ʈ
		//int sum = 0;

		for (int i = 0; i < arr.length-1; i++)			// ���� ������ �迭��ŭ ���ϸ�
		{												// ���� ������ �������� ������ �ƴ� "0" ���� ä������
			for (int j = 0; j < arr[i].length-1; j++)
			{
				n++;
				arr[i][j] = n;
				
				//�׽�Ʈ
				//sum += arr[i][j];
				//System.out.printf("%4d", sum);

				
				arr[i][arr[i].length-1] += arr[i][j];		// [i][4]���� �ڸ��� [i][j]���� ���� �־��ش� 
				//		   ��
				//arr[i][4] += arr[i][j];
				//		   ��
				//arr[0][4] += arr[0][0]
				//			+= arr[0][1]
				//			+= arr[0][2]
				//			+= arr[0][3]
				//arr[1][4] += arr[1][0]
				//			+= arr[1][1]
				//			+= arr[1][2]
				//			+= arr[1][3]


				arr[arr[i].length-1][j] += arr[i][j];
				//		   ��
				//arr[4][j] += arr[i][j];

				arr[arr[i].length-1][arr[i].length-1] += arr[i][j];
				//		   ��
				//arr[4][4] += arr[i][j];*/
			}
			//�׽�Ʈ ����
			//System.out.println();
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}


		//����
		/*
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				n++;
				arr[i][j] = n;
				sum += arr[i][j];
				if (j == 4)
				{
					arr[i][4] = sum - arr[i][4];
					n = n-1;
				}
				if (i == 4)
				{
					arr[4][j] = sum - arr[4][j];
					n = n-1;
				}
			}
		}

		for (int i = 4; i < 5; i++)
		{
			for (int j = 4; j < 5; j++)
			{
				sum += arr[i][j];
			}
		}
		*/
	}
}
