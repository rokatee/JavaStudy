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
 1  8   9  16  17
 2  7  10  15  18
 3  6  11  14  19
 4  5  12  13  20



힌트)
		  i = 짝수			홀수			짝수			홀수			짝수
		 0  0  0  0		 1  1  1  1		 2  2  2  2		 3  3  3  3		 4  4  4  4
웅~~	 i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i
		00 10 20 30		31 21 11 01		02 12 22 32		33 23 13 03		04 14 24 34
숑숑~	j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j
		0  1  2  3		3  2  1  0		0  1  2  3		3  2  1  0		0  1  2  3
			→				←				→				←				→

 계속하려면...
*/

public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		
		
		//오답
		//for (int j = 0; j < arr.length; j++)
		//{
		//	if (j % 2 == 0)
		//	{
		//		for (int i = 0; i < arr[j].length-1; i++)
		//		{
		//			arr[j][i] = n;
		//			n++;
		//		}
		//	}
			//if (j % 3 == 0)
			//{
			//	for (int i = 4; i < arr[j].length; i--)
			//	{
			//		arr[i][j] = n;
			//		n--;
			//	}
			//}
		//}
		/*
		//정답 1
		int n = 1;

		//System.out.println(arr[0].length);
		
		for (int i = 0; i < arr[0].length; i++)	//i<5
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < arr.length; j++)	//j<4
				{
						arr[j][i] = n;
						n++;
				}
			}
			else if (i % 2 != 0)
			{
				for (int j = arr.length-1; j >= 0; j--)	//j = 3, j >= 0	j--
				{
					arr[j][i] = n;
					n++;
				}
			}
		}
		*/
		//정답 2
		/*
		for (int i = 0, n = 1; i < arr[0].length; i += 2)
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[j][i] = n;
				n++;
			}
			n+=4;
		}
		for (int i = 1, n = 5; i < arr[0].length; i += 2)
		{
			for (int j = arr.length-1; j >= 0; j--)
			{
				arr[j][i] = n;
				n++;
			}
			n+=4;
		}
		*/
		
		//해답 코드
		int n = 0;
		for (int i = 0; i < 5; i++)					//outer 웅 i -> 0 1 2 3 4
		{
			for (int j = 0; j < 4; j++)				//inner 숑 j -> 0 1 2 3
			{
				//테스트
				//System.out.print(j + "" + i + " ");
				n++;

				if (i % 2 == 0)						//i가 짝수 -> 0 2 4
				{
					arr[j][i] = n;					//j를 0123 -> 00 10 20 30	02 12 22 32 42	04 14 24 34
				}
				else								//i가 홀수 -> 1 3
				{
					arr[3-j][i] = n;				//j를 0123을 3210으로 -> 31 21 11 01	33 23 13 03
				}
			}
			//System.out.println();	
		}


		// 배열 출력 구문
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

  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/