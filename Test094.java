/*
���� �迭 ���� 
	- �迭�� �迭(2���� �迭)
*/

/*
<<����>>
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)

 n (ù��° ���ڴ� n�� �����Ѵ�) �� ��Ģ ã��!!
��
 A  
 C  B
 D  E  F
 J  I  H  G
 K  L  M  N  O

 ����Ϸ���...
*/

public class Test094
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char n = 'A';
		

		// ��� 1
		// ����� �� �� �����ϸ� ����� ���ϴ�~~
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0) //¦���� ������
			{
				for (int j = 0; j < 1+i; j++)	// i�� 1�� Ŀ���� j�� 1�� Ŀ����
				{
					arr[i][j] = n;;
					n++;
				}
			}
			if (i % 2 != 0) //Ȧ���� ������
			{
				for (int j = i; j >= 0; j--)	//�������̴� j = i���� 0���� ����
				{
					arr[i][j] = n;;
					n++;
				}
			}
		}
		
		// ���2
		/*
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(i % 2 == 0) // ¦�� �� ������
				{
					arr[i][j] = n;
				}
				else // Ȧ�� �� ������
				{
					arr[i][i-j] = n; 
				}
				n++;
			}
		}
		*/


		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
���� ���

 A
 C B
 D E F
 J I H G
 K L M N O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/