/*
���� Ŭ������ �ν��Ͻ� ����
	- �޼ҵ� �����ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
*/

public class Test104
{
	public static void main(String[] args)
	{
		print(3.14);
		//double result = print(3.14);
		// �ڹ� ���忡�� 10���̳� 11���̳� �Ȱ���
		// ��? = �������� �����ʺ��� �б⶧��
		// 11���� 30���� �θ��°� �ƴ�

	}
	
	public static void print() {}
	//public static void print() {}							// - X �� �Ű������� ���� ����
	
	public static void print(int i) {}
	//public static void print(int j) {}					// - X �� �ڷ����� ���� ������(�������� �������)
	public static void print(char c) {}						// - O �� ������ �ϳ� �����ؼ� ��� ��
															//		  �ڵ� �� ��ȯ ��Ģ üũ�ؾ� ��
	public static void print(int i, int j) {}
	public static void print(double d) {}					// - O �� ������ �ϳ� �����ؼ� ��� ��
															//		  �ڵ� �� ��ȯ ��Ģ üũ�ؾ� ��
	//public static void print(double e) {return 10.0;}		// return Ÿ���� �Ǽ��ε� void�� �Ѱ��ִ� �� �����Ƿ� �� ��
															// ���� ���� ���� �Ұ���(������ ����)
	//public static double print(double e) {return 10.0;}	// - X �� �ȵǴ� ���� ����صα� �� main 12~14�� �� ��


	
}