import java.util.Scanner;

public class Sungjuk
{

	int stuNum;								// 사용자 입력 학생 수
	Record[] rc;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력 : ");
			stuNum = sc.nextInt();
		}
		while (stuNum < 1 || stuNum > 100);

		rc = new Record[stuNum];

		for(int i = 0; i < stuNum; i++)
		{
			rc[i] = new Record();
			System.out.printf("%d번째 학생 이름 입력 : ", i+1);
			rc[i].name = sc.next();
			System.out.print("국어 점수  : ");
			rc[i].score[0] = sc.nextInt();
			System.out.print("영어 점수  : ");
			rc[i].score[1] = sc.nextInt();
			System.out.print("수학 점수  : ");
			rc[i].score[2] = sc.nextInt();
		}
	}

	void calScore()
	{
		for(int i = 0; i < stuNum; i++)
		{
			rc[i].total = rc[i].score[0] + rc[i].score[1] + rc[i].score[2];
			rc[i].avg = rc[i].total/3.0;
		}
	}
	
	void print()
	{
		for(int i = 0; i < stuNum; i++)
			System.out.printf("%5s %4d %4d %4d %5d %4.2f%n", rc[i].name, rc[i].score[0], 
													rc[i].score[1], rc[i].score[2], rc[i].total, rc[i].avg);
	}

}