import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

class NameData
{
	// 주요 속성 구성
	public static String tempTitle;
	public static int tempGrade;
	public static int tempPlayTime;
	public static int tempIndex = -1;

	public static Integer sel;
	public static BufferedReader br;
	public static Scanner sc;

	public static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;

	static MovieData[] screen = new MovieData[3];	// 각관에서 상영할 영화를 담을 배열
	
	static MovieData[] movies = new MovieData[1];	// 등록할 영화 제목, 관람 등급, 러닝타임을 담을 배열

	//static int[] sTime = new int[3];				// 각 관의 스크린 타임 (관리자 지정)
	static int[] sTime = {120, 180, 240};			// 각 관의 스크린 타임 (고정: 2, 3, 4시간)

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

	// static 초기화 블럭  m      
	 
	  

	static
	{
		// Vector 자료 구조 생성
		vt = new Vector<MovieData>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// Scanner 인스턴스 생성
		sc = new Scanner(System.in);

		// 사용자 입력값 초기화
		sel = 0;
	}
}

public class MovieData
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
		title = "";
		grade = 0;
		playTime = 0;
	}

	// 생성자(매개변수 3개)
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
		return "영화 제목    : " +this.title +"\n관람 등급    : " + this.grade + "\n러닝타임(분) : " + this.playTime;
	}
}
