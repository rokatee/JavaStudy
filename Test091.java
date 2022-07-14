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
    1    2    3    4   10
    5    6    7    8   26
    9   10   11   12   42
   13   14   15   16   58
   28   32   36   40  136
 

 계속하려면...
*/

/*
반복문 처리 필요한 구간과 아닌 구간을 나눠라
    1    2    3    4  ┃  10
    5    6    7    8  ┃  26
    9   10   11   12  ┃  42
   13   14   15   16  ┃  58
  ━━━━━━━━━━╋━━━
   28   32   36   40  ┃ 136

*/
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n = 0;

		//테스트
		//int sum = 0;

		for (int i = 0; i < arr.length-1; i++)			// 범위 설정을 배열만큼 안하면
		{												// 남은 공간은 없어지는 공간이 아닌 "0" 으로 채워진다
			for (int j = 0; j < arr[i].length-1; j++)
			{
				n++;
				arr[i][j] = n;
				
				//테스트
				//sum += arr[i][j];
				//System.out.printf("%4d", sum);

				
				arr[i][arr[i].length-1] += arr[i][j];		// [i][4]들의 자리에 [i][j]들의 합을 넣어준다 
				//		   ↓
				//arr[i][4] += arr[i][j];
				//		   ↓
				//arr[0][4] += arr[0][0]
				//			+= arr[0][1]
				//			+= arr[0][2]
				//			+= arr[0][3]
				//arr[1][4] += arr[1][0]
				//			+= arr[1][1]
				//			+= arr[1][2]
				//			+= arr[1][3]


				arr[arr[i].length-1][j] += arr[i][j];
				//		   ↓
				//arr[4][j] += arr[i][j];

				arr[arr[i].length-1][arr[i].length-1] += arr[i][j];
				//		   ↓
				//arr[4][4] += arr[i][j];*/
			}
			//테스트 개행
			//System.out.println();
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}


		//오답
		/*
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				n++;
				arr[i][j] = n;
				sum += arr[i][j];
				if (j == 4)
				{
					arr[i][4] = sum - arr[i][4];
					n = n-1;
				}
				if (i == 4)
				{
					arr[4][j] = sum - arr[4][j];
					n = n-1;
				}
			}
		}

		for (int i = 4; i < 5; i++)
		{
			for (int j = 4; j < 5; j++)
			{
				sum += arr[i][j];
			}
		}
		*/
	}
}
