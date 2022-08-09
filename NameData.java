import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

public class NameData
{
	// ������ �ֿ� �Ӽ� ����
	protected static String tempTitle;		// ������Ƽ�� �׽�Ʈ
	//protected static int tempGrade;		// �����ڰ� �Է��� �������
	//protected static int tempPlayTime;	// �����ڰ� �Է��� �󿵽ð�
	protected static int tempIndex = -1;	// �󿵰����� ���

	protected static Integer sel;
	protected static BufferedReader br;
	protected static Scanner sc;

	public static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;

	protected static MovieData[] screen;				// �������� ���� ��ȭ�� ���� �迭

	protected MovieData[] movies = new MovieData[3];	// ����� ��ȭ ����, ���� ���, ����Ÿ���� ���� �迭

	//static int[] sTime = new int[3];					// �� ���� ��ũ�� Ÿ�� (������ ����)
	public int[] sTime = {120, 180, 240};				// �� ���� ��ũ�� Ÿ�� (����: 2, 3, 4�ð�)

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};


	// ����� �ֿ� ����
	//protected String p_id;		//-- Ư�� ������ �����ϱ� ���� process id ���� ����
	protected int tempScreen;		//-- ����ڰ� ������ ��ȭ�� �󿵰� ��
	protected int tempRound;		//-- ����ڰ� ������ ��ȭ�� ȸ�� ��
	protected int runTime;			//-- ��ȭ�� ����Ÿ��
	//protected Vector<String> reservedNum = new Vector<String>();	//-- ���Ź�ȣ ���� ��(���� �߻� ��) ����� ����
	//public Vector<ReservedData> ud = new Vector<ReservedData>();	//-- ����� �����ϱ� �Ϸ� ȭ�鿡�� �Է��� ����(��������) �� �����ϴ� ����
	public static Vector<String> reservedNum;	//-- ���Ź�ȣ ���� ��(���� �߻� ��) ����� ����
	public static Vector<ReservedData> ud;	//-- ����� �����ϱ� �Ϸ� ȭ�鿡�� �Է��� ����(��������) �� �����ϴ� ����

	//====================================================================================================================================
	protected String tempTime;		//-- ����ڰ� ������ �ð� ��
	//====================================================================================================================================

	// �¼� ���� ȭ�鿡�� ����ϴ� ����
	protected String tempSeat;		//-- ����ڰ� ������ �ڸ�
	protected int adult;			//-- ����
	protected int teenager;			//-- û�ҳ�
	protected int kid;				//-- ���
	protected int total;			//-- �� �ο� (������ ���� + û�ҳ� + ��� ��)
	public static boolean[][][] seatInfos;	//-- ��ȭ ȸ���� �¼����� [�� ��ȭ �� ȸ��][��][��]
	
	//====================================================================================================================================
	protected String adminPassword = "java002$";	//-- �ʱ�ȭ��(A,12) �� ������ ��й�ȣ
	protected String bookNumber;					//-- ������� �޴����� ����ڰ� �Է��� ��(���Ź�ȣ) ������ ����
	
	public void setScreen(MovieData[] m)
	{
		screen = m;
	}


	// static �ʱ�ȭ ��  m      
	static
	{
		// �¼� ���� �Է°� �ʱ�ȭ
		seatInfos = new boolean[15][5][5];	//-- ��ȭ ȸ���� �¼����� [�� ��ȭ �� ȸ��][��][��]

		// �󿵰� ���� �Է°� �ʱ�ȭ
		screen = new MovieData[3];

		// Vector �ڷ� ���� ����
		reservedNum = new Vector<String>();	//-- ���Ź�ȣ ���� ��(���� �߻� ��) ����� ����
		ud = new Vector<ReservedData>();	//-- ����� �����ϱ� �Ϸ� ȭ�鿡�� �Է��� ����(��������) �� �����ϴ� ����
		vt = new Vector<MovieData>();
		//screen = new Vector<MovieData>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// Scanner �ν��Ͻ� ����
		sc = new Scanner(System.in);

		// ����� �Է°� �ʱ�ȭ
		sel = 0;
	}
}

