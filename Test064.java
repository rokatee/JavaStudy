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

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


*/

public class Test064
{
	public static void main(String[] args)
	{
		
		// 마름모 = 정삼각형 + (한 줄 줄어든) 역삼각형
		// 정삼각형과 동일한 코드
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 1+(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}



		// 역삼각형과 동일하나 
		// 줄이 4개 (Test063 -1)로
		// 첫째 줄에 공백이 1개 (Test063에서 +1)로
		// 첫째 줄에 별이 7개 (Test063에서 -2)로 줄었으니
		// 변경된 만큼 수정해준다

		//				줄 4줄로
		for (int i = 0; i < 4; i++)
		{
		//					공백 1개로
			for (int j = 0; j < 1+i; j++)
			{
				System.out.print(" ");
			}
		//					별 7개로
			for (int j = 0; j < 7-(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}