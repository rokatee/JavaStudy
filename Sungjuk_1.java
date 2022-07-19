import java.util.Scanner;

public class Sungjuk_1
{
	// 주요 속성 구성
	int inwon;			// 인원 수
	Record_1[] rec;		// Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
						// Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열
	
	// 주요 메소드 정의(기능 구성)
	// 1. 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 100);

		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것일 뿐,
		// Record 클래스의 인스턴스를 생성한 건 아님.
		// (객체들이 담겨있는 게 아니라 빈그릇임)
		rec = new Record_1[inwon];
	}
	
	// 2. 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
		
		
		// 인원 수 만큼 반복 → 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i = 0; i < inwon; i++)		// → for (int i = 0; i < rec.length; i++)
		{
			// Record 클래스 기반의 인스턴스 생성
			// 27번에서 만든 빈그릇을 여기서 사용하면 됨
			// 인원 수 만큼 돌면서 Record 객체를 돌려야 이름, 성적이 각각 들어감.
			rec[i] = new Record_1();
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			rec[i].name = sc.next();
			
			/*
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();
			*/
			// → 위의 3개가 유사한 문법이므로 하나로 묶자!!
			for (int j = 0; j < title.length; j++)
			{
				// 안내 메세지 출력
				System.out.print(title[j]);

				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				rec[i].score[j] = sc.nextInt();		// score[0] → 국어점수
													// score[1] → 영어점수
													// score[2] → 수학점수

				// 국, 영, 수 점수 데이터를 반복적으로 입력받는 동안
				// 총점에 대한 누적 산출
				rec[i].tot += rec[i].score[j];
				// tot는 전역변수이므로 0으로 초기화 되어 있다
			}

			// 평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;

		} // end outer for

	} // end input()
	
	// 3. 결과 출력
	public void print()
	{
		// 내부 석차 산출 메소드 호출
		ranking();
		// 개행
		System.out.println();
		
		// 학생 한 명 당 반복 출력 구문 구성
		for (int i = 0; i < inwon; i++)		// → for (int i = 0; i < rec.length; i++)
		{
			// 이름 출력
			System.out.printf("%5s", rec[i].name);

			// 성적(국 영 수) 반복 출력
			for (int j = 0; j < 3; j++)
				System.out.printf("%4d", rec[i].score[j]);

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			// 석차 출력 구문 추가
			System.out.printf("%5d", rec[i].rank);

			// 개행
			System.out.println();
 		}
	}
	
	// 4. 석차 산출 메소드 추가
	//	  - 산출 과정에서 연산에 필요한 데이터가 이미 존재하는 상황 → 매개변수 (넘겨줄 필요) 없음
	//	  - Record 배열의 rank 속성 초기화 기능 수행 → 반환 자료형 → void
	//	  - 클래스 내부에서 활용할 메소드로 정의 → 접근 제어 지시자 private
	private void ranking()
	{
		// 모든 학생들의 등수(석차, rank)를 1로 초기화
		for (int i = 0; i < inwon; i++)
		{
			rec[i].rank = 1;
		}

		// 등수 산출 → 5명을 예로 들면...
		for (int i = 0; i < inwon - 1; i++)			// 웅 → 비교기준 → 0			1		2		3
		{											// 마지막 사람은 비교 기준이 되지 않기에..
			for (int j = i+1; j < inwon; j++)		// 숑 → 비교대상 → 1 2 3 4	2 3 4	3 4		4
			{
				// 비교기준의 평균이 비교대상의 평균보다 크다면
				if (rec[i].avg > rec[j].avg)
				{
					// 비교대상의 rank를 1만큼 증가
					rec[j].rank++;
				}
				// 비교대상의 평균이 비교기준의 평균보다 크다면
				else if (rec[i].avg < rec[j].avg)
				{
					// 비교기준의 rank를 1만큼 증가
					rec[i].rank++;
				}
			}
		} // 여기까지 석차 산출 연산식 끝냈으니 print()가서 출력문 추가해줘라 → 102번 줄
	}
}
