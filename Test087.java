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
 1  2  3  4  5		i=0	 → n은 i보다 1만큼 크다부터 시작
 2  3  4  5  6		i=1
 3  4  5  6  7		i=2
 4  5  6  7  8		i=3
 5  6  7  8  9		i=4

 계속하려면...
*/

public class Test087
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		
		int n = 1;

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n+i+j;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		// 해답
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		// 주요 변수 선언
		int n;

		for (int i = 0; i < arr.length; i++)		// 웅~~
		{
			n=1+i;
			for (int j = 0; j < arr.length; j++)	// 숑숑~
			{
				// 테스트(확인)
				//System.out.print(" i:" + i + ", j:" + j + "-");
				//System.out.print("[" + n + "]");
				//n++;

				arr[i][j] = n;
				n++;
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
	}
}

/*
실행 결과

  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/