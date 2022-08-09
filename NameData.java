import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

public class NameData
{
	// 관리자 주요 속성 구성
	protected static String tempTitle;		// 프로텍티드 테스트
	//protected static int tempGrade;		// 관리자가 입력할 관람등급
	//protected static int tempPlayTime;	// 관리자가 입력할 상영시간
	protected static int tempIndex = -1;	// 상영관에서 사용

	protected static Integer sel;
	protected static BufferedReader br;
	protected static Scanner sc;

	public static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;

	protected static MovieData[] screen;				// 각관에서 상영할 영화를 담을 배열

	protected MovieData[] movies = new MovieData[3];	// 등록할 영화 제목, 관람 등급, 러닝타임을 담을 배열

	//static int[] sTime = new int[3];					// 각 관의 스크린 타임 (관리자 지정)
	public int[] sTime = {120, 180, 240};				// 각 관의 스크린 타임 (고정: 2, 3, 4시간)

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};


	// 사용자 주요 변수
	//protected String p_id;		//-- 특정 동작을 수행하기 위한 process id 변수 선언
	protected int tempScreen;		//-- 사용자가 선택한 영화의 상영관 값
	protected int tempRound;		//-- 사용자가 선택한 영화의 회차 값
	protected int runTime;			//-- 영화별 러닝타임
	//protected Vector<String> reservedNum = new Vector<String>();	//-- 예매번호 생성 시(난수 발생 시) 사용할 벡터
	//public Vector<ReservedData> ud = new Vector<ReservedData>();	//-- 사용자 예매하기 완료 화면에서 입력한 값들(예매정보) 을 저장하는 벡터
	public static Vector<String> reservedNum;	//-- 예매번호 생성 시(난수 발생 시) 사용할 벡터
	public static Vector<ReservedData> ud;	//-- 사용자 예매하기 완료 화면에서 입력한 값들(예매정보) 을 저장하는 벡터

	//====================================================================================================================================
	protected String tempTime;		//-- 사용자가 선택한 시간 값
	//====================================================================================================================================

	// 좌석 선택 화면에서 사용하는 변수
	protected String tempSeat;		//-- 사용자가 선택한 자리
	protected int adult;			//-- 성인
	protected int teenager;			//-- 청소년
	protected int kid;				//-- 어린이
	protected int total;			//-- 총 인원 (선택한 성인 + 청소년 + 어린이 값)
	public static boolean[][][] seatInfos;	//-- 영화 회차당 좌석정보 [총 영화 상영 회차][행][열]
	
	//====================================================================================================================================
	protected String adminPassword = "java002$";	//-- 초기화면(A,12) 의 관리자 비밀번호
	protected String bookNumber;					//-- 예매취소 메뉴에서 사용자가 입력한 값(예매번호) 저장할 변수
	
	public void setScreen(MovieData[] m)
	{
		screen = m;
	}


	// static 초기화 블럭  m      
	static
	{
		// 좌석 정보 입력값 초기화
		seatInfos = new boolean[15][5][5];	//-- 영화 회차당 좌석정보 [총 영화 상영 회차][행][열]

		// 상영관 정보 입력값 초기화
		screen = new MovieData[3];

		// Vector 자료 구조 생성
		reservedNum = new Vector<String>();	//-- 예매번호 생성 시(난수 발생 시) 사용할 벡터
		ud = new Vector<ReservedData>();	//-- 사용자 예매하기 완료 화면에서 입력한 값들(예매정보) 을 저장하는 벡터
		vt = new Vector<MovieData>();
		//screen = new Vector<MovieData>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// Scanner 인스턴스 생성
		sc = new Scanner(System.in);

		// 사용자 입력값 초기화
		sel = 0;
	}
}

class ReservedData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String rvNumber;		//-- 예매번호
	private String title;			//-- 영화제목
	private String time;			//-- 시간
	private int screen;				//-- 상영관
	private String seatNumber;		//-- 좌석
	private int inwon;				//-- 인원


	// 예매번호 값 가져다 쓰기
	public String getRvNumber()
	{
		return rvNumber;
	}

	// 예매번호 값 세팅하고 저장하기
	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}

	// 영화 제목 값 가져다 쓰기
	public String getTitle()
	{
		return title;
	}

	// 영화 제목 값 세팅하고 저장하기
	public void setTitle(String title)
	{
		this.title = title;
	}


	// 시간 값 가져다 쓰기
	public String getTime()
	{
		return time;
	}

	// 시간 값 세팅하고 저장하기
	public void setTime(String time)
	{
		this.time = time;
	}


	// 상영관 값 가져다 쓰기
	public int getScreen()
	{
		return screen;
	}

	// 상영관 값 세팅하고 저장하기
	public void setScreen(int screen)
	{
		this.screen = screen;
	}


	// 인원 값 가져다 쓰기
	public int getInwon()
	{
		return inwon;
	}

	// 인원 값 세팅하고 저장하기
	public void setInwon(int inwon)
	{
		this.inwon = inwon;
	}

	
	// 좌석 값 가져다 쓰기
	public String getSeatNumber()
	{
		return seatNumber;
	}

	// 좌석 값 세팅하고 저장하기
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;		
	}
	

	// 사용자 정의 생성자 (매개변수: 예매번호, 영화 제목, 시간, 상영관, 인원, 좌석)
	public ReservedData(String rvNumber, String title, String time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;		// 예매번호
		this.title = title;				// 영화 제목
		this.time = time;				// 시간
		this.screen = screen;			// 상영관
		this.inwon = inwon;				// 인원
		this.seatNumber = seatNumber;	// 좌석

	}

	// 사용자 정의 생성자
	public ReservedData()
	{
		title = "";			// 영화 제목 초기화
		time = "";			// 시간 초기화
		screen = 0;			// 상영관 초기화
		seatNumber = "";	// 좌석 초기화
	}
	
	public String toString()
	{
		return "영화 제목: " + this.title + "시간: " + this.time + "상영관: " + this.screen + "좌석: " + this.seatNumber;
	}
	
}

 class MovieData
{
	// 영화 제목
	public String title;
	// 관람 등급
	public int grade;
	// 러닝타임
	public int playTime;

	// 생성자(매개변수 X)
	public MovieData() 
	{
		title = "";			// 영화 제목 초기화
		grade = 0;			// 관람등급 초기화
		playTime = 0;		// 상영시간 초기화
	}

	// 생성자(매개변수 : 영화제목, 관람등급, 상영시간)
	public MovieData(String title, int grade, int playTime)
	{
		super();
		this.title = title;			// 영화제목
		this.grade = grade;			// 관람등급
		this.playTime = playTime;	// 상영시간
	}
	
	// 영화제목 값 가져다 쓰기
	public String getTitle() 
	{
		return title;
	}
	
	// 영화제목 값 세팅하고 저장하기
	public void setTitle(String title) 
	{
		this.title = title;
	}

	// 관람등급 값 가져다 쓰기
	public int getGrade() 
	{
		return grade;
	}

	// 관람등급 값 세팅하고 저장하기
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}

	// 상영시간 값 가져다 쓰기
	public int getPlayTime() 
	{
		return playTime;
	}

	// 상영시간 값 세팅하고 저장하기
	public void setPlayTime(int playTime) 
	{
		this.playTime = playTime;
	}

	public String toString()
	{
		//return "Movie{ [num : "+this.num+"] [title : " +this.title +"] [grade : " + this.grade + "]  [playTime : " + this.playTime + "] }";
		return "영화 제목    : " +this.title +"\n관람 등급    : " + this.grade + "\n러닝타임(분) : " + this.playTime;
	}
}
