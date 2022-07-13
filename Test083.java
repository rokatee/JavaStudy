/*
■■■ 배열 ■■■ 
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
*/

/*
<<과제>>
사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다
단, 배열을 활용하여 구현할 수 있도록 한다

실행 예)
입력할 데이터의 갯수	: 5
데이터 입력(공백 구분)	: 3 98 13 76 54

>> 가장 큰 수 → 98
계속하려면...
*/

import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;		// 사용자가 입력할 데이터의 갯수를 담을 변수

		System.out.print("입력할 데이터의 갯수 : ");
		num = sc.nextInt();

		int[] arr = new int[num];	//사용자가 입력할 데이터 배열을 담을 변수
		System.out.print("데이터 입력(공백 구분) : ");

		for (int i = 0; i < arr.length; i++)	//입력한 데이터 배열
		{
			arr[i] = sc.nextInt();

			// 테스트
			//System.out.println(arr[i]);
		}
		
		int max = arr[0];						// 배열의 첫번째 수를 기준으로 잡는다
		
		for (int j = 0; j < arr.length; j++)	
		{
			if (max < arr[j])					// 첫번째 수보다 큰 배열의 수가 있다면 
			{
				max = arr[j];					// 그 수가 max에 담기면서
			}									// 배열에 있는 모든 수가 서로 크기 비교를 함
		}
		System.out.printf("가장 큰 수 : %d\n", max);
	}
}

/*
실행 결과

입력할 데이터의 갯수 : 3
데이터 입력(공백 구분) : 1 3 2
가장 큰 수 : 3
계속하려면 아무 키나 누르십시오 . . .

*/