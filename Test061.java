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
   **
  ***
 ****
*****

*/

public class Test061
{
	public static void main(String[] args)
	{
		/*		
		//퀘스트 = 총 5줄인데, 한 줄에 별 5개 찍기 
		//		   5개가 나열될 때마다 다음 줄로 넘겨야 한다

		// ■■■ 1. 우선 첫 번째 줄을 뽑아본다■■■
		//	  공백 4개인 for 문, 별 1개인 for 문

		//	공백이 4개이며 j가 0부터 시작이니 0 1 2 3인 j < 4
		for (int j = 0; j < 4; j++)
		{
			System.out.print(" ");
		}
		//  별 1개이며 j가 0부터 시작이니 0이 들어가려면 j < 1
		for (int j = 0; j < 1; j++)
		{
			System.out.print("*");
		}
		// 첫째 줄의 공백과 별이 끝나면 다음 줄로 넘겨야 하므로 개행
		System.out.println();




		// ■■■ 2. 이러한 것이 5줄이 있어야 하므로(5번 반복되어야 하므로)■■■
		for (int i = 0; i < 5; i++)
		{
			//여기 안에 위의 2개 for 문을 넣어주면 된다
		}

		//	▼▼▼▼▼▼▼▼▼▼▼

		
		for (int i = 0; i < 5; i++)
		{
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


		// 물론 위의 결과는 (공백 4) + (별 1) 이 5줄 나온다
		// 그러므로 첫째 줄에서 다음 줄로 내려갈 때, 변경되는 규칙을 찾아 코드에 대입한다

		// ■■■ 3. i가 커질 때(세로줄이 반복되며), 공백이 하나씩 줄어든다■■■
		//			 그러므로 i만큼 줄여주면 된다
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			//	 별은 하나씩 늘어난다
			//	 그러므로 i만큼 늘려주면 된다
			for (int j = 0; j < 1+i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}