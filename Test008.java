/*
���� �ڹ��� ���� �� Ư¡ ����
	- ������ �ڷ���
	- ������ �ڷ��� �ǽ� �� �׽�Ʈ : char
*/

public class Test008
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		char ch1, ch2, ch3, ch4;		// ������ ���ʿ� ���� ����
		int a;

		// ���� �� ó�� (���� ����)
		ch1 = 'A';

		ch2 = '\n';		
		// ���� ���ڶ� ����� �������� ����
		// ���ڿ��� ��� �� ���ڸ� �����ϳ�, \n �� ��� �ϳ��� ���ڿ��� ��

		ch3 = '\\';
		// '\'�� ����ϰ��� �� �� \\(�������� 2��) �� ����϶�

		ch4 = '��';

		//a = ch1;		
		// ������ ���� �ȳ��� ����?
		// 1. �츮 ���� ����('A')�� ��������, �ƽ�Ű�ڵ�� �Ѿ('A' = 65)
		// 2. �ڵ� �� ��ȯ (char �� int)

		a = (int)ch1;
		// ����� �� ��ȯ(���� �� ��ȯ)

		//System.out.printf("%c, %c, %c, %c, %d%n", ch1, ch2, ch3, ch4, a);


		// ��� ���
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
		System.out.println("a : " + a);
	} 
}


/*
A,
, \, ��, 65
ch1 : A
ch2 :

ch3 : \
ch4 : ��
a : 65
*/