/*
���� �ڹ��� ���� �� Ư¡ ����
	- �ڹ� �⺻ ����� : System.out.printf()
*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");				// \n ����

		System.out.println();					// println ���� ������ ���� ���(����)
		//System.out.print();					// print   ���� ������ ������ ���� �߻�
		
		System.out.print("\n");					// ���� ����Ϸ��� ���๮�� �Է�
		//System.out.print(\n);					// ���ڿ��� �ƴ� ���๮�� �Է��ϸ� ������ ���� �߻�
		System.out.printf("123456");
		System.out.printf("123456\n");			// \n ����
		System.out.printf("123456%n");			// %n ����
		//System.out.printf();					// ���� ������ ������ ���� �߻�

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		
		System.out.printf("%5d\n", 123);		// %5d = ���ڸ� ������ 5��ŭ�� ������ Ȯ���ϰ�
		System.out.printf("%10d\n", 123);		// %10d = ���ڸ� ������ 10��ŭ�� ������ Ȯ���ϰ�
		
		/*										// ���� �����Ͽ� ���ڰ� ��� ��
												// (���� ���� �ְ� ������ ����)
		   123									// ex) --123
		       123								// ex) -------123
		*/

		System.out.printf("%010d\n", 123);		// %010d = ���ڸ� ������ 10��ŭ�� ������ Ȯ���ϰ�
												// �Է��� ���� ���� ������ 0�� ä�� �ִ´�
												// 0000000123

		System.out.printf("%+d\n", 123);		// +123 �� %+d Ȥ�� +%d �ϸ� +�� ���ڷ� ��� ��
		System.out.printf("+%d\n", 123);		// +123 
		System.out.printf("%d\n", +123);		// 123 �� �տ� + �� �ٿ��� ����̱⿡ �׳� 365�� ��� ��

		//System.out.printf("%-d\n", 123);		// ��Ÿ�� ����
		System.out.printf("-%d\n", 123);		// ������ -%d �� �ؾ� ������ �� ����
		System.out.printf("%d\n", -123);		// ������ �׳� ���ڿ� - �� �ٿ��� �ȴ�

		System.out.printf("%c\n", 'A');			// ���� ����� %c
		//System.out.printf("%c\n", "ABCD");	// %c �� ���ڿ� ��½� ��Ÿ�� ����
		System.out.printf("%s\n", "ABCD");		// ���ڿ� ����� %s
			
		System.out.printf("%h\n", 123);			// 16����
		System.out.printf("%o\n", 123);

		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);		// boolean �� %b
		
		System.out.printf("%f\n", 123.45);		// �Ǽ�			
		System.out.printf("%.2f\n", 123.456);	// �Ҽ��� ���� �� ��° �ڸ����� �ݿø��Ͽ� ǥ��		
		System.out.printf("%.2f\n", 123.451);	// ���� ��� �ٸ� (�� ��° �ڸ����� ��������)
		
		System.out.printf("%8.2f\n", 123.456);	// 8�� �ڸ� Ȯ�� �� �Ҽ��� �������� 3��°�� �����ϰ� ���� �ִ´�
												// �� --123.46
		System.out.printf("%2.2f\n", 123.456);	// �� 123.46
	}
}

/*
���� ���


AAABBBCCC


123456123456
123456
10 + 20 = 30
  123
       123
0000000123
+123
+123
123
-123
-123
A
ABCD
7b
173
true
false
123.450000
123.46
123.45
  123.46
123.46
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/