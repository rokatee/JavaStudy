/*
���� �ڹ��� ���� �� Ư¡ ����
	- ������ �ڷ���
	- �ڹ� �⺻ ����� : BufferedReader Ŭ����
*/

/*
����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
�̸��� �Է��ϼ��� : ȫ�浿
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ȫ�浿
���� : 240
����Ϸ��� �ƹ� Ű�� ��������....!

*/

/*
���� �ν� �� �м�
1. �̸�, ����, ����, ������ ����ڿ��� �Է¿䱸
2. ������ ��� ���� ���� ����
3. ��� ����� ������ �̸� ��Ÿ���� �ϱ�
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ���� 
		InputStreamReader isr = new InputStreamReader(System.in);		//isr�� InputStreamReader�� ����
		BufferedReader br = new BufferedReader(isr);					//isr�� BufferedReader �Ű������� �־�
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strName, strTemp;					// �̸� ����
		int nKor, nEng, nMat, nTot, nAve;		// ��, ��, ��, ����, ��� ���� ����

		// ���� �� ó��
			
			//���α׷� ��
			System.out.println("���Ἲ��ǥ����");

			//�̸�
			// ����ڿ��� �Է��� �䱸
			System.out.print("�̸��� �Է��ϼ��� : ");
			//�Է� ��⿭�� ���ڿ�(�ܺ� ������)�� �ҷ��� ������ �ֱ�
			strName = br.readLine();
			
			//����
			// ����ڿ��� �Է��� �䱸
			System.out.print("���� ���� �Է� : ");
			//�Է� ��⿭�� ���ڿ��� �ҷ��� ������ ��ȯ�Ͽ� ������ �ֱ�
			strTemp = br.readLine();
			nKor = Integer.parseInt(strTemp);
			//nKor = Integer.parseInt(br.readLine());

			//����
			// ����ڿ��� �Է��� �䱸
			System.out.print("���� ���� �Է� : ");
			//�Է� ��⿭�� ���ڿ��� �ҷ��� ������ ��ȯ�Ͽ� ������ �ֱ�
			nEng = Integer.parseInt(br.readLine());

			//����
			// ����ڿ��� �Է��� �䱸
			System.out.print("���� ���� �Է� : ");
			//�Է� ��⿭�� ���ڿ��� �ҷ��� ������ ��ȯ�Ͽ� ������ �ֱ�
			nMat = Integer.parseInt(br.readLine());


			//���� ����
			nTot = nKor + nEng + nMat;
			nAve = (nKor + nEng + nMat) / 3;



		// ��� ���
			System.out.println("\n====[���]====");
			//System.out.println("�̸� : " + strName);
			System.out.printf("�̸� : %s%n", strName);	// %s �� ������ ���� ���� �ɼ�
			System.out.printf("���� : %d%n", nTot);
			System.out.printf("��� : %d%n", nAve);

	}
}


/*
���Ἲ��ǥ����
�̸��� �Է��ϼ��� : ���α�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ���α�
���� : 240
��� : 80
*/