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
 B  C  
 D  E  F  
 G  H  I  J
 K  L  M  N  O

 ����Ϸ���...
*/

public class Test093
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		
		char n = 'A';
		
		// ����� �� �� �����ϸ� ����� ���ϴ�~~
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < 1+i; j++)	// i�� 1�� Ŀ���� j�� 1�� Ŀ����
			{
				arr[i][j] = n;
				n++;
			}
		}

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
 B C
 D E F
 G H I J
 K L M N O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/