/*
■■■ 자바의 개요 및 특징 ■■■
	- 자바 기본 입출력 : System.util.Scanner
*/

/*
<java.util.Scanner>

단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
디폴트(default)로 사용되는 단락문자는 공백이다
작성된 다음 토큰은 next() 메소드를 사용
다른 형태(자료형)의 값으로 변환할 수 있다

*/

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		//Scanner는 InputStreamReader 라는 번역기는 필요 없다

		// Scanner가 BufferedReader 보다 좋다면 BufferedReader는 필요 없는가?
		// 답은 NO!
		// BufferedReader 보다 Scanner가 기능이 더 많지만
		// 간단한 BufferedReader가 성능은 더 좋다
		// BufferedReader는 문자 입력을 읽어들이는 기능 하나만 가지고 있기 때문

		// 주요 변수 선언
		String name;
		int kor, eng, mat;

		// 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();									// 공백 기준으로 문자열을 파악하여 분할해서 가져오므로
															// 단어 하나 가져오고 기다렸다가 다음 단어를 가져오기에
															// next() 를 쓴다고 이해하면 됨.

		// 테스트(확인)
		//System.out.println("입력한 이름 : " + name);
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();									// Interger.parseInt(br.readLine()) 와 같은 기능
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		// 최종 결과 출력

		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		//System.out.println("총점 : " + kor + eng + mat);	// 이렇게 하면 문자를 나열해 출력함
															// Scanner 는 문자열을 가져오기 때문
		System.out.println("총점 : " + (kor + eng + mat));	// 우선 순위에 의해 덧셈을 먼저 함
		
	}

}


/*
실행 결과

이름을 입력하세요 : 김인교
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

이름 : 김인교
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/