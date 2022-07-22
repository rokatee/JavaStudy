/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
*/

import java.math.BigDecimal;

public class Test133
{
	public static void main(String[] args)
	{
		// Ŀ�ٶ� �Ǽ��� �ٷ� �� ��
		BigDecimal a = new BigDecimal("123456789.123456789");
		
		//movePointLeft() : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("ó�� ��� : " + b);
		// �� ó�� ��� : 123456.789123456789

		// ������ ����(��ü �Ӽ� Ȯ��)
		BigDecimal c = a.divide(b);
		System.out.println("ó�� ��� : " + c);
		// �� ó�� ��� : 1E+3

		BigDecimal d = a.divide(b, BigDecimal.ROUND_DOWN);	// �ݿø��� ���� �ʴ´� �� ����
		System.out.println("ó�� ��� : " + d);
		// �� ó�� ��� :  1000.000000000
		
		// BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		// �� 123456789

	}
}