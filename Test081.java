/*
■■■ 배열 ■■■ 
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
*/

/*
char 자료형의 배열을 만들어
그 배열의 각 방에 알파벳 대문자를 채우고
채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다
단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리할 수 있도록 한다

실행 예)
A B C D E F G H I J K....X Y Z

계속하려면...
*/

public class Test081
{
	public static void main(String[] args)
	{
		// 해답 방법
		char[] arr3 = new char[26];
		for (int i = 0, ch = 65; i < arr3.length; i++, ch++)
		{
			arr3[i] = (char)ch;
			System.out.print(arr3[i] + " ");
		}
		System.out.println();


		// 방법1
		char[] arr = new char[26];

		for (int j = 0; j < arr.length; j++)
		{
			System.out.print((char)(j+65) + " ");
		}
		System.out.println();


		// 방법2
		char[] arr1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'
						, 'H', 'I', 'J', 'K', 'L', 'M'
						, 'N', 'O', 'P', 'Q', 'R', 'S'
						, 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.println(arr1.length);

		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();


		// 방법3
		char[] arr2 = new char[26];
		arr2[0] = 'A';
		arr2[1] = 'B';
		arr2[2] = 'C';
		arr2[3] = 'D';
		arr2[4] = 'E';
		arr2[5] = 'F';
		arr2[6] = 'G';
		arr2[7] = 'H';
		arr2[8] = 'I';
		arr2[9] = 'J';
		arr2[10] = 'K';
		arr2[11] = 'L';
		arr2[12] = 'M';
		arr2[13] = 'N';
		arr2[14] = 'O';
		arr2[15] = 'P';
		arr2[16] = 'Q';
		arr2[17] = 'R';
		arr2[18] = 'S';
		arr2[19] = 'T';
		arr2[20] = 'U';
		arr2[21] = 'V';
		arr2[22] = 'W';
		arr2[23] = 'X';
		arr2[24] = 'Y';
		arr2[25] = 'Z';
		
	}
}

/*
실행 결과

26
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
*/