import java.io.IOException;

public class testMain extends AdminCall
{
	public static void main(String[] args) throws IOException
	{
		// �����ڰ� ���� ��ȭ������ ����� ���ٴ� ����
		MovieData[] screen = new MovieData[3];

		screen[0] = new MovieData("���˵���2", 19, 80);
		screen[1] = new MovieData("ž��2", 15, 70);
		screen[2] = new MovieData("�̴Ͼ���2", 0, 60);


		User u =  new User();
		u.setScreen(screen);// ��ȭ���� �Է����ִ°�
		u.startProcess();//���� ����
	}
}