/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
*/


public class Test135
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// 2147483647
		// -2147483648
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		// 127
		// -128
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		// 1.7976931348623157E308
		// 4.9E-324	�� e ǥ���(���ڰ� �̻��ϰ� ������ �ƴ�)
		
		System.out.println();		// ����
		
		// �Ǽ� ����� ������ ����
		System.out.println("1 : " + 3.0/0);
		System.out.println("2 : " + -3.0/0);
		// �� 1 : Infinity
		// �� 2 : -Infinity
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		// �� 3 : true
		// �� 4 : false
		
		// Double.isInfinite()
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		// �� 5 : true
		// �� 6 : true
		
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + 0.0/0);
		// �� 7 : NaN (Not a Number)
		// �� 8 : NaN
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10: " + (0.0/0 != 0.0/0));
		// �� 9 : false
		// �� 10: true

		// �� NaN(Not A Number) ���� ������ ����
		//	  ũ�� �񱳸� �����ϴ� "==" �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//	  ����� ������ false �� ��ȯ�Ѵ�

		// Double.isNaN()
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		// �� 11 : true
		//    12 : false

		
	}
}