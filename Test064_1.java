/*
���� ���� �帧�� ��Ʈ��(���) ����
	- �ݺ���(for ��) �ǽ�
*/

/*
���� for ��(�ݺ����� ��ø)�� Ȱ���� �� ��� �ǽ�

<<����>>
������ ���� ������ ��µ� �� �ֵ���
�ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����϶�

���� ��)

1)
*
**
***
****
*****
=================
2)
*****
****
***
**
*
=================
3)
*****
 ****
  ***
   **
    *
=================
4)
*
**
***
****
*****
****
***
**
*
=================
5)
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *


*/

/*
"for �� �� ���" �����ϴµ� ���� ����
https://www.youtube.com/watch?v=B13UADqEZTw
���� ���� �����ﰢ��
https://www.youtube.com/watch?v=_0CxKKFLzEo
������ ���� �� �����ﰢ��
https://www.youtube.com/watch?v=Otro-EoDcmU&t=112s
���ﰢ��
https://www.youtube.com/watch?v=N4RZOXAQI3I
������(+���ﰢ���� ���� ����)
*/

public class Test064_1
{
	public static void main(String[] args)
	{

		//int i, j;			// i�� j�� �־��� �� ��� �������� ����
		//System.out.print("i");
		//00000
		//11111
		//22222
		//33333
		//44444

		//System.out.print(j);	
		//01234
		//01234
		//01234
		//01234
		//01234

		//System.out.print(i+j);
		//01234
		//12345
		//23456
		//34567
		//45678


		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 1+i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		//*****
		

		System.out.println();

		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		//****
		//***
		//**
		//*
		

		System.out.println();


		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		// ****
		//  ***
		//   **
		//	  *
		
	}
}