class ReservedData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String rvNumber;		//-- ���Ź�ȣ
	private String title;			//-- ��ȭ����
	private String time;			//-- �ð�
	private int screen;				//-- �󿵰�
	private String seatNumber;		//-- �¼�
	private int inwon;				//-- �ο�


	// ���Ź�ȣ �� ������ ����
	public String getRvNumber()
	{
		return rvNumber;
	}

	// ���Ź�ȣ �� �����ϰ� �����ϱ�
	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}

	// ��ȭ ���� �� ������ ����
	public String getTitle()
	{
		return title;
	}

	// ��ȭ ���� �� �����ϰ� �����ϱ�
	public void setTitle(String title)
	{
		this.title = title;
	}


	// �ð� �� ������ ����
	public String getTime()
	{
		return time;
	}

	// �ð� �� �����ϰ� �����ϱ�
	public void setTime(String time)
	{
		this.time = time;
	}


	// �󿵰� �� ������ ����
	public int getScreen()
	{
		return screen;
	}

	// �󿵰� �� �����ϰ� �����ϱ�
	public void setScreen(int screen)
	{
		this.screen = screen;
	}


	// �ο� �� ������ ����
	public int getInwon()
	{
		return inwon;
	}

	// �ο� �� �����ϰ� �����ϱ�
	public void setInwon(int inwon)
	{
		this.inwon = inwon;
	}

	
	// �¼� �� ������ ����
	public String getSeatNumber()
	{
		return seatNumber;
	}

	// �¼� �� �����ϰ� �����ϱ�
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;		
	}
	

	// ����� ���� ������ (�Ű�����: ���Ź�ȣ, ��ȭ ����, �ð�, �󿵰�, �ο�, �¼�)
	public ReservedData(String rvNumber, String title, String time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;		// ���Ź�ȣ
		this.title = title;				// ��ȭ ����
		this.time = time;				// �ð�
		this.screen = screen;			// �󿵰�
		this.inwon = inwon;				// �ο�
		this.seatNumber = seatNumber;	// �¼�

	}

	// ����� ���� ������
	public ReservedData()
	{
		title = "";			// ��ȭ ���� �ʱ�ȭ
		time = "";			// �ð� �ʱ�ȭ
		screen = 0;			// �󿵰� �ʱ�ȭ
		seatNumber = "";	// �¼� �ʱ�ȭ
	}
	
	public String toString()
	{
		return "��ȭ ����: " + this.title + "�ð�: " + this.time + "�󿵰�: " + this.screen + "�¼�: " + this.seatNumber;
	}
	
}

 class MovieData
{
	// ��ȭ ����
	public String title;
	// ���� ���
	public int grade;
	// ����Ÿ��
	public int playTime;

	// ������(�Ű����� X)
	public MovieData() 
	{
		title = "";			// ��ȭ ���� �ʱ�ȭ
		grade = 0;			// ������� �ʱ�ȭ
		playTime = 0;		// �󿵽ð� �ʱ�ȭ
	}

	// ������(�Ű����� : ��ȭ����, �������, �󿵽ð�)
	public MovieData(String title, int grade, int playTime)
	{
		super();
		this.title = title;			// ��ȭ����
		this.grade = grade;			// �������
		this.playTime = playTime;	// �󿵽ð�
	}
	
	// ��ȭ���� �� ������ ����
	public String getTitle() 
	{
		return title;
	}
	
	// ��ȭ���� �� �����ϰ� �����ϱ�
	public void setTitle(String title) 
	{
		this.title = title;
	}

	// ������� �� ������ ����
	public int getGrade() 
	{
		return grade;
	}

	// ������� �� �����ϰ� �����ϱ�
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}

	// �󿵽ð� �� ������ ����
	public int getPlayTime() 
	{
		return playTime;
	}

	// �󿵽ð� �� �����ϰ� �����ϱ�
	public void setPlayTime(int playTime) 
	{
		this.playTime = playTime;
	}

	public String toString()
	{
		//return "Movie{ [num : "+this.num+"] [title : " +this.title +"] [grade : " + this.grade + "]  [playTime : " + this.playTime + "] }";
		return "��ȭ ����    : " +this.title +"\n���� ���    : " + this.grade + "\n����Ÿ��(��) : " + this.playTime;
	}
}
