import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;
import java.util.Iterator;

class NameData
{
	// �ֿ� �Ӽ� ����
	public static String tempTitle;
	public static int tempGrade;
	public static int tempPlayTime;
	public static int tempIndex = -1;

	public static Integer sel;
	public static BufferedReader br;
	public static Scanner sc;

	public static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;

	static MovieData[] screen = new MovieData[3];	// �������� ���� ��ȭ�� ���� �迭
	
	static MovieData[] movies = new MovieData[1];	// ����� ��ȭ ����, ���� ���, ����Ÿ���� ���� �迭

	//static int[] sTime = new int[3];				// �� ���� ��ũ�� Ÿ�� (������ ����)
	static int[] sTime = {120, 180, 240};			// �� ���� ��ũ�� Ÿ�� (����: 2, 3, 4�ð�)

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

	// static �ʱ�ȭ ��  m      
	 
	  

	static
	{
		// Vector �ڷ� ���� ����
		vt = new Vector<MovieData>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// Scanner �ν��Ͻ� ����
		sc = new Scanner(System.in);

		// ����� �Է°� �ʱ�ȭ
		sel = 0;
	}
}

public class MovieData
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
		return "��ȭ ����    : " +this.title +"\n���� ���    : " + this.grade + "\n����Ÿ��(��) : " + this.playTime;
	}
}
