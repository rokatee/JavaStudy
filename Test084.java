/*
■■■ 배열 ■■■ 
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
*/

/*
<<과제>>
사용자로부터 임의의 학생 수를 입력받고
그만큼의 점수(정수 형태)를 입력받아
전체 학생 점수의 합, 평균, 편차를 구해서
결과를 출력하는 프로그램을 구현한다

실행 예)
학생 수 입력 : 3
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64

>> 합   : 236
>> 평균 : 78.67
>> 편차
1번 학생의 점수 : 90 / 편차 : -11.33
2번 학생의 점수 : 82 / 편차 : -3.33
3번 학생의 점수 : 64 / 편차 : 14.67

계속하려면...
*/

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int stuNum;								// 입력된 학생 수를 담을 변수

		System.out.print("학생 수 입력 : ");
		stuNum = sc.nextInt();
		
		int[] arr = new int[stuNum];			// 입력된 학생 수가 담길 배열

		for (int i = 0; i < arr.length; i++)	// 배열에 담긴 학생 수만큼 점수를 입력할 반복문
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			arr[i] = sc.nextInt();
		}
		// 테스트
		//System.out.println(arr[0]);

		int sum = 0;							// 누적합을 담을 변수
		
		for (int j = 0; j < arr.length; j++)	// 누적합 반복문
		{
			sum += arr[j];
			// 테스트
			//System.out.println(arr[j]);
		}
		System.out.printf(">> 합	: %d\n", sum);

		double avg;								// 평균을 담을 변수
		avg = (double)sum / stuNum;				// 평균 연산식
		//avg = (double)sum / arr.length;
		System.out.printf(">> 평균	: %.2f\n", avg);

		System.out.println(">> 편차");

		double[] arr1 = new double[stuNum];		// 편차를 담을 배열을 선언
		
		double deviation;						// 편차를 담을 변수
		for (int k = 0; k < arr1.length; k++)	
		{
			//편차 = 평균 - 학생 점수	
			arr1[k] = avg - arr[k];
		}
		for (int l = 0; l < arr.length; l++)	// 입력된 학생들의 평균과 편차 반복문
		{
			System.out.printf("%d번 학생의 점수 : %d / 편차 : %.2f\n", l+1, arr[l], arr1[l]);
		}
	}
}

/*
실행 결과

학생 수 입력 : 3
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64

>> 합   : 236
>> 평균 : 78.67
>> 편차
1번 학생의 점수 : 90 / 편차 : -11.33
2번 학생의 점수 : 82 / 편차 : -3.33
3번 학생의 점수 : 64 / 편차 : 14.67

계속하려면 아무 키나 누르십시오 . . .

*/