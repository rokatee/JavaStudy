/*�޼ҵ��� ��� ȣ��*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	// �ڵ� ������ 2���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{
		//Ʋ�� �κа� ���� ã�� 2������ �Ű� ������ ã�ƺ���
		System.out.println("Hi~~");
		showHi(cnt--);					//showHi(3) -> ���⼭ �̹� ���� showHi�޼ҵ�� �Ѿ��
		if (cnt == 1)					//�׷��Ƿ� ����� üũ���� ���Ѵ�(���Ѵ�)
			return;

		System.out.println("Hi~~");
		showHi(--cnt);					//showHi(2) -> ���⼭ �̹� ���� showHi�޼ҵ�� �Ѿ��
										//����ؼ� showHi�� ���� �������� 3 -> 2 -> 1 -> 0 -> -1
		if (cnt == 1)					//�׷��Ƿ� ����� üũ���� ���Ѵ�(���Ѵ�)
			return;
		
		//����
		System.out.println("Hi~~");		
		if (cnt == 1)					// ���⼭ ���� showHi�� ���� 1���� üũ�Ѵ�
			return;
		showHi(--cnt);					// �� �� showHi( ) -> 1�� �� �� ���� if������ �ɷ� ���α׷��� �����Ѵ� 
		

	}
}