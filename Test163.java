/*
���� �÷���(Collection) ����
*/

/*
Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�

���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ������
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : Y
	
	2��° ��� �Է� : ������
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? n

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
		������
	���� ��ü ��� �Ϸ�~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : �ø�

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ������

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : �׸����Ʈ

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ������
	������ ���� �Է� : ġŲ

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=====================
	>> �޴� ����(1~6) : 6

	���α׷� ����~!!
	����Ϸ���...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus    //--�ϼ�
{
	public static final int E_ADD  = 1;		// ��� �߰�
	public static final int E_DISP = 2;		// ��� ���
	public static final int E_FIND = 3;		// ��� �˻�
	public static final int E_DEL  = 4;		// ��� ����
	public static final int E_CHA  = 5;		// ��� ����
	public static final int E_EXIT = 6;		// ����
}

public class Test163
{
	// �ֿ� �Ӽ� ���� -- �ϼ�
	private static final Vector<Object> vt;	// �ڷᱸ��
	private static BufferedReader br;		// �Է� �� Ȱ��
	private static Integer sel;				// ���� ��
	private static String con;				// ��� ����

	// static �ʱ�ȭ �� -- �ϼ�
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\n[�޴� ����]");
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ���");
		System.out.println("3. ��� �˻�");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� ����");
		System.out.println("6. ��     ��");
		System.out.println("=====================");
	}
	
	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> �޴� ����(1~6) : ");   //-- ���⿡ �ص� �������
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel < 1 || sel > 6);		// �޴����� ����
		System.out.println();
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		/*
		// ��� 1
		if (sel == 1)
			addElement();
		else if (sel == 2)
			dispElement();
		else if (sel == 3)
			findElement();
		else if (sel == 4)
			delElement();
		else if (sel == 5)
			chaElement();
		else if (sel == 6)
			exit();
		*/

		/*
		// ��� 2
		switch (sel)
		{
			case 1 : addElement();  break;
			case 2 : dispElement(); break;
			case 3 : findElement(); break;
			case 4 : delElement();  break;
			case 5 : chaElement();  break;
			case 6 : exit(); break;
			default : System.out.println(">> �Է� ����"); break;
		
		}
		*/

		// ��� 3
		switch (sel)
		{
			case Menus.E_ADD  : addElement();  break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL  : delElement();  break;
			case Menus.E_CHA  : chaElement();  break;
			case Menus.E_EXIT : exit(); break;
			default : System.out.println(">> �Է� ����"); break;
		
		}
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		String name;
		do
		{
			// size() : ���� ���Ϳ� ����� ��ü�� ����(size)�� ��ȯ�Ѵ�
			System.out.printf("%d ��° ��� �Է� : ", vt.size()+1);	// 0��°���� �����̴� +1
			name = br.readLine();

			//StringŬ�����̹Ƿ� �ڵ����� Object Ŭ������ ��ĳ���� �� ��
			vt.add(name);

			System.out.printf("%d ��° ��� �Է� ����~!!!\n", vt.size());	// ������ +1 �������� ���� ���ص� ��
			System.out.printf("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		}
		//while (con == "Y" && con == "y");			// �̷��� �ϸ� ���� ��� �Է��� �ƴ� �޴��������� ���ư� ��?;;
		while (con.equals("Y") || con.equals("y"));	// equals ���ϱ� �ٷ� �ذ�ǳ�... ŷ�޳�...
		System.out.println();
	}

	// ��� ��� �޼ҵ�
	public static void dispElement() 
	{
		System.out.println("[���� ��ü ���]");
		
		// ��� 1
		//for (Object v : vt)
		//	System.out.println(v);
		//System.out.println();
		
		// ��� 2
		for (int i = 0; i < vt.size(); i++)
		{
			System.out.printf("%s\n", vt.get(i));
		}
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
		System.out.println();
			
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		String name = "";

		System.out.print("�˻��� ��� �Է� : ");
		name = br.readLine();
		
		// �־��� ��ü�� ����� ��ġ�� ��ȯ�Ѵ�
		// �������� ���� ��� "����"�� ��ȯ�Ѵ�
		int search = vt.indexOf(name);

		System.out.println("[�˻� ��� ���]");
		if (search < 0)	// = �������� ������(�����̸�)
			System.out.print("�׸��� �������� �ʽ��ϴ�.");
		else
			System.out.print("�׸��� �����մϴ�.");
		System.out.println();
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		String name;
		System.out.print("������ ��� �Է� : ");

		name = br.readLine();
		
		// ���Ͱ� �־��� ��ü�� �����ϰ� �ִ����� ���θ� ��ȯ�Ѵ�
		if (vt.contains(name))	// �� ������ ������
		{
			int i = vt.indexOf(name);	// �� ��ġ ã�Ƽ�

			// �׽�Ʈ(Ư�� �������� ��ġ �� ��������)
			//System.out.println(name + "�� index ��ġ : " + i);

			vt.remove(i);				// �� �ش� ������ ����
			System.out.println("[���� ��� ���]");
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n", name);
		}
		else					// �� ������ ������ ��� �ȵǰ� �ϱ�
		{
			System.out.println("[���� ��� ���]");
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");		
		}
		System.out.println();
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		String name;	// ����� ���� �̸�
		String nameNew;	// ������ ���ο� �̸�
		System.out.print("������ ��� �Է� : ");
		name = br.readLine();

		if (vt.contains(name))	// �� ������ ������
		{
			System.out.print("������ ���� �Է� : ");
			nameNew = br.readLine();

			int i = vt.indexOf(name); // �� ��ġ ã�Ƽ�
			//set(name, nameNew)	// �̷��� �ߴٰ�
			//set(int, Object)	// ù��°�� int�� ���� �ϴ°� Ȯ�� ��
			// �� ������ ����ֱ�
			vt.set(i, nameNew);	// name�� int�� ��� ����

			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
		System.out.println();
	}

	//���α׷� ���� �޼ҵ� -- �ϼ�
	public static void exit()
	{
		System.out.println("���α׷� ����~!!!\n");
		System.exit(-1);
	}
	
	// main() �޼ҵ� -- �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}	
}