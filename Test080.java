/*
■■■ 배열 ■■■ 
	- 배열의 기본적 활용
*/

/*
임의의 정수들이 들어있는 배열의 숫자 데이터들 중
짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
프로그램을 구현한다

배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

실행 예)
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8

짝수 선택적 출력
4 2 6 8

3의 배수 선택적 출력
9 3 6

계속하려면...
*/

public class Test080
{
	public static void main(String[] args)
	{
		// 배열 선언 및 메모리 할당
		// 방법 1
		//int[] arr = new int[9];
		//arr[0] = 4;
		//arr[1] = 7;
		//arr[2] = 8;
		//arr[3] = 1;
		//arr[4] = 3;
		//arr[5] = 2;
		//arr[6] = 5;
		//arr[7] = 6;
		//arr[8] = 8;

		// 방법 2
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		//System.out.println(arr);
		// → [I@15db9742
		// 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		// 배열에 담긴 데이터들을 출력할 수 없다.

		System.out.println("배열의 길이(갯수) : " + arr.length + "\n");
		// → 배열 arr의 길이(방의 갯수) 확인
		//	  arr.length

		// 연산 및 처리
		System.out.println("배열 요소 전체 출력");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i = 0; i < arr.length; i++)
		{
			//if (i % 2 == 0)	// → i가 짝수이기 때문에 데이터가 짝수인 값이 아니라 
			//						  인덱스가 짝수인 값을 불러옴

			if (arr[i] % 2 == 0)	// i번째 요소의 값이 2의 배수라면
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 3 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}
}
/*
실행 결과
배열의 길이(갯수) : 9

배열 요소 전체 출력
4 7 9 1 3 2 5 6 8

짝수 선택적 출력
4 2 6 8

3의 배수 선택적 출력
9 3 6
*/