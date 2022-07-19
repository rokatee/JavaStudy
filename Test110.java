/*
■■■ 정렬(Sort) 알고리즘 ■■■
*/

/*
○ 과제
	사용자로부터 여러 학생의 성적 데이터를 입력받아
	점수가 높은 학생부터 낮은 순으로 등수를 부여하여
	결과를 출력하는 프로그램을 구현한다
	단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다

실행 예)
인원 수 입력 : 5
이름, 점수 입력(1, 공백 구분) : 박명수 80
이름, 점수 입력(2, 공백 구분) : 정형돈 60
이름, 점수 입력(3, 공백 구분) : 정준하 70
이름, 점수 입력(4, 공백 구분) : 유재석 90
이름, 점수 입력(5, 공백 구분) :   하하 50


--------------
1등 유재석 90
2등 박명수 80
3등 정준하 70
4등 정형돈 60
5등   하하 50
--------------
계속하려면...
*/

import java.util.Scanner;

public class Test110
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int stuNum;			// 사용자가 입력한 학생 수를 담을 변수
		
		do					// 입력한 숫자가 1보다 작을 경우 계속 되묻기
		{
			System.out.print("인원 수 입력 : ");
			stuNum = sc.nextInt();
		}
		while (stuNum < 1);
		
		String[] name = new String[stuNum];		// 입력한 숫자만큼의 학생 이름을 담을 배열 변수
		int[] score = new int[stuNum];			// 입력한 숫자만큼의 학생 성적을 담을 배열 변수

		for (int i = 0; i < stuNum; i++)		// for문을 통해 각 인원수 만큼 이름과 점수 입력
		{
			System.out.printf("이름, 점수 입력(%d, 공백 구분) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
		
		boolean flag;				
		int pass = 0;		
		String temp;		// 점수 순위가 바뀔 때 낮은 순위와 높은 순위의 이름을 바꾸기 위해 사용될 임시 공간(?)
							
		// 웅~~
		do
		{
			flag = false;
			pass++;
		
			// 숑숑~~
			for (int i = 0; i < stuNum-pass; i++)
			{
				// 테스트
				//System.out.println("숑숑~~~");


				if (score[i] < score[i+1])
				{
					score[i] = score[i] ^ score[i+1];				// 점수 비교해서 순위 바꾸기
					score[i+1] = score[i+1] ^ score[i];
					score[i] = score[i] ^ score[i+1];

					temp = name[i];									// 순위가 바뀐다면
					name[i] = name[i+1];							// i번째 이름과 i+1번째의 위치를 바꾸기 위함
					name[i+1] = temp;

					flag = true;
				}
			}
		}
		while (flag);

		System.out.println("--------------");
		for (int i = 0; i < stuNum; i++)
		{
			System.out.printf("%2d등 %2s %4d\n", i+1, name[i], score[i]);
		}
		System.out.println("--------------");
	}
}

/*
실행 결과

인원 수 입력 : 5
이름, 점수 입력(1, 공백 구분) : 유재석 50
이름, 점수 입력(2, 공백 구분) : 박명수 90
이름, 점수 입력(3, 공백 구분) : 정준하 70
이름, 점수 입력(4, 공백 구분) : 정형돈 60
이름, 점수 입력(5, 공백 구분) : 노홍철 20
--------------
 1등 박명수   90
 2등 정준하   70
 3등 정형돈   60
 4등 유재석   50
 5등 노홍철   20
--------------
계속하려면 아무 키나 누르십시오 . . .
*/