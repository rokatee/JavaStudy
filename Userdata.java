import java.util.Vector;
import java.util.Iterator;

class UserData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String rvNumber;		//-- 예매번호
	private String title;			//-- 영화제목
	private int time;				//-- 영화 시간
	private int screen;				//-- 상영관
	private String seatNumber;		//-- 좌석번호
	private int inwon;

	public String getRvNumber()	// 예매번호
	{
		return rvNumber;
	}

	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}

	public String getTitle()	// 영화 제목 값 가져다 쓸때
	{
		return title;
	}

	public void setTitle(String title)	// 영화 제목 값 세팅할때/저장할때
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
	
	// 생성자(매개변수 5개인 생성자) 예매번호, 제목, 시간, 상영관, 좌석→ 사용자 정의 생성자
	public UserData(String rvNumber, String title, int time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;
		this.title = title;
		this.time = time;
		this.screen = screen;
		this.inwon = inwon;
		this.seatNumber = seatNumber;

	}

	// 생성자(매개변수 없는 생성자) → 사용자 정의 생성자
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
		return "영화제목: " + this.title + "영화시간" + this.time + "상영관" + this.screen + "좌석 : " + this.seatNumber;
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
