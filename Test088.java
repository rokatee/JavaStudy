/*
■■■ 배열 ■■■ 
	- 배열의 배열(2차원 배열)
*/

/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)

 n (첫번째 숫자는 n이 결정한다) → 규칙 찾기!!
↓
 1  2  3  4  5		i=0	 → 12345 → 0 위치부터 출발
 5  1  2  3  4		i=1	 → 51234 → 1 위치부터 출발
 4  5  1  2  3		i=2	 → 45123 → 2 위치부터 출발
 3  4  5  1  2		i=3	 → 34512 → 3 위치부터 출발
 2  3  4  5  1		i=4	 → 23451 → 4 위치부터 출발

00  01  02  03  04    05  -j가 5면, j를 0으로 바꾸기
 1   2   3   4   5  |
     1   2   3   4  |  5
         1   2   3  |  4  5
	         1   2  |  3  4  5
		         1  |  2  3  4  5

 계속하려면...
*/


public class Test088
{
	public static void main(String[] args)
	{
		
		int[][] arr = new int[5][5];

		//int n;

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i, n=1; n <= 5; n++)	// j=i인거 빼고 생각!!
			{									// n이 1일 때, 5까지 n을 1씩 증가시키는 반복문 
												// → 1 2 3 4 5
				arr[i][j] = n;
				j++;
				if (j == 5)
				{
					j = 0;
				}
			}
		}

		// 배열의 배열 전체 요소 출력
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		


		// 해답
		

	}
}