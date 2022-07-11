/*
���� ���� ������ ���� ���� ���� 
*/

// Test071.java ���ϰ� ��Ʈ

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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// �ֿ� �Ӽ�(������) �� ��� ����
	int r;						// ������
	final double PI = 3.14;		// ������ (������ ���ȭ)
	int area, length;

	// �ֿ� ���(����, ����) �� ��� �޼ҵ�

	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// ���� ��� ��� �� �޼ҵ� ����
	double calArea()
	{
		return r*r*PI;
	}

	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calLength()
	{
		return r*2*PI;
	}

	// ��� ��� ��� �� �޼ҵ� ����
	void print(double a, double l)
	{
		System.out.printf(">> �������� %d�� ����\n", r);
		System.out.println(">> ���� : " + a);
		System.out.println(">> �ѷ� : " + l);
	}
}