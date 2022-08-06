/*
���� �ڹ��� �⺻ �����(I/O) ����
	- Reader �ǽ�
	- Test172.java �� ��!!
*/

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ�� �ִ� ���� ����
		// Reader			 : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		while ( (data = rd.read()) != -1 )
		{
			ch = (char)data;

			System.out.print(ch);
			/*
			���ڿ� �Է�(����:Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			//System.out.write(ch);
			/*
			���ڿ� �Է�(����:Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
		}
	}
}