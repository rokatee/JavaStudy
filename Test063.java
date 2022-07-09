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

*********
 *******
  *****
   ***
    *

*/

public class Test063
{
	public static void main(String[] args)
	{
		/*
		// 1. 첫째 줄부터 만들기
		//	  첫째 줄 공백 0개
		for (int j = 0; j < 0; j++)
		{
			System.out.print(" ");
		}
		// 첫째 줄 별 9개
		for (int j = 0; j < 9; j++)
		{
			System.out.print("*");
		}
		// 첫째 줄 끝나고 다음 줄을 위한 개행
		System.out.println();

		
		// 2. 5줄 반복문에 넣기
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 0; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 9; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	

		// 3. 변경되는 규칙 찾아 대입
		for (int i = 0; i < 5; i++)
		{
			// i가 늘어날수록 공백이 하나씩 늘어남
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			// i가 늘어날수록 별이 2개씩 줄어듦
			// j < 9
			// → j < 9 -i (i만큼 줄어드는데) 
			// → j < 9 -i *2 (2개씩 줄어듦) 
			// → j < 9-(i*2)
			for (int j = 0; j < 9-(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}