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

*/

public class Test062
{
	public static void main(String[] args)
	{
		/*
		// 1. 첫째 줄 부터 완성해보기
		//	  첫째 줄 공백 4개
		for (int j = 0; j < 4; j++)
		{
			System.out.print(" ");
		}
		// 첫째 줄 별 1개
		for (int j = 0; j < 1; j++)
		{
			System.out.print("*");
		}
		//첫째 줄이 끝났으니 다음 줄로 넘어갈 개행
		System.out.println();



		// 2. 위의 코드를 5줄 반복해야 하는 for 문 쓰기
		for (int i = 0; i < 5; i++)
		{
			//위의 2개 for 문이 들어갈 자리
			for (int j = 0; j < 4; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/



		// 3. 변경되는 규칙을 찾아 대입
		for (int i = 0; i < 5; i++)
		{
			// i가 늘어날수록 공백이 하나씩 줄어듦
			for (int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			// i가 늘어날수록 별이 2개씩 늘어남
			// j < 1
			// → j < 1 +i (i만큼 늘어나는데) 
			// → j < 1 +i *2 (2개씩 늘어남) 
			// → j < 1+(i*2)
			for (int j = 0; j < 1+(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}