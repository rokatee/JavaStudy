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
 E  J  O  T  Y
 D  I  N  S  X
 C  H  M  R  W
 B  G  L  Q  V
 A  F  K  P  U

 ����Ϸ���...
*/

public class Test090
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];

		char n = 'A';		//65

		for (int i = 0; i < arr[0].length; i++)		//��~~~ i -> 0 1 2 3 4
		{
			for (int j = arr.length-1; j >= 0; j--)	//����~ j -> 4 3 2 1 0
			{
				arr[j][i] = n;	//(char)n
				n++;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}


		/*
		for (int i = 0; i < arr[0].length; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < arr.length; j++)
				{
					arr[j][i] = n;
					n++;
				}
			}
			else if (i % 2 != 0)
			{
				for (int j = arr.length-1; j >= 0; j--)
				{
					arr[j][i] = (char)n;
					n++;
				}
			}
		}
		*/
	}
}