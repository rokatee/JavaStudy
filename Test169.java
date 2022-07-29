/*
���� �÷���(Collection) ����
*/

/*
Set �� HashSet, TreeSet
 - ���� ����
 - �ߺ��� ������� �ʴ� ����(�⺻)

 �� TreeSet<E> Ŭ����
	
	java.util.TreeSet<E> Ŭ������
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�

VO  - Value Object
DTO - Data Transfer Object
DAO - Data Access Object
*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;			// �й�
	private String name;		// �̸�
	private int kor, eng, mat;	// �� �� �� ����
	
	// ������(����� ���� ������) �� 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// default ������ �ڵ� ���Ե��� ����

	// ������(����� ���� ������) �� �Ű����� ���� ������
	// �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	// default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	// �߰��� ������ ������
	GradeVO()
	{
		this("", "", 0, 0, 0);
	}
	
	// getter / setter
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}
	
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ����(���� ����)
	public int getTot()
	{
		//return kor + eng + mat;
		return this.kor + this.eng + this.mat;
	}

}

class MyComparator<T> implements Comparator<T>
{
	// �� �޼ҵ� ������
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ����(��������)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// return Integer.parseInt("2206113") - Integer.parseInt("2206115");
		// return 2206113 - 2206115;
		// return -2;	// ���� �� �ް��� �� ŭ �� ���������� �Ǿ���

		// �й� ����(��������)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
		// ���� ����(��������)
		//return s1.getTot() - s2.getTot();

		// ���� ����(��������)
		//return s2.getTot() - s1.getTot();

		// �̸� ����(��������)
		//return s1.getName().charAt(0) - s2.getName().charAt(0)+1;
		// �� charAt(0)���� ù���ڳ��� �� �� �ٸ��� ����, ������ ���� ���� ��� ������ �� ��
		// �� �ݺ������� �ձ��ڰ� ������ ���� �ε��� ���� ���ϵ��� �����غ��� ������
		//	  �ѱ��� ��� �ڵ�ȭ �߳Ŀ� ���� ����� �޶������� ������ ���� ���� �� ��!!
		//
		//		��
		//
		// API���� String�� compareTo ����ϸ� �ذ�
		//return s1.getName().compareTo(s2.getName());

		// �̸� ����(��������)
		return s2.getName().compareTo(s1.getName());
	}
}

public class Test169
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set �� ��� �߰� �� add();
		set.add("�͸���Į��");
		set.add("��Ž���ڳ�");
		set.add("����ť");
		set.add("�����̸���");
		set.add("���ϸ�");
		set.add("����ġ���������Ҹ�");
		set.add("�������庥��");
		set.add("�̿��������");
		set.add("¯���¸�����");
		set.add("�Ʊ����Ѹ�");
		set.add("������̺�");

		// Iterator �� Ȱ���� set ��� ��ü ���
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// �� �͸���Į�� �����̸��� �������庥�� ������̺� 
		//	  ��Ž���ڳ� ����ġ���������Ҹ� �Ʊ����Ѹ� 
		//	  �̿�������� ¯���¸����� ���ϸ� ����ť
		// - ��Ҹ� ���ڿ��� ������ ���
		//   �����ټ� �� �������� ���� Ȯ��

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		//			��
		//
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		
		// TreeSet �ڷᱸ�� set2 �� ��� �߰�
		set2.add(new GradeVO("2206113", "���缮", 90, 80, 70));
		set2.add(new GradeVO("2206115", "�ڸ��", 91, 81, 71));
		set2.add(new GradeVO("2206128", "������", 92, 82, 72));
		set2.add(new GradeVO("2206139", "������", 70, 60, 50));
		set2.add(new GradeVO("2206150", "��ȫö", 90, 82, 72));


		//Iterator<GradeVO> it2 = set2.iterator();
		//while (it2.hasNext())
		//{
		//	System.out.print(it2.next() + " ");
		//}
		//System.out.println();
		// �� ��Ÿ�� ����
		//    Exception in thread "main" java.lang.ClassCastException
		//		: GradeVO cannot be cast to java.lang.Comparable
		//
		//			��
		//
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		//Iterator<GradeVO> it2 = set2.iterator();
		//while (it2.hasNext())	// ���� �� �ִ��� ������ Ȯ���ϰ�
		//{
		//	System.out.printf(it2.next() + " ");
		//}
		//System.out.println();
		// �� GradeVO@15db9742 GradeVO@7d4991ad GradeVO@28d93b30 GradeVO@1b6d3586 GradeVO@4554617c
		//
		//			��
		//
		// ��ü ��ü�� ���� ����ϴ� ���� �ƴ϶�
		// ��ü�� ���� �ִ� �Ӽ��� �����Ͽ� ����� �� �ֵ��� ó��
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())	// ���� �� �ִ��� ������ Ȯ���ϰ�
		{
			GradeVO vo = it2.next();
			System.out.printf("%8s, %4s, %3d, %3d, %3d, %6d\n"
								, vo.getHak(), vo.getName(), vo.getKor()
								, vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();
		// �й� ����(�������� ����) - 123�� ��
		// ��  2206113,  ���缮,  90,  80,  70,   240
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206128,  ������,  92,  82,  72,   246
		//	   2206139,  ������,  70,  60,  50,   180
		//	   2206150,  ��ȫö,  90,  82,  72,   244

		// �й� ����(�������� ����) - 129�� ��
		// ��  2206150,  ��ȫö,  90,  82,  72,   244
		//	   2206139,  ������,  70,  60,  50,   180
		//	   2206128,  ������,  92,  82,  72,   246
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206113,  ���缮,  90,  80,  70,   240

		// ���� ����(��������)
		// ��  2206128,  ������,  92,  82,  72,   246
		//	   2206150,  ��ȫö,  90,  82,  72,   244
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206113,  ���缮,  90,  80,  70,   240
		//	   2206139,  ������,  70,  60,  50,   180


		// ���� ����(��������)
		// ��  2206139,  ������,  70,  60,  50,   180
		//	   2206113,  ���缮,  90,  80,  70,   240
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206150,  ��ȫö,  90,  82,  72,   244
		//	   2206128,  ������,  92,  82,  72,   246

		// �̸� ����(��������)
		// ��  2206150,  ��ȫö,  90,  82,  72,   244
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206113,  ���缮,  90,  80,  70,   240
		//	   2206128,  ������,  92,  82,  72,   246
		//	   2206139,  ������,  70,  60,  50,   180
		
		// �̸� ����(��������)
		// ��  2206139,  ������,  70,  60,  50,   180
		//	   2206128,  ������,  92,  82,  72,   246
		//	   2206113,  ���缮,  90,  80,  70,   240
		//	   2206115,  �ڸ��,  91,  81,  71,   243
		//	   2206150,  ��ȫö,  90,  82,  72,   244

	}
}