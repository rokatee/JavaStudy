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
 A  B  C  D  E
 F  G  H  I  J
 K  L  M  N  O
 P  Q  R  S  T
 U  V  W  X  Y

 ����Ϸ���...
*/

public class Test092
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];				// ���� 5*5 �迭 ����

		char n = 'A';								// ������ ���ڴ� A��

		for (int i = 0; i < arr.length; i++)		// ��~~~ 0		1		2 3 4 
		{
			for (int j = 0; j < arr[i].length; j++)	// ����~ 01234	01234
			{
				arr[i][j] = n;
				n++;
			}
		}

		for (int i = 0; i < arr.length; i++)		
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);	// ���� ���
			}
			System.out.println();
		}
	}
}

/*
���� ���

 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/