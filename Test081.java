/*
���� �迭 ���� 
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
*/

/*
char �ڷ����� �迭�� �����
�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�
��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���� �� �ֵ��� �Ѵ�

���� ��)
A B C D E F G H I J K....X Y Z

����Ϸ���...
*/

public class Test081
{
	public static void main(String[] args)
	{
		// �ش� ���
		char[] arr3 = new char[26];
		for (int i = 0, ch = 65; i < arr3.length; i++, ch++)
		{
			arr3[i] = (char)ch;
			System.out.print(arr3[i] + " ");
		}
		System.out.println();


		// ���1
		char[] arr = new char[26];

		for (int j = 0; j < arr.length; j++)
		{
			System.out.print((char)(j+65) + " ");
		}
		System.out.println();


		// ���2
		char[] arr1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'
						, 'H', 'I', 'J', 'K', 'L', 'M'
						, 'N', 'O', 'P', 'Q', 'R', 'S'
						, 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.println(arr1.length);

		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();


		// ���3
		char[] arr2 = new char[26];
		arr2[0] = 'A';
		arr2[1] = 'B';
		arr2[2] = 'C';
		arr2[3] = 'D';
		arr2[4] = 'E';
		arr2[5] = 'F';
		arr2[6] = 'G';
		arr2[7] = 'H';
		arr2[8] = 'I';
		arr2[9] = 'J';
		arr2[10] = 'K';
		arr2[11] = 'L';
		arr2[12] = 'M';
		arr2[13] = 'N';
		arr2[14] = 'O';
		arr2[15] = 'P';
		arr2[16] = 'Q';
		arr2[17] = 'R';
		arr2[18] = 'S';
		arr2[19] = 'T';
		arr2[20] = 'U';
		arr2[21] = 'V';
		arr2[22] = 'W';
		arr2[23] = 'X';
		arr2[24] = 'Y';
		arr2[25] = 'Z';
		
	}
}

/*
���� ���

26
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
*/