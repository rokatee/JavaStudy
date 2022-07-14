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
 E  J  O  T  Y
 D  I  N  S  X
 C  H  M  R  W
 B  G  L  Q  V
 A  F  K  P  U

 계속하려면...
*/

public class Test090
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];

		char n = 'A';		//65

		for (int i = 0; i < arr[0].length; i++)		//웅~~~ i -> 0 1 2 3 4
		{
			for (int j = arr.length-1; j >= 0; j--)	//숑숑~ j -> 4 3 2 1 0
			{
				arr[j][i] = n;	//(char)n
				n++;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}


		/*
		for (int i = 0; i < arr[0].length; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < arr.length; j++)
				{
					arr[j][i] = n;
					n++;
				}
			}
			else if (i % 2 != 0)
			{
				for (int j = arr.length-1; j >= 0; j--)
				{
					arr[j][i] = (char)n;
					n++;
				}
			}
		}
		*/
	}
}