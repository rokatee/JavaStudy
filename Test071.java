/*
���� ���� ������ ���� ���� ���� 
*/

// CircleTest.java ���ϰ� ��Ʈ

/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�
Ŭ������ : CircleTest) �� CircleTest.java
BufferedReader �� readLine()

���� ���� = ������ * ������ * 3.14
���� �ѷ� = ������ * 2 * 3.14

���� ��)
������ �Է� : xxx

>> �������� xxx�� ����
>> ���� :  / �ѷ� : 
����Ϸ���.....
*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args)  throws IOException
	{
		CircleTest ct = new CircleTest();
		ct.input();
		double area = ct.calArea();
		double length = ct.calLength();
		ct.print(area, length);
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