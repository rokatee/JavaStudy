/*
���� ������(Operator) ����
	- ��Ʈ ���� ������
*/

public class Test022
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;

		System.out.printf("~a : %d%n", ~a);		//��Ʈ not (����) : ~
		System.out.printf("~b : %d%n", ~b);	
	}
}

/*
a = 10 �� 00001010 ���� (3����Ʈ ����)
		
		1	��
		  11110101 �� -11 �� check �� ok~
		+ 00001011 �� 11
		----------
		1 00000000
*/


/*
���� ���

~a : -11
~b : 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/