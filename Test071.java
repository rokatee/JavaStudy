/*
���� ���� ������ ���� ���� ���� 
*/

// CircleTest.java ���ϰ� ��Ʈ

/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�
Ŭ������ : CircleTest �� CircleTest.java
BufferedReader �� readLine()

���� ���� = ������ * ������ * 3.14
���� �ѷ� = ������ * 2 * 3.14

���� ��)
������ �Է� : xxx

>> �������� xxx�� ����
>> ���� :  / �ѷ� : 
����Ϸ���.....
*/

import java.io.IOException;										// main()���� IOException�� import �ʿ�������
																// BufferedRaeder�� �ʿ� ���� ���� ����
public class Test071
{
	public static void main(String[] args) throws IOException	// CircleTest.java�� input()���� ������
	{															// br.readLine()�� �������� main()
																// ������ ������ ���� IOException
		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest ob = new CircleTest();

		ob.input();												// CircleTest() ���� BufferedRaeder�� ���� ���� ��,
																// main()���� ���°� �ƴϱ⿡ ���⼱ �ʿ� ����
		double area = ob.calArea();

		double length = ob.calLength();

		ob.print(area, length);

	}
}

/*
���� ���

������ �Է� : 3
>> �������� 3�� ����
>> ���� : 28.26
>> �ѷ� : 18.84
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/