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

*********
 *******
  *****
   ***
    *

*/

public class Test063
{
	public static void main(String[] args)
	{
		/*
		// 1. ù° �ٺ��� �����
		//	  ù° �� ���� 0��
		for (int j = 0; j < 0; j++)
		{
			System.out.print(" ");
		}
		// ù° �� �� 9��
		for (int j = 0; j < 9; j++)
		{
			System.out.print("*");
		}
		// ù° �� ������ ���� ���� ���� ����
		System.out.println();

		
		// 2. 5�� �ݺ����� �ֱ�
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 0; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 9; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	

		// 3. ����Ǵ� ��Ģ ã�� ����
		for (int i = 0; i < 5; i++)
		{
			// i�� �þ���� ������ �ϳ��� �þ
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			// i�� �þ���� ���� 2���� �پ��
			// j < 9
			// �� j < 9 -i (i��ŭ �پ��µ�) 
			// �� j < 9 -i *2 (2���� �پ��) 
			// �� j < 9-(i*2)
			for (int j = 0; j < 9-(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}