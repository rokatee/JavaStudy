/*==============================
  ■■■ 클래스 고급 ■■■
   - 인터페이스(Interface)
===============================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.


// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력(공백 구분) : 2207123 최최최
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2208225 박박박
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2207123 최최최    90 100 85    xxx xx.xx
//                   수  수 우
// 2208225 박박박    85 70 65     xxx xx.xx
//                   우 미 양

// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;
import java.io.IOException;

// 속성만 존재하는 클래스 → 자료형 활용
class Record_inter_1
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학
	int tot;				//-- 총점
	double avg;				//-- 평균
}


interface Sungjuk_inter_1
{
	public void set();		//-- 인원 세팅
	public void input();	//-- 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl_1 implements Sungjuk_inter_1
{
	private int inwon;
	private Record_inter_1[] rec;
	
	int score[][];
	char strRank[][];


	// 내부적으로 등급에 대한 판정을 수행할 메소드
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record_inter_1[inwon];
		score = new int[inwon][3];
		strRank = new char[inwon][3];

	}



	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i< inwon; i++)
		{
			rec[i] = new Record_inter_1();
				
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.printf("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			score[i][0] = rec[i].kor;
			score[i][1] = rec[i].eng;
            score[i][2] = rec[i].mat;

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0; 
		}

		System.out.println(); // 개행

		for(int i=0; i < inwon; i++)
		{
			for(int j=0; j < 3; j++)
			{
				if(score[i][j] == 100 || score[i][j] >= 90)
					strRank[i][j] = '수';
				else if(score[i][j] >= 80)
					strRank[i][j] = '우';
                else if(score[i][j] >= 70)
					strRank[i][j] = '미';
                else if(score[i][j] >= 60)
					strRank[i][j] = '양';
                else
					strRank[i][j] = '가';
                
			}
		}
	} // end input()




	@Override
	public void print()
	{
		for(int i=0; i< inwon; i++)
		{
			System.out.printf("%s %4s %4d %3d %3d \t %d %4.2f\n", 
				rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("\t\t  %2c %2c %2c\n",strRank[i][0], strRank[i][1], strRank[i][2]);
		}
	} // end print()

}



// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121_1
{
	public static void main(String[] args) throws IOException
	{

		Sungjuk_inter_1 ob;

		// 문제 해결과정에서 작성해야 할 ob 구성 및 객체 생성
		ob = new SungjukImpl_1();

		ob.set();
		ob.input();
		ob.print();

	}
}