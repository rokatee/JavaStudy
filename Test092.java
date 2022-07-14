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
 A  B  C  D  E
 F  G  H  I  J
 K  L  M  N  O
 P  Q  R  S  T
 U  V  W  X  Y

 계속하려면...
*/

public class Test092
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];				// 문자 5*5 배열 선언

		char n = 'A';								// 시작점 문자는 A로

		for (int i = 0; i < arr.length; i++)		// 웅~~~ 0		1		2 3 4 
		{
			for (int j = 0; j < arr[i].length; j++)	// 숑숑~ 01234	01234
			{
				arr[i][j] = n;
				n++;
			}
		}

		for (int i = 0; i < arr.length; i++)		
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);	// 문자 출력
			}
			System.out.println();
		}
	}
}

/*
실행 결과

 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
계속하려면 아무 키나 누르십시오 . . .
*/