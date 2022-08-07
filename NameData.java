import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

public class NameData
{
	// ������ �ֿ� �Ӽ� ����
	public static String tempTitle;	// ������Ƽ�� �׽�Ʈ
	public static int tempGrade;
	public static int tempPlayTime;
	public static int tempIndex = -1;

	public static Integer sel;
	public static BufferedReader br;
	public static Scanner sc;

	public static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;

	static MovieData[] screen = new MovieData[3];	// �������� ���� ��ȭ�� ���� �迭

	static MovieData[] movies = new MovieData[3];	// ����� ��ȭ ����, ���� ���, ����Ÿ���� ���� �迭

	//static int[] sTime = new int[3];				// �� ���� ��ũ�� Ÿ�� (������ ����)
	static int[] sTime = {120, 180, 240};			// �� ���� ��ũ�� Ÿ�� (����: 2, 3, 4�ð�)

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};


	// ����� �ֿ� ����
	//protected String p_id;		//-- Ư�� ������ �����ϱ� ���� process id ���� ����
	protected int tempScreen;		//-- ����ڰ� ������ ��ȭ�� �󿵰� ��
	protected int tempRound;		//-- ����ڰ� ������ ��ȭ�� ȸ�� ��
	protected int runTime;			//-- ��ȭ�� ����Ÿ��
	protected Vector<String> reservedNum = new Vector<String>();	//-- ���Ź�ȣ ���� ��(���� �߻� ��) ����� ����
	public Vector<ReservedData> ud = new Vector<ReservedData>();	//-- ����� �����ϱ� �Ϸ� ȭ�鿡�� �Է��� ����(��������) �� �����ϴ� ����

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
	
	public void setScreen(MovieData[] m)
	{
		screen = m;
	}


	// static �ʱ�ȭ ��  m      
	static
	{
		// Vector �ڷ� ���� ����
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
		title = "";
		grade = 0;
		playTime = 0;
	}

	// ������(�Ű����� 3��)
	public MovieData(String title, int grade, int playTime)
	{
		super();
		this.title = title;
		this.grade = grade;
		this.playTime = playTime;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public int getGrade() 
	{
		return grade;
	}

	public void setGrade(int grade) 
	{
		this.grade = grade;
	}

	public int getPlayTime() 
	{
		return playTime;
	}

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
