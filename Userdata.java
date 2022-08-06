import java.util.Vector;
import java.util.Iterator;

class UserData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String rvNumber;		//-- ���Ź�ȣ
	private String title;			//-- ��ȭ����
	private int time;				//-- ��ȭ �ð�
	private int screen;				//-- �󿵰�
	private String seatNumber;		//-- �¼���ȣ
	private int inwon;

	public String getRvNumber()	// ���Ź�ȣ
	{
		return rvNumber;
	}

	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}

	public String getTitle()	// ��ȭ ���� �� ������ ����
	{
		return title;
	}

	public void setTitle(String title)	// ��ȭ ���� �� �����Ҷ�/�����Ҷ�
	{
		this.title = title;
	}

	public int getTime()
	{
		return time;
	}

	public void setTitle(int time)
	{
		this.time = time;
	}

	public int getScreen()
	{
		return screen;
	}

	public void setScreen(int screen)
	{
		this.screen = screen;
	}

	public int getInwon()
	{
		return inwon;
	}

	public void setInwon(int inwon)
	{
		this.inwon = inwon;
	}

	public String getSeatNumber()
	{
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;		
	}
	
	// ������(�Ű����� 5���� ������) ���Ź�ȣ, ����, �ð�, �󿵰�, �¼��� ����� ���� ������
	public UserData(String rvNumber, String title, int time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;
		this.title = title;
		this.time = time;
		this.screen = screen;
		this.inwon = inwon;
		this.seatNumber = seatNumber;

	}

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public UserData()
	{
		//this("", 0);
		//reservNumber = "";
		title = "";
		time = 0;
		screen = 0;
		seatNumber = "";
	}
	
	
	public String toString()
	{
		//return "Movie{ [num : "+this.num+"] [title : " +this.title +"] [grade : " + this.grade + "]  [playTime : " + this.playTime + "] }";
		return "��ȭ����: " + this.title + "��ȭ�ð�" + this.time + "�󿵰�" + this.screen + "�¼� : " + this.seatNumber;
	}
	
}

/*

public class Userdata
{
	public static void main(String[] args)
	{
		
	}
}
*/
