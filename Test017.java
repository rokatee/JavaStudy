/*
���� �ڹ��� ���� �� Ư¡ ����
	- �ڹ� �⺻ ����� : System.util.Scanner
*/

/*
<java.util.Scanner>

�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�
�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�

*/

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		//Scanner�� InputStreamReader ��� ������� �ʿ� ����

		// Scanner�� BufferedReader ���� ���ٸ� BufferedReader�� �ʿ� ���°�?
		// ���� NO!
		// BufferedReader ���� Scanner�� ����� �� ������
		// ������ BufferedReader�� ������ �� ����
		// BufferedReader�� ���� �Է��� �о���̴� ��� �ϳ��� ������ �ֱ� ����

		// �ֿ� ���� ����
		String name;
		int kor, eng, mat;

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();									// ���� �������� ���ڿ��� �ľ��Ͽ� �����ؼ� �������Ƿ�
															// �ܾ� �ϳ� �������� ��ٷȴٰ� ���� �ܾ �������⿡
															// next() �� ���ٰ� �����ϸ� ��.

		// �׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� �̸� : " + name);
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();									// Interger.parseInt(br.readLine()) �� ���� ���
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		// ���� ��� ���

		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + mat);
		//System.out.println("���� : " + kor + eng + mat);	// �̷��� �ϸ� ���ڸ� ������ �����
															// Scanner �� ���ڿ��� �������� ����
		System.out.println("���� : " + (kor + eng + mat));	// �켱 ������ ���� ������ ���� ��
		
	}

}


/*
���� ���

�̸��� �Է��ϼ��� : ���α�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

�̸� : ���α�
���� ���� : 90
���� ���� : 80
���� ���� : 70
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/