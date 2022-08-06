/*
���� ��ü�� ����ȭ(Object Serialization) ����
*/

/*
�� ��ü ����ȭ(Object Serialization)��
	
	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
	�״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ������ �� �ִ� �������
	��� ������ ���� �����Ѵٰų�
	�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
	���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
	������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�

	����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�


�� ��ü ����ȭ�� ����
	
	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ü�� ���Ͽ� ���������μ� ���Ӽ��� ������ �� ������
	��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�

	��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
	�� ������ RMI �� Bean �����̾���
	RMI �� ���� ��ü ����� �����ؾ� �ϱ� ������
	��ü�� �״�� �̵��� �� �־�� �Ѵ�
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���

	����, Bean �� ���� �� ���¿�  ���� ������ ������ ��
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�

	�� RMI(Rmote Method Invocation)
		���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
		ȣ���ϰ� �����ϴ� ����� ����Ѵ�
		���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
		��� ������ �����ϴ� �������� �����ϸ� ���ڴ�

	�� Bean(��)
		C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
		���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���
		�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�
		Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

�� Serialization �������̽�
	
	��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
	java.io.Serialization �������̽��� ������ �־�� �Ѵ�
	�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
	JVM �� �˷��ִ� ������ �����Ѵ�
	����, Serialization �������̽���
	�ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
	���� ���� ���ָ� �ȴ�

	����)
	��
	public class Ŭ������ implements Serialization
	{
		...
	}

	��
	Serialization �������̽��� ������ ��
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
	��ü ������ ������� �����ϰ� �ȴ�

	�� ��� ������ static ���� ����� ���
	   (��, Ŭ���� ������ ���)
	   ��ü ����ȭ�� ��󿡼� ���ܵȴ�


�� Object Stream
	
	java.io.ObjectInputStream
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
	���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
	����ȭ�� �����ϴ� ����� �����Ѵ�
	��, java.io.Serialization �������̽���
	java.io.Externalizable �������̽��� �������ִ� ��ü�� ���ؼ��� ����� �����ϴ�
	��, Serialization �������̽��� Externalizable �������̽���
	������ ��ü������ ����� �����ϴٴ� ���̴�
	�� ��, readObject() �޼ҵ带 �̿��Ͽ�
	��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
	������ ��(Type)���� ĳ���� �� �־�� �Ѵ�
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;


public class Test177
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		// �׽�Ʈ
		//System.out.println(appDir);
		// �� C:\JavaStudy

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser"); //������\\�׽�Ʈ.�ø���
		// appDir �� C:\JavaStudy
		// appDir ��ġ�� ��������(�߽�����) "\\data\\test.ser" ��
		// �����ϰڴٴ� �ǹ�
		// ��������� C:\JavaStudy\data\test.ser ����

		// �׽�Ʈ
		//System.out.println(f0.getParentFile().exists());
		// �� false
		//	  test.ser ������ ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴ�
		// C:\JavaStudy ��ο� data ���͸� ���� �� �ٽ� Ȯ��
		// �׽�Ʈ
		//System.out.println(f0.getParentFile().exists());
		// �� true

		// test.ser ������ ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴٸ�
		if (!f0.getParentFile().exists())
		{
			// ���͸��� ����ڴ�
			f0.getParentFile().mkdirs();
		}

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> h1 = new Hashtable<String, String>();
		
		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2206428", "���缮");
		h1.put("2206436", "�ڸ��");
		h1.put("2206512", "������");
		h1.put("2206524", "������");
		h1.put("2206537", "��ȫö");

		// �׽�Ʈ
		//System.out.println(h1.get("2206524"));
		// �� ������

		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)�� 
		//	 f0 ��� ���� ��ü�� ���ڴ�
		// InputStreamReader isr = new InputStreamReader(System.in);
		
		
		// ��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//	 fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�
		// BufferedReader br = new BufferedReader(isr);
		
		// ���� line 145 ~ 152 �� ������ ����
		// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// ���� line 157 �� ����� ���� ����(���������� ������ ����)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ObjectOutputStream Ŭ������
		//	  ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//	  ��� ��Ʈ���� ����ϱ� ����
		//	  ���������� ��ü ����ȭ�� �����ϰ� �ȴ�
		//	  �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//	  ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//	  ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�

		
		// ������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);
		//-- out.write(ch); �� ���� ������ ����
		
		// ��ü ���� ���ҽ� �ݳ�
		oos.close();
		//-- ObjectOutputStream ���ҽ� �ݳ�
		
		// ���� ���� ���ҽ� �ݳ�
		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		// (��ü�� ����ȭ�Ͽ� ���Ϸ�) �������� ��~!!
		// ---------------------------------------------------------------------

		// (��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ����~!!
		
		// f0 ���� ��ü�� �����Ѵٸ�...
		if (f0.exists())
		{
			// f0 ������ ���� �Է� ��Ʈ��(fis, FileInputStream)���� �о���̰�
			FileInputStream fis = new FileInputStream(f0);

			// fis ���� �Է� ��Ʈ�����κ��� ��ü �Է� ��Ʈ��(ois, ObjectInputStream)�� ����
			
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ��ü �Է� ��Ʈ��(ois, ObjectInputStream)���� ���� �о���� ��ü(Object)��
			// ĳ����(Hashtable) �Ͽ� h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
			// Object obj = ois.readObject();
			Hashtable h2 = (Hashtable)ois.readObject();

			ois.close();
			//-- ois, ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis, FileInputStream ���ҽ� �ݳ�

			//-------------------------------------������� �����ϸ� �о���̴� �۾� ��~!!

			// �о���� h2 ��ü�� ���� Ȯ��
			String key;
			String value;

			// Iterator ��� �Ұ�
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- Hashtable �ڷᱸ���� ������� key���� �о���̴� ����
				
				// �׽�Ʈ
				//System.out.println(key);
				/*
				2206512
				2206524
				2206436
				2206537
				2206428
				*/

				value = (String)h2.get(key);
				//-- Hashtable �ڷᱸ���� ������� key�� Ȱ���Ͽ� value �� �о���̴� ����

				System.out.println(key + " �� " + value);
				// ��
				/*
				2206512 �� ������
				2206524 �� ������
				2206436 �� �ڸ��
				2206537 �� ��ȫö
				2206428 �� ���缮
				*/
			}

 		}
	}
}