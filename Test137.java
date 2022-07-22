/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- String Ŭ����
*/

public class Test137
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		// �� s : seoul korea


		// �� ���ڿ� ����
		System.out.println(s.substring(6,9));
		// �� kor

		// �� String.substring(s, e)
		//	  String ���ڿ��� �������
		//	  s ��°����... e-1 ��°���� ����
		//	  (��, �ε����� 0 ���� ����)

		System.out.println(s.substring(7));
		// �� orea

		// �� String.substring(s)
		//	  String ���ڿ��� �������
		//	  s ��°����... ������ ����
		//	  (��, ���ڿ��� ���� ���̸�ŭ)


		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		// �� true
		//    false
		//	��ҹ��� ������ ����

		System.out.println(s.equalsIgnoreCase("SEOUL KOREA"));
		// �� true
		//	��ҹ��� ���� ����

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//	  "kor" ���ڿ��� �����ұ�?
		//	  �����Ѵٸ�.. �� ��ġ�� ��� �ɱ�?
		
		// "seoul korea"
		// 0123456789
		
		System.out.println(s.indexOf("kor"));
		// �� 6

		System.out.println(s.indexOf("ea"));
		// �� 9

		System.out.println(s.indexOf("e"));
		// �� 1
		// ���� ã�� ���ڿ��� �ε����� ��ȯ�ϰ� ����

		System.out.println(s.indexOf("tt"));
		// �� -1
		// ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		// �� ���ڿ��� �ε����� ��ȯ������
		// �������� ���� ��� ������ ��ȯ�ϰ� �ȴ� (-1)
		
		// �� ��� ���ڿ�(s)�� rea �� ���������� ���� Ȯ��
		//	  (true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		// �� true
		//    false

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//	  "e" ���ڿ��� �����ұ�?
		//	  �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		//	  (��, �ڿ��� ���� �˻�)

		// seoul korea
		System.out.println(s.indexOf("e"));
		// �� 1
		System.out.println(s.indexOf("o"));
		// �� 2
		System.out.println(s.lastIndexOf("e"));
		// �� 9
		System.out.println(s.lastIndexOf("o"));
		// �� 7

		// �� ��� ���ڿ�(s) ��
		//	  6 ��° �ε��� ��ġ�� ���ڴ�?

		// seoul korea
		System.out.println(s.charAt(6));
		// �� k

		//System.out.println(s.charAt(22));
		// �� ��Ÿ�� ����
		//	  StringIndexOutOfBoundsException
		
		// �� ��� ���ڿ�(s)�� �� ���ڿ� "seoul corea ��
		//	  � ���ڿ��� �� ū��?	�� ���ڿ��� ���� ũ�� ��
		//	   �� �� ���ڿ��� ���ٸ�    �� 0
		//	   �� �� ���ڿ��� �ٸ��ٸ�  �� ���̸� Ȯ��(������ �迭)
		System.out.println(s.compareTo("seoul korea"));
		// �� 0 �� �� ���ڿ��� ���� (s �� "seoul korea" ��...)
		System.out.println(s.compareTo("seoul corea"));
		// �� 8
		// c ~ k �� defghijk �� 8
		
		// �� ��� ���ڿ�(s) ��
		//	  �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ������ ���ڿ� ��ȯ
		s = "���ѵ��� ���缮 �ڸ�� ���缮 �ڸ��";
		s = s.replaceAll("���缮", "�ڸ��");
		System.out.println("ó����� : " + s);
		// �� ó����� : ���ѵ��� �ڸ�� �ڸ�� �ڸ�� �ڸ��

		// �� ���� ����
		s = "          ��          ��          ";
		System.out.println("|" + s + "|");			// �ð������� s�� ��°�� ���κ��� ������� �˱� ����
		// �� |          ��          ��          |

		System.out.println("|" + s.trim() + "|");
		// �� |��          ��|
		// ���� �����ڸ� ���� ����

		
		
		
		
	}
}