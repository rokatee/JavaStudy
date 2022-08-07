import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;

class UserData
{
	protected Integer sel;		//-- ����� ���� ��(������)
	protected String p_id;		//-- Ư�� ������ �����ϱ� ���� process id ���� ����

	// �󿵰����� ���� ��ȭ�� ������ ��� �迭
	static MovieData[] screen = new MovieData[3];

	public void setScreen(MovieData[] m)
	{
		screen = m;
	}

	// �����ϱ� ��ɿ��� ���Ź�ȣ �ο��޴� ȭ�鿡�� �ʿ��� ���� ����
	//protected int num;			//-- �ӽ����� ����, timePick() ���� ����� ����, ����ڰ� ������ �ð��� ��
	protected String tempTitle;		//-- ��ȭ �˻� ��, ����ڰ� �Է��� ��ȭ ���� ��
	protected int tempScreen;		//-- ����ڰ� ������ ��ȭ�� �󿵰� ��
	protected int tempRound;		//-- ����ڰ� ������ ��ȭ�� ȸ�� ��
	protected int runTime;			//-- ��ȭ�� ����Ÿ��
	protected Vector<String> reservedNum = new Vector<String>();	//-- ���Ź�ȣ ���� ��(���� �߻� ��) ����� ����
	protected Vector<reservedData> ud = new Vector<reservedData>();	//-- ����� �����ϱ� �Ϸ� ȭ�鿡�� �Է��� ����(��������) �� �����ϴ� ����

	//====================================================================================================================================
	protected String tempTime;		//-- ����ڰ� ������ �ð� ��
	//====================================================================================================================================

	// �¼� ���� ȭ�鿡�� ����ϴ� ����
	protected String tempSeat;		//-- ����ڰ� ������ �ڸ�
	protected int adult;			//-- ����
	protected int teenager;			//-- û�ҳ�
	protected int kid;				//-- ���
	protected int total;			//-- �� �ο� (������ ���� + û�ҳ� + ��� ��)
	protected boolean[][][] seatInfos = new boolean[15][5][5];	//-- ��ȭ ȸ���� �¼����� [�� ��ȭ �� ȸ��][��][��]
	
	//====================================================================================================================================
	protected String adminPassword = "java002$";	//-- �ʱ�ȭ��(A,12) �� ������ ��й�ȣ

	protected String bookNumber;	//-- ������� �޴����� ����ڰ� �Է��� ��(���Ź�ȣ) ������ ����
}