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

    *
   ***
  *****
 *******
*********

*/

public class Test062
{
	public static void main(String[] args)
	{
		/*
		// 1. ù° �� ���� �ϼ��غ���
		//	  ù° �� ���� 4��
		for (int j = 0; j < 4; j++)
		{
			System.out.print(" ");
		}
		// ù° �� �� 1��
		for (int j = 0; j < 1; j++)
		{
			System.out.print("*");
		}
		//ù° ���� �������� ���� �ٷ� �Ѿ ����
		System.out.println();



		// 2. ���� �ڵ带 5�� �ݺ��ؾ� �ϴ� for �� ����
		for (int i = 0; i < 5; i++)
		{
			//���� 2�� for ���� �� �ڸ�
			for (int j = 0; j < 4; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/



		// 3. ����Ǵ� ��Ģ�� ã�� ����
		for (int i = 0; i < 5; i++)
		{
			// i�� �þ���� ������ �ϳ��� �پ��
			for (int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			// i�� �þ���� ���� 2���� �þ
			// j < 1
			// �� j < 1 +i (i��ŭ �þ�µ�) 
			// �� j < 1 +i *2 (2���� �þ) 
			// �� j < 1+(i*2)
			for (int j = 0; j < 1+(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}