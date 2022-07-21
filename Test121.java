/*
■■■ 클래스 고급 ■■■
	- 인터페이스(Interface)
*/

/*
○ 실습 문제

성적 처리 프로그램을 구현한다
단, 인터페이스를 활용할 수 있도록 한다

실행 예)

인원 수 입력(1 ~ 10) : 11
인원 수 입력(1 ~ 10) : 0
인원 수 입력(1 ~ 10) : 2

1번째 학생의 학번 이름 입력(공백 구분) : 2207123 유재석
국어 영어 수학 점수 입력   (공백 구분) : 90 100 85

2번째 학생의 학번 이름 입력(공백 구분) : 2208456 박명수
국어 영어 수학 점수 입력   (공백 구분) : 85 70 65


2207123 유재석   90  100  85   총점xxx  평균xxx
				 수   수  우	
2208456 박명수   85   70  65	xxx		xxx
				 우	  미  양

계속하려면...

속성만 존재하는 클래스 → 자료형 활용

*/

import java.util.Scanner;

class Record_inter
{
	String hak, name;		// 학번, 이름
	int kor, eng, mat;		// 국 영 수 점수
	int tot;				// 총점
	double avg;				// 평균
	//int[] jumsu = new int[3];
}

//인터페이스
interface Sungjuk_inter
{
	public void set();		// 인원 세팅
	public void input();	// 데이터 입력
	public void print();	// 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk_inter
{
	private int inwon;
	private Record_inter[] rec;
	

	@Override
	public void set()
	{

		// 테스트
		//System.out.println("set()...");
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1 ~ 10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record_inter[inwon];
	}

	@Override
	public void input()
	{
		// 테스트
		//System.out.println("input()...");
		
		Scanner sc = new Scanner(System.in);

		//String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		for (int i = 0; i < inwon; i++)
		{
			rec[i] = new Record_inter();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.printf("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
			
			/*
			for (int j = 0; j < title.length; j++)
			{
				System.out.print(title[j]);

				rec[i].jumsu[j] = sc.nextInt();

				rec[i].tot += rec[i].jumsu[j];
			}

			rec[i].avg = rec[i].tot / 3.0;
			*/
		}
	}

	@Override
	public void print()
	{
		// 테스트
		//System.out.println("print()...");

		for (int i = 0; i < inwon; i++)
		{
			System.out.printf("%2s %2s %3d %3d %3d %4d  %4.2f\n"
					, rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("\t %10s %2s %2s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));

			/*
			System.out.printf("%2s %2s", rec[i].hak, rec[i].name);

			for (int j = 0; j < 3; j++)
			{
				System.out.printf("%3d", rec[i].jumsu[j]);
			}
			
			System.out.printf("%4d %4.2f", rec[i].tot, rec[i].avg);
			*/
		}
	}

	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		String grade;

		if (score >= 90)
			grade = "수";
		else if (score >= 80)
			grade = "우";
		else if (score >= 70)
			grade = "미";
		else if (score >= 60)
			grade = "양";
		else
			grade = "가";
		return grade;
	}
}

// main() 메소드 포함하는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		//SungjukImpl ob1 = new SungjukImpl();
		//Sungjuk_inter ob;
		//ob = ob1;		// → ob = (Sungjuk_inter)ob1; → 앞에 괄호가 없어도 되는 이유는 하위에서 상위로 가는 것이기 때문
		//	↓ 한줄로 바꾸면?
		Sungjuk_inter ob = new SungjukImpl();


		// 문제 해결 과정에서 작성해야할 ob 구성 및 객체 생성
		ob.set();
		ob.input();
		ob.print();
	}
}