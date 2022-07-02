/*
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 자바 기본 입출력 : BufferedReader 클래스
*/

/*
사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
이름과 총점을 출력하는 프로그램을 구현한다.

실행 예)
이름을 입력하세요 : 홍길동
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 홍길동
총점 : 240
계속하려면 아무 키나 누르세요....!

*/

/*
문제 인식 및 분석
1. 이름, 국어, 영어, 수학을 사용자에게 입력요구
2. 국영수 모두 더해 총점 수식
3. 결과 도출로 총점과 이름 나타나게 하기
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언 
		InputStreamReader isr = new InputStreamReader(System.in);		//isr은 InputStreamReader로 선언
		BufferedReader br = new BufferedReader(isr);					//isr을 BufferedReader 매개변수에 넣어
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strName, strTemp;					// 이름 변수
		int nKor, nEng, nMat, nTot, nAve;		// 국, 영, 수, 총점, 평균 점수 변수

		// 연산 및 처리
			
			//프로그램 명
			System.out.println("■■■성적표■■■");

			//이름
			// 사용자에게 입력을 요구
			System.out.print("이름을 입력하세요 : ");
			//입력 대기열에 문자열(외부 데이터)을 불러와 변수에 넣기
			strName = br.readLine();
			
			//국어
			// 사용자에게 입력을 요구
			System.out.print("국어 점수 입력 : ");
			//입력 대기열에 문자열을 불러와 정수로 변환하여 변수에 넣기
			strTemp = br.readLine();
			nKor = Integer.parseInt(strTemp);
			//nKor = Integer.parseInt(br.readLine());

			//영어
			// 사용자에게 입력을 요구
			System.out.print("영어 점수 입력 : ");
			//입력 대기열에 문자열을 불러와 정수로 변환하여 변수에 넣기
			nEng = Integer.parseInt(br.readLine());

			//수학
			// 사용자에게 입력을 요구
			System.out.print("수학 점수 입력 : ");
			//입력 대기열에 문자열을 불러와 정수로 변환하여 변수에 넣기
			nMat = Integer.parseInt(br.readLine());


			//총점 공식
			nTot = nKor + nEng + nMat;
			nAve = (nKor + nEng + nMat) / 3;



		// 결과 출력
			System.out.println("\n====[결과]====");
			//System.out.println("이름 : " + strName);
			System.out.printf("이름 : %s%n", strName);	// %s 는 문자형 서식 지정 옵션
			System.out.printf("총점 : %d%n", nTot);
			System.out.printf("평균 : %d%n", nAve);

	}
}


/*
■■■성적표■■■
이름을 입력하세요 : 김인교
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 김인교
총점 : 240
평균 : 80
*/