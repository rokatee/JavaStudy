/*
■■■ 배열 ■■■ 
	- 배열의 배열(2차원 배열)
*/

/*
<<과제>>
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)

 n (첫번째 숫자는 n이 결정한다) → 규칙 찾기!!
↓
 A  
 C  B
 D  E  F
 J  I  H  G
 K  L  M  N  O

 계속하려면...
*/

public class Test094
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char n = 'A';
		

		// 방법 1
		// 별찍기 할 때 생각하며 만들면 편하다~~
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0) //짝수줄 정방향
			{
				for (int j = 0; j < 1+i; j++)	// i가 1씩 커지면 j도 1씩 커진다
				{
					arr[i][j] = n;;
					n++;
				}
			}
			if (i % 2 != 0) //홀수줄 역방향
			{
				for (int j = i; j >= 0; j--)	//역방향이니 j = i부터 0까지 감소
				{
					arr[i][j] = n;;
					n++;
				}
			}
		}
		
		// 방법2
		/*
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(i % 2 == 0) // 짝수 줄 정방향
				{
					arr[i][j] = n;
				}
				else // 홀수 줄 역방향
				{
					arr[i][i-j] = n; 
				}
				n++;
			}
		}
		*/


		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
실행 결과

 A
 C B
 D E F
 J I H G
 K L M N O
계속하려면 아무 키나 누르십시오 . . .

*/