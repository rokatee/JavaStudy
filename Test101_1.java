/*
■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
*/

/*
학생별로 국어점수, 영어점수, 수학점수를 입력받아
총점 평균을 계산하는 프로그램을 구현한다
단, 클래스의 개념을 활용하여 작성할 수 있도록 한다
또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다
더불어, 접근 제한 지시자는 생략한다
클래스 설계는 다음의 가이드 라인에 따라 진행할 수 있도록 한다

[가이드라인]
프로그램을 구성하는 클래스

1. Record 클래스
	- 속성만 존재하는 클래스로 설계할 것 (변수만 있는 클래스)

2. Sungjuk 클래스
	- 인원 수를 입력받아, 입력받은 인원 수 만큼
	  이름, 국어점수, 영어점수, 수학점수를 입력받고
	  총점과 평균을 산출하는 클래스로 설계할 것
	  - 속성 : 인원수, Record 타입의 배열 ( Record[] rc; )
	  - 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

3. Test101 클래스
	- main() 메소드가 존재하는 외부 클래스로 설계할 것

실행 예)
인원수 입력(1~100) : 102
인원수 입력(1~100) : -10
인원수 입력(1~100) : 3

1번째 학생의 이름 입력 : 홍길동
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

2번째 학생의 이름 입력 : 최삼록
국어 점수 : 92
영어 점수 : 82
수학 점수 : 72

3번째 학생의 이름 입력 : 오영택
국어 점수 : 94
영어 점수 : 84
수학 점수 : 74

홍길동 90 80 70 240 xx.xx
최삼록 92 82 72 246 xx.xx
오영택 94 84 74 252 xx.xx

계속하려면....

*/
import java.util.Scanner;

public class Test101_1
{
	public static void main(String[] args)
	{
		//main클래스만 사용한 방법
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int stuNum;
		double avg = 0;
		String name;

		int rank;

		do
		{
			System.out.print("인원 수 입력 : ");
			stuNum = sc.nextInt();
		}
		while (stuNum < 0 || stuNum > 100);

		int[][] score = new int[stuNum][3];

		String[] nameArr = new String[stuNum];

		for(int i = 0; i < stuNum; i++)
		{
			//rc[i] = new Record();
			System.out.printf("%d번째 학생 이름 입력 : ", i+1);
			name = sc.next();
			System.out.print("국어 점수  : ");
			score[i][0] = sc.nextInt();
			System.out.print("영어 점수  : ");
			score[i][1] = sc.nextInt();
			System.out.print("수학 점수  : ");
			score[i][2] = sc.nextInt();

			nameArr[i] = name;
		}

		int[] totArr = new int[stuNum];
		double[] avgArr = new double[stuNum];

		for(int i = 0; i < stuNum; i++)
		{
			total = score[i][0] + score[i][1] + score[i][2];
			avg = total/3.0;

			totArr[i] = total;
			avgArr[i] = avg;
		}

		for(int i = 0; i < stuNum; i++)
			System.out.printf("이름: %s | 국: %d | 영: %d | 수: %d | 총: %d | 평: %.2f%n", nameArr[i], score[i][0], 
													score[i][1], score[i][2], totArr[i], avgArr[i]);
	}
}