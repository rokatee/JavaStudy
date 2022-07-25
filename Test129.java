/*
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Object Ŭ����
*/

class NewCar // extends Object
{
	private int velocity;		// �ڵ��� �ӵ�
	private int wheelNum;		// �ڵ��� ���� ����
	private String carName;		// �ڵ��� �̸�

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}

public class Test129
{
	public static void main(String[] args)
	{
		//NewCar nCar1 = new NewCar();	// NewCar Ŭ������ NewCar() �޼ҵ忡 ���ڰ� �����Ƿ� ����Ʈ �ν��Ͻ� ���� �Ұ�
		NewCar nCar1 = new NewCar(250, "���������", 4);
		NewCar nCar2 = new NewCar(150, "K5", 4);
		
		// equals()	-- Object�� �����ϴ� �޼ҵ�
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		// �� 1-1 : false
		//    1-2 : false	// equals()�� "==" �� �����ڿ� �����ϰ� �ּҰ��� ���ϴ� �޼ҵ��

		NewCar nCar3 = nCar1;	// ��ü ���� �� ���� ����(������)
								// �� �ּҰ� ���� (Test096,097.java ����)
		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		// �� 2-1 : true
		//    2-2 : true
		// 35�� ���� ���� ���縦 ���� nCar1�� �ּҰ��� nCar3�� ������Ƿ�
		// ���� ���� �ּҰ��� ����Ű�� �־ ������ ���� ���´�

		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		// �� 3-1 : NewCar@15db9742
		//	  3-2 : NewCar@6d06d69c
		//	  3-3 : NewCar@15db9742
		// 35�� �ٿ� ���� nCar1 �� nCar3 �� ��ü�� ���ٺ��� 3-1�� 3-3�� ���� ����

		// hashcode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		// �� 4-1 : 366712642
		//	  4-2 : 1829164700
		//	  4-3 : 366712642
		// �� ������� 16���� ���·� �ٲٰ� �Ǹ� toString() �޼ҵ尡 ��ȯ�� ����� Ȯ�� ����
		
		// getClass()
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		// �� 5-1 : class NewCar
		//    5-2 : class NewCar
		//	  5-3 : class NewCar
		// �� ������ ��ü�� ���� �ش� ��ü�� ��� ���赵�� Ȯ���� �ִ� ����� ���� �޼ҵ�

		// clone()		// ��ü ����

		// finalize()	// ��ü ����ȭ
		
		// ��Ÿ ������ �޼ҵ�� ������ ó���� ������ �ִ�
		
		
		
	}
}