/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Random Ŭ����
*/

/*
�� java.util.Random Ŭ������
	
	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
	�ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������ �����ؾ� �Ѵ�
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�


�ζ� ��ȣ ����(���� �߻� ���α׷�)

���α׷��� ����Ǹ� �⺻������ �ζǸ�
5���� �����ϴ� ���α׷��� �����Ѵ�

���� ��)
   1   2   7   9  19  23
   3  12  16  23  44  45
  17  22  34  36  40  42
  10  15  26  32  39  45
   4   6   9  12  17  33
����Ϸ���...

*/
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;


	// ������
	Lotto()
	{
		num = new int[6];
	}

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();

		// ��� 1
		//for (int i = 0; i < num.length; i++)
		//{
		//	num[i] = rd.nextInt(45) + 1;

		//	for (int j = 0; j < i; j++)
		//	{
		//		if (num[i]==num[j])
		//		{
		//			i--;
		//			break;
		//		}
		//	}
		//}
		

		// ��� 2
		//for (int i = 0; i < 5; i++)
		//{
		//	for (int j = 0; j < 6; j++)
		//	{
		//		num[j] = rd.nextInt(45) + 1;
		//		
		//		for (int k = 0; k < 6; k++)
		//		{
		//			if (j == k)
		//			{
		//				break;
		//			}
		//			else if (num[j] == num[k])
		//			{
		//				num[j] = rd.nextInt(45) + 1;
		//				k = 0;
		//			}
		//		}
		//	}
		//}
		
		
		// ��� 3
		int n;
		int cnt = 0;

		jump:	// �����ݷ� �ƴϰ� ":" �̴�
				// ����ϰ� ������� �� ��

		while (cnt < 6)						// ��~~ 0 1 2 3 4 5	
		{
			n = rd.nextInt(45) + 1;			// 0 ~ 44 �� +1 �� 0 ~ 45
			
			for (int i = 0; i < cnt; i++)	// ����~~ cnt��4 / i��123
			{
				if (num[i] == n)
				{
					continue jump;
				}
			}

			num[cnt++] = n;
		}

		// ���� �޼ҵ� ȣ��
		sorting();
	}
	
	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);	//API ã�ƺ���~!  num �Ѱ��ָ� �˾Ƽ� �� �⺻ �������� ���ĵ�
							//���������� ��� �ؾ��ϴ��� ã�ƺ���!
	}
}

public class Test146
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i = 1; i< = 5; i++)
		{
			// �ζ� ���� ����
			lotto.start();
			
			// ��� ���
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}

	}
}

/*
���� ���

   1   5  10  33  34  42
  19  20  30  34  41  45
  10  19  22  29  34  40
   1   4   5   6  22  45
   3  13  19  24  32  45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/