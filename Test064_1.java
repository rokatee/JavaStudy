/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- 반복문(for 문) 실습
*/

/*
다중 for 문(반복문의 중첩)을 활용한 별 찍기 실습

<<과제>>
다음과 같은 내용이 출력될 수 있도록
반복문의 중첩 구문을 작성하여 프로그램을 구현하라

실행 예)

1)
*
**
***
****
*****
=================
2)
*****
****
***
**
*
=================
3)
*****
 ****
  ***
   **
    *
=================
4)
*
**
***
****
*****
****
***
**
*
=================
5)
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *


*/

/*
"for 문 별 찍기" 이해하는데 좋은 영상
https://www.youtube.com/watch?v=B13UADqEZTw
왼쪽 정렬 직각삼각형
https://www.youtube.com/watch?v=_0CxKKFLzEo
오른쪽 정렬 역 직각삼각형
https://www.youtube.com/watch?v=Otro-EoDcmU&t=112s
정삼각형
https://www.youtube.com/watch?v=N4RZOXAQI3I
마름모(+역삼각형도 참고 가능)
*/

public class Test064_1
{
	public static void main(String[] args)
	{

		//int i, j;			// i와 j만 넣었을 때 어떻게 나오는지 관찰
		//System.out.print("i");
		//00000
		//11111
		//22222
		//33333
		//44444

		//System.out.print(j);	
		//01234
		//01234
		//01234
		//01234
		//01234

		//System.out.print(i+j);
		//01234
		//12345
		//23456
		//34567
		//45678


		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 1+i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		//*****
		

		System.out.println();

		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		//****
		//***
		//**
		//*
		

		System.out.println();


		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		// ****
		//  ***
		//   **
		//	  *
		
	}
}