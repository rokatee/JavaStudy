/*
���� �÷���(Collection) ����
*/

/*
�� Map �� Hashtable, HashMap
	
	- �� ���� ����� ���. �ؽ����̺��� ����ȭ ����� �ְ� �ؽø��� ����ȭ ����� ����.
	
	- java.util.Map �������̽���
	  Ű(key)�� ��(value)�� ����(mapping)�Ͽ�
	  ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
	  �� Ű�� �� ���� ������ �����ؾ� �Ѵ�
	  ��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�


�� Hashtable<K, V> Ŭ����

	- Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
	  Hashtable Ŭ������ ����� Hashtable �� ����������
	  Synchronization �� ���� ������ ���ü� ������ ���ٸ�
	  (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	  HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�

	- ����, HashMap �� Hashtable Ŭ������ �޸� null �� ����Ѵ�
	  
*/

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test171
{
	public static void main(String[] args) throws IOException
	{
		// HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map �̶�� Hashmap �ڷᱸ���� ��� �߰�
		// �� put();
		map.put("��ȭ", "���˵���2");
		map.put("���", "���¿�Ŭ��");
		map.put("��ȭ", "������ũ");

		// �׽�Ʈ �� ���� Ȯ��
		System.out.println(map);
		// �� {���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=������ũ}
		// ������ ���� ���� Ȯ��
		// ������ ��� �ݳ� ������ �߰� ������ ���� ����
		

		// �� null ���� ó��
		//	  �Ʒ��� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//	  ������ null �� key �� ���ε� "�𳪸���" ��
		//	  ���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�
		//	  ��, HashMap �� null �� �ϳ��� ������ key �� �����Ѵ�(�ν��Ѵ�)

		// key �� value ��� null
		map.put(null, null);
		// �׽�Ʈ �� ���� Ȯ��
		System.out.println(map);
		// �� {null=null, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=������ũ}
		//	   ---------

		// value �� null
		map.put("��ȭ", null);
		// �׽�Ʈ �� ���� Ȯ��
		System.out.println(map);
		// �� {null=null, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=null, ��ȭ=������ũ}
		//	   ---------									   ---------

		// key �� null
		map.put(null, "�𳪸���");
		// �׽�Ʈ �� ���� Ȯ��
		System.out.println(map);
		// �� {null=�𳪸���, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=null, ��ȭ=������ũ}
		//	   -------------									   ---------

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
		String[] temp;

		for (String str; ((str = br.readLine()) != null); )
		{
			temp = str.split(",");
			if (temp.length < 2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}
	}
}